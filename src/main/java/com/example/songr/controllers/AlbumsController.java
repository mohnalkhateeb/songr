package com.example.songr.controllers;

import com.example.songr.modules.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.songr.repository.AlbumRepository;

@Controller
public class AlbumsController {

    @Autowired
    AlbumRepository albumRepository;
//    @GetMapping("/albums")
//    public String getAlbums(Model model ) {
////        public Album(String title, String artist, short songCount, long length, String imageUrl)
//        Album album1 = new Album("MMM" , "Majed",6,5.20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSDsgQXBkbDg1udaz1R3_-VH8cA0q3K4bGmFw&usqp=CAU");
//        Album album2 = new Album("MMM" , "Majed",6,5.20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQPC5yXb456bJiO4Ro8pEihRnZvXeS4wVI_NA&usqp=CAU");
//        Album album3 = new Album("MMM" , "Majed",6,5.20, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0Q_Q9msEykP7JVNA7EvlWYc5I5kXqnOorrQ&usqp=CAU");
//        List<Album> albums = new ArrayList<>();
//        albums.add(album1);
//        albums.add(album2);
//        albums.add(album3);
//        model.addAttribute("albums", albums);
//        return "albums";
//    }

    @GetMapping("/albums")
    public String getAllAlbums(Model m) {
        m.addAttribute("newAlbum", new Album());

        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums")
    public String albumSubmit(@ModelAttribute Album addAlbum) {
        albumRepository.save(addAlbum);
        return "redirect:/albums";
    }
}
