package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    private static final int IDENTIFIER = 1;
    private ArrayList<TrackDetail> trackDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Set the action bar elevation to 0dp
        getSupportActionBar().setElevation(0);

        View header = View.inflate(this, R.layout.header_songs_list_view, null);

        // Create an arrayList of an object TrackDetail
        trackDetails = new ArrayList<>();
        trackDetails.add(new TrackDetail(getString(R.string.song1_name), getString(R.string.song1_artist), R.drawable.pro8l3m_molly));
        trackDetails.add(new TrackDetail(getString(R.string.song2_name), getString(R.string.song2_artist), R.drawable.taconafide_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song3_name), getString(R.string.song3_artist), R.drawable.miuosh_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song4_name), getString(R.string.song4_artist), R.drawable.fisz_emade));
        trackDetails.add(new TrackDetail(getString(R.string.song5_name), getString(R.string.song5_artist), R.drawable.pentatonix));
        trackDetails.add(new TrackDetail(getString(R.string.song6_name), getString(R.string.song6_artist), R.drawable.kortez));
        trackDetails.add(new TrackDetail(getString(R.string.song7_name), getString(R.string.song7_artist), R.drawable.tulia_cover));
        trackDetails.add(new TrackDetail(getString(R.string.song8_name), getString(R.string.song8_artist), R.drawable.imagine_drqagons));
        trackDetails.add(new TrackDetail(getString(R.string.song9_name), getString(R.string.song9_artist), R.drawable.ten_typ_mes));
        trackDetails.add(new TrackDetail(getString(R.string.song10_name), getString(R.string.song10_artist), R.drawable.eldo));


        ListView listView = findViewById(R.id.songs_list);

        listView.addHeaderView(header);
        TrackAdapter trackAdapter = new TrackAdapter(this, trackDetails, IDENTIFIER);
        listView.setAdapter(trackAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(SongsActivity.this, PlayingSongActivity.class);

                TrackDetail track = trackDetails.get(position - 1);

                Bundle bundle = new Bundle();
                bundle.putString("song_name", track.getSongName());
                bundle.putString("artist_name", track.getArtistName());
                bundle.putInt("album_cover", track.getAlbumArt());

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(SongsActivity.this, MainActivity.class);
        startActivity(intent);
        super.onBackPressed();

    }
}
