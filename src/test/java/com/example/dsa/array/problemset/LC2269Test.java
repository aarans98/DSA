package com.example.dsa.array.problemset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC2269Test {

    @Test
    public void divisorSubstringTest() {
        Assert.assertEquals(LC2269.divisorSubstrings(240,2),2);
        Assert.assertEquals(LC2269.divisorSubstrings(430043,2),2);
    }
}
