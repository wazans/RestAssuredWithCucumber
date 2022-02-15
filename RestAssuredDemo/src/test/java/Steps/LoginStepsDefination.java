package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefination {
	public static WebDriver driver;

@Given("I have launched chrome")
public void i_have_launched_chrome() {
	System.setProperty("webdriver.chrome.driver","C:\\Utilities\\chromedriver.exe");
	driver = new ChromeDriver();
}

@When("I have entered the correct URL")
public void i_have_entered_the_correct_URL() {
    driver.get("https://facebook.com");
}

@Then("I should be successfully on the home screen")
public void i_should_be_successfully_on_the_home_screen() {
    System.out.println("i am on the home page");
    String fbTitle=driver.getTitle();
    Assert.assertEquals(fbTitle, "Facebook – log in or sign up");
    System.out.println(fbTitle);
}

}
