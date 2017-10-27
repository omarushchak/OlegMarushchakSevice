package com.epam.lab.service.rest;

import com.epam.lab.service.CalculationResult;
import com.epam.lab.service.Calculator;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public class CalculatorRestService {
    private Calculator calculator;

    public CalculatorRestService(){
        calculator = new Calculator();
    }

    @GET
    @Path("/add/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResult add(@PathParam("a") double firstOperand,
                                 @PathParam("b") double secondOperand) {
        return calculator.add(firstOperand, secondOperand);
    }

    @GET
    @Path("/subtract/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResult subtract(@PathParam("a") double firstOperand,
                                      @PathParam("b") double secondOperand) {
        return calculator.subtract(firstOperand, secondOperand);
    }

    @GET
    @Path("/divide/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResult divide(@PathParam("a") double firstOperand,
                                    @PathParam("b") double secondOperand) {
        return calculator.divide(firstOperand, secondOperand);
    }

    @GET
    @Path("/multiply/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResult multiply(@PathParam("a") double firstOperand,
                                      @PathParam("b") double secondOperand) {
        return calculator.multiply(firstOperand, secondOperand);
    }

    @GET
    @Path("/percentage/{a}/{b}")
    @Produces(MediaType.APPLICATION_JSON)
    public CalculationResult percentage(@PathParam("a") double firstOperand,
                                        @PathParam("b") double secondOperand) {
        return calculator.percentage(firstOperand, secondOperand);
    }
}
