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

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Controller
@Transactional
public class SongsController {
    @Autowired
    private SongRepository songRepository;
    @Autowired
    private AlbumRepository albumRepository;


    @GetMapping("/albums/{id}")
    public String getAlbumSong(@PathVariable long id, Model m){
        Album theAlbum = albumRepository.findById(id).get();
        Iterable<Song> songs = theAlbum.getSongs();
        m.addAttribute("songs", songs);
        m.addAttribute("album", theAlbum);
        m.addAttribute("songSubmit", new Song());
        return "songs";
    }

    @PostMapping("/albums/{id}")
    public RedirectView songSubmit(@RequestParam String title, @RequestParam long length, @RequestParam int trackNumber, @PathVariable long id){
        Album a = albumRepository.findById(id).get();
        Song song = new Song(title, length, trackNumber, a);
        songRepository.save(song);
        return new RedirectView("/albums/{id}");
    }

}
