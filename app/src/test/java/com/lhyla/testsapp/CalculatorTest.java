package com.lhyla.testsapp;

import com.lhyla.testsapp.calculator.Calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        calculator = null;
    }

    @Test
    public void addTwoInts() {
        assertEquals(2, calculator.add(1, 1));
    }

    @Test(expected = NumberFormatException.class)
    public void addTwoNulls() throws NumberFormatException {
        calculator.add(null, null);
    }

    @Test
    public void minus() {
        assertEquals(0, calculator.minus(1, 1));
    }

    @Test(expected = NumberFormatException.class)
    public void minusTwoNulls() throws NumberFormatException {
        calculator.minus(null, null);
    }

    @Test
    public void multiplication() {
        assertEquals(4, calculator.multiplication(2, 2));
    }

    @Test(expected = NumberFormatException.class)
    public void multiplicationTwoNulls() {
        calculator.multiplication(null, null);
    }

    @Test
    public void divideFirst() {
        String num = "0.1037736";
        assertEquals(num, String.valueOf(calculator.divide(22, 212)));
    }

    @Test(expected = NumberFormatException.class)
    public void divideTwoNulls() {
        calculator.multiplication(null, null);
    }
}