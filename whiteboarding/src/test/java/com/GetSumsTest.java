package com;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetSumsTest {
    private GetSums getSums;

    @BeforeEach
    void setUp() {
        getSums = new GetSums();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test_Get_Sums_Returns_Target() {
        int[] array = {7,3,2};
        int[] actual = getSums.getSums(array, 9);
        int[] expected = {7,2};

        Assert.assertEquals("Given array: [7,3,2] and target: 9, indexes [0,2] add up to target",expected[0], actual[0]);
        Assert.assertEquals("Given array: [7,3,2] and target: 9, indexes [0,2] add up to target",expected[1], actual[1]);

    }

    @Test
    void test_Get_Sums_When_Target_Is_0() {
        int[] array = {7,3,2};
        int[] actual = getSums.getSums(array, 0);
        int[] expected = new int[0];

        Assert.assertEquals("Given array: [7,3,2] and target: 0, expect an empty array because none of the given values add up to target.", actual.length, expected.length);
    }

    @Test
    void test_Get_Sums_When_Array_Is_Empty() {

    }

    @Test
    void test_Get_Sums_When_Target_Is_Negative_And_Array_Only_Positive() {
        int[] array = {7,3,2};
        int[] actual = getSums.getSums(array, -9);
        int[] expected = new int[0];

        Assert.assertEquals("Given array: [7,3,2] and target: 0, expect an empty array because none of the given values add up to the negative target.", actual.length, expected.length);
    }


    @Test
    void test_Get_Sums_When_Array_Has_Negative_Numbers_And_Target_Is_Positive() {
        int[] array = {-7,-3,-2};
        int[] actual = getSums.getSums(array, 9);
        int[] expected = new int[0];

        Assert.assertEquals("Given array: [7,3,2] and target: 0, expect an empty array because none of the given values add up to the negative target.", actual.length, expected.length);
    }
}