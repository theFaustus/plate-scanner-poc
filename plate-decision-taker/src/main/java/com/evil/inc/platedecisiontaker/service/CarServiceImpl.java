package com.evil.inc.platedecisiontaker.service;

import com.evil.inc.platedecisiontaker.model.Car;
import com.evil.inc.platedecisiontaker.model.exception.CarNotFoundException;
import com.evil.inc.platedecisiontaker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Override
    public Car getCarByLicensePLate(String licensePLate) {
        return carRepository.findByLicensePlate(licensePLate).orElseThrow(() -> new CarNotFoundException("This " + licensePLate +  " is not valid"));
    }
}
