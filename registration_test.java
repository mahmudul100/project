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

public class registration_test{

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Initialize ChromeDriver
        driver.get("http://localhost/sqa/project-main/project-main/login.php");

        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement name1Field = driver.findElement(By.id("name1"));
        WebElement email1Field = driver.findElement(By.id("email1"));
        WebElement password1Field = driver.findElement(By.id("password1"));
        WebElement cpassword1Field = driver.findElement(By.id("cpassword1"));
        WebElement utypeField = driver.findElement(By.id("utype1"));

        name1Field.sendKeys("Mahmudul");
        email1Field.sendKeys("mahmudul@@gmail.com");
        password1Field.sendKeys("123");
        cpassword1Field.sendKeys("123");
        utypeField.sendKeys("user");
        
        
        
WebElement loginButton = driver.findElement(By.name("reg1"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.quit();
    }
}
