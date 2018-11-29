package com.infoshare.emilczanowska.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OwnerDataPage extends BasePage {

    @FindBy (xpath = "//h2[contains(text(),'Owner Information')]")
    private WebElement ownerData;
    @FindBy(xpath = "//a[contains(text(),'Owner')]")
    private WebElement editOwner;

    public OwnerDataPage(WebDriver driver) {
        super(driver);
    }

    public String getTextFromOwnerInformationPage(){
        return ownerData.getText();
    }

    public void editOwnersProfile () {
        editOwner.click();
    }
}
