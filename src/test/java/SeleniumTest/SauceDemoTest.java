package SeleniumTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoTest {

    static WebDriver driver;

    @Before //runs before test cases are executed
    public void openBroswe() {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test //to 1st test the case
    public void loginToApplication() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(1000);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        //to compare expected url & actual url using assertion
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(expectedUrl, actualUrl);

    }
    //tear down it is also called in companies
    @After //to run after all tests are executed
    public void closeBrowser() {
        driver.quit();
    }
}
