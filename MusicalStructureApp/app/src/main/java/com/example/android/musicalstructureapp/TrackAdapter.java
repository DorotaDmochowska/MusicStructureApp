package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class TrackAdapter extends ArrayAdapter<TrackDetail> {

    private Context mContext;

    private View mListView;

    private TrackDetail mCurrentItem;

    private int mIdentifier;

    public TrackAdapter(@NonNull Context context, @NonNull List<TrackDetail> trackList, int identifier) {
        super(context, 0, trackList);
        mContext = context;
        mIdentifier = identifier;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        mListView = convertView;
        if(mListView == null) {
            mListView = LayoutInflater.from(mContext).inflate(R.layout.song_details_list_item, parent, false);
        }

        mCurrentItem = getItem(position);

        switch(mIdentifier) {
            case 1:
                displayTrack();
                break;
            case 2:
                displayArtist();
                break;
        }
        return mListView;
    }

    private void displayTrack() {
        TextView trackNameTextView = mListView.findViewById(R.id.song_list_item_track_name);
        trackNameTextView.setText(mCurrentItem.getSongName().toString());

        TextView trackArtistTextView = mListView.findViewById(R.id.song_list_item_track_artist);
        trackArtistTextView.setVisibility(View.VISIBLE);
        trackArtistTextView.setText(mCurrentItem.getArtistName().toString());

        ImageView albumArt = mListView.findViewById(R.id.song_list_item_track_album_art);
        trackNameTextView.setText(mCurrentItem.getAlbumArt());
    }

    private void displayArtist() {
        TextView trackNameTextView = mListView.findViewById(R.id.song_list_item_track_name);
        trackNameTextView.setText(mCurrentItem.getArtistName().toString());
        trackNameTextView.setTextSize(16);

        ImageView artistPhoto = mListView.findViewById(R.id.song_list_item_track_album_art);
        artistPhoto.setImageResource(mCurrentItem.getArtistPhoto());

        TextView textView = mListView.findViewById(R.id.song_list_item_track_artist);
        textView.setVisibility(View.GONE);
    }
}
