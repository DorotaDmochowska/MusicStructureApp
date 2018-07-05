package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    private static final int IDENTIFIER = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        getSupportActionBar().setElevation(0);
        View header = View.inflate(this, R.layout.header_artist_list_view, null);

        ArrayList<TrackDetail> artistDetail = new ArrayList<>();

        artistDetail.add(new TrackDetail(getString(R.string.song1_artist), R.drawable.pro8l3m));
        artistDetail.add(new TrackDetail(getString(R.string.song2_artist), R.drawable.taconafide));
        artistDetail.add(new TrackDetail(getString(R.string.song3_artist), R.drawable.miuosh));
        artistDetail.add(new TrackDetail(getString(R.string.song4_artist), R.drawable.fisz_emade));
        artistDetail.add(new TrackDetail(getString(R.string.song5_artist), R.drawable.pentatonix));
        artistDetail.add(new TrackDetail(getString(R.string.song6_artist), R.drawable.kortez));
        artistDetail.add(new TrackDetail(getString(R.string.song7_artist), R.drawable.tulia));
        artistDetail.add(new TrackDetail(getString(R.string.song8_artist), R.drawable.imagine_drqagons));
        artistDetail.add(new TrackDetail(getString(R.string.song9_artist), R.drawable.ten_typ_mes));
        artistDetail.add(new TrackDetail(getString(R.string.song10_artist), R.drawable.eldo));

        ListView listView = findViewById(R.id.songs_list);
        listView.addHeaderView(header);
        TrackAdapter trackAdapter = new TrackAdapter(this, artistDetail, IDENTIFIER);
        listView.setAdapter(trackAdapter);
    }
}
