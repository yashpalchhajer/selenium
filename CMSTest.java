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

        driver.get("web site");
        
        System.out.println("Chrome openning");

        // provide id of email element
        WebElement userElement = driver.findElement(By.id("email"));
        userElement.sendKeys("user name");

        // provide id of password element
        WebElement passElement = driver.findElement(By.id("password"));
        passElement.sendKeys("password");

        // can use id of submit button, if provided in form
        WebElement loginElement = driver.findElement(By.xpath("//button[@type='submit']"));
        loginElement.submit();

    }

}

