import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestCase {


    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }
    @Test
    public void facebookTest() {

        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
        loginPage.loginToFb("test@gmail.com", "pasword123");

        Assert.assertEquals("The password you’ve entered is incorrect. Forgot Password?", loginPage.getErrorMessage());
    }



















}
