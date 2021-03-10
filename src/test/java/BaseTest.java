import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    @BeforeEach
    public void start() {
        Configuration.remote = "http://192.168.0.121:4444/wd/hub";
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("enableVNC", true);
        Configuration.browserCapabilities = dc;
        Configuration.baseUrl = "https://mvnrepository.com";
    }
}
