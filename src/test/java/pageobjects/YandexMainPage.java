package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YandexMainPage {
    private String selector_URL = "https://yandex.ru";
    private String selector_Market = "//a[@data-id='market']/div[1]";


    private WebDriver webDriver;

    public WebDriver getWebDriver(){
        return webDriver;
    }

    public YandexMainPage(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriver.get(selector_URL);
    }

    public void goToMarketPage(){
        webDriver.findElement(By.xpath(selector_Market)).click();
    }
}
