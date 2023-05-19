package com.dharma.infoBook.infoBookservice.repository;


import com.dharma.infoBook.infoBookservice.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthorRepository extends JpaRepository <Author, Long> {

}
