package com.example.adriana.musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private ArrayList<Song> songsList;
    Context context;

    public SongAdapter(ArrayList<Song> songsList, Context context) {
        super(context, R.layout.song_item, songsList);
        this.songsList = songsList;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView artistName = listItemView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        TextView songName = listItemView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        ImageView songImage = listItemView.findViewById(R.id.song_image);
        songImage.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}
