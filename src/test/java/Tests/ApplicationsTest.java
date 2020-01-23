package Tests;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

// to open different applications integrated with google home page
public class ApplicationsTest extends TestBase {
    HomePage homeObject;

    @Test
    public void OpenGmail()
    {
        homeObject = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        homeObject.Gmail();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "OpenGmail")
    public void OpenHelpPage()
    {
        homeObject.SearchHelp();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue(homeObject.googlesearchMessage.getText().contains("How Google Search works"));
        driver.navigate().back();

    }
}
