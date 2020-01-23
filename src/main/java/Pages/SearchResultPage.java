package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {
    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")
     WebElement desiredUrl;
    @FindBy(css = "div.lfloat._ohe")
    public WebElement successMessage;
    @FindBy(xpath = "//*[@id=\"hdtb-msb-vis\"]/div[2]/a")
    public WebElement imageBtn;

public void OpenPage()
{
    desiredUrl.click();
}
}
