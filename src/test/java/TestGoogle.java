import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by taras on 12/20/2016.
 */
public class TestGoogle {
    WebDriver driver;
    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.get("https://www.google.com.ua/");
    }

    @Test
    public void searchFieldGoogle (){
        String testURL = "http://toolsqa.com/selenium-webdriver/testng-testcase/";
        driver.get(testURL);
       // driver.findElement(By.id("_fZl")).click();
        String currentURL = driver.getCurrentUrl();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(currentURL, testURL);
        System.out.println(currentURL);
        System.out.println(testURL);
    }
}
