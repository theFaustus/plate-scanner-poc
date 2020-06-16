package com.evil.inc.platedecisiontaker.repository;

import com.evil.inc.platedecisiontaker.model.Car;
import com.evil.inc.platedecisiontaker.model.Company;
import com.evil.inc.platedecisiontaker.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CarRepositoryImpl implements CarRepository {
    private List<Car> cars;

    public CarRepositoryImpl() {
        this.cars = new ArrayList<>();
        Company isd = new Company("ISD", "www.isd.com");
        Owner lebron = new Owner("Lebron", "James", 23, "0(69)373-789", "ljames@gmail.com", isd);
        Owner bob = new Owner("Bob", "Dylan", 21, "0(69)373-119", "bdylan@gmail.com", isd);
        Owner mike = new Owner("Mike", "Jackson", 23, "0(69)373-789", "mjackson@gmail.com", isd);
        Car bmw = new Car("BMW", "7", 2002, "C AA 001", "Black", lebron);
        Car audi = new Car("Audi", "A6", 2006, "K ID 007", "Black", mike);
        Car mercedes = new Car("Mercedes", "W124", 2001, "AAK 491", "Red", bob);
        this.cars.add(bmw);
        this.cars.add(audi);
        this.cars.add(mercedes);
    }

    @Override
    public Optional<Car> findByLicensePlate(String licensePlate) {
        return cars.stream().filter(c -> c.getLicensePlate().equals(licensePlate)).findFirst();
    }
}
