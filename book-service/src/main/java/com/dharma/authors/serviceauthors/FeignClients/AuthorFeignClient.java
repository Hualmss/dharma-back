package com.dharma.authors.serviceauthors.FeignClients;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "author-service", path = "/author")
public interface AuthorFeignClient {
    @GetMapping(value = "/isPresent/{id}")
    public  boolean existAuthor(@PathVariable long id);

}
