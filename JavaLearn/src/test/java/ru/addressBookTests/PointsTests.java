package ru.addressBookTests;

import org.example.Points;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointsTests {
    Points p = new Points(2,4,6,8);


    @Test(testName = "Negative")
    public void testPointFail (){
        Assert.assertEquals(p.distance(), 22.0);
    }

    @Test
    public void testPointPass () {
        Assert.assertEquals(p.distance(), 4.0);
    }

}

