package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {

    By logout = By.xpath("//button[contains(text(),'Logout')]");
    By yourName = By.xpath("//label[contains(text(),'Your Name :')]");


public void verifyLogoutTabDisplay(String expectedLogoutText){
    isTextDisplayed(logout,expectedLogoutText);
}
public void clickOnLogout(){
    clickOnElement(logout);
}
public void verifyYourNameText(String expectedYourNameText){
    isTextDisplayed(yourName, expectedYourNameText );
}


}
