package com.example.dsa.array.problemset;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LC1652Test {

    @Test
    public void decryptTest() {
        Assert.assertEquals(LC1652.decrypt(new int[]{5,7,1,4},3), new int[]{12,10,16,13});
    }
}
