import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void register(){
        driver.findElement(By.cssSelector(".skip-link.skip-account")).click();
        driver.findElement(By.cssSelector("a[href*=\"create\"]")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Bonda");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Moise");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Dan");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("aladin@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("ghiceste");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("ghiceste");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click(); //nu stiu cum sa-l fac
        driver.findElement(By.cssSelector("button[title='Register']")).click();
    }

    @After
    public void exit(){
        driver.quit();
    }
}
