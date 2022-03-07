package com.auto.driver;

import com.auto.utils.ReadPropertyFile;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Objects;

public final class Driver {

    private Driver() {}

    public static void initDriver() throws Exception {
        if(Objects.isNull(DriverManager.getDriver())){
            DriverManager.setDriver(new ChromeDriver());
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        }
    }

    public static void quiDriver() {
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
