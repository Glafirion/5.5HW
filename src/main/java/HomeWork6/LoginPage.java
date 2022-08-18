package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@name='email']")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"litres_header\"]/header/div[2]/div[2]/div[2]/div/div/div/div[1]/div/form/div[2]/button/div")
    private WebElement continueLoginField;


    @FindBy(xpath = "//input[@placeholder='Введите пароль']")
    private WebElement passwdField;

    @FindBy(xpath = "//*[@id=\"litres_header\"]/header/div[2]/div[2]/div[2]/div/div/div/div[1]/div/form/div[3]/button")
    private WebElement enterButtonP;

    public MainPage login(String login, String password) throws InterruptedException {
        webDriverWait.until(ExpectedConditions.visibilityOf(loginField));
        loginField.sendKeys(login);
        continueLoginField.click();
        webDriverWait.until(ExpectedConditions.visibilityOf(passwdField));
        //Thread.sleep(1000);
        passwdField.sendKeys(password);
        enterButtonP.click();
        return new MainPage(driver);
    }


}
