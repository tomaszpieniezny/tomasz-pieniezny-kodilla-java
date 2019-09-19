package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library Test 1");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Some Author " + n, " Some Title " + n,  LocalDate.now())));

        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library Test 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library Test 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When Then
        System.out.println(library);
        System.out.println(deepCloneLibrary);
        System.out.println(cloneLibrary);
        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());
        Assert.assertEquals(5, cloneLibrary.getBooks().size());

    }
}
