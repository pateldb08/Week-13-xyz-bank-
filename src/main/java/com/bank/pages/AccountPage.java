package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By deposit = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]");
    By depostiField = By.xpath("//input[@placeholder='amount']");
    By depostit2 = By.xpath("//button[@type='submit']");
    By depositSuccessfulText = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawl = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawlField = By.xpath("//input[@placeholder='amount']");
    By withdrawl2 = By.xpath("//button[normalize-space()='Withdraw']");
    By transactionSuccessfulText = By.xpath("//span[@class='error ng-binding']");


    public void clickOnDeposit(){
        clickOnElement(deposit);
    }
    public void enterAmount(String amount){
        sendTextToElement(depostiField , amount);
    }
    public void clickOnDeposit2(){
        clickOnElement(depostit2);
    }
    public void verityDepositSuccessfulText(String expectedText){
        isTextDisplayed(depositSuccessfulText,expectedText);
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawl);
    }
    public void typeAmount(String amount){
        sendTextToElement(withdrawlField,amount);
    }
    public void clickOnWithdrqwl2(){
        clickOnElement(withdrawl2);
    }
    public void verifyTransactionSuccessfulText(String expectedText){
        isTextDisplayed(transactionSuccessfulText,expectedText);
    }
    public String transactionMessage(){
       return   getTextFromElement(transactionSuccessfulText);
    }


}
