package com.dharma.authors.serviceauthors.Service;

import com.dharma.authors.serviceauthors.CustomErrors.ResourceNotFound;

import com.dharma.authors.serviceauthors.FeignClients.InfoBookFeignClient;
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

    @Autowired
    private InfoBookFeignClient infoBookFeignClient;


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
        if(verifyNecessaryField(book))
            bookRepository.save(book);
        else{
            throw new ResourceNotFound("author, store or genre field are incorrect or empty");
        }
    }

    @Override
    public List<Book> getBooksByAuthorId(long id) {
        return bookRepository.findByAuthorId(id);
    }

    @Override
    public List<Book> getBooksByGenreId(long id) {
        return bookRepository.findByGenreId(id);
    }

    @Override
    public List<Book> getBooksByStoreId(long id) {
        return bookRepository.findByStoreId(id);
    }


    public boolean verifyNecessaryField(Book book){
        return existAuthor(book.getAuthorId())&&existStore(book.getStoreId())&&existGenre(book.getGenreId());
    }

    public boolean existGenre(long id){
        System.out.println("id: "+id);
        return infoBookFeignClient.existGenre(id);
    }

    public boolean existStore(long id){
        System.out.println("id: "+id);
        return infoBookFeignClient.existStore(id);
    }

    public boolean existAuthor(long id){
        System.out.println("id: "+id);
        return infoBookFeignClient.existAuthor(id);
    }
}
