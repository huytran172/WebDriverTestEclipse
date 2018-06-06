package demo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DemoTest {
	private WebDriver driver;
	
	@Test
	public void test_title() {
        driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
	}
	
	@BeforeTest
	public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/huytran172/Downloads/chromedriver");	
		driver = new ChromeDriver();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
