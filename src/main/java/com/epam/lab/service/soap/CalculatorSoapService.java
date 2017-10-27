package com.epam.lab.service.soap;

public interface CalculatorSoapService {
    String add(double firstN, double secondN);
    String subtract(double firstN, double secondN);
    String divide(double firstN, double secondN);
    String multiply(double firstN, double secondN);
    String percentage(double firstN, double secondN);
}
