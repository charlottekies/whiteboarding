package com.beginner;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.beginner.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

class DynamicProgrammingTest {

    private DynamicProgramming dynamicProgramming;

    @BeforeEach
    void setUp() {
        dynamicProgramming = new com.beginner.DynamicProgramming();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testCalculateFibonacci_With_Positive_Input() {
        // Test Fibonacci method with positive input values
        assertEquals(0, dynamicProgramming.calculateFibonacci(0));
        assertEquals(1, dynamicProgramming.calculateFibonacci(1));
        assertEquals(1, dynamicProgramming.calculateFibonacci(2));
        assertEquals(55, dynamicProgramming.calculateFibonacci(10));
        // Add more test cases as needed
    }

    @Test
    void calculateFibonacci_position_negative_1() {
        assertThrows(IllegalArgumentException.class, () -> dynamicProgramming.calculateFibonacci(-1));
    }

    @Test
    void calculateFactorial() {
        int actual = dynamicProgramming.calculateFactorial(0);
        int expected = 0;
        assertEquals(actual, expected);

        actual = dynamicProgramming.calculateFactorial(1);
        expected = 1;
        assertEquals(actual, expected);

        actual = dynamicProgramming.calculateFactorial(10);
        expected = 3628800;
        assertEquals(actual, expected);
    }

    @Test
    void calculateFactorial_when_negative() {
        assertThrows(IllegalArgumentException.class, () -> dynamicProgramming.calculateFibonacci(-1));
        assertThrows(IllegalArgumentException.class, () -> dynamicProgramming.calculateFibonacci(-10));
    }

    @Test
    void calculateFactorial_BoundaryTests() {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int actual = dynamicProgramming.calculateFactorial(maxValue);
        int expected = -1;

        assertEquals(actual, expected);

        assertThrows(IllegalArgumentException.class, () -> dynamicProgramming.calculateFibonacci(-minValue));
    }

    @Test
    void test_minCoins_valid_input_returns_expected() {
        int actual = dynamicProgramming.minCoins(new int[]{5, 10, 1, 1, 1, 5, 5, 5, 10, 10, 25, 25, 25, 25, 25, 25, 25, 5, 10, 10, 5, 5, 10, 1, 1}, 2);
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    void test_minCoins_valid_input_returns_negative_one_when_not_possible() {
        int actual = dynamicProgramming.minCoins(new int[]{5, 10, 1, 1, 1, 5, 5, 5, 10, 10, 25, 25, 25, 25, 25, 25, 25, 5, 10, 10, 5, 5, 10, 1, 1}, 100);
        int expected = -1;
        assertEquals(actual, expected);
    }

    @Test
    void test_minCoins_invalid_input_throws_exception() {
        assertThrows(IllegalArgumentException.class, () -> dynamicProgramming.minCoins(new int[]{5, 10, 1, 1, 1, 5, 5, 5, 10, 10, 25, 25, 25, 25, 25, 25, 25, 5, 10, 10, 5, 5, 10, 1, 1}, 100));
    }

}