package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "tb_user")
public class User extends BaseItem{

    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Preferences preferences;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Playlist> playlists;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Album> albums;

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Preferences getPreferences() {
        return preferences;
    }
    

}
