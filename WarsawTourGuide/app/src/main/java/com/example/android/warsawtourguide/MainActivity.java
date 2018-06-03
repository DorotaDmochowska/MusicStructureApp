package com.example.android.warsawtourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomOnClickListener(R.id.hotels, HotelsActivity.class);
        setCustomOnClickListener(R.id.restaurants, RestaurantsActivity.class);
        setCustomOnClickListener(R.id.museums, MuseumsActivity.class);
        setCustomOnClickListener(R.id.attractions, AttractionsActivity.class);
        setCustomOnClickListener(R.id.pubs_and_discos, DiscosActivity.class);
    }

    public void setCustomOnClickListener(int resourceId, final Class className) {
        View view = findViewById(resourceId);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(view.getContext(), className);
                        startActivity(intent);
                    }
                }
        );
    }
}
