package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }

    By homeHeader = By.xpath("//a[@class='main-header-logo']//*[name()='svg']");
    By searchPlaceholder = By.cssSelector("#search-form__input-field__search-input");
    By searchButton = By.cssSelector("button[type='button']");
    By colorSearch = By.cssSelector("input[placeholder='Renk Ara']");
    By blackColor = By.cssSelector("img[src='http://akstatic.lcwaikiki.com/Resource/Images/icon/siyah.png']");
    //By searchHeader = By.cssSelector("span[class='product-list-heading__product-count']");
    By productBlouse = By.cssSelector("a[title='LCW CASUAL V Yaka Nakışlı Askılı Viskon Kadın Bluz']");
    By cerezBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/button[2]");
    By addCartBtn = By.cssSelector("#pd_add_to_cart");
    By productPageHeader = By.cssSelector("div[class='col-xs-7 col-sm-9'] div[class='product-title']");
    By productSize = By.xpath("/html[1]/body[1]/div[3]/div[1]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/a[3]");
    By goCartPage=By.cssSelector("body > div:nth-child(11) > div:nth-child(1) > div:nth-child(1) > header:nth-child(2) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1)");
    By productModel=By.cssSelector(".rd-cart-item-code");
    By purchaseStepButton=By.cssSelector("div[class='col-md-12 pl-20 pr-20'] a[class='main-button mt-15']");
    By emailPlaceholder=By.cssSelector("div[class='login-form without-login-form'] input[placeholder='E-Posta Adresiniz']");
    By privayRadioBtn=By.cssSelector("input[value='false'][name='memberPrivacyApprove']");
    By continueWithoutRegister=By.cssSelector(".login-form__button.login-form__button--bg-blue.login-form__without-login-button");
    public void checkHome() {
        helper.checkElementVisible(homeHeader);
        helper.click(cerezBtn);
    }

    public void searchKey(String search) {
        helper.sendKey(searchPlaceholder, search);
    }

    public void clickSearch() {
        helper.click(searchButton);
    }

    public void selectBlack() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 1000);");
        helper.sendKey(colorSearch, "siyah");
        helper.click(blackColor);
        jse.executeScript("window.scrollBy(0 , 1000);");
    }

    public void selectProduct() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0 , 100);");
        helper.click(productBlouse);
    }

    public void clickAddCart() {

        helper.click(productSize);
        helper.click(addCartBtn);
    }

    public void checkProductPage() {
        helper.checkElementVisible(productPageHeader);
    }


    public void clickGoCartPage() {
        helper.click(goCartPage);
    }

    public void checkProductCart(String model) {
        helper.checkElementText(productModel,model);
    }
    public void clickPurchaseStepBtn() { helper.click(purchaseStepButton);}

    public void enterEmail(String mail) {
        helper.sendKey(emailPlaceholder,mail);
    }

    public void clickPrivacyRadioBtn() { helper.click(privayRadioBtn);
    }

    public void clickContinueWithoutRegisterBtn() { helper.click(continueWithoutRegister);
    }
}