package com.example.dsa.array.problemset;

public class LC1588 {

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        System.out.println(sumOddLengthSubArraysBruteForce(arr));
        System.out.println(sumOddLengthSubArraysOptimalSolution(arr));
    }

    public static int sumOddLengthSubArraysBruteForce(int[] arr) {
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

    // intuition: https://www.youtube.com/watch?v=J5IIH35EBVE&t=18s
    public static int sumOddLengthSubArraysOptimalSolution(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int total = (n-i)*(i+1);
            if (total % 2 == 0) {
                sum += arr[i]*(total/2);
            } else {
                sum += arr[i]*(1+total/2);
            }
        }
        return sum;
    }
}
