package com.cydeo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {

    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }
}
