package Railway;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Constant.Constant;
import org.openqa.selenium.support.FindBy;

public class GerneralPage {
    //locators
    private final By tagLogin= By.xpath("//span[normalize-space()='Login']");
    public final By tagLogout= By.xpath("//span[normalize-space()='Log out']");//thay doi sau
    private final By lblWelcomeMessage= By.xpath("//*[@id=\"banner\"]/div/strong");
    private final By lnlErrorMessage=By.xpath("//*[@id=\"content\"]/p");
    private final By tagBookTicket= By.xpath("//span[normalize-space()='Book ticket']");
    private final By lblHomePageMessage=By.xpath("//div[@id='content']/h1");
    private final By tabRegister=By.xpath("//span[normalize-space()='Register']");
    private final By tabChangePassWord=By.xpath("//span[normalize-space()='Change password']");


     //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tagLogin);
    }
    protected WebElement getTabLogOut(){
        return Constant.WEBDRIVER.findElement(tagLogout);
    }
    protected WebElement getlblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getlblErrorMessage(){
        return Constant.WEBDRIVER.findElement(lnlErrorMessage);
    }
    protected WebElement getlblHomePageMessage(){
        return Constant.WEBDRIVER.findElement(lblHomePageMessage);
    }
    protected WebElement getTabBookTicket(){
        return Constant.WEBDRIVER.findElement(tagBookTicket);
    }
    public WebElement getTabRegister(){return Constant.WEBDRIVER.findElement(tabRegister);}
    public WebElement getTabChangePassword(){return Constant.WEBDRIVER.findElement(tabChangePassWord);}



    //Methods
    public String getWelcomeMessage() {
        return this.getlblWelcomeMessage().getText();
    }
    public String getErrorMessage() {
        return this.getlblErrorMessage().getText();
    }
    public String getHomePageMessage() {
        return this.getlblHomePageMessage().getText();
    }
    public LoginPage gotoLoginPage() {
        this.getTabLogin().click();
        return new LoginPage();
    }
    public BookTicketPage gotoBookTicketPage() {
        this.getTabBookTicket().click();
        return new BookTicketPage();
    }

    public HomePage gotoLogoutPage() {
        this.getTabLogOut().click();
        return new HomePage();
    }
    public RegisterPage gotoResgisterPage() {
        this.getTabRegister().click();
        return new RegisterPage();
    }
    public ChangePasswordPage gotoChangePasswordPage() {
        this.getTabChangePassword().click();
        return new ChangePasswordPage();
    }


}
