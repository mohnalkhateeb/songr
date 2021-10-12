package com.example.songr.controllers;

import modules.Album;
import modules.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.AlbumRepository;
import repository.SongRepository;

public class SongsController {

    @Autowired
    private SongRepository songRepository;
    @Autowired
    private AlbumRepository AlbumRepository;


    @GetMapping("/albums/{id}")
    public String getAlbumSong(@PathVariable long id, Model m){
        Album theAlbum = AlbumRepository.findById(id).get();
//        Iterable<Song> songs = theAlbum.getSongs();
//        m.addAttribute("songs", songs);
        m.addAttribute("album", theAlbum);
        m.addAttribute("addSong", new Song());
        return "songs";
    }

    @PostMapping("/albums/{id}")
    public String songSubmit(@RequestParam String title, @RequestParam long length, short trackNumber, @PathVariable long id){
        Album a = AlbumRepository.findById(id).get();
        Song newSong = new Song(title, length, trackNumber, a);
        songRepository.save(newSong);
        return "redirect:/albums/{id}";
    }
}
