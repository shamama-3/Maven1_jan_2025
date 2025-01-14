package testng;

import org.testng.annotations.*;

public class BeforeAfterMethodEx {
    @BeforeClass(groups = {"smoke"})
    public void beforeClass(){
        System.out.println("Before Class");
    }
@AfterClass(groups = {"smoke"})
    public void afterClass(){
        System.out.println("After Class");
    }
    @BeforeMethod
    public void beforeMe(){
        
    }
    @AfterMethod
    public void afterMe(){
        System.out.println("After Method");
    }
    @Test(groups = {"smoke"})
    public void demo1(){
        System.out.println("Demo 1");
    }
    @Test
    public void demo2(){
        System.out.println("Demo 2");
    }
    @Test
    public void demo3(){
        System.out.println("Demo 3");
    }
}
