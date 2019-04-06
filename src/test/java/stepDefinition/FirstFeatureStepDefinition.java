package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstFeatureStepDefinition {
    static WebDriver mydriver;
    @Given("^I am a chrome user$")
    public void i_am_a_chrome_user()  {
        System.setProperty("webdriver.chrome.driver", "C:\\work_space\\MyFirstMavanProject\\src\\chromedriver.exe");
        mydriver =new ChromeDriver();

        // Write code here that turns the phrase above into concrete action
    }

    @When("^I access Google website$")
    public void i_access_Google_website()  {
        // Write code here that turns the phrase above into concrete actions
        mydriver.get("https://www.google.com");
    }

    @Then("^I see Google Home page$")
    public void i_see_Google_Home_page()  {
        // Write code here that turns the phrase above into concrete actions
        mydriver.quit();
       // mydriver.getTitle();
      // System.out.println(mydriver.getTitle());


    }




}
