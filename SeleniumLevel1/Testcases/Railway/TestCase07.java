package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase07 extends BeforeAfterTest{
    @Test
    public void TCO7 (){

        System.out.println("TCO7-User can create new account");
        HomePage homePage = new HomePage();
        RegisterPage registerPage= new RegisterPage();
        homePage.open();
        homePage.gotoResgisterPage();
        registerPage.register(
                "vanvuong1997@gmail.com","vanvuong123","vanvuong123","12345678");

        String actualMsg=registerPage.getRegisterMessage();
        String expectedMsg="Registration Confirmed! You can now log in to the site.";
        Assert.assertEquals(actualMsg ,expectedMsg, "User can not create new account ");


    }
}
