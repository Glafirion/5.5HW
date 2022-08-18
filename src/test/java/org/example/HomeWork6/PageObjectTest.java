package org.example.HomeWork6;

import HomeWork6.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDiver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
       driver = new ChromeDriver();
       driver.get("https://www.litres.ru/");
    }

    @Test
    void buyABookTest() throws InterruptedException {
       //new MainPage(driver).clickEnterButton();
      // new MainPage(driver).clickEmailButton();
      // new LoginPage(driver).login("testaradi001@mail.ru", "283/377");
      // new MainMenuBlock(driver).clickNovaButton();
      // new PopularPage(driver).clickSortingMenuButton();

        new MainPage(driver).clickEnterButton().clickEmailButton().login("testaradi001@mail.ru", "283/377")
                .mainMenuBlock
                .clickCloseIconButton().clickNovaButton().clickFirstCardBook()
                .clickBuyingButton().checkTotalSumma("249");


        //Thread.sleep(5000);

    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }


}
