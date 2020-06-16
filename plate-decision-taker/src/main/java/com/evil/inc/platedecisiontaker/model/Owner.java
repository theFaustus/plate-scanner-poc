package com.evil.inc.platedecisiontaker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Owner {
    private String firstName;
    private String lastName;
    private int age;
    private String telephoneNumber;
    private String email;
    private Company company;
    private List<Car> cars;

    public Owner(String firstName, String lastName, int age, String telephoneNumber, String email, Company company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.company = company;
    }
}
