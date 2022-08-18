package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BasePage{

    @FindBy(xpath = "//a[@class='Login-module__loginLink']")
    private WebElement enterButton;


    public MainPage(WebDriver driver) {
        super(driver);
        mainMenuBlock = new MainMenuBlock(driver);
    }

    public MainMenuBlock mainMenuBlock;

    public ChooseLoginForm clickEnterButton() {
        enterButton.click();
        return new ChooseLoginForm(driver);
    }

}
