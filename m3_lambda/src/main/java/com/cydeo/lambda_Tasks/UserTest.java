package com.cydeo.lambda_Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Pollard",55));

        //print all elements in the list
        printName(users, user -> true);

        System.out.println("===========================");

        //print all people that last name starts with E
        printName(users, user->user.getLastName().startsWith("E"));



    }

    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
        }
    }
}