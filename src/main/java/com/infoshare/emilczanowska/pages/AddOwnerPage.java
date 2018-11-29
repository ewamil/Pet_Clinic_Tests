package com.infoshare.emilczanowska.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddOwnerPage extends BasePage {
    @FindBy(id="firstName")
    private WebElement firstNameInput;
    @FindBy(id="lastName")
    private WebElement lastNameInput;
    @FindBy(id="address")
    private WebElement addressInput;
    @FindBy(id="city")
    private WebElement cityInput;
    @FindBy(id="telephone")
    private WebElement telephoneInput;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement addOwnerButton;

    public AddOwnerPage(WebDriver driver) {
        super(driver);
    }

    public void addNewOwnerFullDetails(String firstName, String lastName, String address, String city, String phone){

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        telephoneInput.sendKeys(phone);
        addOwnerButton.click();
    }
}
