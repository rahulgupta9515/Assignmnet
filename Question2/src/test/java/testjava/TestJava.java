package testjava;

import mainjava.MainJava;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;



public class TestJava {
	WebDriver driver;
	MainJava mainjava;
	

	@BeforeClass
	public void Launch_Browser() {
		
		driver = new ChromeDriver();
		driver.get("http://10.0.31.161:9292/");
		mainjava = new MainJava(driver);
	}
	
	@Test
	public void Tes5() {
	mainjava.Tes5_login1();
	mainjava.Tes5_login2();
	
	}
}
