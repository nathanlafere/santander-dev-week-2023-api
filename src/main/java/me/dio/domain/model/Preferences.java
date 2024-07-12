package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity(name = "tb_preferences")
public class Preferences extends BaseItem {
    private List<String> artists;
    
    private List<String> genres;

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }
    
}
