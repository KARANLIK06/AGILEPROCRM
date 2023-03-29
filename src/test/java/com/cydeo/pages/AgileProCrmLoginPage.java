package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileProCrmLoginPage {
    public AgileProCrmLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

/*
    public void login() {
        userName.sendKeys(ConfigurationReader.getProperty("agileprocrm.username"));
        BrowserUtils.sleep(1);
        password.sendKeys(ConfigurationReader.getProperty("agileprocrm.password"));
        BrowserUtils.sleep(1);
        loginButton.click();
    }

 */
public void login(String username,String password) {
    userNameBox.sendKeys(username);
    BrowserUtils.sleep(1);
    passwordBox.sendKeys(password);
    BrowserUtils.sleep(1);
    loginButton.click();
}
}