package com.company;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        SimpleCalculator calculator2 = new SimpleCalculator();
        calculator.setFirstNumber(40);
        calculator.setSecondNumber(20);
        System.out.println("Sum is " + calculator.getAdditionResult());
        System.out.println("Difference is " + calculator.getSubtractionResult());
        System.out.println("Product is " + calculator.getMultiplicationResult());
        System.out.println("Division result is " + calculator.getDivisionResult());
    }
}
