package com.example.android.warsawtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.lazienki, R.string.lazienki_name, R.string.lazienki_info, R.string.lazienki_price, R.string.lazienki_address, R.string.lazienki_phone, R.string.lazienki_website));
        info.add(new Info(R.drawable.starowka, R.string.staremiasto_name, R.string.staremiasto_info, R.string.staremiasto_price, R.string.staremiasto_address, R.string.staremiasto_phone, R.string.staremiasto_website));
        info.add(new Info(R.drawable.narodowy, R.string.stadion_name, R.string.stadion_info, R.string.stadion_price, R.string.stadion_address, R.string.stadion_phone, R.string.staremiasto_website));
        info.add(new Info(R.drawable.church, R.string.church_name, R.string.church_info, R.string.church_price, R.string.church_address, R.string.church_phone, R.string.church_website));
        info.add(new Info(R.drawable.powiazki, R.string.powiazki_name, R.string.powiazki_info, R.string.powiazki_price, R.string.powiazki_address, R.string.powiazki_phone, R.string.polin_website));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
