import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerServiceTest {

    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void customerService (){
        driver.findElement(By.cssSelector("a[href*=\"customer-service\"]")).click();
        WebElement customerService = driver.findElement(By.cssSelector(".page-title"));
        Assert.assertTrue(customerService.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }
}
