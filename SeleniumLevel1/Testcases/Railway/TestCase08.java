package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase08 extends BeforeAfterTest{
    @Test
    public void TCO8 (){

        System.out.println("TCO8-User can't login with an account hasn't been activated");
        HomePage homePage = new HomePage();
        homePage.open();
        LoginPage loginPage= homePage.gotoLoginPage();
        String actualMsg=loginPage.login(Constant.UnactivatedUsername,Constant.PASSWORD).getErrorMessage();
        String expectedMsg="Invalid username or password. Please try again.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can login with an account hasn't been activated");
}
}
