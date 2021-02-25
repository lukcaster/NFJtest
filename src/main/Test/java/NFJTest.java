import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.IOException;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import static java.lang.System.setProperty;

public class NFJTest {
    private WebDriver driver;


    @Before
    public void setUp() throws InterruptedException {
        setProperty("webdriver.chrome.driver",
                "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nofluffjobs.com/pl");
        TimeUnit.SECONDS.sleep(3);
    }

    @Test
    public void NFJMainTest() throws InterruptedException, IOException, AWTException {
        //Cookies

        driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/div/ngx-loadable/nfj-lazy-layout/nfj-fixed-banner/section/nfj-cookie-information/div/div/button")).click();

        //Check if I am logged in
        //String Email = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/span/span")).getAttribute();
        //if (driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/span/span".));
) {
        } else {
            Assert.fail();
        }
    }
}


