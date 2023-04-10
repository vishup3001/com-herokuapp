import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        // launch the chrome browser
        WebDriver driver= new ChromeDriver();
        //open url into browser
        driver.get(baseUrl);
        //print the title of page
        String title = driver.getTitle();
        System.out.println(title);
        //print the current url
        System.out.println("Current Url :"+driver.getCurrentUrl());
        //print the page source
        System.out.println("Page source :"+driver.getPageSource());
        //enter email to email field
        driver.findElement(By.id("username")).sendKeys("vish123@gmail.com");
        //enter password to password field
        driver.findElement(By.id("password")).sendKeys("3456789");
        //close the browser
        driver.close();
    }
}
