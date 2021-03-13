package pages.com.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public  HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    // PageFactory.initElements(driver, HomePage.class--> the way how to handle StaleElementException


    @FindBy(xpath = " //select[@id='ConfirmAddressID']")
    public WebElement deliverOptions;

    @FindBy(xpath = "//label[@class='custom-control-label']")
    public WebElement groupOrder;

    @FindBy(xpath = "//button[@id='getAddressNextButton']")
    public WebElement nextButton;
}
