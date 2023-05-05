package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
//    By openAccount = By.className("btn btn-lg tab");
//    By customer = By.id("userSelect");
//
//    public void clickOnOpenAccountTab(){
//        clickOnElement(openAccount);
//    }
//    public void selectCustomer(String customerName){
//        selectByVisibleTextFromDropDown(customer, customerName);
//    }
    By bankManagerLogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By customerLogin = By.xpath("//button[normalize-space()='Customer Login']");


    public void clickOnBankManagerLogin() {
        clickOnElement(bankManagerLogin);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);
    }
}
