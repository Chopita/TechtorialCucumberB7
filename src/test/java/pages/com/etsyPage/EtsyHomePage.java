package pages.com.etsyPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyHomePage {

    public EtsyHomePage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@data-id='gnav-search-submit-button']")
    public  WebElement searchButton;

    public void sendSearchKey(String searchValue){
        searchBox.sendKeys(searchValue);
        searchButton.click();
    }


}
