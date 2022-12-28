package org.codetest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        Grader grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD(){
        Grader grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }

    @Test
    void seventyOneShouldReturnC(){
        Grader grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(71));
    }

    @Test
    void eightyOneShouldReturnB(){
        Grader grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(81));
    }

    @Test
    void ninetyTwoShouldReturnA(){
        Grader grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(92));
    }

}