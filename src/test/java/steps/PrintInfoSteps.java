package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintInfoSteps {
    @Given("the user print first name")
    public void the_user_print_first_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cholpon");
    }
    @When("the user print lastname")
    public void the_user_print_lastname() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Kubanova");
    }
    @Then("the user should see the full name")
    public void the_user_should_see_the_full_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cholpon Kubanova");
    }
    @Then("the user print city")
    public void the_user_print_city() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Schaumburg");
    }
    @Then("the user print state")
    public void the_user_print_state() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Illinois");
    }
    @Then("the user print age")
    public void the_user_print_age() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("26");
    }
    @Then("the user shoild see the school name")
    public void the_user_shoild_see_the_school_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Techtorial shool");
    }


}
