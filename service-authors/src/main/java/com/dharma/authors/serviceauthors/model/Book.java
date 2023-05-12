package com.dharma.authors.serviceauthors.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @JsonFormat(pattern = "YYY-MM-dd")
    private Date purchaseDate;

    @JsonFormat(pattern = "YYY-MM-dd")
    private Date readingStarDate;
    private float price;


}
