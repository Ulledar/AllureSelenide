import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseTest {

    @BeforeEach
    public void start() {
        Configuration.driverManagerEnabled = false;
        Configuration.remote = "http://192.168.0.121:4444/wd/hub";
        //Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("enableVNC", true);
        Configuration.browserCapabilities = dc;
        Configuration.baseUrl = "https://mvnrepository.com";
    }

}
