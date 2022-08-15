package com.cydeo;

public class EvenPredicate implements UnaryPredicate<Integer> {

    public boolean test(Integer obj) {

        return obj%2==0;
    }
}
