package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarketPage {

    private WebElement searchField ;
    private WebElement searchButton;

    private WebDriver webDriver;

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public MarketPage(WebDriver webDriver){
        this.webDriver=webDriver;
        searchField = webDriver.findElement(By.id("header-search"));
        searchButton = webDriver.findElement(By.xpath("//button/div[text()='Найти']/.."));

    }

    public void setSearchField(String request){
        searchField.click();
        searchField.sendKeys(request);
    }

    public void clickSearchbutton(){
        searchButton.click();
    }
}
