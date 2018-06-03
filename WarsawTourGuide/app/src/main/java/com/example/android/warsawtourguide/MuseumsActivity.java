package com.example.android.warsawtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.neon_museum, R.string.neon_name, R.string.neon_info, R.string.neon_price, R.string.neon_address, R.string.neon_phone, R.string.neon_website));
        info.add(new Info(R.drawable.prl_museum, R.string.prl_name, R.string.prl_info, R.string.prl_price, R.string.prl_address, R.string.prl_phone, R.string.prl_website));
        info.add(new Info(R.drawable.zacheta_museum, R.string.zacheta_name, R.string.zacheta_info, R.string.zacheta_price, R.string.zacheta_address, R.string.zacheta_phone, R.string.zacheta_website));
        info.add(new Info(R.drawable.national_museum, R.string.national_name, R.string.national_info, R.string.national_price, R.string.national_address, R.string.national_phone, R.string.national_website));
        info.add(new Info(R.drawable.polin_museum, R.string.polin_name, R.string.polin_info, R.string.polin_price, R.string.polin_address, R.string.polin_phone, R.string.polin_website));

        InfoAdapter adpater = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adpater);
    }
}
