package org.example.Homework.hw5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    @Test
    void grade() {
        assertEquals("A",GradeCalculator.grade(90));
    }
}