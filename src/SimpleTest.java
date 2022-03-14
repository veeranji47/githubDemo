import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SimpleTest {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Veera\\eclipse\\java-2021-12\\eclipse\\TestingPrograms\\Drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("https:\\www.facebook.com");
			String text = driver.getTitle();
			System.out.println(text);
			
		}
}
//*[@id="u_0_d_M3"]