import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");

        WishListTest wish = new WishListTest();
        wish.addToWishList();

        RegisterTest register = new RegisterTest();
        register.register();

        LoginTest login = new LoginTest();
        login.login();


    }
}
