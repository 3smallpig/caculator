package com.zhuhengan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {


        private final Calculator calculator = new Calculator();

        @Test
        void addsTwoNumbers() {
            assertEquals(5.0, calculator.add(2, 3));
        }

        @Test
        void subtractsTwoNumbers() {
            assertEquals(1.0, calculator.subtract(4, 3));
        }

        @Test
        void multipliesTwoNumbers() {
            assertEquals(12.0, calculator.multiply(3, 4));
        }

        @Test
        void dividesTwoNumbers() {
            assertEquals(2.5, calculator.divide(5, 2));
        }

        @Test
        void rejectsDivisionByZero() {
            assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        }

}
