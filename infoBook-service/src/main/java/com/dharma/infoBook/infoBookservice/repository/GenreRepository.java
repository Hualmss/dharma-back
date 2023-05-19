package com.dharma.infoBook.infoBookservice.repository;


import com.dharma.infoBook.infoBookservice.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenreRepository extends JpaRepository <Genre, Long> {

}
