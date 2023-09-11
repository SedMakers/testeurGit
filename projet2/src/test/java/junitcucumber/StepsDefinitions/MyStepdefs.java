package junitcucumber.StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
}
