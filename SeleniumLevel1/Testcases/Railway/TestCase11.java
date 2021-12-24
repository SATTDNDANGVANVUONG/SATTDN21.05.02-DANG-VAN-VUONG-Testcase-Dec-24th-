package Railway;

import Constant.Constant;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase11 extends BeforeAfterTest{
    @Test
    public void TC11 (){

        System.out.println("TC11-User can't create account while password and PID fields are empty");
        HomePage homePage = new HomePage();
        RegisterPage registerPage= new RegisterPage();
        homePage.open();
        homePage.gotoResgisterPage();
        registerPage.register("vanvuon1234@gmail.com","","  ","");

        String actualFrmMsg=registerPage.getErrorEmailMessage();
        String expecteFrmMsg="There're errors in the form. Please correct the errors and try again.";
        String actualErrorPasswordMsg=registerPage.getErrorPassWordMessage();
        String expectedErrorPasswordMsg="Invalid password length";
        String actualErrorPassportMsg=registerPage.getErrorPassportMessage();
        String expectedErrorPassportMsg="Invalid ID length";
        Assert.assertEquals(actualFrmMsg ,expecteFrmMsg);
        Assert.assertEquals(actualErrorPasswordMsg ,expectedErrorPasswordMsg);
        Assert.assertEquals(actualErrorPassportMsg ,actualErrorPassportMsg);



    }
}
