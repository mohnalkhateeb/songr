package com.example.songr.repository;

import com.example.songr.modules.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Service
public interface AlbumRepository extends JpaRepository<Album, Long> {
}