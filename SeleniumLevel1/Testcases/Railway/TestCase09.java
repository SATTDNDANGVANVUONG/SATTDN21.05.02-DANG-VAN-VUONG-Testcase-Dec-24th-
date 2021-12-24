package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase09 extends BeforeAfterTest{
    @Test
    public void TC09 (){
        System.out.println("TC09- User can't change password when New Password and  Confirm Password  are different.");
        HomePage homePage = new HomePage();
        homePage.open();
        LoginPage loginPage= homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);
        homePage.gotoChangePasswordPage();

        String actualMsg=loginPage.login(Constant.USERNAME,Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg="Welcome"+" "+Constant.USERNAME;
        Assert.assertEquals(actualMsg ,expectedMsg, "Welcome message is not displayed as expexed");


    }
}
