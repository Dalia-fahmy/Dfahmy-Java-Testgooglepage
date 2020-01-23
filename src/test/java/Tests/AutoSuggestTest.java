package Tests;
import Pages.HomePage;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
// searching using auto suggest
public class AutoSuggestTest extends TestBase {
    HomePage homeObject;

    @Test
    public void SuccessfulAutoSearch() {
        homeObject = new HomePage(driver);
        homeObject.SearchUsingAutoSuggest("face");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().back();
    }
}
