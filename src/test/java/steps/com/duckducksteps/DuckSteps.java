package steps.com.duckducksteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.com.DuckDuckPages.DuckDuckHomePage;
import pages.com.DuckDuckPages.DuckSearchResultPage;
import utils.ConfigReader;
import utils.Driver;

public class DuckSteps {

    WebDriver driver;
    DuckDuckHomePage duckDuckHomePage;
    DuckSearchResultPage duckSearchResultPage;


    @Given(": user on DuckDuckGo home webpage")
    public void user_on_duck_duck_go_home_webpage() {
        driver= Driver.getDriver();
        driver.get("https://duckduckgo.com/");

    }
    @When(": user searches for Selenium")
    public void user_searches_for_selenium() {
duckDuckHomePage=new DuckDuckHomePage(driver);
duckDuckHomePage.searchBox.sendKeys(ConfigReader.getProperty("searchValue"));
duckDuckHomePage.searchBox.click();

    }
    @Then(": the user should see the result about Selenium")
    public void the_user_should_see_the_result_about_selenium() {

    }
    @Then(": result contains Selenium keyword")
    public void result_contains_selenium_keyword() {

    }



}
