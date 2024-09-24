package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("TI84");
        System.out.println(calculator.performOperation("+", 10, -5));
        System.out.println(calculator.divisibleBy(8, 2));
        System.out.println(calculator.coordinatePair(2,3));
        System.out.println(calculator.info());
    }
}