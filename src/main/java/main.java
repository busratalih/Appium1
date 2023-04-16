import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class main {


        public static void main(String[] args) throws MalformedURLException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("udid", "emulator-5554");
            desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
            desiredCapabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

            WebDriver driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
        }
    }


