package com.evil.inc.platedecisiontaker.web.rest;

import com.evil.inc.platedecisiontaker.model.Car;
import com.evil.inc.platedecisiontaker.model.Decision;
import com.evil.inc.platedecisiontaker.model.LicensePlateDecisionInfo;
import com.evil.inc.platedecisiontaker.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plates")
@RequiredArgsConstructor
public class PlateDecisionTakerRestController {
    private final CarService carService;

    @GetMapping(value = "/{licensePlate}/validate")
    public ResponseEntity<LicensePlateDecisionInfo> validate(@PathVariable String licensePlate){
        Car carByLicensePLate = carService.getCarByLicensePLate(licensePlate);
        LicensePlateDecisionInfo licensePlateDecisionInfo = new LicensePlateDecisionInfo(carByLicensePLate.getOwner(), Decision.ALLOWED);
        return ResponseEntity.ok().body(licensePlateDecisionInfo);
    }
}
