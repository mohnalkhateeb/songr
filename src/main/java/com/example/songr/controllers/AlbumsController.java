package com.example.songr.controllers;

import modules.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class AlbumsController {

    @GetMapping("/albums")
    public String getAlbums(Model model ) {
//        public Album(String title, String artist, short songCount, long length, String imageUrl)
        Album album1 = new Album("MMM" , "Majed",6,5.20, "jokjnn");
        Album album2 = new Album("MMM" , "Majed",6,5.20, "jokjnn");
        Album album3 = new Album("MMM" , "Majed",6,5.20, "jokjnn");
        List<Album> albums= new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);

        model.addAttribute("albums", albums);
        return "albums";
    }
}
