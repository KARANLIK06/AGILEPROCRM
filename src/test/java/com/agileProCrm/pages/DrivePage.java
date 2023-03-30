package com.agileProCrm.pages;

import com.agileProCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {
    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "li#bx_left_menu_menu_files")
    public WebElement driveMenuitem;

    @FindBy(xpath = "(//span[contains(text(),'My Drive')])[2]")
    public WebElement myDriveText;

    @FindBy(xpath = "(//span[contains(text(),'All Documents')])[1]")
    public WebElement allDocumentsField;

    @FindBy(xpath = "(//span[contains(text(),'All Documents')])[2]")
    public WebElement allDocumentsText;

    @FindBy(xpath = "(//span[contains(text(),'Company Drive')])[1]")
    public WebElement companyDriveField;

    @FindBy(xpath = "//span[contains(text(),'Company drive')]")
    public WebElement companyDriveText;

    @FindBy(xpath = "(//span[contains(text(),'Sales and Marketing')])[1]")
    public WebElement salesAndMarketingField;

    @FindBy(xpath = "(//span[contains(text(),'Drive: Sales and marketing')])[1]")
    public WebElement salesAndMarketingText;

}
