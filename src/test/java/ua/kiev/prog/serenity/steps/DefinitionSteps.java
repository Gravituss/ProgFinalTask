package ua.kiev.prog.serenity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.kiev.prog.serenity.steps.serenity.EndUserSteps;

import java.util.concurrent.TimeUnit;

public class DefinitionSteps {

    WebDriver driver;
//    WeatherForecastMainPage weatherForecastMain;
//    WeatherForecastSomeCityPage weatherForecastSomeCity;

    @Steps
    EndUserSteps endUser;

    @Given("$browser started")
    public void startDriver (String browser) {
        System.setProperty("webdriver.gecko.driver", "C:\\pr\\gecko\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\pr\\cd\\chromedriver.exe");
        if (browser.equals("firefox")) driver = new FirefoxDriver();
        if (browser.equals("chrome")) driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("proceed to $url")
    public void givenTheUserIsOnTheWikionaryHomePage(String url) {
        driver.get(url);
        endUser.is_the_home_page();
    }

    @When("the user types the $capital")
    public void whenTheUserLooksUpTheDefinitionOf(String capital) {
        endUser.looks_for(capital);
    }

    @Then("they should see the corresponding $country")
    public void thenTheyShouldSeeTheCorrespondingCountry(String country) {
        endUser.should_see_definition(country);
    }

}
