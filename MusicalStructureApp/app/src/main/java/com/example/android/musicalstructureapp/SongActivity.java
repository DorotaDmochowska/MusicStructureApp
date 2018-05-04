package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.songs);

        ImageView playSong = (ImageView) findViewById(R.id.play);
        playSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Play song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView stopSong = (ImageView) findViewById(R.id.stop);
        stopSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Stop song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView nextSong = (ImageView) findViewById(R.id.next);
        nextSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Next song", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView lastSong = (ImageView) findViewById(R.id.prev);
        lastSong.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(SongActivity.this, "Last song", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
