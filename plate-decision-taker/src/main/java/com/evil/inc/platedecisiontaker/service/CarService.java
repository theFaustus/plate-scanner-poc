package com.evil.inc.platedecisiontaker.service;

import com.evil.inc.platedecisiontaker.model.Car;

public interface CarService {
    Car getCarByLicensePLate(String licensePLate);
}
