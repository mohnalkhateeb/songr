package com.example.songr.repository;

import com.example.songr.modules.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    @Override
    List<Album> findAllById(Iterable<Long> longs);
}
