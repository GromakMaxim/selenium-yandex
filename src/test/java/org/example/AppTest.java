package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class AppTest extends BaseTest{
    @Test
    public void shouldAnswerWithTrue() {
        driver.get("https://stackoverflow.com/questions/30707783/java-selenium-webdriver-with-yandex");
        new Actions(driver).pause(Duration.ofSeconds(5)).perform();
    }
}
