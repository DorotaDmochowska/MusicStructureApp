package com.example.android.newsapplication;

import android.text.TextUtils;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class QueryUtils {
    public static final String LOG_TAG = QueryUtils.class.getSimpleName();

    private QueryUtils(){
    }

    public static List<News> fetchNewsData(String requestUrl) {
        Log.i(LOG_TAG, "TEST: fetchNewsData() called...");

        URL url = createUrl(requestUrl);

        String jsonResponse = null;

        try {
            jsonResponse = makeHttpRequest(url);
        } catch (IOException e) {
            Log. e(LOG_TAG, "Error closing input stream", e);
        }

        List<News> news = extractNews(jsonResponse);

        return news;
    }

    private static URL createUrl(String stringUrl) {
        URL url = null;

        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Error with creating URL", e);
        }
        return url;
    }

    private static String makeHttpRequest(URL url) throws IOException {
        String jsonResponse = "";

        if(url == null) {
            return jsonResponse;
        }

        HttpURLConnection urlConnection = null;
        InputStream inputStream = null;

        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(15000);
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            if(urlConnection.getResponseCode() == 200) {
                inputStream = urlConnection.getInputStream();
                jsonResponse = readFormStream(inputStream);
            } else {
                Log.e(LOG_TAG, "Error response code: " + urlConnection.getResponseCode());
            }
        } catch(IOException e) {
            Log.e(LOG_TAG, "Problem retriving the news JSON result.", e);
        } finally {
            if(urlConnection != null) {
                urlConnection.disconnect();
            }
            if(inputStream != null) {
                inputStream.close();
            }
        }
        return jsonResponse;
    }

    private static String readFormStream(InputStream inputStream) throws IOException {
        StringBuilder output = new StringBuilder();
        if(inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line = reader.readLine();
            while(line != null) {
                output.append(line);
                line = reader.readLine();
            }
        }
        return output.toString();
    }

    private static List<News> extractNews(String newsJSON) {
        if(TextUtils.isEmpty(newsJSON)) {
            return null;
        }

        List<News> news = new ArrayList<>();

        try {
            JSONObject baseJsonResponse = new JSONObject(newsJSON);
            JSONObject responseObject = baseJsonResponse.getJSONObject("response");
            JSONArray resultsArray = responseObject.getJSONArray("result");

            if(responseObject.has("results")) {
                for(int i = 0; i < resultsArray.length(); i++) {
                    JSONObject currentArticle = resultsArray.getJSONObject(i);

                    String title = "";
                    if(currentArticle.has("webTitle")) {
                        title = currentArticle.getString("webTitle");
                    }
                    String writer = "";
                    if(currentArticle.has("tags")) {
                        JSONArray tagsArray = currentArticle.getJSONArray("tags");

                        if(tagsArray.length() > 0) {
                            for(int j = 0; j < 1; j++) {
                                JSONObject singleTag = tagsArray.getJSONObject(j);
                                if(singleTag.has("webTitle")) {
                                    writer = singleTag.getString("webTitle");
                                }
                            }
                        }
                    }

                    String section = "";
                    if(currentArticle.has("sectionName")) {
                        section = currentArticle.getString("sectionName");
                    }

                    String date = "";
                    if(currentArticle.has("webPublicationDate")) {
                        date = currentArticle.getString("webPublicationDate");
                    }

                    String url = "";
                    if(currentArticle.has("webUrl")) {
                        url = currentArticle.getString("webUrl");
                    }

                    News article = new News(title, writer, section, date, url);

                    news.add(article);
                }
            }
        } catch (JSONException e) {
            Log.e(LOG_TAG, "Problem parsing the books JSON results.", e);
        }
        return news;
    }
}
