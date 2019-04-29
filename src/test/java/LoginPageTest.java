import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;


@Epic("Login Tests Epic")
@Feature("Login Features")
public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage(driver);


    @Test
    @Description("Login with valid email and password")
    @Severity(SeverityLevel.CRITICAL)
    @Story("User login the page with email and password.")
    @Issue("Test issue")
    public void loginHomePage(){

        new HomePage(driver)
                .goToHomePage()
                .hoverLoginButton()
                .goToLoginPage()
                .fillMailPasswordAndClickLoginButton("ahmet@ahmet.com","ahmet123");
    }

    @Test
    @Description("Login with valid email and  wrong password")
    @Severity(SeverityLevel.NORMAL)
    @Story("User login the page with email and password.")
    public void loginWithWrongPass(){

        new HomePage(driver)
                .goToHomePage()
                .hoverLoginButton()
                .goToLoginPage()
                .fillMailPasswordAndClickLoginButton("ahmet@ahmet.com","ahmet");
        loginPage
                .wrongPasswordMessage("E-posta adresiniz ya da şifreniz yanlış.");
    }

    @Test
    @Description("Get fail message")
    @Severity(SeverityLevel.TRIVIAL)
    @Story("User login the page with email and wrong password.")
    public void failTest(){

        new HomePage(driver)
                .goToHomePage()
                .hoverLoginButton()
                .goToLoginPage()
                .fillMailPasswordAndClickLoginButton("ahmet@ahmet123.com","ahmet");
        loginPage
                .assertFail();
    }
}
