package HomeWork6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NovaPage extends BasePage{
    public NovaPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//div[@class='line line-0']//div[1]//div[1]//div[1]//a[1]//img[1]")
    private WebElement firstCardBook;

    public FirstCardBook clickFirstCardBook() {
        firstCardBook.click();
        return new FirstCardBook(driver);
    }
}


   // @FindBy(xpath = "//a[@class='sorting-block__link'][contains(text(),'Популярное')]")
    //private WebElement popularButton;

   // public PopularPage clickPopularButton() {
    //    popularButton.click();
     //   return new PopularPage(driver);
   // }


//}
