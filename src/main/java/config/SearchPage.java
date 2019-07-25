package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BaseClassAllPages {

    private By searchButton = By.cssSelector("#header-top > div > div.headerTop__container__Hambnsearch > a.js-search-trigger.ff-search-trigger > span > svg");
    private By searchWindow = By.cssSelector("#ff-search-input");
    private By heronPrestonButton = By.cssSelector("#main-search-results > div > div.baseline.col9.col-md-12.col-sm-12.col-xs-12.alpha.omega.ff-suggestions-container > div > div > div > span > a > span > strong");
    private By heronPrestonTitle = By.cssSelector("#slice-container > div._d64e3b > h1");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void sendSearchRequest(String request) {
        driver.findElement(searchWindow).sendKeys(request);
    }

    public void navigateToHeronPrestonClothes() {
        driver.findElement(heronPrestonButton).click();
    }

    public String getHeronPrestonTitle() {
        return driver.findElement(heronPrestonTitle).getText();
    }

}
