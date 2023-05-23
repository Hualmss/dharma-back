package com.dharmaclient.dharmaclient.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor@NoArgsConstructor
public class Book {
    private long id;
    private String name;

    private long authorId;

    private long storeId;

    private long genreId;

    @JsonFormat(pattern = "YYY-MM-dd")
    private Date purchaseDate;

    @JsonFormat(pattern = "YYY-MM-dd")
    private Date readingStarDate;
    private float price;
}
