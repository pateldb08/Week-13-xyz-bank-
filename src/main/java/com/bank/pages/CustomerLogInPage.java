package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLogInPage extends Utility {
    By yourName = By.id("userSelect");
    By login = By.xpath("//button[contains(text(),'Login')]");





    public void selectYourName(String customerName){
        selectByVisibleTextFromDropDown(yourName, customerName);
    }
    public void clickOnLoginbtn(){
        clickOnElement(login);
    }

}
