package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        /*
        //Creating unmodifiable List before java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java", "Spring", "Agile"));
        courses.add("TS");
        System.out.println(courses);

         */


        //Creating unmodifiable List after java9
        List<String> myCourse = List.of("Java", "Spring", "Agile");
        System.out.println(myCourse);

        //Creating unmodifiable Set after java9
        Set<String> myProducts = Set.of("Milk", "Bread", "Butter");
        System.out.println(myProducts);

        //Creating unmodifiable Map after java9
        Map<String, Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV", 1),
                Map.entry("PSP", 1),
                Map.entry("Chair", 5)
        );
        System.out.println(myCart);

    }

}
