import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestAutoQAName {
    WebDriver driver;
    POITest objName;

    @BeforeTest
    public void setUp(){
        driver = new FirefoxDriver();
        objName = new POITest(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://toolsqa.com/automation-practice-form/?firstname=&lastname=&photo=&continents=Asia&selenium_commands=Wait+Commands&submit=");
    }
    @Test
    public void checkSetFirstName(){
        objName.registrationInputFirstName("Taras", "Buryak");
    }
}
