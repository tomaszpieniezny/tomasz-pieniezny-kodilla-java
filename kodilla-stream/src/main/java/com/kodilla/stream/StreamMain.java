package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nZadanie 7.1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC", text -> text + " jakis tekst");
        poemBeautifier.beautify("ABC", text -> text.toLowerCase() + " jakis tekst");
        poemBeautifier.beautify("Cos tam napisane", text -> text.substring(4, 8));
        poemBeautifier.beautify("eemmeemmm", text -> text.replace("m", "S"));

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("\nLambdas");
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nMethod references");
        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        System.out.println("\nMore than 11 characters");
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println("\nBook");
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println("\ngetList");
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("\nCollectors toList");
        BookDirectory theBookDirectory2 = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println("\nCollectors toMap");
        BookDirectory theBookDirectory3 = new BookDirectory();

        Map<String, Book> theResultMapOfBooks = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("\nCollectors joining");
        BookDirectory theBookDirectory4 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory4.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);

        System.out.println("\nZadanie 7.3");
        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfForumUser = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getPostCount() > 0)
                .filter(ForumUser -> ForumUser.getBirthdate().getYear() < 1999)
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .collect(Collectors.toMap(ForumUser::getID, ForumUser -> ForumUser));

        System.out.println("# elements: " + theResultMapOfForumUser.size());
        theResultMapOfForumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}