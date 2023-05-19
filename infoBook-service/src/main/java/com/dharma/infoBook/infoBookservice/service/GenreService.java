package com.dharma.infoBook.infoBookservice.service;


import com.dharma.infoBook.infoBookservice.model.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {

    public Optional<Genre> getGenreById(long id);

    public List<Genre> getAllGenres();

    public Genre updateGenre (long id, Genre genre);

    public void deleteGenreById(long id);

    public void saveGenre(Genre genre);

    public boolean ifGenreExistById(long id);
}
