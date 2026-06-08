package com.practice.songtrackerdb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongRepos repos;
    private final SongsService songsService;

    public SongController(SongRepos repos) {
        this.repos = repos;
        this.songsService = new SongsService(repos);
    }

    @GetMapping
    public List<Song> getSongs() {
        return songsService.getSongs();
    }

    @PostMapping
    public void saveSong(@RequestBody Song song) {
        songsService.addSong(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        songsService.deleteSong(id);
    }

}
