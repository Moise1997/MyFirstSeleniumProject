import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishListTest {

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
    public void addToWishList(){
        driver.findElement(By.cssSelector(".nav-6 a[href*=\"vip\"]")).click();
        driver.findElement(By.cssSelector("a[href*=\"412\"]")).click();
        WebElement added = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertTrue(added.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }

}
