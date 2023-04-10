import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser ="Chrome";
    static String baseUrl="http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }
        //open url into browser
        driver.get(baseUrl);
        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source :" + driver.getPageSource());
        //enter email to email field
        driver.findElement(By.id("username")).sendKeys("vish4545@gmail.com");
        //enter password to password field
        driver.findElement(By.id("password")).sendKeys("44654647784");
        //close the browser
        driver.close();
    }
}
