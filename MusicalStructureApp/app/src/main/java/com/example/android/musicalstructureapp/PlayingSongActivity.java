package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayingSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_song);

        getSupportActionBar().setElevation(0);

        Intent intent = getIntent();
        String songName = intent.getStringExtra("song_name");
        String artistName = intent.getStringExtra("artist_name");
        int albumCover = intent.getIntExtra("album_cover", R.drawable.album_placeholder);

        ImageView albumCoverImageView = findViewById(R.id.playing_song_album_cover);
        albumCoverImageView.setImageResource(albumCover);

        TextView songNameTextView = findViewById(R.id.playing_song_name);
        songNameTextView.setText(songName);

        TextView artistNameTextView = findViewById(R.id.playing_song_artist_name);
        artistNameTextView.setText(artistName);
    }
}
