package testng;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 1, groups="smoke")
    public void TestScenarioA(){
        System.out.println("Test Scenario A");
    }
    @Test(priority = 2)
    public void TestScenarioB(){
        System.out.println("Test Scenario B");
    }
    @Test(priority = -1)
    public void TestScenarioH(){
        System.out.println("Test Scenario H");
    }
    @Test(priority = 'c' , groups = "smoke")
    public void TestScenarioZ(){
        System.out.println("Test Scenario Z");
    }
}
