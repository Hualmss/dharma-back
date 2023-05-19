package com.dharma.infoBook.infoBookservice.service.impl;



import com.dharma.infoBook.infoBookservice.model.BookStore;
import com.dharma.infoBook.infoBookservice.repository.StoreRepository;
import com.dharma.infoBook.infoBookservice.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public Optional<BookStore> getStoreById(Long id) {
        return storeRepository.findById(id);
    }

    @Override
    public List<BookStore> getAllStores() {
        return storeRepository.findAll();
    }

    @Override
    public void deleteStoreById(long id) {
        storeRepository.deleteById(id);
    }

    @Override
    public BookStore updateStore(long id, BookStore store) {
        if(storeRepository.findById(id).isPresent())
            storeRepository.save(store);
        return null;
    }

    @Override
    public void saveStore(BookStore store) {
        storeRepository.save(store);
    }

    @Override
    public boolean ifStoreExistById(long id) {
        return storeRepository.findById(id).isPresent();
    }
}
