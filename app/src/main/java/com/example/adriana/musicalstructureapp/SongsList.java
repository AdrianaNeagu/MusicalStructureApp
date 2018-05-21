package com.example.adriana.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsList extends AppCompatActivity {

    private static SongAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_songs);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Dave Brubeck", "Take Five", R.drawable.dave_brubeck));
        songs.add(new Song("Duke Ellington", "Take the A train", R.drawable.duke_ellington));
        songs.add(new Song("Miles Davis", "So what", R.drawable.miles_davis));

        ListView listView = findViewById(R.id.list_songs);
        adapter = new SongAdapter(songs, getApplicationContext());
        listView.setAdapter(adapter);

    }

}
