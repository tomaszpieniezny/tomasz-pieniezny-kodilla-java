package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedian() {
        //given
        Book book1 = new Book("author1", "title1", 2001, "12345678");
        Book book2 = new Book("author2", "title2", 2002, "23456789");
        Book book3 = new Book("author3", "title3", 2003, "34567890");
        Set<Book> books = new HashSet<>(Arrays.asList(book1, book2, book3));
        MedianaAdapter medianAdapter = new MedianaAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        assertEquals(2002, median);
    }
}