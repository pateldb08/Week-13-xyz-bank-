package com.bank.testbase;

import com.bank.utilities.Utility;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = "Chrome";

    @BeforeMethod                                 // TestNG annotation
    public void setUp() {
        selectBrowser(browser);

    }
//
//    @AfterMethod                        // TestNG annotation
//    public void tearDown() {
//        closeBrowser();
//    }

}