package com.example.hellospring.workshop01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("input = 1")
    public void case01() {
        Integer input = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        Integer expectedResult = 1;
        Integer actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }
}