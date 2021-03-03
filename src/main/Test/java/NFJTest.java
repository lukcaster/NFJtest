import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
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
        TimeUnit.SECONDS.sleep(1);
    }

    @Test
    public void NFJMainTest() throws InterruptedException, IOException, AWTException {
        //Cookies
        Actions LogInAction = new Actions(driver);
        WebElement LogInWebElement = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]"));
        LogInAction.moveToElement(LogInWebElement).build().perform();
        LogInWebElement.click();
        TimeUnit.SECONDS.sleep(2);
        WebElement LogInWebElement1 = driver.findElement(By.xpath("//*[@id=\"navbar-login\"]/span"));
        if(LogInWebElement1.isEnabled());
        LogInWebElement1.click();
        TimeUnit.SECONDS.sleep(2);
        WebElement FakeEmailWebElement = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-auth-loader/ngx-loadable/nfj-auth-handler/div/div/nfj-auth-login/nfj-auth-shell/nfj-social-login-box/div/div[4]/button"));
        FakeEmailWebElement.click();
        TimeUnit.SECONDS.sleep(2);
        String FakeEmail = "email123@gmail.com";
        FakeEmailWebElement.sendKeys(FakeEmail);
        WebElement FakeEmailWebElement1 = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[3]"));
        FakeEmailWebElement1.sendKeys(FakeEmail);


        }





    }



