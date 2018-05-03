package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.musicalstructureapp.R.id.subscription;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView playlist = (TextView) findViewById(R.id.playlist);

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                startActivity(playlistIntent);
            }
        });

        TextView artist = (TextView) findViewById(R.id.artist);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntend = new Intent(MainActivity.this, ArtistsActivity.class);

                startActivity(artistIntend);
            }
        });

        TextView album = (TextView) findViewById(R.id.album);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntend = new Intent(MainActivity.this, AlbumActivity.class);

                startActivity(albumIntend);
            }
        });

        TextView song = (TextView) findViewById(R.id.song);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntend = new Intent(MainActivity.this, SongActivity.class);

                startActivity(songIntend);
            }
        });

        TextView subscription = (TextView) findViewById(R.id.subscription);

        subscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent subscriptionIntent = new Intent(MainActivity.this, SubscriptionActivity.class);

                startActivity(subscriptionIntent);
            }
        });
    }
}
