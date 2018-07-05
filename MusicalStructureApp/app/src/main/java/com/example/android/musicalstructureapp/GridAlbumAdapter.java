package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridAlbumAdapter extends ArrayAdapter<TrackDetail> {
    private Context mContext;

    public GridAlbumAdapter(@NonNull Context context, @NonNull List<TrackDetail> objects) {
        super(context, 0, objects);
        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;
        if(gridItemView == null) {
            gridItemView = LayoutInflater.from(mContext).inflate(R.layout.album_grid_item, parent, false);
        }

        TrackDetail currentItem = getItem(position);

        ImageView albumArt = gridItemView.findViewById(R.id.grid_item_album_cover);
        albumArt.setImageResource(currentItem.getAlbumArt());

        TextView albumName = gridItemView.findViewById(R.id.grid_item_album_name);
        albumName.setText(currentItem.getAlbumName().toString());

        TextView artistName = gridItemView.findViewById(R.id.grid_item_artist_name);
        artistName.setText(currentItem.getArtistName().toString());

        return gridItemView;
    }
}
