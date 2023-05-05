package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {

    By openAccount = By.xpath("//button[@ng-class='btnClass2']");
    By customer = By.id("userSelect");
    By currency = By.id("currency");
    By process = By.xpath("//button[contains(text(),'Process')]");


    public void clickOnOpenAccountTab(){
        clickOnElement(openAccount);
    }
    public void selectCustomer(String customerName){
        selectByVisibleTextFromDropDown(customer, customerName);
    }
    public void selectCurrency(String currencyName){
        selectByVisibleTextFromDropDown(currency, currencyName );
    }
    public void clickOnProcessbtn(){
        clickOnElement(process);
    }
    public String verifyAccountCreatedText(){
        return getTextFromAlert();
    }
    public void acceptPopup() {           // this method will click on ok button for popup
        switchToAlert();
        acceptAlert();
    }

}
