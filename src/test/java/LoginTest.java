import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {

    private WebDriver driver;
    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void login() {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("aladin@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("ghiceste");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement welcomeElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertTrue(welcomeElement.isDisplayed());
        //Assert.assertEquals("Hello, Bonda Moise Dan!", welcomeElement.getText());
    }

    @Test
    public void loginWithNumbers() {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("111111@yahoo.com");
        driver.findElement(By.cssSelector("#pass")).sendKeys("111111");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement failed = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        Assert.assertTrue(failed.isDisplayed());
    }

    @Test
    public void emptyLogin() {
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        WebElement emptyEmail = driver.findElement(By.cssSelector("#advice-required-entry-email"));
        Assert.assertTrue(emptyEmail.isDisplayed());
        WebElement emptyPass = driver.findElement(By.cssSelector("#advice-required-entry-pass"));
        Assert.assertTrue(emptyPass.isDisplayed());
    }

    @After
    public void exit(){
        driver.quit();
    }
}
