package com.evil.inc.platedecisiontaker.web.rest;

import com.evil.inc.platedecisiontaker.model.Decision;
import com.evil.inc.platedecisiontaker.model.LicensePlateDecisionInfo;
import com.evil.inc.platedecisiontaker.model.exception.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<LicensePlateDecisionInfo> forbiddenCar(){
        LicensePlateDecisionInfo licensePlateDecisionInfo = new LicensePlateDecisionInfo(null, Decision.FORBIDDEN);
        return ResponseEntity.ok(licensePlateDecisionInfo);
    }
}
