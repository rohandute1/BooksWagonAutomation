package com.bridgelabz.pages;

import com.bridgelabz.testbase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookswagonLoginPage extends TestBase {
    @FindBy(id="ctl00_imglogo")
    WebElement booksWagonLogo;
    @FindBy(id="inputbar")
    WebElement searchBar;
    @FindBy(id="btnTopSearch")
    WebElement clickSearch;
    @FindBy(id="ctl00_lblTotalCartItems")
    WebElement cart;
    @FindBy(linkText = "Existing User? Log in")
    WebElement gotoLogin;
    @FindBy(id="ctl00_phBody_SignIn_txtEmail")
    WebElement mobileNum;
    @FindBy(id="ctl00_phBody_SignIn_txtPassword")
    WebElement password;
    @FindBy(linkText = "Login")
    WebElement loginButton;

    public BookswagonLoginPage(){
        PageFactory.initElements(driver, this);
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
    public void isBooksWagonLogoClickableOrNot() throws InterruptedException {
        gotoLogin.click();
        Thread.sleep(3000);
        booksWagonLogo.click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(3000);
    }
    public void searchBook(String enterBookName) throws InterruptedException {
        gotoLogin.click();
        Thread.sleep(3000);
        searchBar.click();
        searchBar.sendKeys(enterBookName);
        clickSearch.click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(3000);
    }
    public void cartClickableOrNot() throws InterruptedException {
        gotoLogin.click();
        cart.click();
        Thread.sleep(3000);
        driver.navigate().back();
    }
    public BookswagonHomePage loginBookswagon(String enterNumber, String enterPassword) throws InterruptedException {
        gotoLogin.click();
        Thread.sleep(3000);
        mobileNum.sendKeys(enterNumber);
        password.sendKeys(enterPassword);
        loginButton.click();
        Thread.sleep(3000);
        return new BookswagonHomePage();
    }
}