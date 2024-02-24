package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class verstka {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/bekmyrza/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
        try {
            driver.get("https://jqueryui.com/droppable/");
            Thread.sleep(2000);

            WebElement element = driver.findElement(By.xpath(""));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        // Action
//        Actions actions = new Actions();

        //        // - с этими можно манипулировать элементами
        //        actions.moveToElement()// -
        //                .keyDown()// -  нажимаем на кнопку
        //                .keyUp() // - как будто мы отжимаем клик
        //                .clickAndHold() // - нажать и задержать
        //                .release() // -  отпусть
        //                .build() // - что бы все это нужно собрать
        //                .perform(); // - для применения

    }
}

