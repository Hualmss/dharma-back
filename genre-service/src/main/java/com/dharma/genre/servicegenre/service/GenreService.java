package com.dharma.genre.servicegenre.service;

import com.dharma.genre.servicegenre.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService  {

    public Optional<Genre> getGenreById(long id);

    public List<Genre> getAllGenres();

    public Genre updateGenre (long id, Genre genre);

    public void deleteGenreById(long id);

    public void saveGenre(Genre genre);

    public boolean ifGenreExistById(long id);
}
