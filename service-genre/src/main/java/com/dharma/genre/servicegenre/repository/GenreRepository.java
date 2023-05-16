package com.dharma.genre.servicegenre.repository;

import com.dharma.genre.servicegenre.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GenreRepository extends JpaRepository <Genre, Long> {

}
