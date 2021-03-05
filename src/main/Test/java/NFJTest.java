import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://nofluffjobs.com/pl");

    }

    @Test
    public void NFJMainTest() throws InterruptedException, IOException, AWTException {

        WebDriverWait wait = new WebDriverWait(driver, 30);
        Actions LogInAction = new Actions(driver);
        WebElement LogInWebElement = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]"));
        LogInAction.moveToElement(LogInWebElement).build().perform();
        LogInWebElement.click();
        WebElement LogInWebElement1 = driver.findElement(By.xpath("//*[@id=\"navbar-login\"]/span"));
        wait.until(ExpectedConditions.elementToBeClickable(LogInWebElement1));
        if(LogInWebElement1.isEnabled()){
        LogInWebElement1.click();
        WebElement FakeEmailWebElement = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-auth-loader/ngx-loadable/nfj-auth-handler/div/div/nfj-auth-login/nfj-auth-shell/nfj-social-login-box/div/div[4]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(FakeEmailWebElement));
        String FakeEmail = "jmuzykant331@gmail.com";
        String FakePassword = "Test!234";
        WebElement FakeEmailInput = driver.findElement(By.xpath("//*[@id=\"log-in-email\"]"));
        WebElement FakePasswordInput = driver.findElement(By.xpath("//*[@id=\"log-in-password\"]"));
        FakeEmailInput.click();
        FakeEmailInput.clear();
        FakeEmailInput.sendKeys(FakeEmail);
        FakePasswordInput.click();
        FakePasswordInput.clear();
        FakePasswordInput.sendKeys(FakePassword);
        driver.findElement(By.xpath("//*[@id=\"log-in-submit\"]")).click();
        WebElement TechButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[1]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(TechButton));
        TechButton.click();
        WebElement JavaButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[1]/div/button"));
        WebElement SeleniumButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[1]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[2]/nfj-filter-universal-section/section[2]/div/nfj-filter-control[2]/button"));
        WebElement TechAcceptButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[1]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[3]/div[1]/button[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(JavaButton));
        JavaButton.click();
        SeleniumButton.click();
        TechAcceptButton.click();
        WebElement LocationButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[2]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(LocationButton));
        LocationButton.click();
        WebElement KrakowButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[2]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[2]/nfj-filter-universal-section/section[1]/div/nfj-filter-control[4]/button"));
        WebElement RemoteButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[2]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[2]/nfj-filter-universal-section/section[1]/div/nfj-filter-control[1]/button"));
        WebElement LocationAcceptButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[2]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[3]/div[1]/button[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(KrakowButton));
        KrakowButton.click();
        RemoteButton.click();
        LocationAcceptButton.click();
        WebElement CategoryButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[4]/div/button"));
        wait.until(ExpectedConditions.elementToBeClickable(CategoryButton));
        CategoryButton.click();
        WebElement TestingButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[4]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[2]/nfj-filter-universal-section/section[1]/div/nfj-filter-control[5]/button"));
        WebElement CategoryAcceptButton = driver.findElement(By.xpath("/html/body/nfj-root/nfj-layout/nfj-controls-toolbar/div/div/div/div[1]/nfj-filters/div/nfj-filter-trigger[4]/popover-content/div/div[4]/nfj-filters-wrapper/div/div[3]/div[1]/button[2]"));
        wait.until(ExpectedConditions.elementToBeClickable(TestingButton));
        TestingButton.click();
        CategoryAcceptButton.click();
        } else{
            WebElement MyEmail = driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/div/nfj-navbar-candidate/header/p"));
            MyEmail.isEnabled();
        }


    }





    }



