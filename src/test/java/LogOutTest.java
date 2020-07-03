import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutTest {

    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("a[href*=\"account\"] span.label")).click();
        driver.findElement(By.cssSelector("a[href*=\"login\"]")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("aladin@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("ghiceste");
        driver.findElement(By.cssSelector("#send2")).click();
    }

    @Test
    public void logOut() throws InterruptedException {
        driver.findElement(By.cssSelector("a.skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("a[href*=\"logout\"]")).click();
        Thread.sleep(5000);
        WebElement loggedOut = driver.findElement(By.cssSelector(".welcome-msg"));
        Assert.assertTrue(loggedOut.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }

}
