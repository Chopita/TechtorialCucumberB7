package steps.com.webordersteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.com.weborderpages.GroupOrderPage;
import pages.com.weborderpages.LoginHomePage;
import utils.ConfigReader;
import utils.Driver;

import java.util.List;


public class LoginSteps {

    WebDriver driver;
    LoginHomePage loginHomePage;


    @Given(": the user navigates to the WebOrder")
    public void the_user_navigates_to_the_web_order() {
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("webOrderUrl"));

    }

    @When(": the user provides the credentials")
    public void the_user_provides_the_credentials() {
        loginHomePage = new LoginHomePage(driver);
        loginHomePage.login(ConfigReader.getProperty("webOrderUsername"), ConfigReader.getProperty("webOrderPassword"));
    }

    @Then("the user is on home page")
    public void the_user_is_on_home_page() {

        String expectedTitle = "ORDER DETAILS - Weborder";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Then("the user send invite list")
    public void the_user_send_invite_list(List<String> emails) {


    }
}