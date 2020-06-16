package com.evil.inc.platedecisiontaker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private int year;
    private String licensePlate;
    private String color;
    private Owner owner;
}
