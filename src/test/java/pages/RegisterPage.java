package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class RegisterPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    By mailPlaceholder=By.cssSelector("input[placeholder='E-Posta Adresiniz']");
    By passwordPlaceholder=By.cssSelector("input[placeholder='Şifreniz']");
    By phonePlaceholder=By.cssSelector("input[placeholder='0 (5__) ___ __ __']");
    By sozlesmeRadioBtn=By.cssSelector("input[value='false'][name='memberPrivacyApprove']");
    By uyeOlBtn=By.cssSelector("button[type='submit']");
    public void typeMailtoMail(String mail) {
        helper.sendKey(mailPlaceholder,mail);
    }

    public void typePasswordtoPassword(String password) {
        helper.sendKey(passwordPlaceholder,password);
    }

    public void typePhonetoPhone(String number) {
        helper.sendKey(phonePlaceholder,number);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 100);");
    }

    public void clickSozlesmeRadioBtn() {
        helper.click(sozlesmeRadioBtn);
    }

    public void clickUyeOlBtn() {
        helper.click(uyeOlBtn);
    }
}
