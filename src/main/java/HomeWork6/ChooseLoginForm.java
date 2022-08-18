package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChooseLoginForm extends BasePage{
    public ChooseLoginForm(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"litres_header\"]/header/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[3]/button[1]/div")
    private WebElement emailButton;

    public LoginPage clickEmailButton() {
        emailButton.click();
        return new LoginPage(driver);
    }
}
