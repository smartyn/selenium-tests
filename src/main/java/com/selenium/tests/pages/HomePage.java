package com.selenium.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /** elements identify by FindBy */

    @FindBy(id = "at-cv-lightbox-close")
    WebElement AlertClose;

    @FindBy(id = "advanced_example")
    WebElement AdvancedBookmark;




    /**  */

    public HomePage closeAlert() {
        AlertClose.click();
        return this;
    }

    public HomePage advancedBookmark() {
        AdvancedBookmark.click();
        return this;
    }
}
