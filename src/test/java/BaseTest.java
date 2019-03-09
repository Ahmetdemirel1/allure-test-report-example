import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;



    @BeforeEach
    public void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver","/Users/sahabt/Desktop/swacademy/deneme/allure-test-report/driver/chromedriver");

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,15);


    }

    @AfterEach
    public void driverQuit(){
//        driver.close();
        driver.quit();
    }



}
