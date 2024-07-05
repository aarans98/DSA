package com.example.dsa.array.problemset;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LC219Test {

    @Test
    public void containsNearbyDuplicateTest() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(LC219.containsNearbyDuplicate(new int[]{1,2,3,1},3),true, "First assertion failed");
        softAssert.assertEquals(LC219.containsNearbyDuplicate(new int[]{1,0,1,1},1),true, "Second assertion failed");
        softAssert.assertEquals(LC219.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2),false, "Third assertion failed");
        softAssert.assertAll();
    }
}
