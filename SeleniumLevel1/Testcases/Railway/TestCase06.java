package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase06 extends BeforeAfterTest{
    @Test
    public void TCO6 (){
        System.out.println("TC06-User is redirected to Home page after logging out");
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.gotoLoginPage();
        LoginPage loginPage= new LoginPage();
        loginPage.login(Constant.USERNAME,Constant.PASSWORD);
        homePage.gotoLogoutPage();
        String actualMsg=homePage.getHomePageMessage();
        String expectedMsg="Welcome to Safe Railway";
        Assert.assertEquals(actualMsg ,expectedMsg, "User is not redirected to Home page after logging out");



    }

}
