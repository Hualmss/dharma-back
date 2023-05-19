package com.dharma.infoBook.infobookservice.repository;



import com.dharma.infoBook.infobookservice.model.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends JpaRepository <BookStore, Long> {

}
