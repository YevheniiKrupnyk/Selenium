package ua.privatBank;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest extends WebDriverSettings {

    @Test
    public void firstTest() {
        newDriver = new ChromeDriver();
        newDriver.get("https://www.saucedemo.com");
        String title = newDriver.getTitle();
        Assert.assertTrue(title.equals("Swag Labs"));
        newDriver.findElement(By.id("user-name")).sendKeys("standard_user");
        newDriver.findElement(By.id("password")).sendKeys("secret_sauce");
        newDriver.findElement(By.id("login-button")).click();
        String myURL = newDriver.getCurrentUrl();
        Assert.assertTrue(myURL.equals(("https://www.saucedemo.com/inventory.html")));
    }

    @Test
    public void secondTest() {
        newDriver = new ChromeDriver();
        newDriver.get("https://www.saucedemo.com");
        String title = newDriver.getTitle();
        Assert.assertTrue(title.equals("Swag Labs"));
        newDriver.findElement(By.id("user-name")).sendKeys("test1");
        newDriver.findElement(By.id("password")).sendKeys("test2");
        newDriver.findElement(By.id("login-button")).click();
        String error1Text = newDriver.findElement(By.xpath("//div[contains(@class,'error-message-container error')]/h3")).getText();
        System.out.println(error1Text);
        Assert.assertTrue(error1Text.contains("Username and password do not match any user in this service"));
    }

    @Test
    public void thirdTest() {
        newDriver = new ChromeDriver();
        newDriver.get("https://www.saucedemo.com");
        String title = newDriver.getTitle();
        Assert.assertTrue(title.equals("Swag Labs"));
        newDriver.findElement(By.id("login-button")).click();
        String error2Text = newDriver.findElement(By.xpath("//div[contains(@class,'error-message-container error')]/h3")).getText();
        System.out.println(error2Text);
        Assert.assertTrue(error2Text.contains("Username is required"));
    }
}
