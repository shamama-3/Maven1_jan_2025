package testng.paramterization;

import com.beust.jcommander.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParametrizationExample {
    //@Parameters({"city"}, "course"})
    @Test
    public void NeedOfParametrization(String city, String course) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(city + "  " + course);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
