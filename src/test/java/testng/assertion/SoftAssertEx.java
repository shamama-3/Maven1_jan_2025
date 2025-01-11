package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
    @Test(description = "verify page text, bmw radio button & enable text page on practice page")
    public void verifySoftAssert(){ WebDriver driver=new ChromeDriver();
        SoftAssert ast=new SoftAssert();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement bmwButton=driver.findElement(By.id("bmwradio"));
        WebElement pageText=driver.findElement(By.xpath("//h1[text()='Practice Page']"));
        WebElement enableTextBox=driver.findElement(By.id("enabled-example-input"));

        ast.assertFalse(bmwButton.isSelected(),"bmw bottun shouldnt be selected bydefault");
        ast.assertEquals(pageText.getText(),"Practice Page","Practice Page should be display");
        ast.assertTrue(enableTextBox.isEnabled(), "enable text box should be display");
        ast.assertAll();
        driver.close();

    }
}
