package com.bridgelabz.pages;

import com.bridgelabz.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookswagonHomePage extends TestBase {

    @FindBy(id="inputbar")
    WebElement searchBar;
    @FindBy(id="btnTopSearch")
    WebElement clickForSearch;


    public BookswagonHomePage(){
        PageFactory.initElements(driver, this);
    }
    public String get_Page_Title(){
        return driver.getTitle();
    }
    public void search_For_Book(String enterBookName){
        searchBar.sendKeys(enterBookName);
        clickForSearch.click();
    }
}
