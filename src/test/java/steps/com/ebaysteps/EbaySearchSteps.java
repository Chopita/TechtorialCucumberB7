package steps.com.ebaysteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.com.ebayPages.EbayHomePage;
import pages.com.ebayPages.EbaySearchResultsPaged;
import utils.ConfigReader;
import utils.Driver;

import static utils.Driver.getDriver;

public class  EbaySearchSteps {

    WebDriver driver;
    EbayHomePage ebayHomePage;
    EbaySearchResultsPaged ebaySearchResultsPaged;
    @Given("user is on ebay home page")
    public void user_is_on_ebay_home_page() {
        driver= Driver.getDriver();
        driver.get("https://ebay.com");
    }
    @When("user searches for imC 2020")
    public void user_searches_for_im_c() {
        ebayHomePage=new EbayHomePage(getDriver());
        ebayHomePage.searchBox.sendKeys(ConfigReader.getProperty("searchValue"));
        ebayHomePage.searchButton.click();
    }
    @Then("user sees results about iMac only")
    public void user_sees_results_about_i_mac_only() {
     ebaySearchResultsPaged=new EbaySearchResultsPaged(driver);
     for(WebElement link:ebaySearchResultsPaged.listOfLinks){
         System.out.println(link.getText());
     }
    }
    @Then("there are more than 3 pages of results")
    public void there_are_more_than_pages_of_results() {
        ebaySearchResultsPaged=new EbaySearchResultsPaged(driver);
        int actualPageNumber=ebaySearchResultsPaged.pages.size();
        Assert.assertTrue(actualPageNumber>3);

    }






}
