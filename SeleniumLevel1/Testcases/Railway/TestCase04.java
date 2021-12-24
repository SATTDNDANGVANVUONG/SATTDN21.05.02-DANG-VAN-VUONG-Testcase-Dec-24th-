package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase04 extends BeforeAfterTest{
    @Test
    public void TCO4 (){
        System.out.println("TCO4-User is redirected to Book ticket page after logging in");
        HomePage homePage = new HomePage();
        homePage.open();
        homePage.gotoBookTicketPage();
        LoginPage loginPage= new LoginPage();
        String actualMsg=loginPage.login(Constant.USERNAME,Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg="Welcome"+" "+Constant.USERNAME;
        Assert.assertEquals(actualMsg ,expectedMsg, "Welcome message is not displayed as expexed");}


}
