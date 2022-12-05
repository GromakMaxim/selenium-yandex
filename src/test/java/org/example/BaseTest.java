package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    public WebDriver driver;

    @BeforeEach
    void setUp() {

        //System.setProperty("webdriver.chrome.driver", "src/test/resources/wd/chromium/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:/Users/User/AppData/Local/Yandex/YandexBrowser/Application/browser.exe");
        //options.addArguments("binary=C:\\Users\\User\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");

        WebDriverManager.chromedriver()
                .browserVersion("106") //смотри browser://version/
                .capabilities(options).setup();
        this.driver = new ChromeDriver(options);
    }

    @AfterEach
    void tearDown() {
        if (driver != null){
            driver.quit();
        }
    }
}
