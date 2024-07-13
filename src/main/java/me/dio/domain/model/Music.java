package me.dio.domain.model;

import java.io.File;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "tb_music")
public class Music extends BaseItem {
    private String artist;
    private int duration;
    private String genre;
    public final LocalDate realeaseDate;
    

    @Column(unique = true)
    private File musicFile;
    
    
    public Music() {
        this.realeaseDate = LocalDate.now();
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
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