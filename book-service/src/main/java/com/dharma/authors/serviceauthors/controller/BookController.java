package com.dharma.authors.serviceauthors.controller;

import com.dharma.authors.serviceauthors.Service.BookService;
import com.dharma.authors.serviceauthors.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping(value = "/{bookId}")
    public Book getBook(@PathVariable long bookId){
       return bookService.getBookById(bookId).get();
    }

    @GetMapping
    public List<Book> getAllBook(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public void saveBook(@RequestBody  Book book){
        bookService.saveBook(book);
    }

    @DeleteMapping(value="{id}")
    public void deleteBook(@PathVariable long id){
        bookService.deleteBookById(id);
    }


}
