package com.example.dsa.array.problemset;

public class LC1588 {

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubarraysBruteForce(arr));
    }

    public static int sumOddLengthSubarraysBruteForce(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int count = 0;
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    count++;
                }

                if  (count % 2 != 0) {
                    ans += sum;
                }
            }
        }
        return ans;
    }
}
