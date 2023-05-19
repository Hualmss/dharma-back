package com.dharma.authors.serviceauthors.FeignClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "store-service", path = "/store")
public interface StoreFeignClient {
    @GetMapping(value = "/isPresent/{id}")
    public  boolean existStore(@PathVariable long id);
}
