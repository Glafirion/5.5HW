package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseIconPage extends BasePage{
    public CloseIconPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'Новинки')]")
    private WebElement novaButton;

    public NovaPage clickNovaButton() {
        novaButton.click();
        return new NovaPage(driver);
    }


}
