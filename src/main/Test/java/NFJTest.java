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
        //WebElement LogInWebElementClick = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/span/span"));
        //LogInWebElementClick.click();
        TimeUnit.SECONDS.sleep(2);
        WebElement LogInWebElement1 = driver.findElement(By.xpath("//*[@id=\"navbar-login\"]/span"));
        if(LogInWebElement1.isEnabled());
        LogInWebElement1.click();
        //TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div")).click();
        TimeUnit.SECONDS.sleep(2);
        WebElement FakeEmailWebElement = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-auth-loader/ngx-loadable/nfj-auth-handler/div/div/nfj-auth-login/nfj-auth-shell/nfj-social-login-box/div/div[4]/button"));
        FakeEmailWebElement.click();
        TimeUnit.SECONDS.sleep(2);
        String FakeEmail = "email123@gmail.com";
        WebElement FakeEmailWebElement1 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        FakeEmailWebElement1.sendKeys(FakeEmail);

        //WebDriverWait Wait = new WebDriverWait(WebDriverRefernce,20);
        //TimeUnit.SECONDS.sleep(2);
        //WebElement FakeEmailWebElement = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[1]/div/div[3]"));
        //FakeEmailWebElement.click();
        //FakeEmailWebElement.sendKeys(FakeEmail);

        //Check if I am logged in
        //String MyEmail = "gruchala.lukasz1@gmail.com";
        //driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-login-wrapper/nfj-navbar-profile-dropdown/div/span")).click();
        //WebElement LogIn = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-login-wrapper/nfj-navbar-profile-dropdown/div/span/span"));
        //System.out.print(LogIn);

        }





    }



