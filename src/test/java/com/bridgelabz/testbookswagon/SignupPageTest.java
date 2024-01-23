package com.bridgelabz.testbookswagon;

import com.bridgelabz.pages.BookswagonSignupPage;
import com.bridgelabz.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class SignupPageTest extends TestBase {
    BookswagonSignupPage bookswagonSignupPage;
    public SignupPageTest(){
        super();
    }
    @BeforeTest
    public void signup_Page_Setup(){
        start_Test_Execution();
        bookswagonSignupPage = new BookswagonSignupPage();
    }
    @Test(priority = 1)
    public void sign_Up_Page_Title_Validation(){
        String pageTitle;
        pageTitle = bookswagonSignupPage.getPageTitle();
        Assert.assertEquals(pageTitle,"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Test(priority = 2)
    public void sign_Up_BooksWagon(){
        bookswagonSignupPage.bookswagaonSignup(properties.getProperty("name"),properties.getProperty("mobileNumber"));
    }
    @AfterTest
    public void quit_Browser(){
        driver.quit();
    }
}