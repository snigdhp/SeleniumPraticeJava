package LaunchDriver;

import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class DriverLaunch {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.close();
    }
}
