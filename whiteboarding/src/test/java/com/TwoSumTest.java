package com;

import com.beginner.ArraysAndLists;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoSumTest {
    private ArraysAndLists getSums;

    @BeforeEach
    void setUp() {
        getSums = new ArraysAndLists();
    }

    @AfterEach
    void tearDown() {
    }


    /** TwoSum Tests **/
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

    @Test
    void test_Get_Sums_When_Array_Has_Two_Possible_Solutions() {
        int[] array = {1, 8, 3, 6};
        int[] actual = getSums.getSums(array, 9);
        int[] expected = new int[2];
        expected[0] = 1;
        expected[1] = 8;

        Assert.assertTrue(actual.length > 0);
        Assert.assertEquals("Given array: [1, 8, 3, 6] and target: 9, expect a new array: [1, 8]", actual[0], expected[0]);
        Assert.assertEquals("Given array: [1, 8, 3, 6] and target: 9, expect a new array: [1, 8]", actual[1], expected[1]);

    }

    /** Unique Pairs Tests **/
    @Test
    void test_unique_pairs_returns_expected() {
        int[] array = {1, 8, 3, 6};
        int[][] actual = getSums.getUniquePairs(array, 9);
        int[] firstPair = {1,8};
        int[] secondPair = {3,6};
        int[][] expected = {firstPair, secondPair};
        int expectedRowLength = 2;

        Assert.assertTrue("Number of rows in should be greater than 0. There should be two rows, one representing each pair of values.", actual.length > 0);
        Assert.assertEquals("There should be two rows, each of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[0].length);
        Assert.assertEquals("There should be two rows, each of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[1].length);
        Assert.assertEquals("Given array: [1, 8, 3, 6] and target: 9, expect a new array: [[1, 8], [3, 6]",  expected[0][0], actual[0][0]);
    }


//    Empty Input Array Test: Test the case when the input array nums is empty. The method should return an empty two-dimensional array.

//    Input Array with No Pairs Test: Test the case when there are no pairs of elements in the input array that add up to the target. The method should return an empty two-dimensional array.

//    Target Sum Negative Test: Test a scenario where the target sum is negative. Verify that the method correctly handles this case and returns expected unique pairs.

//    Target Sum Negative No Pairs Test: Test a scenario where the target sum is negative. Verify that the method correctly handles this case and returns expected unique pairs.

//    Negative Numbers Test: Test the method with an input array containing negative numbers and a target sum that includes both positive and negative numbers.

//    Multiple Unique Pairs Test: Test a scenario where there are multiple pairs of elements in the input array that add up to the target. Verify that the method returns all the unique pairs.

//    Duplicate Pairs Test: Test a scenario where there are duplicate pairs of elements in the input array that add up to the target. Ensure that the method returns only unique pairs.

//    Large Input Test: Test the method with a large input array and target sum to ensure it performs efficiently and doesn't exceed time or space limits.

//    Target Sum Zero Test: Test a scenario where the target sum is zero. Consider testing when the array contains pairs of 0s and pairs of negative / positive numbers that add up to 0..

//    Edge Case Test / Invalid Input Test(s): Test the method with edge cases, such as very small input arrays or arrays with only one element.

//    Performance Test: If your method needs to handle large input arrays efficiently, consider writing a performance test to ensure it meets the required performance criteria.

//    Boundary Tests: Test the boundaries of your input space, including the maximum and minimum possible values for array elements and the target sum.

}