package com.dharma.authors.serviceauthors.Service;

import com.dharma.authors.serviceauthors.model.Book;
import com.dharma.authors.serviceauthors.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    @Override
    public Optional<Book> getBookById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> updateBook(long id, Book book) {
        if(bookRepository.findById(id).isPresent())
            return Optional.of(bookRepository.save(book));
        else
            return Optional.empty();
    }

    @Override
    public void deleteBookById(long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
}
