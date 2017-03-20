import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by taras on 12/3/2016.
 */
public class POITest {
    WebDriver driver;
    By firstName = By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]");
    By lastName = By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]");
    By searchField = By.name("q");

    public POITest (WebDriver driver) {

        this.driver = driver;
    }
    public void setFirstName (String strFirstName){

        driver.findElement(firstName).sendKeys(strFirstName);
    }
    public void setLastName (String strLastName){

        driver.findElement(lastName).sendKeys(strLastName);
    }
    public void setSearchField(String strSearchText){
        driver.findElement(searchField).sendKeys(strSearchText);
    }
    public void inputSearchField(String strSearchText){

        this.setSearchField(strSearchText);
    }

    public void registrationInputFirstName (String strFirstName, String strLastName){
        this.setFirstName(strFirstName);
        this.setLastName(strLastName);
    }
}
