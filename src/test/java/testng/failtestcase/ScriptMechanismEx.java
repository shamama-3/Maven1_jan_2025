package testng.failtestcase;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ScriptMechanismEx implements IRetryAnalyzer {
public static int count=0;
public static final int retry_limit=3;
    @Override
    public boolean retry(ITestResult iTestResult) {
if(count<retry_limit){
    count++;
    return true;
}return false;

    }
}
