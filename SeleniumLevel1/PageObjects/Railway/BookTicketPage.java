package Railway;

import Constant.Constant;

public class BookTicketPage extends GerneralPage{
    //Locators inherit go reuse General navitional tabs
    //Elements extends which  class you want to use abble to call it here
    //Methods
// Methos that start our test cases
    public BookTicketPage open(){
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }

}
