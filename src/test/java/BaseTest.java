//import org.junit.After;
//import org.junit.Before;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import util.TestProperties;
//
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//public class BaseTest {
//
//    Properties properties;
//    String baseUrl;
//    WebDriver driver;
//
//    @Before
//    public void beforeTest() {
//        properties = TestProperties.getInstance().getProperties();
//        baseUrl = properties.getProperty("url");
//        System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get(baseUrl);
//    }
//
//    @After
//    public void afterTest() {
//        driver.quit();
//    }
//}
