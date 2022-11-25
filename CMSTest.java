import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class CMSTest
{

    public static void main(String[] args) throws IOException, InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        WebDriver driver = new ChromeDriver();

        String baseUrl = "";

        driver.get( baseUrl + "login");
        
        System.out.println("Chrome openning");

        // provide id of email element
        WebElement userElement = driver.findElement(By.id("email"));
        userElement.sendKeys("");

        // provide id of password element
        WebElement passElement = driver.findElement(By.id("password"));
        passElement.sendKeys("");

        // can use id of submit button, if provided in form
        WebElement loginElement = driver.findElement(By.xpath("//button[@type='submit']"));
        loginElement.submit();

        String expectedURL = baseUrl + ""; // enter url, on which user will be redirected after login, eg - baseurl/dashboard
        String currentURL = driver.getCurrentUrl();

        if(expectedURL.equalsIgnoreCase(currentURL)) {
            System.out.println("Test passed"); 
        } else {
            System.out.println("Test failed");
            System.exit(1);
        }
        // put desired url to open that page in web portal
        driver.get( baseUrl + "");

        // enter desired anchor tag href, which you want to open
        WebElement createMedicine = driver.findElement(By.xpath("//a[@href='']"));
        createMedicine.click();


    }

}

