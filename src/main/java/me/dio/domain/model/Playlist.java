package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity(name = "tb_playlist")
public class Playlist extends BaseItem {
    private boolean isPrivate;
    

    public boolean isPrivate() {
        return isPrivate;
    }


    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
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
