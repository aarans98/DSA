package com.example.dsa.array.problemset;

import org.testng.Assert;

public class LC647Test {

    public void countSubstringsTest() {
        Assert.assertEquals(LC647.countSubstrings("abc"), 3);
        Assert.assertEquals(LC647.countSubstrings("aaa"), 3);
    }
}
