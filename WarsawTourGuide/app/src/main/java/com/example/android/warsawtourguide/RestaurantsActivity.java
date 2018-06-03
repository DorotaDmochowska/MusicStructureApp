package com.example.android.warsawtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.platter_okrasa, R.string.platter_okrasa_name, R.string.platter_okrasa_info, R.string.platter_okrasa_price, R.string.platter_okrasa_address, R.string.platter_okrasa_phone, R.string.platter_okrasa_website));
        info.add(new Info(R.drawable.starydom, R.string.starydom_name, R.string.starydom_info, R.string.starydom_price, R.string.starydom_address, R.string.starydom_phone, R.string.staremiasto_website));
        info.add(new Info(R.drawable.soul, R.string.soul_name, R.string.soul_info, R.string.soul_price, R.string.soul_address, R.string.soul_phone, R.string.soul_website));
        info.add(new Info(R.drawable.przyzamku, R.string.przyzamku_name, R.string.przyzamku_info, R.string.przyzamku_price, R.string.przyzamku_address, R.string.przyzamku_phone, R.string.przyzamku_website));
        info.add(new Info(R.drawable.skamieniejka, R.string.skamieniejka_name, R.string.skamieniejka_info, R.string.skamieniejka_price, R.string.skamieniejka_address, R.string.skamieniejka_phone, R.string.skamieniejka_website));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
