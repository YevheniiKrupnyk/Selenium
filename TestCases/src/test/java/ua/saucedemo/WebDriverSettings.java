package ua.privatBank;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public ChromeDriver newDriver;

    @Before
    public void setUp() {
        newDriver = new ChromeDriver();
    }

    @After
    public void close() {
        newDriver.quit();
    }
}
