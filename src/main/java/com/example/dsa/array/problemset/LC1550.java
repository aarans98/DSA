package com.example.dsa.array.problemset;

public class LC1550 {

    public static boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 2) {
            return false;
        }
        int left = 0;
        int right = 2;
        while (right != arr.length) {
            int count = 0;
            for (int i=left; i<=right; i++) {
                if (arr[i] % 2 != 0) {
                    count++;
                }
            }
            if (count == 3) {
                return true;
            }
            left++;
            right++;
        }
        return false;
    }
}
