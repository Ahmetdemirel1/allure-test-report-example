package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    //========= WebElements =========
    @FindBy(id = "email")
    public WebElement emailInputArea;

    @FindBy(id = "password")
    public WebElement passwordInputArea;

    @FindBy(xpath = "//button[contains(text(),'Giriş')]")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='response-message-content']")
    public WebElement errorMessage;

    //========= Methods =========


    public BasePage fillMailPasswordAndClickLoginButton(String email, String pass){
        emailInputArea.sendKeys(email);
        passwordInputArea.sendKeys(pass);
        //loginButton.click();
        waitSeconds(5);
        return this;
    }


    public BasePage wrongPasswordMessage(String expected){
        String getText = errorMessage.getText();
        System.out.println(getText);
        assertEquals(expected,"E-posta adresiniz ya da şifreniz yanlış.","Şifre hatalı olduğu için giriş yapılamadı");


        return this;
    }


    public BasePage assertFail(){
        assertTrue(false);
        return this;
    }

}

