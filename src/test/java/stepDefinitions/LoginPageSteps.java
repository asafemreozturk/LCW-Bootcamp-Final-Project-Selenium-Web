package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.LoginPage;
import util.DriverFactory;

public class LoginPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("User is on Home page")
    public void userIsOnHomePage() {
        loginPage.checkHomePage();
    }

    @When("Click Giris Yap card in the top right")
    public void clickGirisYapCardInTheTopRight() {
        loginPage.clickGirisCard();
    }

    @Then("Should see Login Page")
    public void shouldSeeLoginPage() {
        loginPage.checkLoginPage();
    }

    @When("Type email {string}")
    public void typeEmail(String email) {
        loginPage.TypeEmail(email);
    }

    @Then("Type password {string}")
    public void typePassword(String password) {
        loginPage.TypePassword(password);
    }

    @Then("Click Giris yap button")
    public void clickGirisYapButton() {
        loginPage.clickGirisButton();
    }

    @Then("Click Uye ol Button on Login Page")
    public void clickUyeOlButtonOnLogin() {
        loginPage.clickUyeOlBtn();
    }

}
