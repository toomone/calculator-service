package com.octodemo.rest.calculatorservice.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int addition(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }


}
