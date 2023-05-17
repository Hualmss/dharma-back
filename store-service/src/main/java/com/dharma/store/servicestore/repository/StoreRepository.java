package com.dharma.store.servicestore.repository;

import com.dharma.store.servicestore.model.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository  extends JpaRepository <BookStore, Long> {

}
