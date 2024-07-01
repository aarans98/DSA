package com.example.dsa.array.problemset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC1588Test {

    @Test
    public void sumOddLengthSubArraysBruteForceTest() {
        Assert.assertEquals(LC1588.sumOddLengthSubArraysOptimalSolution(new int[]{1,4,2,5,3}), 58);
        Assert.assertEquals(LC1588.sumOddLengthSubArraysOptimalSolution(new int[]{1,2}), 3);
        Assert.assertEquals(LC1588.sumOddLengthSubArraysOptimalSolution(new int[]{10,11,12}), 66);
    }

}
