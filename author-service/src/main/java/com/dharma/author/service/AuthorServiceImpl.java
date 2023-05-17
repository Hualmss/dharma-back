package com.dharma.author.service;

import com.dharma.author.model.Author;
import com.dharma.author.repository.AuthorRepository;
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
}
