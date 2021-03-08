package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseSelenium {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String driverPath = "src\\main\\resources\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().window().maximize();
    }



    /*@AfterMethod
    public void tearDown() {
        driver.quit();
    }*/
}
