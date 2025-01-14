package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicOfTestNGEx {
@Test
    public void testCase_1(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/");
        
    }
    @Test
    public void testCase_2(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
         System.out.println("Before Class");
        driver.close();
    }
}
