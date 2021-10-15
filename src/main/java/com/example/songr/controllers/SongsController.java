package com.example.songr.controllers;

import com.example.songr.modules.Album;
import com.example.songr.modules.Song;
import com.example.songr.repository.AlbumRepository;
import com.example.songr.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class SongsController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository AlbumRepository;


    @GetMapping("/albums/{id}")
    public String getAlbumSong(@PathVariable long id, Model m){
        Album theAlbum = AlbumRepository.findById(id).get();
        Iterable<Song> songs = theAlbum.getSongs();
        m.addAttribute("songs", songs);
        m.addAttribute("album", theAlbum);
        m.addAttribute("songSubmit", new Song());
        return "songs";
    }

    @PostMapping("/albums/{id}")
    public RedirectView songSubmit(@RequestParam String title, @RequestParam long length, @RequestParam int trackNumber, @PathVariable long id){
        Album a = AlbumRepository.findById(id).get();
        Song newSong = new Song(title, length, trackNumber, a);
        songRepository.save(newSong);
        return new RedirectView("/albums/{id}");
    }

}
