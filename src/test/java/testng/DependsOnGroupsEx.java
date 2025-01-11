package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsEx {
    @Test(groups ={"smoke"})
    public void verifyAddAccountInPay(){
        Assert.assertTrue(false);
        System.out.println("verify Add Account In Pay");
    }
    @Test(dependsOnGroups = {"smoke"})
    public void verifyFundTransfer(){
        System.out.println("verify Fund Transfer");
    }
    @Test
    public void verifyCashBackOffer(){
        System.out.println("verifyCashBackOffer");
    }
}
