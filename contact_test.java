
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact_test{

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Initialize ChromeDriver
        driver.get("http://localhost/sqa/project-main/project-main/login.php");

        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement name2Field = driver.findElement(By.id("name2"));
        WebElement email2Field = driver.findElement(By.id("email2"));
        WebElement number2Field = driver.findElement(By.id("number2"));
        WebElement msg2Field = driver.findElement(By.id("msg2"));
        

        name2Field.sendKeys("Mahmudul");
        email2Field.sendKeys("mahmudul@@gmail.com");
        number2Field.sendKeys("01843576762");
        msg2Field.sendKeys("Customer Review");
       
        
        
        
WebElement loginButton = driver.findElement(By.name("send1"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.quit();
    }
}
