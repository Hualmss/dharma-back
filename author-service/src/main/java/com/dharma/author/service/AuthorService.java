package com.dharma.author.service;

import com.dharma.author.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    public Optional<Author> getAuthorById(long id);

    public List<Author> getAllAuthors();

    public void deleteAuthorById(long id);

    public Author updateAuthorById(long id, Author author );

    public void saveAuthor(Author author);
}
