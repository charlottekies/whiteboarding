package com;

public class GetSums {

    /*
        1. Two Sum
         Given an array of integers, find two numbers that add up to a specific target sum.
    */

    public int[] getSums(int[] nums, int target) {
        if (nums.length > 1) {
            for (int i = 0; i<nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{nums[i], nums[j]};
                    }
                }
            }
        }
        return new int[0];
    }

}
