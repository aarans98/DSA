package com.example.dsa.array.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceFundamental {

    public static void main(String[] args) {
         int[]  arr = {1,2,3,4,5};
        List<List<Integer>> subsequences = generateSubsequence(arr);
        printSubsequences(subsequences);
    }

    /**
     * For the array {1, 2, 3}, the binary representation of numbers from 0 to 7 (for 2^3 subsequences) will generate the following subsequences:
     * 000: []
     * 001: [1]
     * 010: [2]
     * 011: [1, 2]
     * 100: [3]
     * 101: [1, 3]
     * 110: [2, 3]
     * 111: [1, 2, 3]
     * This method ensures that all possible subsequences of the given array are generated and printed using a brute force approach.
     * @param arr
     */
    public static List<List<Integer>> generateSubsequence(int[] arr) {
        List<List<Integer>> subsequences = new ArrayList<>();
        int n = arr.length;
        int totalSubSequences = 1 << n;

        for (int i = 0; i < totalSubSequences; i++) {
            List<Integer> subsequence = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & 1 << j) != 0) {
                    subsequence.add(arr[j]);
                }
            }
            subsequences.add(subsequence);
        }
        return subsequences;
    }

    public static void printSubsequences(List<List<Integer>> subsequences) {
        for (List<Integer> subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }


}
