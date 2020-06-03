package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassThree {
	@Test
	public void methodThreeA(){
		System.out.println("Inside methodoneThreeA of classThree");
		System.out.println("Inside methodoneA of classOne");
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.quit();
	}

	
}
