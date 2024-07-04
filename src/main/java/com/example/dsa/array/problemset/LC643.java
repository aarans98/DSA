package com.example.dsa.array.problemset;

public class LC643 {
    public static double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return (double) nums[0];
        }
        double tempSum = 0;
        for (int i=0; i<k; i++) {
            tempSum += nums[i];
        }

        int left = 0;
        int right = k-1;
        double maxAverage = -Double.MAX_VALUE;
        while (right < nums.length) {
            if (left == 0 && right == k-1) {
                tempSum = tempSum;
            } else {
                int operation = nums[right] - nums[left-1];
                tempSum += operation;
            }

            if (tempSum/k > maxAverage) {
                maxAverage = tempSum/k;
            }
            left++;
            right++;
        }
        return maxAverage;
    }
}
