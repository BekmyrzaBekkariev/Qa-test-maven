package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class practicethree {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/bekmyrza/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.avito.ru/catalog/auto-ASgBAgICAUTQvA7~m9EB");

        WebElement element = driver.findElement(By.xpath(""))




    }
}
