package com.dharmaclient.dharmaclient.utils;

import com.dharmaclient.dharmaclient.model.Book;

import java.util.List;
import java.util.stream.IntStream;

public class DharmaClientUtils {
    public static void ListBooks(List<Book>books){

        IntStream.range(0, books.size())
                .forEach(i-> System.out.println("\t"+(i+1)+")"+books.get(i)));
    }
}
