package com.epam.lab.service.soap;

import javax.xml.ws.Endpoint;

public class Exporter {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8090/calc", new CalculatorSoapServiceImpl());
        System.out.println("Calc SOAP Server started on host http://localhost:8090/calc");
    }
}
