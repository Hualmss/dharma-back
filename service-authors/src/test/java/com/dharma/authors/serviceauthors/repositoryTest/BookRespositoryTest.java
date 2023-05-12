package com.dharma.authors.serviceauthors.repositoryTest;


import static org.assertj.core.api.Assertions.assertThat;

import com.dharma.authors.serviceauthors.model.Book;
import com.dharma.authors.serviceauthors.repository.BookRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;

@DataJpaTest
public class BookRespositoryTest {


    @Autowired
    private BookRepository bookRepository;

    private Book book;



    @Test
    void testSaveBook(){
        //g

        book = Book.builder()
                .name("El principito")
                .price(42.0f)
                .purchaseDate(new Date("2020-20-12"))
                .build();
        //whe
        Book savedBook= bookRepository.save(book);
        //then
        assertThat(savedBook).isNotNull();
        assertThat(savedBook.getId()).isGreaterThan(0);

    }
}
