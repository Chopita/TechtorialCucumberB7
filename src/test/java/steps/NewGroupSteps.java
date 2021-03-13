package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.com.weborderpages.GroupOrderPage;
import pages.com.weborderpages.HomePage;
import pages.com.weborderpages.LoginHomePage;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.Driver;

public class NewGroupSteps {
    WebDriver driver;
    LoginHomePage loginHomePage;
    HomePage homePage;
    GroupOrderPage groupOrderPage;


    @Given("the user is on weborder home page")
    public void the_user_is_on_weborder_home_page() {
     driver= Driver.getDriver();
     loginHomePage=new LoginHomePage(driver);
     driver.navigate().to(ConfigReader.getProperty("webOrderUrl"));
     loginHomePage.login(ConfigReader.getProperty("webOrderUsername"), ConfigReader.getProperty("webOrderPassword"));
    }

    @Then("user select {string} option")
    public void user_select_option(String text) {
        homePage=new HomePage(driver);
        BrowserUtils.selectByText(homePage.deliverOptions, text);



    }
    @Then("the user on the group order page")
    public void the_user_on_the_group_order_page() {
        homePage.groupOrder.click();
        homePage.nextButton.click();


    }
    @Then("the user send invitees note {string}")
    public void the_user_send_invitees_note(String note) {
    groupOrderPage=new GroupOrderPage(driver);
    groupOrderPage.sendInviteeNote(note);

    }
    @Then("the user send invite list {string} and {string}")
    public void the_user_send_invite_list_and(String person1, String person2) {
      groupOrderPage.sendInviteList(person1+" ,"+person2);
      groupOrderPage.clickCreateGroup();
    }


    @Then("the user validate {string}")
    public void the_user_validate(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String actualText=groupOrderPage.viewGroupOrderHeader.getText();
        Assert.assertEquals(expectedText,actualText);

    }

        @Then("the user validate total participants is {int}")
        public void the_user_validate_total_participants_is(Integer int1) {
           Integer participantNumber=groupOrderPage.getParticipantNumber();
           Assert.assertEquals(int1,participantNumber);
        }

    }


