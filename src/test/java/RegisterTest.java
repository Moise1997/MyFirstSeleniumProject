import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void register(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("Bonda");
        driver.findElement(By.cssSelector("#middlename")).sendKeys("Moise");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("Dan");
        driver.findElement(By.cssSelector("#email_address")).sendKeys("aladin@yahoo.com");
        driver.findElement(By.cssSelector("#password")).sendKeys("ghiceste");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("ghiceste");
        driver.findElement(By.cssSelector("#form-validate > div.fieldset > ul > li.control > label")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
        driver.quit();
    }
}
