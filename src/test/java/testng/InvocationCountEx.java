package testng;

import org.testng.annotations.Test;

public class InvocationCountEx {
    @Test(invocationCount = 20, invocationTimeOut = 1)
    public void methodExample(){
        System.out.println("Method Example");
    }
}
