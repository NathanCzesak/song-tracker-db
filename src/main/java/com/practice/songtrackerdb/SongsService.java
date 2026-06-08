package com.practice.songtrackerdb;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class SongsService {

    private final SongRepos songRepos;
    public SongsService(SongRepos songRepos) {
        this.songRepos = songRepos;
    }

    public List<Song> getSongs() {
        return songRepos.findAll();
    }

    public void addSong(Song song) {
        songRepos.save(song);
    }

    public void deleteSong(Long id) {
        if(!songRepos.existsById(id)) {
            throw new RuntimeException("Song with id " + id + " does not exist");
        }
        songRepos.deleteById(id);
    }

}
