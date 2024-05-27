package task_15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question_5 {

    static WebDriver driver;

//    Step 1:
//           * Download and Install the JDK latest version from website
//           * Download and Install the Integrated Development Environment(IDE) like Eclipse or IntelliJ

//    Step 2:
//           * Create a new Maven Project

//    Step 3:
//           * Add the Latest Selenium Dependency from Maven repository website in pom.xml file

//    Step 4:
//           * Write a Script to Run the WebDriver
       private static void sampleScript(){
          driver = new ChromeDriver();
          driver.get("https://www.google.com/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Selenium");
          driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
          driver.close();
      }
//    Step 5:
//           * Run the Script by Right clicking the Script (or) Click the Run Symbol

    public static void main(String[] args) {
        sampleScript();
    }
}
