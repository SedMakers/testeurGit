package junitcucumber.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static junitcucumber.StepsDefinitions.Hooks.driver;

public class MyStepdefs {

    @Given("said user on {string}")
    public void saidUserOn(String arg0) throws InterruptedException {
        driver.get(arg0);
        TimeUnit.SECONDS.sleep(3);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @When("he clicks on the menu button")
    public void heClicksOnTheMenuButton() throws InterruptedException {
        driver.findElement(By.xpath("//a[@data-widget=\"pushmenu\"]")).click();
        TimeUnit.SECONDS.sleep(3);


    }
}
