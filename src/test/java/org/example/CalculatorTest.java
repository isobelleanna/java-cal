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
    void CalculateWithDoubles() {
        calculator.calculate( 1.3, 3.2 , "+");
        assertEquals(4.5, calculator.getO());
    }
    @Test
    void CalculateWithMinusNumbers() {
        calculator.calculate( 1, -3 , "+");
        assertEquals(-2, calculator.getO());
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
    void CalculateMinusWithMinusNumbers() {
        calculator.calculate( 3, -1 , "-");
        assertEquals(4, calculator.getO());
    }

    @Test
    void CalculateMinusWithDoubles() {
        calculator.calculate( 3.2, 1.1 , "-");
        assertEquals(2.1, calculator.getO());
    }
    @Test
    void CalculateMultiply() {
        calculator.calculate( 3, 2 , "*");
        assertEquals(6, calculator.getO());
    }

    @Test
    void CalculateMultiplywithMinusNumbers() {
        calculator.calculate( -3, 2 , "*");
        assertEquals(-6, calculator.getO());
    }

    @Test
    void CalculateMultiplyWithDoubles() {
        calculator.calculate( 3.3, 2.2 , "*");
        assertEquals(7.26, calculator.getO());
    }
    @Test
    void CalculateDivide() {
        calculator.calculate( 10, 2 , "/");
        assertEquals(5, calculator.getO());
    }

    @Test
    void CalculateDivideWithMinusNumbers() {
        calculator.calculate( 10, -2 , "/");
        assertEquals(-5, calculator.getO());
    }

    @Test
    void CalculateDivideWithDoubles() {
        calculator.calculate( 5.4, 2 , "/");
        assertEquals(2.7, calculator.getO());
    }

    @Test
    void CalculatePowerOf() {
        calculator.calculate( 2, 4, "^");
        assertEquals(16, calculator.getO());
    }

    @Test
    void CalculatePowerOfWithMinusNumbers() {
        calculator.calculate( -2, 4, "^");
        assertEquals(16, calculator.getO());
    }

    @Test
    void CalculatePowerOfWithDoubles() {
        calculator.calculate( 2.2, 4.4, "^");
        assertEquals(32, calculator.getO());
    }

    @Test
    void CalculateSquareRoot() {
        calculator.calculate( 16);
        assertEquals(4, calculator.getO());
    }

    @Test
    void CalculateSquareRootWithMinusNumber() {
        calculator.calculate( -16);
        assertEquals(0, calculator.getO());
    }

    @Test
    void CalculateSquareRootWithADouble() {
        calculator.calculate( 16.4);
        assertEquals(4, calculator.getO());
    }
}