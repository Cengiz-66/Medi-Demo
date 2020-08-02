package com.medi.stepdefinitions;

import com.medi.pages.MainPage;
import com.medi.utilities.BrowserUtils;
import com.medi.utilities.ConfigurationReader;
import com.medi.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoStepDefs {

    @Given("the user on the page")
    public void the_user_on_the_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("the user search {string}")
    public void the_user_search(String search) {
        new MainPage().searchBox.sendKeys(search);
        new Actions(Driver.get()).moveToElement(new MainPage().searchButton).click().perform();
    }

    @Then("User should see search result")
    public void user_should_see_search_result() {
        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.visibilityOf(new MainPage().searchResult));
        System.out.println(new MainPage().searchResult.getText());

        Assert.assertFalse("Test Result",new MainPage().searchResult.isDisplayed());
    }

}
