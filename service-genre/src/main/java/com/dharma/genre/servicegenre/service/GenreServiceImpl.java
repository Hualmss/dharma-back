package com.dharma.genre.servicegenre.service;


import com.dharma.genre.servicegenre.model.Genre;
import com.dharma.genre.servicegenre.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService{

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public Optional<Genre> getGenreById(long id) {
        return genreRepository.findById(id);
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre updateGenre(long id, Genre genre) {
        if(genreRepository.findById(id).isPresent())
            return genreRepository.save(genre);
        return null;
    }

    @Override
    public void deleteGenreById(long id) {
        genreRepository.deleteById(id);
    }

    @Override
    public void saveGenre(Genre genre) {
        genreRepository.save(genre);
    }
}
