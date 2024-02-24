package lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class practicetwo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/bekmyrza/Downloads/chromedriver-linux64/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // ожидание  явное - но старый метод
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // новый метод
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebElement element = (WebElement) new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("123")));




        driver.get("https:google.com");
    }
}
