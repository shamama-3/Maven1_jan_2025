package testng.failtestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExampleOfFailScript {
@Test(retryAnalyzer = ScriptMechanismEx.class )
public void failScriptA(){
    Assert.assertFalse(true);
}
@Test
    public void failScriptB(){
        System.out.println("fail script");
    }@Test
    public void failScriptC(){
        System.out.println("fail script");
    }


}
