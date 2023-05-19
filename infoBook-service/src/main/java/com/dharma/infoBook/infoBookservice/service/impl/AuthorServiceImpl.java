package com.dharma.infoBook.infoBookservice.service.impl;


import com.dharma.infoBook.infoBookservice.model.Author;
import com.dharma.infoBook.infoBookservice.repository.AuthorRepository;
import com.dharma.infoBook.infoBookservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public Optional<Author> getAuthorById(long id) {
        return authorRepository.findById(id);
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public void deleteAuthorById(long id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Author updateAuthorById(long id, Author author) {
        if(authorRepository.findById(id).isPresent())
            return authorRepository.save(author);
        return null;
    }

    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public boolean ifAuthorExistById(long id) {
        return authorRepository.findById(id).isPresent();
    }
}
