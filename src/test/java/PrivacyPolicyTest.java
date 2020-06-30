import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrivacyPolicyTest {

    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void privacy(){
        driver.findElement(By.cssSelector("body > div > div.page > div.footer-container > div > div:nth-child(2) > ul > li:nth-child(4) > a")).click();
        WebElement privacyPolicy = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.page-title > h1"));
        Assert.assertTrue(privacyPolicy.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }
}
