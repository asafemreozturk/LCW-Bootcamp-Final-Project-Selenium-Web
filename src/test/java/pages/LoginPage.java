package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }
    By homeHeader = By.xpath("//a[@class='main-header-logo']//*[name()='svg']");
    By cerezBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/button[2]");
    By girisCard=By.cssSelector(".dropdown-label");
    By loginHeader=By.cssSelector(".login-form__title");
    By emailPlaceholder=By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By passwordPlaceholder=By.cssSelector("input[placeholder='Şifreniz']");
    By loginButton=By.cssSelector("button[type='submit']");
    By uyeOlButton=By.cssSelector(".login-form__link");
    public void checkHomePage() {
        helper.checkElementVisible(homeHeader);
        helper.click(cerezBtn);
    }
    public void clickGirisCard() {
        helper.click(girisCard);
    }
    public void checkLoginPage() {
        helper.checkElementVisible(loginHeader);
    }
    public void TypeEmail(String email) {
        helper.sendKey(emailPlaceholder,email);
    }
    public void TypePassword(String password) {
        helper.sendKey(passwordPlaceholder,password);
    }

    public void clickGirisButton() {
        helper.click(loginButton);
    }

    public void clickUyeOlBtn() {
        helper.click(uyeOlButton);
    }
}
