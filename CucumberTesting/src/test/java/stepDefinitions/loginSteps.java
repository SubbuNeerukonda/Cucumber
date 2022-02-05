package stepDefinitions;

import io.cucumber.java.en.*;

public class loginSteps
{
    @Given("User launches HomePage")
    public void user_launches_home_page() {
        System.out.println("in Given");
    }
    @When("user enter valid userName and password")
    public void user_enter_valid_user_name_and_password() {
        System.out.println("in When");
    }
    @And("User Clicks on LoginButton")
    public void user_clicks_on_login_button() {
        System.out.println("in And");

    }
    @Then("User Navigates to HomePage")
    public void user_navigates_to_home_page() {
        System.out.println("in Then");
    }

}
