package com.example.android.newsapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<News> news;
    private Context context;

    private static final String LOG_TAG = NewsAdapter.class.getName();

    public NewsAdapter(Context context, List<News> news) {
        this.context = context;
        this.news = news;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleView;
        private TextView writerView;
        private TextView sectionView;
        private TextView dateView;
        private View parentView;

        public ViewHolder(View view) {
            super(view);
            this.parentView = view;
            this.titleView = (TextView) view.findViewById(R.id.textview_title);
            this.writerView = (TextView) view.findViewById(R.id.textview_wrtiter);
            this.sectionView = (TextView) view.findViewById(R.id.textview_section);
            this.dateView = (TextView) view.findViewById(R.id.textview_date);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context)
        .inflate(R.layout.list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final News currentArticle = news.get(position);

        holder.titleView.setText(currentArticle.getNewsTitle());

        holder.writerView.setText(currentArticle.getNewsWriter());

        holder.sectionView.setText(currentArticle.getNewsSection());

        String originalDate = currentArticle.getNewsDate();

        String substringDate = originalDate.substring(0, 10);

        SimpleDateFormat oldFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat newFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date date = oldFormat.parse(substringDate);

            String formattedDate = newFormat.format(date);

            holder.dateView.setText(formattedDate);
        } catch (ParseException e) {
            Log.e(LOG_TAG, "Problem parsing dates", e);
        }

        holder.parentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri articleUri = Uri.parse(currentArticle.getNewsUrl());

                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, articleUri);

                if(websiteIntent.resolveActivity(context.getPackageManager()) != null) {
                    context.startActivity(websiteIntent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.news.size();
    }

    public void setNewsList(List<News> news) {
        this.news = news;
    }
}
