package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase10 extends BeforeAfterTest{
    @Test
    public void TC10 (){

        System.out.println("TC10-User can't create account with an already in-useemai");
        HomePage homePage = new HomePage();
        RegisterPage registerPage= new RegisterPage();
        homePage.open();
        homePage.gotoResgisterPage();
        registerPage.register(Constant.InuseEmail,"vanvuong123","vanvuong123","12345678");

        String actualMsg=registerPage.getErrorEmailMessage();
        String expectedMsg="This email address is already in use.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can crete account with an already in-use email");

    }
}
