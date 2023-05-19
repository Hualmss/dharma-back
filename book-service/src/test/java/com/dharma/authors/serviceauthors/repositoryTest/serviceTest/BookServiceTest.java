package com.dharma.authors.serviceauthors.repositoryTest.serviceTest;

import com.dharma.authors.serviceauthors.Service.BookService;
import com.dharma.authors.serviceauthors.Service.BookServiceImpl;
import com.dharma.authors.serviceauthors.model.Book;
import com.dharma.authors.serviceauthors.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl bookService;


    private Book book;

    @BeforeEach
    void setup(){
        this.book = Book.builder()
                .name("libro de prueba")
                .genreId(1)
                .price(22)
                .authorId(1)
                .storeId(1)
                .build();

    }

    @Test
    public void listBooksByAuthorId(){
        //given
        given(bookRepository.findByAuthorId(1L)).willReturn(List.of(book));

        //when
        List<Book>books = bookService.getBooksByAuthorId(1);


        // then
        assertThat(books).isNotNull();
        assertThat(books.size()).isGreaterThan(0);
    }
}


//given
//when
// then
