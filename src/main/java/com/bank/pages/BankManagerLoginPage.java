package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

  //  By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By addCustomerTab = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postcodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerBtn = By.xpath("//button[@type='submit']");




    public void clickOnAddCustomer() {
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName(String firstName) {
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(postcodeField, postcode);
    }

    public void clickOnAddCustomerbtn() {
        clickOnElement(addCustomerBtn);
    }

    public String verifyCustomerAddedText() {
        return getTextFromAlert();
    }

    public void acceptPopup() {           // this method will click on ok button for popup
        switchToAlert();
        acceptAlert();
    }


}
