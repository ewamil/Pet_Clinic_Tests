package com.infoshare.emilczanowska.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindOwnersPage extends BasePage {

    @FindBy(id = "lastName")
    private WebElement ownersLastNameInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement findOwnerButton;

    public FindOwnersPage(WebDriver driver) {
        super(driver);
    }

    public void searchOwnerByName(String ownersName){
        ownersLastNameInput.sendKeys(ownersName);
        findOwnerButton.click();
    }

}
