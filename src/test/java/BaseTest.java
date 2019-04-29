import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;



    @BeforeEach
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/sahabt/Desktop/swacademy/deneme/allure-test-report/driver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver,15);


    }

    @AfterEach
    public void driverQuit(){

       driver.quit();
    }



}
