package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase05 extends BeforeAfterTest{
    @Test
    public void TCO5 (){
        System.out.println("TCO5-System show message when user enters wrong password several times");
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.gotoLoginPage();
        LoginPage loginPage= new LoginPage();
        for (int i = 0; i < 5; i++) {
            loginPage.login(Constant.USERNAME,"sairoi");
        }
        String actualMsg=loginPage.getErrorMessage();
        String expectedMsg="You have used 4 out of 5 login attempts";
        Assert.assertEquals(actualMsg ,expectedMsg, "Welcome message is not displayed as expexed");}

}
