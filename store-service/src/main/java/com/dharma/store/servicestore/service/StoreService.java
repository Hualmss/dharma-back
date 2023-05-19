package com.dharma.store.servicestore.service;

import com.dharma.store.servicestore.model.BookStore;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    public Optional<BookStore> getStoreById(Long id);

    public List<BookStore> getAllStores();

    public void deleteStoreById(long id);

    public BookStore updateStore(long id, BookStore store);

    public void saveStore(BookStore store);

    public boolean ifStoreExistById(long id);
}
