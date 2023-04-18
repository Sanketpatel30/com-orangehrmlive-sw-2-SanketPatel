package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {

        driver.findElement(By.linkText("Forgot your password?")).click();
        String expectedresult = "Forgot Your Password?";
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1"));
        String actualresult = element.getText();
        Assert.assertEquals("Error", expectedresult, actualresult);
    }


    @After
    public void close() {
        // closeBrowser();
    }
}
