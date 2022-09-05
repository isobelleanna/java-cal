package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void Calculate() {
        calculator.calculate( 1, 3 , "+");
        assertEquals(4, calculator.getO());
    }

    @Test
    void CalculateWithIrregularOperator() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate( 1, 3 , "p");
        });
    }

    @Test
    void CalculateWithStrings() throws IllegalArgumentException {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate( 2, Integer.parseInt("q"), "+");
        });
    }

    @Test
    void CalculateMinus() {
        calculator.calculate( 3, 1 , "-");
        assertEquals(2, calculator.getO());
    }

    @Test
    void CalculateMultiply() {
        calculator.calculate( 3, 2 , "*");
        assertEquals(6, calculator.getO());
    }

    @Test
    void CalculateDivide() {
        calculator.calculate( 10, 2 , "/");
        assertEquals(5, calculator.getO());
    }

    @Test
    void CalculatePowerOf() {
        calculator.calculate( 2, 4, "^");
        assertEquals(16, calculator.getO());
    }

    @Test
    void CalculateSquareRoot() {
        calculator.calculate( 16);
        assertEquals(4, calculator.getO());
    }
}