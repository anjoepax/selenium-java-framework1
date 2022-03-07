package com.auto.tests;

import com.auto.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected BaseTest() {}

    @BeforeMethod
    public void setUp() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDown() {
        Driver.quiDriver();
    }
}
