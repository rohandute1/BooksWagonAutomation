package com.bridgelabz.testbookswagon;

import com.bridgelabz.pages.BookswagonHomePage;
import com.bridgelabz.pages.BookswagonLoginPage;
import com.bridgelabz.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    BookswagonLoginPage bookswagonLoginPage;
    BookswagonHomePage bookswagonHomePage;
    public HomePageTest(){
        super();
    }
    @BeforeTest
    public void home_Page_Setup(){
        start_Test_Execution();
        bookswagonLoginPage = new BookswagonLoginPage();
        bookswagonHomePage = bookswagonLoginPage.loginBookswagon(properties.getProperty("mobileNumber"),properties.getProperty("password"));
    }
    @Test(priority = 1)
    public void home_Page_Title_Validation_Test(){
        String pageTitle;
        pageTitle = bookswagonHomePage.get_Page_Title();
        System.out.println(pageTitle);
        Assert.assertEquals(pageTitle,"Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com");
    }
    @Test(priority = 2)
    public void search_Validation_Test(){
        bookswagonHomePage.search_For_Book(properties.getProperty("bookName"));
    }
}
