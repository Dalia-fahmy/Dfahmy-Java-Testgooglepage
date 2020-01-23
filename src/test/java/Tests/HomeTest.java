package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

// testing google home page
public class HomeTest extends TestBase {
    HomePage homeObject;

    @Test(priority = 1)
    public void UnSuccessfulSearch()
    {
        homeObject = new HomePage(driver);
        homeObject.OpenSearchPage("testlohdhghgh");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test (dependsOnMethods = "UnSuccessfulSearch")
    public void SuccessfulSearch()
    {
        homeObject.OpenSearchPage("facebook");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
