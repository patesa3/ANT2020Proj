package PackOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTwo {

	@Test
	public void methodTwoA(){
		System.out.println("Inside methodoneTwoA of classTwo");
		System.out.println("Inside methodoneA of classOne");
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.quit();
	}

	@Test
	public void methodTwoB(){
		System.out.println("Inside methodoneTwoB of classTwo");
		
	}
}
