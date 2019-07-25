package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingBagPage extends BaseClassAllPages {

    private By shoppingBagButton = By.cssSelector("#ff-details > li:nth-child(4) > a > span.icon-bag > svg > path");
    private By shoppingBagInfo = By.cssSelector("#basketWrapper > div > section.section-bag > div > div > div.baseline.col12.checkout-Maintitle-Container > h1");

    public ShoppingBagPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToShoppingBag() {
        driver.findElement(shoppingBagButton).click();
    }

    public String getShoppingBagInfo() {
        return driver.findElement(shoppingBagInfo).getText();
    }

}
