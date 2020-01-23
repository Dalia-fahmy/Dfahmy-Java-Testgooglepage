package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name=\"q\"]")
    WebElement searchTxt;
    @FindBy(xpath = "//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")
    WebElement gmailBtn;
    @FindBy(xpath = "//*[@id=\"fsl\"]/a[4]")
    WebElement helpBtn;
    @FindBy (xpath = "//*[@id=\"hsw\"]/div[2]/div/div/div/div/h2")
    public WebElement googlesearchMessage;
    @FindBy (xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/div[2]/ul")
    List<WebElement> searchList;

    public void OpenSearchPage (String txt)
    {
        searchTxt.clear();
        searchTxt.sendKeys(txt);
        searchTxt.submit();
    }

     public void Gmail()
    {
       gmailBtn.click();
    }

    public void SearchHelp()
    {
        helpBtn.click();
    }

    public void SearchUsingAutoSuggest(String autotxt)
    {
        searchTxt.clear();
        searchTxt.sendKeys(autotxt);
        searchList.get(0).click();
    }
}
