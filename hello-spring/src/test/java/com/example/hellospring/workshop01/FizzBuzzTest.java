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

        String expectedResult = String.valueOf(1);
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 2")
    public void case02() {
        Integer input = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = String.valueOf(2);
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 3")
    public void case03() {
        Integer input = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 4")
    public void case04() {
        Integer input = 4;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = String.valueOf(4);
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 6")
    public void case05() {
        Integer input = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 7")
    public void case07() {
        Integer input = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = String.valueOf(7);
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 8")
    public void case08() {
        Integer input = 8;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = String.valueOf(8);
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 9")
    public void case09() {
        Integer input = 9;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 11")
    public void case11() {
        Integer input = 11;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = String.valueOf(11);
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("input = 12")
    public void case12() {
        Integer input = 12;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.fizzBuzz(input);

        assertEquals(expectedResult, actualResult);
    }
}