package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassFour {
	@Test
	public void methodFourA(){
		System.out.println("Inside methodoneFourA of classFour");
		System.out.println("Inside methodoneA of classOne");
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");
		driver.quit();
	}


}
