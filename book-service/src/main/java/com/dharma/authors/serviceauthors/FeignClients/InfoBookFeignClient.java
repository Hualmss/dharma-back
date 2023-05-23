package com.dharma.authors.serviceauthors.FeignClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "info-book-service", path = "/infoBook")
public interface InfoBookFeignClient {
    @GetMapping(value = "/store/isPresent/{id}")
    public  boolean existStore(@PathVariable long id);


    @GetMapping(value = "/genre/isPresent/{id}")
    public  boolean existGenre(@PathVariable long id);


    @GetMapping(value = "/author/isPresent/{id}")
    public  boolean existAuthor(@PathVariable long id);
}
