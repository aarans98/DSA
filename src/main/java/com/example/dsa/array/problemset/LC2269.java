package com.example.dsa.array.problemset;

public class LC2269 {

    public static int divisorSubstrings(int num, int k) {
        int left = 0;
        int right = k;
        int temp = 0;
        int count = 0;
        while (right <= String.valueOf(num).length()) {
            String numSubstr = "";
            numSubstr = String.valueOf(num).substring(left, right);
            temp = Integer.valueOf(numSubstr);
            if (temp != 0 && num % temp == 0) {
                count++;
            }
            left++;
            right++;
        }
        return count;
    }

}
