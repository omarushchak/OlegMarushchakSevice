package com.epam.lab.service;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator {
    static NumberFormat formatter = new DecimalFormat("#0.0000");

    public CalculationResult add(double firstOperand, double secondOperand) {
        try {
            String result = getFormattedResult(firstOperand + secondOperand);

            return new CalculationResult(firstOperand, secondOperand, result);

        } catch (Exception e) {
            System.out.println("Could not add values");

            return new CalculationResult(firstOperand, secondOperand,"Could not add values");
        }
    }

    public CalculationResult subtract(double firstOperand, double secondOperand) {
        try {
            String result = getFormattedResult(firstOperand - secondOperand);

            return new CalculationResult(firstOperand, secondOperand, result);

        } catch (Exception e) {
            System.out.println("Could not subtract values");

            return new CalculationResult(firstOperand, secondOperand,"Could not subtract values");
        }
    }

    public CalculationResult divide(double firstOperand, double secondOperand) {
        try {
            String result = getFormattedResult(firstOperand / secondOperand);

            return new CalculationResult(firstOperand, secondOperand, result);

        } catch (Exception e) {
            System.out.println("Could not divide values");

            return new CalculationResult(firstOperand, secondOperand,"some error");
        }
    }

    public CalculationResult multiply(double firstOperand, double secondOperand) {
        try {
            String result = getFormattedResult(firstOperand * secondOperand);

            return new CalculationResult(firstOperand, secondOperand, result);
        } catch (Exception e) {

            System.out.println("Could not multiply values");

            return new CalculationResult(firstOperand, secondOperand,"Could not multiply values");
        }
    }

    public CalculationResult percentage(double firstOperand, double secondOperand) {
        try {
            String result = getFormattedResult(firstOperand % secondOperand);

            return new CalculationResult(firstOperand, secondOperand, result);

        } catch (Exception e) {
            System.out.println("Could not calculate percentage");

            return new CalculationResult(firstOperand, secondOperand,"Could not calculate percentage");
        }
    }

    private String getFormattedResult(double result){
        return formatter.format(result);
    }
}
