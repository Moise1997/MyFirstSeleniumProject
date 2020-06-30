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
        driver.findElement(By.cssSelector("body > div > div.page > div.footer-container > div > div:nth-child(2) > ul > li:nth-child(3) > a")).click();
        WebElement customerService = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.std > div > h1"));
        Assert.assertTrue(customerService.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }
}
