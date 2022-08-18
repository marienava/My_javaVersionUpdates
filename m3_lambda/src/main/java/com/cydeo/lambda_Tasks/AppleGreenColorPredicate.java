package com.cydeo.lambda_Tasks;

public class AppleGreenColorPredicate implements ApplePredicate{


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
