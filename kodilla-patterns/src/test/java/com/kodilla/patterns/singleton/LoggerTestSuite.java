package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog(){
        //Given
        //When
        Logger.getInstance().Log("Test 22:48 17-09-2019");
        Logger.getInstance().Log("Test 23:08 17-09-2019");
        //Then
        Assert.assertEquals("Test 23:08 17-09-2019", Logger.getInstance().getLastLog());
    }
}
