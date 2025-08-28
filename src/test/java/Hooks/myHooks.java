package Hooks;

import Factory.DataFactory;
import Utils.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class myHooks {
    WebDriver driver;

    @Before
    public void OpenBrowser() {
        Properties prop = configReader.initializeProperties();
        DataFactory.initializeBrowser(prop.getProperty("browser"));
//        driver.manage().timeouts().implicitlyWait(6, TimeUnit.MINUTES);
        driver = DataFactory.getDriver();
        // driver.manage().timeouts().implicitlyWait(6, TimeUnit.MINUTES);
        driver.navigate().to(prop.getProperty("Url"));
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().deleteAllCookies();
    }

    @After
    public void closed() {

        driver.close();
    }


}
