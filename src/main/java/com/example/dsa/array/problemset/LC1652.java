package com.example.dsa.array.problemset;

public class LC1652 {

    public static int[] decrypt(int[] code, int k) {
        int[] arr = new int[2*code.length];
        for (int i=0; i<arr.length; i++) {
            if (i < code.length) {
                arr[i] = code[i];
            } else {
                arr[i] = code[i-code.length];
            }
        }

        int prefixSum = 0;
        if (k > 0) {
            for (int i=0; i<k; i++) {
                prefixSum += code[i];
            }

            for (int i=0; i<code.length; i++) {
                code[i] = prefixSum - code[i] + arr[i+k];
                prefixSum = code[i];
            }
        } else if (k < 0) {
            int left = code.length+k;
            int right = code.length-1;
            for (int i=code.length-1; i>=code.length+k; i--) {
                prefixSum += arr[i];
            }

            for (int i=0; i<code.length; i++) {
                if (i == 0) {
                    code[i] = prefixSum;
                } else {
                    code[i] = prefixSum + arr[right] - arr[left-1];
                    prefixSum = code[i];
                }
                left++;
                right++;
            }
        } else {
            return new int[code.length];
        }
        return code;
    }

}
