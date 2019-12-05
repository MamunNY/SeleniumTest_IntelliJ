//AbdullahMamun
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver d = new ChromeDriver();

            String Url = "https://www.facebook.com/";
            //System.out.println(driver.getTitle());
            String expectedTitle = "Facebook - Log In or Sign Up";
            String actualTitle = "";

            // get the URL by launching Chrome
            d.get(Url);

            // get actual title
            actualTitle = d.getTitle();

            //compare actual with the expected
            if (actualTitle.contentEquals(expectedTitle)){
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }

            //d.close();
        }

    }