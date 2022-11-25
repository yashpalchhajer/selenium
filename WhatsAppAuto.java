import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class WhatsAppAuto {

    public static void main(String[] args) throws IOException, InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        String baseUrl = "https://web.whatsapp.com/";

        WebDriver driver= new ChromeDriver();
        
        driver.get(baseUrl);

        System.out.println("Browser opening");


    }

}
