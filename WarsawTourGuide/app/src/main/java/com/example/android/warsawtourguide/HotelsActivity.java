package com.example.android.warsawtourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loc_list);

        ArrayList<Info> info = new ArrayList<Info>();
        info.add(new Info(R.drawable.hilton_hotel, R.string.hilton_hotel_name, R.string.hilton_hotel_info, R.string.hilton_hotel_price, R.string.hilton_hotel_address, R.string.hilton_hotel_phone,R.string.hilton_hotel_website ));
        info.add(new Info(R.drawable.wiselka_hotel, R.string.wsielka_hotel_name, R.string.wiselka_hotel_info, R.string.wiselka_hotel_price, R.string.wiselka_hotel_address, R.string.wiselka_hotel_phone, R.string.wiselka_hotel_website ));
        info.add(new Info(R.drawable.novotel_hotel, R.string.novotel_hotel_name, R.string.novotel_hotel_info, R.string.novotel_hotel_price, R.string.novotel_hotel_address, R.string.novotel_hotel_phone, R.string.novotel_hotel_website));
        info.add(new Info(R.drawable.sobieski_hotel, R.string.sobieski_hotel_name, R.string.sobieski_hotel_info, R.string.sobieski_hotel_price, R.string.sobieski_hotel_address, R.string.sobieski_hotel_phone, R.string.sobieski_hotel_website));
        info.add(new Info(R.drawable.cloud_hotel, R.string.cloud_hotel_name, R.string.cloud_hotel_info, R.string.cloud_hotel_price, R.string.cloud_hotel_address, R.string.cloud_hotel_phone, R.string.cloud_hotel_website));

        InfoAdapter adapter = new InfoAdapter(this, info);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
