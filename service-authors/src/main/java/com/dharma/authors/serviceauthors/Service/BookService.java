package com.dharma.authors.serviceauthors.Service;

import com.dharma.authors.serviceauthors.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookService {

    public Optional<Book> getBookById(long id);
    public List<Book> getAllBooks();
    public Optional<Book> updateBook(long id, Book book);
    public void deleteBookById(long id);
    public void saveBook(Book book);



}
