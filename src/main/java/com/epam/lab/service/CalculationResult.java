package com.epam.lab.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalculationResult {
    private double firstOperand;
    private double secondOperand;
    private String result;

    public CalculationResult() {
    }

    public CalculationResult(double firstOperand, double secondOperand, String result) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.result = result;
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
