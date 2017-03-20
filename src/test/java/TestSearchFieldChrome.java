import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by taras on 12/9/2016.
 */
public class TestSearchFieldChrome {
    WebDriver driver;
    POITest objName;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.get("https://www.google.com.ua/");
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void checkSearchField(){
        objName = new POITest(driver);
        objName.inputSearchField("Катюшка, дай цемну в ушко!");
        //objName.driver.close();
    }


}
