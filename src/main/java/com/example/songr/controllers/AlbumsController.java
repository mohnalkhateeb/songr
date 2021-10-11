package com.example.songr.controllers;

import modules.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
public class AlbumsController {
    @GetMapping("/albums")
    public String getAlbums(Model model ) {
//        public Album(String title, String artist, short songCount, long length, String imageUrl)
        Album album1 = new Album("MMM" , "Majed",6,5.20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDsgQXBkbDg1udaz1R3_-VH8cA0q3K4bGmFw&usqp=CAU");
        Album album2 = new Album("MMM" , "Majed",6,5.20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPC5yXb456bJiO4Ro8pEihRnZvXeS4wVI_NA&usqp=CAU");
        Album album3 = new Album("MMM" , "Majed",6,5.20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0Q_Q9msEykP7JVNA7EvlWYc5I5kXqnOorrQ&usqp=CAU");
        List<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);
        albums.add(album3);
        model.addAttribute("albums", albums);
        return "albums";
    }
}
