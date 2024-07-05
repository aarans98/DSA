package com.example.dsa.array.problemset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> elementIndexMap = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int element = nums[i];
            if (!elementIndexMap.containsKey(element)) {
                elementIndexMap.put(element, new ArrayList<>());
            }

            elementIndexMap.get(element).add(i);
            if (elementIndexMap.get(element).size() > 1) {
                if (i - elementIndexMap.get(element).get(elementIndexMap.get(element).size()-2) <= k) {
                    return true;
                }
            }
        }

        return false;
    }
}
