package me.dio.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity(name = "tb_music")
public class Music extends BaseItem {
    private String artist;
    private String album;
    private int duration;
    private String genre;
    private final LocalDate realeaseDate;

    public Music() {
        this.realeaseDate = LocalDate.now();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}