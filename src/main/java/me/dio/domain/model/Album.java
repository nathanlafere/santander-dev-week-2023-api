package me.dio.domain.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_album")
public class Album extends BaseItem {
    public String artist;
    public LocalDate realeaseDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Music> musics;

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

}