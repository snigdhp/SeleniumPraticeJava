package GmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginwithSignInButton {

    @Test
    public void Signin() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        //click on Gmail link
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/a"))
                .click();

        //Click on Google Accoounts
        driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Enter Email
        driver.findElement(By.id("identifierId")).sendKeys("Abc@yopmail.com");

        //Click on Next Button
        driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Enter Password
        driver.findElement(By.name("Passwd")).sendKeys("S@44233word");

        //click on Next Button
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
        //driver.findElement(By.id("gb_71")).click();
        driver.close();




    }
}
