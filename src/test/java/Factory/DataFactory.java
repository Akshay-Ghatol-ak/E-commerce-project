package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DataFactory {
    static WebDriver driver = null;

    public static void initializeBrowser(String BrowserName) {


        if (BrowserName.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay\\Documents\\amol\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (BrowserName.equals("Edge")) {
            // WebDriverManager.edgedriver().setup();
            // System.setProperty("webdriver.edge.driver","C:\\Users\\akshay\\Documents\\amol\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (BrowserName.equals("Firefox")) {
            driver = new FirefoxDriver();
        } else if (BrowserName.equals("Safari")) {
            driver = new SafariDriver();


        }

    }

    public static WebDriver getDriver() {
        return driver;
    }
}
