package com.auto.tests;

import com.auto.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public final class LoginPageTest extends BaseTest {

    private LoginPageTest(){}

    @Test
    public void firstTest() {
        DriverManager.getDriver().findElement(By.xpath("//a[text()='Store']")).click();
        new WebDriverWait(DriverManager.getDriver(), 30)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("woocommerce-product-search-field-0")));
        DriverManager.getDriver().findElement(By.id("woocommerce-product-search-field-0"))
                .sendKeys("Blue Shoes", Keys.ENTER);
    }

    @Test
    public void secondTest() {
        DriverManager.getDriver().findElement(By.xpath("//a[text()='Store']")).click();
        new WebDriverWait(DriverManager.getDriver(), 30)
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("woocommerce-product-search-field-0")));
        DriverManager.getDriver().findElement(By.id("woocommerce-product-search-field-0"))
                .sendKeys("Blue Shoes", Keys.ENTER);
    }
}
