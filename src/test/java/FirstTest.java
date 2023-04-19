import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class FirstTest {
    @Test
    public void connectionToSelenium() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("https://www.potolki-minsk.by/");
        WebElement element = driver.findElement(By.xpath(".//strong[contains(text(),'Натяжные потолки MINSK')]"));
        String text = element.getText();
        List<WebElement> elements = driver.findElements(By.xpath(".//div"));
        System.out.println(elements.size());
        Assert.assertEquals("Натяжные потолки MINSK ", "Натяжные потолки MINSK ");
    }


}
