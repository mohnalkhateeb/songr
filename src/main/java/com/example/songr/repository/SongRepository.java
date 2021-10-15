package com.example.songr.repository;

import com.example.songr.modules.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {
//    List<Song> findAllById(Iterable<Long> longs);

}
