package com.lhyla.testsapp.calculator;

import java.math.BigDecimal;
import java.math.MathContext;

public class Calculator {

    public int add(Integer a, Integer b) {
        return a + b;

    }

    public int minus(Integer a, Integer b) {
        return a - b;
    }

    public int multiplication(Integer a, Integer b) {
        return a * b;
    }

    public BigDecimal divide(Integer a, Integer b) {
        BigDecimal bigDecimalA = new BigDecimal(a);
        BigDecimal bigDecimalB = new BigDecimal(b);
        return bigDecimalA.divide(bigDecimalB, MathContext.DECIMAL32);
    }
}
