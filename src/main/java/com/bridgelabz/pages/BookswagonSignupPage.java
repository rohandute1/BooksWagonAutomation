package com.bridgelabz.pages;

import com.bridgelabz.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookswagonSignupPage extends TestBase {
    @FindBy(id="ctl00_phBody_SignUp_txtName")
    WebElement name;
    @FindBy(id="ctl00_phBody_SignUp_txtEmail")
    WebElement mobileNumber;
//    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
//    WebElement captcha;
    @FindBy(id="ctl00_phBody_SignUp_btnContinue")
    WebElement clickContinue;

    public BookswagonSignupPage() {
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        String pageTitle = driver.getTitle();
        return pageTitle;
    }
    public void bookswagaonSignup(String enterName, String enterMobileNumber){
        name.sendKeys(enterName);
        mobileNumber.sendKeys(enterMobileNumber);
        //captcha.click();
        clickContinue.click();
    }

}
