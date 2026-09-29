package valid_login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidLoginTest extends BaseTest {

    
    public void startBrowser() {
        setUp();
    }

    @Test
    public void validLoginTest() {
        System.out.println("Valid Login Test Started");
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}
