package com.example.android.warsawtourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class InfoAdapter extends ArrayAdapter<Info> {

    public InfoAdapter(Context context, List<Info> info) {
        super(context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Info currentLocation = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photoImageView);
        imageView.setImageResource(currentLocation.getImageResourceId());
        imageView.setVisibility(View.VISIBLE);

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView infoLocationTextView = (TextView) listItemView.findViewById(R.id.infoTextView);
        infoLocationTextView.setText(currentLocation.getInfo());

        TextView priceLocationTextView = (TextView) listItemView.findViewById(R.id.priceTextView);
        priceLocationTextView.setText(currentLocation.getPrice());

        TextView addressLocationTextView = (TextView) listItemView.findViewById(R.id.addressTextView);
        addressLocationTextView.setText(currentLocation.getAddress());

        TextView phoneLocationTextView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneLocationTextView.setText(currentLocation.getPhone());

        TextView websiteLocationTextView = (TextView) listItemView.findViewById(R.id.websiteTextView);
        websiteLocationTextView.setText(currentLocation.getWebsite());

        return listItemView;
    }
}
