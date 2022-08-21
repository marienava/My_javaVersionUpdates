package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum1 = 0;
        for (Integer number : numbers) {
            sum1 = sum1+number;
        }

        System.out.println(sum1);

        System.out.println("=================");

        int result = numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);

        System.out.println("Dish calories total:");
        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
                .get();
        System.out.println(calTotal);

        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);






    }
}
