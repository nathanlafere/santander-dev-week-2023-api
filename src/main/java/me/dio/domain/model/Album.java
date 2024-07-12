package me.dio.domain.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;

@Entity(name = "tb_album")
public class Album extends BaseItem {
    private final String artist;
    private final LocalDate realeaseDate;

    public Album(String artist) {
        this.realeaseDate = LocalDate.now();
        this.artist = artist;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Music> musics;

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

}