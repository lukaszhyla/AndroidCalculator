package com.lhyla.testsapp.calculator;


import java.math.BigDecimal;
import java.math.MathContext;

public class Calculator {

    public int add(Integer a, Integer b) throws NumberFormatException {
        if (isOneOfParamsIsNull(a, b)) {
            throw new NumberFormatException();
        }
        return a + b;

    }

    public int minus(Integer a, Integer b) throws NumberFormatException {
        if (isOneOfParamsIsNull(a, b)) {
            throw new NumberFormatException();
        }
        return a - b;
    }

    public int multiplication(Integer a, Integer b) throws NumberFormatException {
        if (isOneOfParamsIsNull(a, b)) {
            throw new NumberFormatException();
        }
        return a * b;
    }

    public BigDecimal divide(Integer a, Integer b) throws NumberFormatException {
        if (isOneOfParamsIsNull(a, b)) {
            throw new NumberFormatException();
        } else if (b == 0) {
            throw new ArithmeticException();
        }
        BigDecimal bigDecimalA = new BigDecimal(a);
        BigDecimal bigDecimalB = new BigDecimal(b);
        return bigDecimalA.divide(bigDecimalB, MathContext.DECIMAL32);
    }

    private boolean isOneOfParamsIsNull(Integer a, Integer b) {
        return a == null || b == null;
    }
}
