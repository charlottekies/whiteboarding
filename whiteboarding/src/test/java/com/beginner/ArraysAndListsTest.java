package com.beginner;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraysAndListsTest {

    private com.beginner.ArraysAndLists arraysAndLists;

    @BeforeEach
    void setUp() {
        arraysAndLists = new com.beginner.ArraysAndLists();
    }

    @AfterEach
    void tearDown() {
    }


    /** TwoSum Tests **/
    @Test
    void test_Get_Sums_Returns_Target() {
        int[] array = {7,3,2};
        int[] actual = arraysAndLists.getSums(array, 9);
        int[] expected = {7,2};

        Assert.assertEquals("Given array: [7,3,2] and target: 9, indexes [0,2] add up to target",expected[0], actual[0]);
        Assert.assertEquals("Given array: [7,3,2] and target: 9, indexes [0,2] add up to target",expected[1], actual[1]);

    }

    @Test
    void test_Get_Sums_When_Target_Is_0() {
        int[] array = {7,3,2};
        int[] actual = arraysAndLists.getSums(array, 0);
        int[] expected = new int[0];

        Assert.assertEquals("Given array: [7,3,2] and target: 0, expect an empty array because none of the given values add up to target.", actual.length, expected.length);
    }

    @Test
    void test_Get_Sums_When_Array_Is_Empty() {

    }

    @Test
    void test_Get_Sums_When_Target_Is_Negative_And_Array_Only_Positive() {
        int[] array = {7,3,2};
        int[] actual = arraysAndLists.getSums(array, -9);
        int[] expected = new int[0];

        Assert.assertEquals("Given array: [7,3,2] and target: 0, expect an empty array because none of the given values add up to the negative target.", actual.length, expected.length);
    }


    @Test
    void test_Get_Sums_When_Array_Has_Negative_Numbers_And_Target_Is_Positive() {
        int[] array = {-7,-3,-2};
        int[] actual = arraysAndLists.getSums(array, 9);
        int[] expected = new int[0];

        Assert.assertEquals("Given array: [7,3,2] and target: 0, expect an empty array because none of the given values add up to the negative target.", actual.length, expected.length);
    }

    @Test
    void test_Get_Sums_When_Array_Has_Two_Possible_Solutions() {
        int[] array = {1, 8, 3, 6};
        int[] actual = arraysAndLists.getSums(array, 9);
        int[] expected = new int[2];
        expected[0] = 1;
        expected[1] = 8;

        Assert.assertTrue(actual.length > 0);
        Assert.assertEquals("Given array: [1, 8, 3, 6] and target: 9, expect a new array: [1, 8]", actual[0], expected[0]);
        Assert.assertEquals("Given array: [1, 8, 3, 6] and target: 9, expect a new array: [1, 8]", actual[1], expected[1]);

    }

    /** Unique Pairs Tests **/

    // Helper methods
    private boolean containsSameElements(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int value : array1) {
            if (!containsValue(array2, value)) {
                return false;
            }
        }
        return true;
    }
    private boolean containsValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    // tests
    @Test
    void test_unique_pairs_returns_expected() {
        int[] array = {1, 8, 3, 6};
        int[][] actual = arraysAndLists.getUniquePairs(array, 9);
        int[] firstPair = {1,8};
        int[] secondPair = {3,6};
        int[][] expected = {firstPair, secondPair};
        int expectedRowLength = 2;

        Assert.assertTrue("Number of rows in should be greater than 0. There should be two rows, one representing each pair of values.", actual.length > 0);
        Assert.assertEquals("There should be two rows, each of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[0].length);
        Assert.assertEquals("There should be two rows, each of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[1].length);
        Assert.assertEquals("Given array: [1, 8, 3, 6] and target: 9, expect a new array: [[1, 8], [3, 6]",  expected[0][0], actual[0][0]);
    }

    @Test
    void test_unique_pairs_when_nums_is_empty() {
        int[] array = new int[0];
        int[][] actual = arraysAndLists.getUniquePairs(array, 9);
        int[] firstPair = new int[0];
        int[] secondPair = new int[0];
        int[][] expected = {firstPair, secondPair};
        int expectedRowLength = 0;

        Assert.assertTrue("", actual.length == 0);
        Assert.assertEquals(".", expectedRowLength, actual[0].length);
        Assert.assertEquals("",  expected[0][0], actual[0][0]);
    }

    @Test
    void test_unique_pairs_when_multiple_pairs_match() {
        int[] array = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
        int[][] actual = arraysAndLists.getUniquePairs(array, 9);
        int[] firstPair = {1,8};
        int[] secondPair = {2,7};
        int[] thirdPair = {4,5};
        int[][] expected = {firstPair, secondPair, thirdPair};
        int expectedRowLength = 2;
        // TODO: Consider the possibility that a solution might not add values to rows in the same order, and that rows might not be added in the same order
        // TODO: Consider validating that there is a row with 1 and 8 in it, for example
        Assert.assertTrue("The number of rows (number of unique pairs) should be 3", actual.length == expected.length);
        Assert.assertEquals("The rows should each contain 2 values.", expectedRowLength, actual[0].length);

        Assert.assertEquals("Row 0 column 0 should be 1",  expected[0][0], actual[0][0]);
        Assert.assertEquals("Row 0 column 1 should be 8",  expected[0][1], actual[0][1]);
        Assert.assertEquals("row 1 column 1 should be 7",  expected[1][1], actual[1][1]);
        Assert.assertEquals("row 1 column 0 should be 2",  expected[1][0], actual[1][0]);
        Assert.assertEquals("row 2 column 1 should be 5",  expected[2][1], actual[2][1]);
        Assert.assertEquals("row 2 column 0 should be 4",  expected[2][0], actual[2][0]);
    }

    @Test
    void test_unique_pairs_when_target_is_negative() {
        int[] array = {1,2,3,4,5,-7,6,5,4,3,-2,1};
        int[][] actual = arraysAndLists.getUniquePairs(array, -9);
        int[] firstPair = {-7,-2};
        int[][] expected = {firstPair};
        int expectedRowLength = 2;

        Assert.assertTrue("The number of rows (number of unique pairs) should be 1", actual.length == expected.length);
        Assert.assertEquals("The rows should each contain 2 values.", expectedRowLength, actual[0].length);

        Assert.assertTrue(containsSameElements(expected[0], actual[0]));
    }

    void test_unique_pairs_returns_expected_when_target_negative() {
        int[] array = {-1, 3, -8, 6};
        int[][] actual = arraysAndLists.getUniquePairs(array, -9);
        int[] firstPair = {1,8};
        int[][] expected = {firstPair};
        int expectedRowLength = 2;

        Assert.assertTrue("Number of rows in should be greater than 0. There should be one row, representing the single pair of values.", actual.length == 1);
        Assert.assertEquals("There should be 1 row, of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[0].length);
        Assert.assertTrue("Given array: [-1, 3, -8, 6] and target: -9, expect a new array: [[-1, -8]]] or [[-8, -1]]", containsSameElements(expected[0], actual[0]));
    }

    void test_unique_pairs_returns_empty_array_when_no_pairs_match() {
        int[] array = {1, 2, 3, 4, 12, 9};
        int[][] actual = arraysAndLists.getUniquePairs(array, -9);
        int[][] expected = {{}};
        int expectedRowNumber = 0;

        Assert.assertTrue("Number of rows in should be 0.", actual.length == expectedRowNumber);
    }


    void test_unique_pairs_returns_one_pair_when_duplicate_pairs_exist() {
        int[] array = {1, 2, 2, 1, 1, 2};
        int[][] actual = arraysAndLists.getUniquePairs(array, 3);
        int[] firstPair = {1,2};
        int[][] expected = {firstPair};
        int expectedRowLength = 2;

        Assert.assertTrue("Number of rows in should be greater than 0. There should be one row, representing the single pair of values.", actual.length == 1);
        Assert.assertEquals("There should be 1 row, of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[0].length);
        Assert.assertTrue("Given array: [1, 2, 2, 1, 1, 2] and target: 3, expect a new array: [[2, 1]]] or [[1, 2]]", containsSameElements(expected[0], actual[0]));
    }

    void test_unique_pairs_returns_expected_when_target_is_zero() {
        int[] array = {0, 0, -1, -1};
        int[][] actual = arraysAndLists.getUniquePairs(array, 0);
        int[] firstPair = {0,0};
        int[] secondPair = {-1,-1};
        int[][] expected = {firstPair, secondPair};
        int expectedRowLength = 2;
        int expectedNumberRows = 2;

        Assert.assertTrue("Number of rows in should be 2. There should be two rows, each representing the single pair of values.", actual.length == expectedNumberRows);
        Assert.assertEquals("There should be 2 rows, of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[0].length);
        Assert.assertEquals("There should be 2 rows, of length 2. Each row represents a pair of values that add up to the target.", expectedRowLength, actual[1].length);
        Assert.assertTrue("Given array: [0, 0, -1, -1] and target: 0, expect a new array: [[2, 1]]] or [[1, 2]]", containsSameElements(expected[0], actual[0]));
        Assert.assertTrue("Given array: [0, 0, -1, -1] and target: 0, expect a new array: [[2, 1]]] or [[1, 2]]", containsSameElements(expected[1], actual[1]));
    }


    void test_unique_pairs_when_input_invalid() {
        int[] array = {0};
        int[][] actual = arraysAndLists.getUniquePairs(array, 0);
        int[][] expected = {{}};
        int expectedRowLength = 0;
        int expectedNumberRows = 0;
        Assert.assertTrue("Number of rows in should be 0.", actual.length == expectedNumberRows);

        int[] emptyArray = new int[0];
        actual = arraysAndLists.getUniquePairs(emptyArray,5);
        Assert.assertTrue("Number of rows in should be 0.", actual.length == expectedNumberRows);

    }

//    Performance Test: If your method needs to handle large input arrays efficiently, consider writing a performance test to ensure it meets the required performance criteria.

//    Boundary Tests: Test the boundaries of your input space, including the maximum and minimum possible values for array elements and the target sum.


    /** findMaxValueTests **/
    @Test
    void findMaxValue() {
    }

    /** removeElementTests **/

    @Test
    void removeElement() {
    }

    /** calculateArraySumTests **/

    @Test
    void calculateArraySum() {
    }

    /**** LIST tests ****/

    /** twoSumListTests **/
    @Test
    void findTwoSum() {
    }

    /** reverseStringsListTests **/

    @Test
    void reverseStrings() {
    }

    /** findPalindromesListTest **/

    @Test
    void findPalindromes() {
    }

    /** findMaxValueInaListTests **/
    @Test
    void testFindMaxValue() {
    }

    /** removeElements tests **/
    @Test
    void removeElements() {
    }

    /** calculate list sum tests **/
    @Test
    void calculateListSum() {
    }
}