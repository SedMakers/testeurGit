package junitcucumber.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.locators.WaitForWebElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static junitcucumber.StepsDefinitions.Hooks.driver;

public class MyStepdefs {
    @Given("un etudiant sur le site {string}")
    public void unEtudiantSurLeSite(String url) {
        driver.get(url);
    }

    @When("il saisit son userName {string}")
    public void ilSaisitSonUserName(String username) {
        driver.findElement(By.id("userName")).sendKeys(username);
    }

    @And("il saisit son password {string}")
    public void ilSaisitSonPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("il clique sur le bouton login")
    public void ilCliqueSurLeBoutonLogin() {
        driver.findElement(By.id("login")).click();
    }

    @Then("le message d'erreur {string} apparait en rouge")
    public void leMessageDErreurApparraitEnRouge(String message) {
        WebElement messageErreur = driver.findElement(By.id("name"));
        String style = messageErreur.getAttribute("style");
        assert style.contains("color: red;");

    }

    //-----------RUGBY-WORLD-CUP--------------------------------
    @Given("the fan is on the website {string}")
    public void theFanIsOnTheWebsite(String url) {
        driver.get(url);
    }
    @When("he accepts cookies")
    public void heAcceptsCookies() {
        WebElement cookie = driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookie.click();
    }
    @And("he clicks on pools link")
    public void heClicksOnPoolsLink() {
        WebElement pool = driver.findElement(By.xpath("(//ul[@class='main-nav__list']/li)[2]"));
        pool.click();
    }
    @Then("the pools page is opened and pool A is visible")
    public void thePoolsPageIsOpenedAndPoolAIsVisible() {
        WebElement poolA = driver.findElement(By.xpath("//li[contains(@class, 'active pools__tab-selector')]/div[text()='Pool A']"));
        Assert.assertFalse(!poolA.isEnabled());
    }

}
