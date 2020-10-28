package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MarketSearchResultPage {

    private WebElement myRegionButton;
    private WebDriverWait wait;

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public MarketSearchResultPage(WebDriver webDriver){
        this.webDriver = webDriver;
        myRegionButton = webDriver.findElement(By.xpath("//span[text()='Сначала предложения в моём регионе']/.."));
        wait = new WebDriverWait(webDriver,10);
    }

    public void chooseMyRegionButton(){
        myRegionButton.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
