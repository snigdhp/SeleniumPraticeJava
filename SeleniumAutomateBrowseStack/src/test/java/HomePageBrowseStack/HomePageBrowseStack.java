package HomePageBrowseStack;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
public class HomePageBrowseStack {

    @Test
    public  void  Homepage(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/guide/how-to-create-selenium-test-cases");
        driver.close();
    }

}
