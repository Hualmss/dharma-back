package com.dharma.infoBook.infoBookservice.service.impl;



import com.dharma.infoBook.infoBookservice.model.Genre;
import com.dharma.infoBook.infoBookservice.repository.GenreRepository;
import com.dharma.infoBook.infoBookservice.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {

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

    @Override
    public boolean ifGenreExistById(long id) {
        return genreRepository.findById(id).isPresent();
    }
}
