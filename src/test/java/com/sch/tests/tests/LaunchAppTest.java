package com.sch.tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchAppTest extends TestBase {

    @Test
    public void testLaunchApp(){
        String version = app.getAppVersion();
        System.out.println("App version" + version + "launched");
        Assert.assertEquals(version,"0.0.3");

    }


}