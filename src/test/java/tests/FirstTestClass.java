package tests;

import com.selenium.tests.pages.HomePage;
import org.testng.annotations.Test;

public class FirstTestClass extends BaseSelenium {

    protected HomePage hp = new HomePage(driver);


    @Test
    public void Test() {
        //HomePage hp = new HomePage(driver);
        hp.closeAlert();
        hp.advancedBookmark();
    }

}
