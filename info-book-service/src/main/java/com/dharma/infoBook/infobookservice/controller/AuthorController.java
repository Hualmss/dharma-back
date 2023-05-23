package com.dharma.infoBook.infobookservice.controller;


import com.dharma.infoBook.infobookservice.model.Author;
import com.dharma.infoBook.infobookservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/infoBook/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public List<Author> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping(value ="/{id}")
    public Optional<Author> getAuthorById(@PathVariable long id){
        return authorService.getAuthorById(id);
    }

    @PostMapping
    public void saveAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);
    }

    @DeleteMapping(value ="/{id}")
    public void deleteAuthorById(@PathVariable long id){
         authorService.deleteAuthorById(id);
    }

    @PutMapping(value = "/{id}")
    public Optional<Author> updateAuthor(@PathVariable long id , @RequestBody Author author){
        return authorService.updateAuthorById(id, author);
    }

    @GetMapping(value="/isPresent/{id}")
    public boolean ifGenreExistById(@PathVariable long id){
        return authorService.ifAuthorExistById(id);
    }

}
