package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                //.map(i->i.getName())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("============================");

        //Print the length of the name of each dish
        DishData.getAll().stream()
                .map(i->i.getName().length())
                .forEach(System.out::println);

       /* DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        */


        System.out.println("============================");

        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(i->i.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);



        System.out.println("============================");

        //Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()
                .filter(i->i.getCalories()<400)
                //.sorted(Comparator.comparing(i->i.getCalories()))
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);


        // if we create stream this way => Stream <Dish> dishStream = DishData.getAll().stream()
        // we need to change return type to String Stream <String> dishStream







    }
}
