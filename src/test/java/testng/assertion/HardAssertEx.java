package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
@Test(description = "verify page text, bmw radio button & enable text page on practice page")
    public void verifyPracticePage(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
    WebElement bmwButton=driver.findElement(By.id("bmwradio"));
    WebElement pageText=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
    WebElement enableTextBox=driver.findElement(By.id("enabled-example-input"));

    Assert.assertFalse(bmwButton.isSelected(),"bmw bottun shouldnt be selected bydefault");
   Assert.assertEquals(pageText.getText(),"Practice Page","Practice Page should be display");
   Assert.assertTrue(enableTextBox.isEnabled(), "enable text box should be display");
driver.close();
    }
}
