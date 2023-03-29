package com.cydeo.step_definitions;

import com.cydeo.pages.AgileProCrmLoginPage;
import com.cydeo.pages.DrivePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyDrive_StepDefinition {

    AgileProCrmLoginPage agileProCrmLoginPage = new AgileProCrmLoginPage();
    DrivePage mainPage= new DrivePage();
    @Given("User is already with {string} and {string} logged in and on Activity Stream page")
    public void user_is_already_with_and_logged_in_and_on_activity_stream_page(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("agileprocrm.url"));
        agileProCrmLoginPage.login(username,password);
    }
    @When("User clicks Drive menu item")
    public void user_clicks_drive_menu_item() {
        mainPage.driveMenuitem.click();
    }
    @Then("User should be able to see title is My Drive")
    public void user_should_be_able_to_see_title_is_my_drive() {
        String expectedText= "My Drive";
        BrowserUtils.sleep(1);
        String actualText= mainPage.myDriveText.getText();
        Assert.assertEquals("My Drive is not display",expectedText,actualText);

    }

}
