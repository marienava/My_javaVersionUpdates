package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4);
       // list.forEach(System.out::println);
        //list.forEach((x) -> System.out.println(x));

        System.out.println("FILTER");
        //Filter
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);

        System.out.println("DISTINCT");

        //Distinct
        Stream<Integer> str = list.stream()
                .filter(i->i%2==0)
                .distinct();
        str.forEach(System.out::println); // stream is closed

        System.out.println("LIMIT");
        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);


    }
}
