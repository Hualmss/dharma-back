package com.dharma.infoBook.infoBookservice.service;



import com.dharma.infoBook.infoBookservice.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    public Optional<Author> getAuthorById(long id);

    public List<Author> getAllAuthors();

    public void deleteAuthorById(long id);

    public Author updateAuthorById(long id, Author author );

    public void saveAuthor(Author author);

    public boolean ifAuthorExistById(long id);
}
