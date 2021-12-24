package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase03 extends BeforeAfterTest{
    @Test
    public void TCO3 (){
        System.out.println("TCO3-User can't login with invalid password");
        HomePage homePage = new HomePage();
        homePage.open();
        LoginPage loginPage= homePage.gotoLoginPage();
        String actualMsg=loginPage.login(Constant.USERNAME,"sairoi").getErrorMessage();
        String expectedMsg="Invalid username or password. Please try again.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can log in with invalid password");


    }
}
