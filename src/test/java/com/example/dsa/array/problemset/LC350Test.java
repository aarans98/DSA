package com.example.dsa.array.problemset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC350Test {

    @Test
    public void intersectTest() {
        Assert.assertEquals(LC350.intersect(new int[]{1,2,2,1}, new int[]{2,2}), new int[]{2,2});
        Assert.assertEquals(LC350.intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4}), new int[]{4,9});
        Assert.assertEquals(LC350.intersect(new int[]{2,1,2,1}, new int[]{2,2}), new int[]{2,2});
    }
}
