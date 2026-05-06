package org.example;

public class Calculator {
    public double calculateRatio(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        return sum / product;
    }

    public void printResult(double result) {
        System.out.println("Result: " + result);
    }
}