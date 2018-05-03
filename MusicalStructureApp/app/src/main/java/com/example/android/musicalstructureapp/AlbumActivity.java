package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AlbumActivity extends AppCompatActivity {

    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.albums);

        LinearLayout albumToSong = (LinearLayout) findViewById(R.id.albumToSong);

        albumToSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent albumToSongIntent = new Intent(AlbumActivity.this, SongActivity.class);
                startActivity(albumToSongIntent);
            }
        });

        ImageView playSong = (ImageView) findViewById(R.id.play);
        playSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Play song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView stopSong = (ImageView) findViewById(R.id.stop);
        stopSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Stop song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView nextSong = (ImageView) findViewById(R.id.next);
        nextSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView lastSong = (ImageView) findViewById(R.id.prev);
        lastSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(AlbumActivity.this, "Last song", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
