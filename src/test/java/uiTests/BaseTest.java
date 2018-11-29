package uiTests;

import com.infoshare.emilczanowska.utils.driver.WebDriverCreators;
import com.infoshare.emilczanowska.utils.driver.WebDriverProvider;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;
    private static final String petClinicUrl = "http://localhost:8080/";

    @Before
    public void setUp() {

        driver = new WebDriverProvider(WebDriverCreators.CHROME).getDriver();
        driver.get(petClinicUrl);
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowser() {

        driver.close();
    }
}
