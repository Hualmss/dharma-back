package com.dharma.authors.serviceauthors.FeignClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "genre-service", path ="/genre" )

public interface GenreFeignClient {

    @GetMapping(value = "/isPresent/{id}")
    public  boolean existGenre(@PathVariable long id);
}
