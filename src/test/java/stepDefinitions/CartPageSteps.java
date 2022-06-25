package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import util.DriverFactory;

public class CartPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);

    @Given("Uygulama acilir")
    public void uygulamaAcilir() {
        cartPage.checkHome();
    }

    @When("Arama cubuguna {string} yazilir")
    public void aramaCubugunaYazilir(String bluz) {
        cartPage.searchKey(bluz);
    }

    @When("Ara butonuna tiklanir")
    public void araButonunaTiklanir() {
        cartPage.clickSearch();
    }

    @When("Filtreden siyahı seç")
    public void filtredenSiyahıSeç() {
        cartPage.selectBlack();
    }

    @Then("Ürünü seç")
    public void ürünüSec() {
        cartPage.selectProduct();
    }

    @Then("Product Pagein acildigi kontrol edilir")
    public void productPageinAcildigiKontrolEdilir() {
        cartPage.checkProductPage();
    }

    @When("Sepete ekleye tiklanir")
    public void sepeteEkleyeTiklanir() {
        cartPage.clickAddCart();
    }

    @Then("Sepete gidilir")
    public void sepeteGidilir() {
        cartPage.clickGoCartPage();
    }

    @Then("Urunun {string} kontrol edilir")
    public void urununKontrolEdilir(String model) {
        cartPage.checkProductCart(model);
    }

    @When("Odeme adımına gec butonuna tıklanır")
    public void odemeAdımınaGecButonunaTıklanır() {
        cartPage.clickPurchaseStepBtn();
    }


    @Then("Kullanım sözlesmesi tıklenir")
    public void kullanımSözlesmesiTıklenir() {
        cartPage.clickPrivacyRadioBtn();
    }

    @Then("Uye olmadan devam et butonuna tıklanır")
    public void uyeOlmadanDevamEtButonunaTıklanır() {
        cartPage.clickContinueWithoutRegisterBtn();
    }

    @Then("Uye olmadan siparis kısmına {string} yazılır")
    public void uyeOlmadanSiparisKısmınaYazılır(String mail) {
        cartPage.enterEmail(mail);
    }
}
