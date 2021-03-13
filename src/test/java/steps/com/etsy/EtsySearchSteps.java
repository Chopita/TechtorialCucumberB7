package steps.com.etsy;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.com.etsyPage.EtsyHomePage;
import utils.BrowserUtils;
import utils.Driver;

public class EtsySearchSteps {

    WebDriver driver;
    EtsyHomePage homePage;


    @Before
    public void beforeScenario(){
        //it will run before each scenario
        System.out.println("Before annotation");

    }
    @Before ("@tc2")
    public void conditionalHook(){
        System.out.println("conditional annotation");
    }

    @After
    public void afterScenario(Scenario scenario){
        //it wil run after each scenario
        System.out.println("After annotation");

        if(scenario.isFailed()){
            BrowserUtils.takeScreenshot();
        }
    }


@BeforeStep
public void beforeStep() {
    System.out.println("before each step");
}
    @AfterStep
    public void afterStep(){
        System.out.println("after each step");

}

    @Given(": the user navigates to {string}")
    public void the_user_navigates_to(String url) {
       driver= Driver.getDriver();
       driver.get(url);
    }



    @When("The user search with {string}")
    public void the_user_search_with(String searchValue) {
    homePage=new EtsyHomePage(driver);
    homePage.sendSearchKey(searchValue);
    }



    @Then("the user should see the title {string}")
    public void the_user_should_see_the_title(String expectedTitle) {

      String actualTitle= driver.getTitle();
        Assert.assertEquals("Validation of title", expectedTitle, actualTitle);




    }


}
