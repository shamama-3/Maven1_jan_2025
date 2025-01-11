package testng.paramterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;





public class
DataMethod{
    @DataProvider(name="Testdata")
    public Object[][] dataFuntion() {
        return new Object[][]{
                {"Nagpur", "Java"}, {"Mumbai", "python"}, {"pune", "C+"}
        };
    }

    @Test(dataProvider = "Testdata")
    public void NeedOfParametrization(String city,String course) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys(city+"   "+course);
        searchBox.click();
        Thread.sleep(3000);
        driver.close();


    }
}









