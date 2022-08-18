package HomeWork6;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyingButton extends BasePage{
    public BuyingButton(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"popup__payment_price\"]")
    private WebElement totalSumma;

    public BuyingButton checkTotalSumma(String expectedSumma) {
        Assertions.assertEquals(expectedSumma, totalSumma.getText());
        return this;
    }

   // @FindBy(xpath = "//span[contains(text(),'Купить и скачать за')]")
  // private WebElement buyingButton;

    //public SuccessAddToCartPage clickBuyingButton() {
    //    buyingButton.click();
   //     return new SuccessAddToCartPage(driver);
   // }
}
