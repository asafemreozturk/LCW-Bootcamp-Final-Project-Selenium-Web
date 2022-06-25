package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.RegisterPage;
import util.DriverFactory;

public class RegisterPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    RegisterPage regPage = new RegisterPage(driver);

    @When("Type email {string} to email placeholder")
    public void typeEmailToEmailPlaceholder(String mail) {
        regPage.typeMailtoMail(mail);
    }

    @Then("Type password {string} to password placeholder")
    public void typePasswordToPasswordPlaceholder(String password) {
        regPage.typePasswordtoPassword(password);
    }

    @When("Type phone number {string} to number placeholder")
    public void typePhoneNumberToNumberPlaceholder(String number) {
        regPage.typePhonetoPhone(number);

    }

    @Then("Click Kullanıcı sözlesmesi Radio Button")
    public void clickKullanıcıSözlesmesiRadioButton() {
        regPage.clickSozlesmeRadioBtn();
    }

    @Then("Click Uye Ol Button")
    public void clickUyeOlButton() {
        regPage.clickUyeOlBtn();
    }
}
