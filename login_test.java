/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package bookshop;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_test{

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // Initialize ChromeDriver
        driver.get("http://localhost/sqa/project-main/project-main/login.php");

        driver.getTitle();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement usernameField = driver.findElement(By.id("email_id"));
        WebElement passwordField = driver.findElement(By.id("password_id"));
        

        usernameField.sendKeys("mahmudul39@gmail.com");
        passwordField.sendKeys("mahmudul100");
        
        
WebElement loginButton = driver.findElement(By.name("submit1"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.quit();
    }
}