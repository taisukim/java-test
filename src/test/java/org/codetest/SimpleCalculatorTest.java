package org.codetest;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualsFour(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    void sevenPlusThreeShouldEqualsTen(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(7,3));
    }
}