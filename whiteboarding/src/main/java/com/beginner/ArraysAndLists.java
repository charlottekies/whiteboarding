package com.beginner;

/**
 * This class includes problems that involve Arrays and Lists.
 * These challenges deal with finding pairs or sets of numbers in a collection that, when combined with a given operator, result in an expected target.
 **/

public class ArraysAndLists {

    /*
        1. Two Sum
         Given an array of integers, find the first two numbers that add up to a specific target sum.

         example: given an array: [1, 3, 6], and a target: 9, the expected return is a new array: [3, 6]
         example: given an array: [1, 3, 6, 2, 9], and a target: 9, the expected return is a new array: [3, 6]
         example: given an array: [1, 8, 3, 6], and a target: 9, the expected return is a new array: [1, 8]
    */

    public int[] getSums(int[] nums, int target) {
        if (nums.length > 1) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{nums[i], nums[j]};
                    }
                }
            }
        }
        return new int[0];
    }


    /*
       2. Unique Pairs
        Given an array of integers, return an array of the unique pairs of matching values that add up to a given target sum.

        example: given an array: [1, 3, 6, 3], and a target: 9, the expected return is a new array: [[3, 6]]. The values at indices 2 and 3 ([6,3]) should not be included.
        example: given an array [1, 3, 6, 3], and a target: 3, the expected return is a new array: [[]] of length 0, because no two values add up to the expected target.
    */
    public int[][] getUniquePairs(int[] nums, int target) {
        // TODO: Implement method stub
        return new int[0][0];
    }

    /**
     * Given an array of integers, find the maximum value in the array.
     *
     * @param nums The input array.
     * @return The maximum value.
     */
    public int findMaxValue(int[] nums) {
        // TODO: Implement method stub
        return 0;
    }

    /**
     * Given an array of integers and a target value, remove all instances of the target value in-place and return the new length of the array.
     *
     * @param nums   The input array.
     * @param target The value to be removed.
     * @return The new length of the array after removal.
     */
    public int removeElement(int[] nums, int target) {
        // TODO: Implement method stub
        return 0;
    }

    /**
     * Given an array of integers, calculate the sum of all elements in the array.
     *
     * @param nums The input array.
     * @return The sum of all elements.
     */
    public int calculateArraySum(int[] nums) {
        // TODO: Implement method stub
        return 0;
    }

}
