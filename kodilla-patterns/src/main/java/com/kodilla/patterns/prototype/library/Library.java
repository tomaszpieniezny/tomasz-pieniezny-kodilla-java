package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Book task : books) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theList : books) {
            Book clonedList = new Book(theList.getTitle(), theList.getAuthor(), theList.getPublicationDate());
            clonedLibrary.getBooks().add(clonedList);
        }
        return clonedLibrary;
    }
    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }
}