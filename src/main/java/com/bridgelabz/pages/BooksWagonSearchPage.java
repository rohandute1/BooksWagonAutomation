package com.bridgelabz.pages;

import com.bridgelabz.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BooksWagonSearchPage extends TestBase {
    @FindBy(linkText = "Ikigai")
    WebElement book;
    @FindBy(xpath = "(//input[@class='btn-red'])[1]")
    WebElement buyBook;
    @FindBy(xpath = "(//span[@class='itemcount'])[1]")
    WebElement cartButton;
    @FindBy(id="ctl00_phBody_BookCart_lvCart_imgPayment")
    WebElement buyButton;
    @FindBy(id="ctl00_cpBody_txtNewRecipientName")
    WebElement recipientName;
    @FindBy(id="ctl00_cpBody_txtNewCompanyName")
    WebElement companyName;
    @FindBy(id="ctl00_cpBody_txtNewAddress")
    WebElement streetAddress;
    @FindBy(id="ctl00_cpBody_txtNewLandmark")
    WebElement landmark;
    @FindBy(id="ctl00_cpBody_imgSaveNew")
    WebElement saveAndContinue;
    Select select;

    public BooksWagonSearchPage() {
        select = new Select(driver.findElement(By.name("ctl00$cpBody$ddlNewCountry")));
        select.selectByVisibleText("country");
    }
}
