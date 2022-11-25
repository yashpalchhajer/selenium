import java.io.IOException;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class TecAdminSeleniumTest {
 
        public static void main(String[] args) throws IOException, InterruptedException {
                System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
                System.setProperty("webdriver.chrome.verboseLogging", "true");

                // ChromeOptions chromeOptions = new ChromeOptions();
                // chromeOptions.setExperimentalOption("debuggerAddress", "127.0.0.1:6670");

                // chromeOptions.addArguments("--headless");
                // chromeOptions.addArguments("--no-sandbox");
 
                WebDriver driver = new ChromeDriver();
 
                // driver.navigate().to("https://google.com");
                driver.get("https://web.whatsapp.com/");
                System.out.println("Chrome openning");
                Thread.sleep(1000);
 
                if (driver.getPageSource().contains("I'm Feeling Lucky")) {
                        System.out.println("Pass");
                } else {
                        System.out.println("Fail");
                }
                // driver.quit();
        }
}