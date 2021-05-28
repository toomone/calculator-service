package com.octodemo.rest.calculatorservice.controller;

import com.octodemo.rest.calculatorservice.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable Integer a, @PathVariable Integer b) {
        return calculatorService.addition(a,b);
    }

}
