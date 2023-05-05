package com.bank.testsuit;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    BankManagerLoginPage bankManagerLogin = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    HomePage homePage = new HomePage();
    CustomerLogInPage customerLogInPage = new CustomerLogInPage();
    CustomerPage customerPage = new CustomerPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void test(){
        System.out.println("Hello");
    }

    @Test
    public void verifyBankManagerShouldAddCustomerSuccessfully() {
       // homePage.click();
        homePage.clickOnBankManagerLogin();
        bankManagerLogin.clickOnAddCustomer();
        bankManagerLogin.enterFirstName("Mr abc");
        bankManagerLogin.enterLastName("xyz");
        bankManagerLogin.enterPostcode("wd15 1pl");
        bankManagerLogin.clickOnAddCustomerbtn();
        Assert.assertEquals(bankManagerLogin.verifyCustomerAddedText(), "Customer added successfully with customer id :6");
        bankManagerLogin.acceptPopup();
    }
    @Test
    public void verifybankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLogin();
        openAccountPage.clickOnOpenAccountTab();
        openAccountPage.selectCustomer("Harry Potter");
        openAccountPage.selectCurrency("Pound");
        openAccountPage.clickOnProcessbtn();
        Assert.assertEquals(openAccountPage.verifyAccountCreatedText(),"Account created successfully");
        openAccountPage.acceptPopup();
    }
    @Test
    public void verifycustomerShouldLoginAndLogoutSuceessfully(){
        homePage.clickOnCustomerLogin();
        customerLogInPage.selectYourName("Harry Potter");
        customerLogInPage.clickOnLoginbtn();
        customerPage.verifyLogoutTabDisplay("Logout");
        customerPage.clickOnLogout();
        customerPage.verifyYourNameText("Your Name");
    }
    @Test
    public void verifycustomerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLogin();
        customerLogInPage.selectYourName("Harry Potter");
        customerLogInPage.clickOnLoginbtn();
        accountPage.clickOnDeposit();
        accountPage.enterAmount("100");
        accountPage.clickOnDeposit2();
        accountPage.verityDepositSuccessfulText("Deposit Successful");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLogin();
        customerLogInPage.selectYourName("Harry Potter");
        customerLogInPage.clickOnLoginbtn();
        accountPage.clickOnDeposit();
        accountPage.enterAmount("100");
        accountPage.clickOnDeposit2();
        accountPage.clickOnWithdrawl();
        Thread.sleep(3000);
        accountPage.typeAmount("50");
        accountPage.clickOnWithdrqwl2();
        accountPage.verifyTransactionSuccessfulText("Transaction successful");
        //Another way to do assertion
        //Assert.assertEquals(accountPage.transactionMessage(),"Transaction successful");

    }

}
