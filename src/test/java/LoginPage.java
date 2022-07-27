import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="email")
    private WebElement email;

    @FindBy(id="pass")
    private WebElement password;

    @FindBy(xpath = "//div[contains(text(), 'The password you’ve entered is incorrect.')]")
    private WebElement errorMessage;

    public String getErrorMessage(){
        String error = errorMessage.getText();
        return error;
    }

    public void loginToFb(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password+ Keys.ENTER);
    }
}
