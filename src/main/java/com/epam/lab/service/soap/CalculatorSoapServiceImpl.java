package com.epam.lab.service.soap;

import com.epam.lab.service.CalculationResult;
import com.epam.lab.service.Calculator;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.DecimalFormat;
import java.text.NumberFormat;

@WebService
public class CalculatorSoapServiceImpl implements CalculatorSoapService {
    NumberFormat formatter = new DecimalFormat("#0.0000");
    private Calculator calculator;

    public CalculatorSoapServiceImpl(){
        calculator = new Calculator();
    }

    @WebMethod
    public String add(double firstOperand, double secondOperand) {
        try {
            CalculationResult calculationResult = calculator.add(firstOperand, secondOperand);

            return calculationResult.getResult();
        } catch (Exception e) {
            System.out.println("Could not add values");
            return "Could not add values";
        }
    }

    @WebMethod
    public String subtract(double firstOperand, double secondOperand) {
        try {
            CalculationResult calculationResult = calculator.subtract(firstOperand, secondOperand);

            return calculationResult.getResult();
        } catch (Exception e) {
            System.out.println("Could not subtract values");
            return "Could not subtract values";
        }
    }

    @WebMethod
    public String divide(double firstOperand, double secondOperand) {
        try {
            CalculationResult calculationResult = calculator.divide(firstOperand, secondOperand);

            return calculationResult.getResult();
        } catch (Exception e) {
            System.out.println("Could not divide values");

            return "Could not divide values";
        }
    }

    @WebMethod
    public String multiply(double firstOperand, double secondOperand) {
        try {
            CalculationResult calculationResult = calculator.multiply(firstOperand, secondOperand);

            return calculationResult.getResult();
        } catch (Exception e) {
            System.out.println("Could not multiply values");
            return "Could not multiply values";
        }
    }

    @WebMethod
    public String percentage(double firstOperand, double secondOperand) {
        try {
            CalculationResult calculationResult = calculator.percentage(firstOperand, secondOperand);

            return calculationResult.getResult();
        } catch (Exception e) {
            System.out.println("Could not calculate percentage");
            return "Could not calculate percentage";
        }
    }
}
