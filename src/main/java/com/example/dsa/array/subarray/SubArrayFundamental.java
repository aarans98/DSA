package com.example.dsa.array.subarray;

public class SubArrayFundamental {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        generateSubArray(arr);
        System.out.println("====================");
        generateSubArrayWithRecursion(arr,0,0);
    }

    public static void generateSubArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void generateSubArrayWithRecursion(int[] nums, int start, int end) {
        if (start == nums.length) {
            return;
        } else if (start > end) {
            generateSubArrayWithRecursion(nums, 0, end + 1);
        } else {
            for (int i = start; i <= end; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            generateSubArrayWithRecursion(nums, start + 1, end);
        }
    }
}
