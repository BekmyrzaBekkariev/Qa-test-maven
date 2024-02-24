package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verstka {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/bekmyrza/Downloads/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");

        // переменная

        WebElement accept = driver.findElement(By.xpath("//*[@id='W0wltc']/div"));
        accept.click();
        WebElement input = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        input.sendKeys("google");
        input.sendKeys(Keys.ENTER);


    }
}

