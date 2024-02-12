package SignupBrowseStack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SignUpPageBrowseStack {
    @Test
    public void signup() {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/users/sign_up");


        //Sign up without gmail account with enter Manual Details

        //allowing cooking by click on accept button
        WebElement accept_cookies = driver.findElement(By.id("accept-cookie-notification"));
        accept_cookies.click();


        //Enter Full Name
        WebElement full_name = driver.findElement(By.id("user_full_name"));
        full_name.sendKeys("Surya Prakash");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Enter Business Email
        WebElement business_email = driver.findElement(By.id("user_email_login"));
        business_email.sendKeys("surya.prakash@chawtechsolution.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Enter Password
        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("Pass123@#$word");


        //For New Sign up click on check box to Approve "TermsOfService" & "Privacy Policy"
        WebElement check_box = driver.findElement(By.id("tnc_checkbox"));
        check_box.click();




    }
}
