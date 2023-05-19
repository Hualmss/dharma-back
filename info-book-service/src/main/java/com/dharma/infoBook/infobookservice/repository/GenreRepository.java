package com.dharma.infoBook.infobookservice.repository;



import com.dharma.infoBook.infobookservice.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenreRepository extends JpaRepository <Genre, Long> {

}
