package com.dharma.infoBook.infoBookservice.repository;


import com.dharma.infoBook.infoBookservice.model.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository <BookStore, Long> {

}
