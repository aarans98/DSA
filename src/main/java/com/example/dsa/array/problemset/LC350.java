package com.example.dsa.array.problemset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int length = Math.max(nums1.length, nums2.length);
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<length; i++) {
            if (i < nums1.length) {
                if (map1.containsKey(nums1[i])) {
                    map1.put(nums1[i], map1.get(nums1[i]) + 1);
                } else {
                    map1.put(nums1[i], 1);
                }
            }

            if (i < nums2.length) {
                if (map2.containsKey(nums2[i])) {
                    map2.put(nums2[i], map2.get(nums2[i]) + 1);
                } else {
                    map2.put(nums2[i], 1);
                }
            }
        }

        for (Integer key : map1.keySet()) {
            if (map2.containsKey(key)) {
                if (map2.get(key).equals(map1.get(key))) {
                    for (int i=0; i<map2.get(key); i++) {
                        result.add(key);
                    }
                }

                if (!map2.get(key).equals(map1.get(key))) {
                    int boundary = Math.min(map2.get(key), map1.get(key));
                    for (int i=0; i<boundary; i++) {
                        result.add(key);
                    }
                }
            }
        }

        return convertToArray(result);
    }

    public static int[] convertToArray(List<Integer> weekly) {
        int[] result = new int[weekly.size()];
        for (int i=0; i<result.length; i++) {
            result[i] = weekly.get(i);
        }
        return result;
    }
}
