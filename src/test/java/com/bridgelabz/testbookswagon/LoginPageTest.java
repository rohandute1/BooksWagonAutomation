package com.bridgelabz.testbookswagon;

import com.bridgelabz.pages.BookswagonHomePage;
import com.bridgelabz.pages.BookswagonLoginPage;
import com.bridgelabz.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

@Listeners(CustomListener.class)
public class LoginPageTest extends TestBase {
    Logger log = Logger.getLogger(BookswagonLoginPage.class);
    BookswagonLoginPage bookswagonLoginPage;
    BookswagonHomePage bookswagonHomePage;
    public LoginPageTest(){
        super();
    }
    @BeforeTest
    public void loginPageSetup(){
        log.info("Execution started");
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
    public void booksWagon_Logo_Validate_Test() throws InterruptedException {
        bookswagonLoginPage.isBooksWagonLogoClickableOrNot();
    }
    @Test(priority = 3)
    public void search_Bar_Validate_Tets() throws InterruptedException {
        bookswagonLoginPage.searchBook("bookName");
    }
    @Test(priority = 4)
    public void cart_Validate_Test() throws InterruptedException {
        bookswagonLoginPage.cartClickableOrNot();
    }
    @Test(priority = 5)
    public void test_Login_With_Valid_Credentials() throws InterruptedException {
        bookswagonHomePage = bookswagonLoginPage.loginBookswagon(properties.getProperty("mobileNumber"),properties.getProperty("password"));
        log.info("Login successfully"+properties.getProperty("mobileNumber"));
    }
    @AfterClass
    public void quite_Browser(){
        driver.quit();
    }
}
