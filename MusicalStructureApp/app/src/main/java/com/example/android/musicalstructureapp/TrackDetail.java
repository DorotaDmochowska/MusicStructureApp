package com.example.android.musicalstructureapp;

public class TrackDetail {

    private String mSongName;
    private String mArtistName;
    private String mAlbumName;
    private int mAlbumArt;
    private int mArtistPhoto;

    public TrackDetail(String songName, String artistName, int albumArt) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    public TrackDetail(String albumName, String songName, String artistName, int albumArt) {
        mAlbumName = albumName;
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    public TrackDetail(String artistName, int artistPhoto) {
        mArtistName = artistName;
        mArtistPhoto = artistPhoto;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }

    public int getArtistPhoto() {
        return mArtistPhoto;
    }
}
