package com.medi.pages;

import com.medi.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(css = "input[type='submit'][value='Go']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")
    public WebElement searchResult;




}
