package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseLaunch {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.techlistic.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
