package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle {


    //TestNG Using Title Header Match
    @Test
    public void testgoogle() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");
        String actual_result = "Google";
        String expected_result = driver.getTitle();
        Assert.assertEquals(actual_result,expected_result);
    }
}
