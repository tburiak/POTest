import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

public class mouseWheelTest {
    WebDriver driver;
    PracticeAutomationPage page;


    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("http://toolsqa.com/automation-practice-form/");
//        driver.get("https://learn.javascript.ru/mousewheel");
        driver.get("https://learn.javascript.ru/article/mousewheel/wheel/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        page = new PracticeAutomationPage(driver);

    }
    @Test
    public void TC_mouseWheelTest () throws InterruptedException {

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("//div[@id='container']"));

        Thread.sleep(5000);


        if (driver instanceof JavascriptExecutor) {
            ((JavascriptExecutor) driver)
                    .executeScript(
                            "\n" +
                                    "    var elem = document.getElementById('container');\n" +
                                    "\n" +
                                    "    if (elem.addEventListener) {\n" +
                                    "      if ('onwheel' in document) {\n" +
                                    "        // IE9+, FF17+\n" +
                                    "        elem.addEventListener(\"wheel\", onWheel);\n" +
                                    "      } else if ('onmousewheel' in document) {\n" +
                                    "        // устаревший вариант события\n" +
                                    "        elem.addEventListener(\"mousewheel\", onWheel);\n" +
                                    "      } else {\n" +
                                    "        // Firefox < 17\n" +
                                    "        elem.addEventListener(\"MozMousePixelScroll\", onWheel);\n" +
                                    "      }\n" +
                                    "    } else { // IE8-\n" +
                                    "      elem.attachEvent(\"onmousewheel\", onWheel);\n" +
                                    "    }\n" +
                                    "\n" +
                                    "\n" +
                                    "    // Это решение предусматривает поддержку IE8-\n" +
                                    "    function onWheel(e) {\n" +
                                    "      e = e || window.event;\n" +
                                    "\n" +
                                    "      // deltaY, detail содержат пиксели\n" +
                                    "      // wheelDelta не дает возможность узнать количество пикселей\n" +
                                    "      // onwheel || MozMousePixelScroll || onmousewheel\n" +
                                    "      var delta = e.deltaY || e.detail || e.wheelDelta;\n" +
                                    "\n" +
                                    "      var info = document.getElementById('delta');\n" +
                                    "\n" +
                                    "      info.innerHTML = +info.innerHTML + delta;\n" +
                                    "\n" +
                                    "      e.preventDefault ? e.preventDefault() : (e.returnValue = false);\n" +
                                    "    }\n" +
                                    "  "
                                    , element);
        }

    }
}
