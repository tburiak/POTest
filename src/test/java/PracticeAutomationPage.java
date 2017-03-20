import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by taras on 12/3/2016.
 */
public class PracticeAutomationPage{

    WebDriver driver;
    private static String URL_MATCH = "";


    public PracticeAutomationPage (WebDriver driver){
        if (!driver.getCurrentUrl().contains(URL_MATCH)) {
            throw new IllegalStateException(
                    "This is not the page you are expected"
            );
        }
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    @FindBy (id = "container")
    WebElement conteiner;

    @FindBy (id = "sitetoolbar__login")
    WebElement buttonLogin;

    @FindBy (id = "sex-1")
    WebElement radioButtonSexMale;

    void  clickConteiner() {

        conteiner.click();
    }

    void  clickLogin() {

        buttonLogin.click();
    }

    void clickradioButtonSexMale(){

        radioButtonSexMale.click();
    }



//    WebDriver driver;
//    By firstName = By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]");
//    By lastName = By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]");
//    By searchField = By.name("q");
//
//    public PracticeAutomationPage(WebDriver driver) {
//
//        this.driver = driver;
//    }
//    public void setFirstName (String strFirstName){
//
//        driver.findElement(firstName).sendKeys(strFirstName);
//    }
//    public void setLastName (String strLastName){
//
//        driver.findElement(lastName).sendKeys(strLastName);
//    }
//    public void setSearchField(String strSearchText){
//        driver.findElement(searchField).sendKeys(strSearchText);
//    }
//    public void inputSearchField(String strSearchText){
//
//        this.setSearchField(strSearchText);
//    }
//
//    public void registrationInputFirstName (String strFirstName, String strLastName){
//        this.setFirstName(strFirstName);
//        this.setLastName(strLastName);
//    }
}
