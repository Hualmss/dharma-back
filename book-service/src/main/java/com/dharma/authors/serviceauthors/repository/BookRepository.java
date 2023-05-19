package com.dharma.authors.serviceauthors.repository;

import com.dharma.authors.serviceauthors.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository <Book, Long> {
    List<Book> findByAuthorId(long id);
    List<Book> findByStoreId(long id);
    List<Book> findByGenreId(long id);
}
