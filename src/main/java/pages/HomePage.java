package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    //========= Variables =========

    String baseUrl = "https://hepsiburada.com";

    //========= WebElements =========
    @FindBy(xpath = "//a[@class='cart-copy'][contains(text(),'Giriş Yap')]")
    public WebElement loginHoverButton;

    @FindBy(id = "login")
    public  WebElement loginButton;


    //========= Methods =========

    public HomePage goToHomePage(){
        driver.get(baseUrl);
        return this;
    }

    public HomePage hoverLoginButton(){
        Actions action = new Actions(driver);
        action.moveToElement(loginHoverButton).build().perform();
        waitSeconds(3);

        return this;
    }

    public LoginPage goToLoginPage(){

        loginButton.click();
        return new PageFactory().initElements(driver,LoginPage.class);
    }

}
