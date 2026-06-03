package com.practice.songtrackerdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepos extends JpaRepository<Song, Long> {
}
