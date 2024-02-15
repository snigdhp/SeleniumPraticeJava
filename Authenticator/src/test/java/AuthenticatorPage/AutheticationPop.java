package AuthenticatorPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutheticationPop {
    public static void main(String[] args) {
        //WebDriverManager.firefoxdriver().setup();

        //Launch Browser Firefox
        WebDriver driver = new FirefoxDriver();

        //maximize Browser for Chrome
        //driver.manage().window().maximize();

        //Open
        driver.get("https://www.selenium.dev/");


    }
}
