package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerArrayListTestSuite {
    @Test
    public void getLastLog(){
        //Given
        //When
        LoggerArrayList.getInstance().addLogg("Test 22:48 17-09-2019");
        String lastLog = LoggerArrayList.getInstance().getListLog(0);
        //Then
        Assert.assertEquals("Test 22:48 17-09-2019", lastLog);
    }
}
