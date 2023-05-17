package com.dharma.store.servicestore.controller;

import com.dharma.store.servicestore.model.BookStore;
import com.dharma.store.servicestore.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping
    public List<BookStore> getAllStores(){
        return storeService.getAllStores();
    }

    @GetMapping(value = "/{id}")
    public Optional<BookStore> getStoreById(@PathVariable long id){
        return storeService.getStoreById(id);
    }

    @PostMapping
    public void saveStore(@RequestBody BookStore store){
        storeService.saveStore(store);
    }

    @PutMapping(value = "/{id}")
    public BookStore updateStore(@PathVariable long id, @RequestBody BookStore store){
        return storeService.updateStore(id, store);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable long id){
        storeService.deleteStoreById(id);
    }

}
