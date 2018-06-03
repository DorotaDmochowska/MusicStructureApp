package com.example.android.warsawtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DiscosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.room13, R.string.room13_name, R.string.room13_info, R.string.room13_price, R.string.room13_address, R.string.room13_phone, R.string.room13_website));
        info.add(new Info(R.drawable.smolna, R.string.smolna_name, R.string.smolna_info, R.string.smolna_price, R.string.smolna_address, R.string.smolna_phone, R.string.smolna_website));
        info.add(new Info(R.drawable.mirage, R.string.mirage_name, R.string.mirage_info, R.string.mirage_price, R.string.mirage_address, R.string.mirage_phone, R.string.mirage_website));
        info.add(new Info(R.drawable.klar, R.string.klar_name, R.string.klar_info, R.string.klar_price, R.string.klar_address, R.string.klar_phone, R.string.klar_website));
        info.add(new Info(R.drawable.chmury, R.string.chmury_name, R.string.chmury_info, R.string.chmury_price, R.string.chmury_address, R.string.chmury_phone, R.string.chmury_website));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
