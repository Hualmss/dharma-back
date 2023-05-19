package com.dharma.infoBook.infobookservice.controller;


import com.dharma.infoBook.infobookservice.model.Genre;
import com.dharma.infoBook.infobookservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/infoBook/genre")
public class GenreController {


    @Autowired
    private GenreService genreService;


    @GetMapping(value ="/{id}")
    public Optional<Genre> getGenreById(@PathVariable long id){
        return genreService.getGenreById(id);
    }


    @GetMapping
    public List<Genre> getAllGenres(){
        return genreService.getAllGenres();
    }
    @PostMapping
    public void saveGenre(@RequestBody Genre genre){
        genreService.saveGenre(genre);

    }


    @PutMapping(value = "/{id}")
    public Genre updateGenre(@RequestBody Genre genre, @PathVariable long id){
        return genreService.updateGenre(id, genre);
    }

    @DeleteMapping(value="/{id}")
    public void deleteGenreById(@PathVariable long id){
        genreService.deleteGenreById(id);
    }


    @GetMapping(value="/isPresent/{id}")
    public boolean ifGenreExistById(@PathVariable long id){
        return genreService.ifGenreExistById(id);
    }
}
