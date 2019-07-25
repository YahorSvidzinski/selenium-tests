import config.SearchPage;
import config.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SearchTest {

    private WebDriverSingleton instance = WebDriverSingleton.getInstance();
    private WebDriver driver = instance.openBrowser();
    private SearchPage searchPage = new SearchPage(driver);

    @BeforeClass
    public void start() {
        driver.get("https://www.farfetch.com/by/shopping/men/items.aspx");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void isHeronPrestonAvailable() {
        searchPage.navigateToSearchButton();
        searchPage.sendSearchRequest("Heron Preston");
        searchPage.navigateToHeronPrestonClothes();
        Assert.assertEquals("HERON PRESTON", searchPage.getHeronPrestonTitle());
    }

    @AfterClass
    public void finishCompletely() {
        driver.quit();
    }

}
