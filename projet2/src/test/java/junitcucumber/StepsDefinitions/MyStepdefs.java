package junitcucumber.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

    @Given("player go to {string}")
    public void playerGoTo(String url) {
        driver.get(url);
    }

    @When("player clic on the lost ark section")
    public void playerClicOnTheLostArkSection() {
        driver.findElement(By.xpath("//a[@href=\"/lost-ark\"]")).click();
    }

    @And("click on build")
    public void clickOnBuild() {
        driver.findElement(By.xpath("//a[@href=\"/lost-ark/category/build-guides\"]")).click();
    }

    @And("click on the {string} class")
    public void clickOnTheClass(String number) {
        driver.findElement(By.xpath("(//li[contains(@class,\"font-title\")])["+number+"]")).click();
    }

    @And("click on the {string} build")
    public void clickOnTheBuild(String build) {
        driver.findElement(By.xpath("//h2[contains(@title,\""+build+"\")]")).click();
    }

    @Then("Player can see the build")
    public void playerCanSeeTheBuild() {
        driver.findElement(By.xpath("//div[contains(@class,\"lap-class-devilhunter_female\")]")).isDisplayed();
    }

    //-----------RUGBY-WORLD-CUP-------------------------------
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
        Assert.assertTrue(poolA.isEnabled());
    }
}

