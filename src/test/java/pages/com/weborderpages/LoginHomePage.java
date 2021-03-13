package pages.com.weborderpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;

public class LoginHomePage {

    public LoginHomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }

    @FindBy(id = "Email")
    public WebElement username;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn;


    public void login(String username, String password){
        this.username.clear();
        this.username.sendKeys(ConfigReader.getProperty("webOrderUsername"));
        this.password.clear();
        this.password.sendKeys(ConfigReader.getProperty("webOrderPassword"));
        this.signIn.click();

    }


}
