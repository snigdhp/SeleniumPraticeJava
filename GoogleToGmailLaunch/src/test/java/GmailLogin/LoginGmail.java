package GmailLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class LoginGmail {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        Step_1_launchApp();
        Step_2_signIn();
        Step_3_dismiss();
        Step_4_loginUsingCredentials();
        Step_5_gmailView();
        Step_6_clickOnComposeEmail();
        Step_7_clickOnSettinIcon();


    }



    private static void Step_1_launchApp() {
        driver.get("https://www.google.com/");
    }

    private static void Step_2_signIn() {
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]"))
                .click();
    }

    private static void Step_3_dismiss() {
        driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]"))
                .click();
    }

    private static void Step_4_loginUsingCredentials() {
        driver.findElement(By.id("identifierId"))
                .sendKeys("Test@yopmail.com");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]"))
                .click();
        waitTimeInSecond(2);
        driver.findElement(By.name("Passwd")).sendKeys("Hello123Test");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]"))
                .click();
        waitTimeInSecond(5);

    }

    private static void Step_5_gmailView() {
        driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"))
                .click();
    }

    private static void Step_6_clickOnComposeEmail() {
        driver.findElement(By.xpath("//div[contains(text(),'Compose')]"))
                .click();
    }
    private static void Step_7_clickOnSettinIcon() {
        driver.findElement(By.xpath("//header/div[2]/div[3]/div[1]/div[2]/div[1]/a[1]")).click();
    }

    private static void waitTimeInSecond(int waitTimeInSecond) {
        try {
            Thread.sleep(waitTimeInSecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
