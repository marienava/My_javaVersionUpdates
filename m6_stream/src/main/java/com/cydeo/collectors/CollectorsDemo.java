package com.cydeo.collectors;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.DishTask;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        System.out.println("To Collection(Supplier)"); // is used to create a collection using collector
        List<Integer> numberList = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println("To List");// returns collector interface that gathers input data into a new list
        List<Integer> numberList2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("To SET"); //returns collector interface that gathers input data into a new set
        Set<Integer> numberList3 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberList3);

        System.out.println("To MAP (Function,Function)"); //returns collector interface that gathers input date into a new map
        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        System.out.println("SUMMING INT (To INT FUNCTION)"); //returnd collector that produces sum of a Integer-valued func

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        System.out.println("COUNTING"); // returns collector that counts the number of the elements
        Long eventCount = numbers.stream()
                        .filter(x->x%2==0)
                        .collect(Collectors.counting());
        System.out.println(eventCount);

        System.out.println("AVERAGING INT (To INT FUNCTION)"); //returns the average of the integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("JOINING()");// is used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("PARTITIONING BY()");// is used to partition a stream or objects(or a set of elements based on a given predicate
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("GROUPING BY()");// is ued for grouping objects by some property and storing results in a Map instance
        Map<Type, List<Dish>>dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);








    }
}
