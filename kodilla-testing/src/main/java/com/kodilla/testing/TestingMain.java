package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        Calculator calculator = new Calculator(5, 2);

        int resultAdd = calculator.add(5, 2);
        int resultSubstract = calculator.subtract(5, 2);


        if (resultAdd == 7 && resultSubstract == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        System.out.println("Test - drugi test jednostkowy:");


    }
}