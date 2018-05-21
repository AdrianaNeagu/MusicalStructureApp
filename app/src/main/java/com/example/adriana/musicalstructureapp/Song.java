package com.example.adriana.musicalstructureapp;

public class Song {
    private String artistName;
    private String songName;
    private int imageResourceId;


    public Song(String artistName, String songName, int imageResourceId) {
        this.artistName = artistName;
        this.songName = songName;
        this.imageResourceId = imageResourceId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

}
