import config.ShoppingBagPage;
import config.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class ShoppingBagTest {

    private WebDriverSingleton instance = WebDriverSingleton.getInstance();
    private WebDriver driver = instance.openBrowser();
    private ShoppingBagPage shoppingBagPage = new ShoppingBagPage(driver);

    @BeforeClass
    public void start() {
        driver.get("https://www.farfetch.com/by/shopping/men/items.aspx");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void isShoppingBagEmpty() {
        shoppingBagPage.navigateToShoppingBag();
        Assert.assertEquals("ВАША КОРЗИНА ПУСТА", shoppingBagPage.getShoppingBagInfo());
    }

    @AfterClass
    public void finishCompletely() {
        driver.quit();
    }

}
