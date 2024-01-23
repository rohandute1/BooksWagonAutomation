package com.bridgelabz.testbookswagon;

import com.bridgelabz.pages.BookswagonHomePage;
import com.bridgelabz.pages.BookswagonLoginPage;
import com.bridgelabz.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    BookswagonLoginPage bookswagonLoginPage;
    BookswagonHomePage bookswagonHomePage;
    public LoginPageTest(){
        super();
    }
    @BeforeTest
    public void loginPageSetup(){
        start_Test_Execution();
        bookswagonLoginPage = new BookswagonLoginPage();
    }
    @Test(priority = 1)
    public void login_Page_Title_Validation(){
        String pageTitle = bookswagonLoginPage.getPageTitle();
        System.out.println(pageTitle);
        Assert.assertEquals(pageTitle, "Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Test(priority = 2)
    public void test_Login_With_Valid_Credentials(){
        bookswagonHomePage = bookswagonLoginPage.loginBookswagon(properties.getProperty("mobileNumber"),properties.getProperty("password"));
    }
    @AfterClass
    public void quite_Browser(){
        driver.quit();
    }
}
