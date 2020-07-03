import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsTest {

    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void contactUs(){
        driver.findElement(By.cssSelector("a[href*=\"contact\"]")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys("Bonda Moise Dan");
        driver.findElement(By.cssSelector("#email")).sendKeys("aladin@yahoo.com");
        driver.findElement(By.cssSelector("#telephone")).sendKeys("0744265729");
        driver.findElement(By.cssSelector("#comment")).sendKeys("I have a problem with a product");
        driver.findElement(By.cssSelector("button[title='Submit']")).click();
        WebElement contactUs = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertTrue(contactUs.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }
}
