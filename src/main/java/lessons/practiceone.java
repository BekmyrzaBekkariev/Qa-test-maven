package lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceone {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/bekmyrza/Downloads/chromedriver-linux64/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}

