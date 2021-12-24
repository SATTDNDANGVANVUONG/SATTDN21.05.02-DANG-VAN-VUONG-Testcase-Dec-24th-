package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase01 extends BeforeAfterTest{
    @Test
    public void TCO1 (){
        System.out.println("TCO1- User can log into Railway with valid username and password");
        HomePage homePage = new HomePage();
        homePage.open();
        LoginPage loginPage= homePage.gotoLoginPage();
        String actualMsg=loginPage.login(Constant.USERNAME,Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg="Welcome"+" "+Constant.USERNAME;
        Assert.assertEquals(actualMsg ,expectedMsg, "Welcome message is not displayed as expexed");


    }
}
