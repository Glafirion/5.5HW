package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuBlock extends BasePage{


    public MainMenuBlock(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//a[@class='AuthorizationPopup-module__close-icon']")
    public WebElement closeIconButton;

    public CloseIconPage clickCloseIconButton() {
        closeIconButton.click();
        return new CloseIconPage(driver);
    }
}
