package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.artists);

        LinearLayout artist = (LinearLayout) findViewById(R.id.artists);

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(ArtistsActivity.this, AlbumActivity.class);
                startActivity(artistIntent);
            }
        });

        ImageView playSong = (ImageView) findViewById(R.id.play);
        playSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsActivity.this, "Play song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView stopSong = (ImageView) findViewById(R.id.stop);
        stopSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsActivity.this, "Stop song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView nextSong = (ImageView) findViewById(R.id.next);
        nextSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsActivity.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView lastSong = (ImageView) findViewById(R.id.prev);
        lastSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(ArtistsActivity.this, "Last song", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
