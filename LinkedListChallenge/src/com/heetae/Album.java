package com.heetae;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hsMacbook on 2017. 7. 13..
 */
public class Album {
    private String name;
    private String artists;
    private List<Song> songs;

    public Album(String name, String artists) {
        this.name = name;
        this.artists = artists;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSongs(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkSong : this.songs) {
            if(checkSong.getTitle().equalsIgnoreCase(title)) {
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList (int track, List<Song> playLists) {
        int index = track - 1;
        if (index > 0 && index <= this.songs.size()) {
            playLists.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not contain a track " + track);
        return false;
    }

    public boolean addToPlayList (String title, List<Song> playLists) {
        Song checkSong = findSong(title);
        if (checkSong != null) {
            playLists.add(checkSong);
            return true;
        } else {
            System.out.println("The song " + title + " isn't in this album.");
            return false;
        }
    }
}
