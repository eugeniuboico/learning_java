package org.example.Homework.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BiggerNumberTest {

    @ParameterizedTest(name = "{0} -> {1} -> {2} -> {3}")
    @CsvSource(
            {
                    "1, 2, 3, 3",
                    "2, 3, 1, 3",
                    "3, 1, 2, 3",
                    "3, 2, 1, 3",
                    "5, 5, 5, 5",
                    "5, 1, 5, 5",
                    "-1, -2, -3, -1",
                    "2147483647, 0, -1, 2147483647"

            }
    )
    void biggerOfThree( int first, int second, int third, int expected) {
        assertEquals(expected, BiggerNumber.biggerOfThree(first, second, third));
    }
}