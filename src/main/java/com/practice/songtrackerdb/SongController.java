package com.practice.songtrackerdb;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/songs")
public class SongController {

    private final SongRepos repos;
    public SongController(SongRepos repos) {
        this.repos = repos;
    }

    @GetMapping
    public List<Song> getSongs() {
        return repos.findAll();
    }

    @PostMapping
    public void saveSong(@RequestBody Song song) {
        repos.save(song);
    }

    @DeleteMapping("/{id}")
    public void deleteSong(@PathVariable Long id) {
        repos.deleteById(id);
    }

}
