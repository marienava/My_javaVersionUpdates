package com.cydeo.lambda_Tasks;

import java.util.function.*;

public class Functional_Interface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };

        //=====================PREDICATE=====================

        Predicate<Integer> lessThan = i-> i<18;
        System.out.println(lessThan.test(20));


        //=====================CONSUMER=====================

        Consumer<Integer> display = i-> System.out.println();
        display.accept(10);

        //=====================BI CONSUMER=====================

        BiConsumer<Integer,Integer> addTwo = (x,y)-> System.out.println(x+y);
        addTwo.accept(1,2);

        //=====================FUNCTION=====================

        Function<String, String> fun = s-> "Hello"+s;
        System.out.println(fun.apply("Cydeo"));

        //=====================BI FUNCTION=====================

        BiFunction<Integer, Integer, Integer> func = (x1,x2)-> x1+x2;
        System.out.println(func.apply(2, 3));

        //=====================SUPPLIER=====================

        Supplier<Double> randomValue = ()-> Math.random();
        System.out.println(randomValue.get());

    }
}
