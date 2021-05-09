package tests.base;

import com.epam.reportportal.junit5.ReportPortalExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.VncRecordingContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.io.File;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

@ExtendWith({ReportPortalExtension.class})
@Testcontainers
public class BaseTest {

    @Container
    public final static BrowserWebDriverContainer<?> container = new BrowserWebDriverContainer<>()
            .withCapabilities(new ChromeOptions())
            .withRecordingMode(RECORD_ALL, new File("./src/test/resources")
                    ,VncRecordingContainer.VncRecordingFormat.MP4);;

    public RemoteWebDriver getDriver(){
        RemoteWebDriver driver = null;
        while(true){
            if(container.isRunning()){
                driver = container.getWebDriver();
                break;
            }
        }
        return driver;
    }

}
