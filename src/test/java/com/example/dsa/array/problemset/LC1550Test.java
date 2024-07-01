package com.example.dsa.array.problemset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC1550Test {

    @Test
    public void lc1550Test() {
        Assert.assertEquals(LC1550.threeConsecutiveOdds(new int[]{2,6,4,1}), false);
        Assert.assertEquals(LC1550.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12}), true);
        Assert.assertEquals(LC1550.threeConsecutiveOdds(new int[]{1,1,1}), true);
    }
}
