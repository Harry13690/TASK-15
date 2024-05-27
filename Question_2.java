package task_15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_2 {

    public static WebDriver driver;

    //Function to Start the Chrome Browser with URL
    private static void startChrome(String url){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    public static void main(String[] args) {

        startChrome("https://www.google.com/");
        //Using Id Locator Trying to Insert the Data in Search Box
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium Browser Driver");
        //Using Id Locator Trying to Click the Enter Button
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    }
}
