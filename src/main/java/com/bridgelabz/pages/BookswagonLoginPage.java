package com.bridgelabz.pages;

import com.bridgelabz.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookswagonLoginPage extends TestBase {
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
    public BookswagonHomePage loginBookswagon(String enterNumber, String enterPassword){
        gotoLogin.click();
        mobileNum.sendKeys(enterNumber);
        password.sendKeys(enterPassword);
        loginButton.click();
        return new BookswagonHomePage();
    }
}