package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        getSupportActionBar().setElevation(0);

        ArrayList<TrackDetail> trackDetails = new ArrayList<>();

        trackDetails.add(new TrackDetail(getString(R.string.song1_album), getString(R.string.song1_name), getString(R.string.song1_artist), R.drawable.pro8l3m_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song2_album), getString(R.string.song2_name), getString(R.string.song2_artist), R.drawable.taconafide_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song3_album), getString(R.string.song3_name), getString(R.string.song3_artist), R.drawable.miuosh_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song4_album), getString(R.string.song4_name), getString(R.string.song4_artist), R.drawable.fisz_emade_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song5_album), getString(R.string.song5_name), getString(R.string.song5_artist), R.drawable.pentatonix_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song6_album), getString(R.string.song6_name), getString(R.string.song6_artist), R.drawable.kortez_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song7_album), getString(R.string.song7_name), getString(R.string.song7_artist), R.drawable.tulia_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song8_album), getString(R.string.song8_name), getString(R.string.song8_artist), R.drawable.imagine_dragons_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song9_album), getString(R.string.song9_name), getString(R.string.song9_artist), R.drawable.ten_typ_mes_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song10_album), getString(R.string.song10_name), getString(R.string.song10_artist), R.drawable.eldo_cover));

        GridView girdView = findViewById(R.id.grid_view_album);
        GridAlbumAdapter gridAlbumAdapter = new GridAlbumAdapter(this, trackDetails);
        girdView.setAdapter(gridAlbumAdapter);
    }

}
