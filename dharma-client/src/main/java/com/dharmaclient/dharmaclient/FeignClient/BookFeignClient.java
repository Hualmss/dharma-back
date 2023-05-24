package com.dharmaclient.dharmaclient.FeignClient;


import com.dharmaclient.dharmaclient.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name  = "gateway-service", url = "http://localhost:8081", path = "/book")
public interface BookFeignClient {

    @GetMapping
    public List<Book> getListBooks();

}
