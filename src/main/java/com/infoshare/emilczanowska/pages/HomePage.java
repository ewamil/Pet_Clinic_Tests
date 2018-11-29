package com.infoshare.emilczanowska.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    private WebElement homeLink;
    @FindBy(xpath = "//span[contains(text(),'Find owners')]")
    private WebElement findOwnerLink;
    @FindBy(xpath = "//span[contains(text(),'Veterinarians')]")
    private WebElement veterinariansLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickFindOwner(){
        findOwnerLink.click();
    }
}
