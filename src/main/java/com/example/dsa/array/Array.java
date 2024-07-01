package com.example.dsa.array;

public class Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = arr.length;

        System.out.println("sub array count of arr : " + countSubarrays(length));
        System.out.println("sub sequences count of arr : " + countSubSequences(length));
    }

    public static int countSubarrays(int n) {
        return ((n)*(n+1))/2;
    }

    public static int countSubSequences(int n) {
        return (int) Math.pow(2, n); // or 1 << n
    }
}
