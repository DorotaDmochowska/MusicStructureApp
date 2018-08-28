package com.example.android.newsapplication;

public class News {

    private String mNewsTitle;
    private String mNewsWriter;
    private String mNewsSection;
    private String mNewsDate;
    private String mNewsUrl;

    public News(String newsTitle, String newsWriter, String newsSection, String newsDate, String newsUrl) {
        mNewsTitle = newsTitle;
        mNewsWriter = newsWriter;
        mNewsSection = newsSection;
        mNewsDate = newsDate;
        mNewsUrl = newsUrl;
    }

    public String getNewsTitle() {
        return mNewsTitle;
    }

    public String getNewsWriter() {
        return mNewsWriter;
    }

    public String getNewsSection() {
        return mNewsSection;
    }

    public String getNewsDate() {
        return mNewsDate;
    }

    public String getNewsUrl() {
        return mNewsUrl;
    }
}
