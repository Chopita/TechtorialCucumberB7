package pages.com.DuckDuckPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckDuckHomePage {

    public DuckDuckHomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }
    @FindBy(id = "search_form_input_homepage")
    public WebElement searchBox;

    @FindBy(id = "search_button_homepage")
    public WebElement searchButton;

}
