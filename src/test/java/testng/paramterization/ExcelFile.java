package testng.paramterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {
@DataProvider(name="testdata")
    public Object[][] dataFun() throws IOException, InterruptedException {
        Object[][] arrayobject = getExcelData("D:\\TestFile.xlsx", "TestCase1");
        return arrayobject;
    }

    public String[][] getExcelData(String fileName, String sheetName) throws IOException, InterruptedException {
        FileInputStream file = new FileInputStream(fileName);//normalFile access ki ye class se
        XSSFWorkbook wb = new XSSFWorkbook(file);//excel file ko access kiya hai hune
        XSSFSheet sheet = wb.getSheet(sheetName);
        XSSFRow row = sheet.getRow(0);
        int noOfRow = sheet.getPhysicalNumberOfRows();
        int noOfColum = row.getLastCellNum();
        Cell cell;

        String[][] data = new String[noOfRow - 1][noOfColum];
        for (int i = 1; i <= noOfRow-1; i++) {
            for (int j = 0; j < noOfColum; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i - 1][j] = cell.getStringCellValue();
            }
        }
        return data;
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
