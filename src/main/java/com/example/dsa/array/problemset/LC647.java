package com.example.dsa.array.problemset;

public class LC647 {

    public static int countSubstrings(String s) {
        int left = 0;
        int n = s.length();
        int count = 0;
        while (left < n) {
            for (int i=left; i<n; i++) {
                if (isPalindrom(s.substring(left,i+1))) {
                    count++;
                }
            }
            left++;
        }
        return count;
    }

    public static boolean isPalindrom(String s) {
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
}
