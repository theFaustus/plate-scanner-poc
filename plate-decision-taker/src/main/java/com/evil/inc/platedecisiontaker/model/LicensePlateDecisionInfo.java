package com.evil.inc.platedecisiontaker.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class LicensePlateDecisionInfo {
    private Owner owner;
    private Decision decision;
}
