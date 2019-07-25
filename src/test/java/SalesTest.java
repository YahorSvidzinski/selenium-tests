import config.SalesPage;
import config.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class SalesTest {

    private WebDriverSingleton instance = WebDriverSingleton.getInstance();
    private WebDriver driver = instance.openBrowser();
    private SalesPage salesPage = new SalesPage(driver);

    @BeforeClass
    public void start() {
        driver.get("https://www.farfetch.com/by/shopping/men/items.aspx");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void isBalenciagaOnSale() {
        salesPage.navigateToSales();
        salesPage.navigateToBrandNewBalenciaga();
        assertEquals("506344W05G0", salesPage.getDesignerArticle());
    }

    @AfterClass
    public void finishCompletely() {
        driver.quit();
    }

}
