package Tests;
import Pages.HomePage;
import Pages.SearchResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

//testing search result page
public class SearchResultTest extends TestBase {
    HomePage homeObject;
    SearchResultPage SearchResultObject;
    @Test
    public void ExistResult()
    {

        homeObject = new HomePage(driver);
        homeObject.OpenSearchPage("facebook");
        SearchResultObject = new SearchResultPage(driver);
        SearchResultObject.OpenPage();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertTrue(SearchResultObject.successMessage.getText().contains("Facebook"));
        driver.navigate().back();
    }

    @Test(dependsOnMethods = "ExistResult")
    public void CheckImagesForExistingResult()
    {

        homeObject = new HomePage(driver);
        homeObject.OpenSearchPage("twitter");
        SearchResultObject = new SearchResultPage(driver);
        SearchResultObject.imageBtn.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().back();
    }
}
