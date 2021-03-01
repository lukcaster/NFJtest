import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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
        TimeUnit.SECONDS.sleep(3);
    }

    @Test
    public void NFJMainTest() throws InterruptedException, IOException, AWTException {
        //Cookies
        Actions LogInAction = new Actions(driver);
        WebElement LogInWebElement = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]"));
        LogInAction.moveToElement(LogInWebElement).build().perform();
        LogInWebElement.click();
        WebElement LogInWebElementClick = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/span/span"));
        LogInWebElementClick.click();
        WebElement LogInWebElement1 = driver.findElement(By.xpath("//*[@id=\"navbar-login\"]/span"));
        LogInWebElement1.isEnabled();
        LogInWebElement1.click();
        //driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div")).click();

        //Check if I am logged in
        //String MyEmail = "gruchala.lukasz1@gmail.com";
        //driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-login-wrapper/nfj-navbar-profile-dropdown/div/span")).click();
        //WebElement LogIn = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-login-wrapper/nfj-navbar-profile-dropdown/div/span/span"));
        //System.out.print(LogIn);

        }





    }



