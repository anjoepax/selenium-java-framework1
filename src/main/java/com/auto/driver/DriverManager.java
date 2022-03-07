package com.auto.driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager(){}

    private static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();

    public static synchronized WebDriver getDriver() {
        return dr.get();
    }

    public static synchronized void setDriver(WebDriver driver) {
        dr.set(driver);
    }

    public static synchronized void unload() {
        dr.remove();
    }
}
