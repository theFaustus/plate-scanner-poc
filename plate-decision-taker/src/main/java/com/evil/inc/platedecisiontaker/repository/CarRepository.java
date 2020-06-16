package com.evil.inc.platedecisiontaker.repository;

import com.evil.inc.platedecisiontaker.model.Car;

import java.util.Optional;

public interface CarRepository {
    Optional<Car> findByLicensePlate(String licensePlate);
}
