import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

//@Execution(ExecutionMode.CONCURRENT)
public class BaseTest {

    @BeforeEach
    public void start() {
        Configuration.remote = "http://192.168.0.1:4444/wd/hub";
        Configuration.driverManagerEnabled = false;
        //Configuration.remote = "http://localhost:4444/wd/hub";
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("enableVNC", true);
        Configuration.browserCapabilities = dc;
        Configuration.baseUrl = "https://mvnrepository.com";
    }

}
