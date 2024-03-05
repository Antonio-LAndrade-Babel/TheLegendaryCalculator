package com.legendary.service;

import com.legendary.controller.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public double add(double a, double b) {
        return a + b;
    }
    @Override
    public double subtract(double a, double b){
        return a - b;
    }
    @Override
    public double multiply(double a, double b){
        return a * b;
    }
    @Override
    public double divide(double a, double b) throws IllegalArgumentException {
        if (b == 0) throw new IllegalArgumentException("Sacrilegio!!! Has intentado dividir por cero!!!");
        return a / b;
    }
}
