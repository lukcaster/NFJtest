import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class NFJtest {
    private WebDriver driver;



@Before
public void setUp() throws InterruptedException {
    setProperty("webdriver.chrome.driver",
            "src/main/resources/driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://nofluffjobs.com/pl");
}
}


