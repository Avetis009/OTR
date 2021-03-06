import org.junit.jupiter.api.Test;
import pageobjects.MarketPage;
import pageobjects.MarketSearchResultPage;
import pageobjects.YandexMainPage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Tests extends WebDriverSettings{

    @Test
    public void test1(){

        YandexMainPage yandexMain = new YandexMainPage(chromeDriver);
        yandexMain.goToMarketPage();
        yandexMain.getWebDriver().close();

        ArrayList<String> newTab = new ArrayList<>(chromeDriver.getWindowHandles());

        chromeDriver.switchTo().window(newTab.get(newTab.size()-1));

        MarketPage marketPage = new MarketPage(chromeDriver);
        marketPage.setSearchField("Xiaomi Mi Band 4");
        marketPage.clickSearchbutton();


        chromeDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        MarketSearchResultPage searchResultPage = new MarketSearchResultPage(chromeDriver);
        searchResultPage.chooseMyRegionButton();

        CustomUtils.getScreen(searchResultPage.getWebDriver());

    }
}
