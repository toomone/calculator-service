package com.octodemo.rest.calculatorservice.service;

import com.octodemo.lib.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    Calculator calculator = new Calculator();

    public int addition(int a, int b){
        return a + b;
    }

    public int substraction(int a, int b){
        return a - b;
    }


}
