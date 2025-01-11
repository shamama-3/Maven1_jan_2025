package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicOfTestNgExam {
    public static WebDriver driver;
   @BeforeMethod
    public void preRequisit(){
        driver=new ChromeDriver();

    }
    @Test(groups = "smoke")
    public void testCase_1(){
         driver=new ChromeDriver();
        driver.get("https://mvnrepository.com/");

    }
    @Test
    public void testCase_2() {
        driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

    }
    @AfterMethod
    public void postRequisit() {
        driver = new ChromeDriver();

    }
    public void tearDown(){
        driver.close();
    }
}
