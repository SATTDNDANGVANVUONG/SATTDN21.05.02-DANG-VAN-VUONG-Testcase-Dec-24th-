package Railway;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends GerneralPage {
//Locators
    private final By _txtUsername= By.xpath("//*[@id=\"username\"]");
    private final By _txtPassword= By.xpath("//*[@id=\"password\"]");
    private final By _btbLogin= By.xpath("//*[@id=\"content\"]/form/fieldset/p/input");
    private final By _lblLoginErrorMsg= By.xpath("//p[@class='message error LoginForm']");
    //Elements
    public WebElement getTxtUsername(){
        return Constant.WEBDRIVER.findElement(_txtUsername);
    }
    public WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(_txtPassword);
    }
    public WebElement getBtnLogin(){
        return Constant.WEBDRIVER.findElement(_btbLogin);
    }
    public WebElement getlbLoginErrorMsg(){
        return Constant.WEBDRIVER.findElement(_lblLoginErrorMsg);
    }
    //Methods
    public HomePage login(String username,String password){
        //Submit login credentials
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        //Land on Home page
        return new HomePage();
    }
}