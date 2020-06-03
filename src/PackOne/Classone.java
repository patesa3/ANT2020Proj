package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Classone {

	@Test
	public void methodoneA(){
		System.out.println("Inside methodoneA of classOne");
		System.out.println("Inside Hello");
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();

		
	}

}
