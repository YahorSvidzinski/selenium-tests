package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SalesPage extends BaseClassAllPages {

    private By salesButton = By.partialLinkText("Распродажа");
    private By balenciagaSpeed = By.cssSelector("#slice-container > div:nth-child(3) > div > div._b732a8 > div > div._4ba192 > ul > li:nth-child(16) > a > div._7e8db3 > img");
    private By designerArticle = By.cssSelector("#panelInner-0 > div > div > div._005d7d._9220e1 > div:nth-child(2) > p > span");

    public SalesPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToSales() {
        driver.findElement(salesButton).click();
    }

    public void navigateToBrandNewBalenciaga() {
        driver.findElement(balenciagaSpeed).click();
    }

    public String getDesignerArticle() {
        return driver.findElement(designerArticle).getText();
    }
}
