package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mydream {
    public static void main(String[] args) {
        // Нужно создать авто остановку спама для моей почты

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://mail.google.com/");

        WebElement input = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        input.sendKeys("bekmyrzabekkariev05@gmail.com");
        input.sendKeys(Keys.ENTER);



//        WebElement password = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
//        password.sendKeys("bekmyrzabekmyrza05");
//        password.sendKeys(Keys.ENTER);








    }
}
