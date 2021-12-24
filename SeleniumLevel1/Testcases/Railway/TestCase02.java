package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02 extends BeforeAfterTest{
    @Test
    public void TCO2 (){
        System.out.println("TCO2-User can't login with blank Username textbox");
        HomePage homePage = new HomePage();
        homePage.open();
        LoginPage loginPage= homePage.gotoLoginPage();
        String actualMsg=loginPage.login("", Constant.PASSWORD).getErrorMessage();
        String expectedMsg="There was a problem with your login and/or errors exist in your form.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can log in with blank Username");


    }

}
