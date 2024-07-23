package com.example.dsa.array.problemset;

public class LC724 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        int count = 0;
        for (int i=0; i<nums.length; i++) {
            count += nums[i];
            int leftSum = count - nums[i];
            int rightSum = sum - count;
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
