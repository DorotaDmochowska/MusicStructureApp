package com.example.android.newsapplication;

import java.util.List;
import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static final  String LOG_TAG = NewsLoader.class.getName();

    private String url;

    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "TEST: onStartLoading() called..." );
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        Log.i(LOG_TAG, "TEST: loadInBackground() called...");

        if(url == null) {
            return null;
        }

        List<News> result = QueryUtils.fetchNewsData(url);
        return result;
    }
}
