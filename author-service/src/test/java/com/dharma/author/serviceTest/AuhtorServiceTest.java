package com.dharma.author.serviceTest;



import com.dharma.author.repository.AuthorRepository;
import com.dharma.author.service.AuthorService;
import com.dharma.author.service.AuthorServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuhtorServiceTest {

    @Mock
    private AuthorRepository authorRepository;


    @InjectMocks
    private AuthorServiceImpl authorService;





}
