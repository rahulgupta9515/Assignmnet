package mainjava;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert; 
import io.restassured.RestAssured;

public class MainJava {
	WebDriver driver;
	WebElement element;
	
	public MainJava(WebDriver driver) {
		this.driver = driver;
	}
		
	public void click_login_auth1() {
		driver.findElement(By.linkText("Form Authentication")).click();
	}
	public void check_login_auth1() {
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")), "Login Page");
	}
	
	public void check_cred_auth1_msg() {
		driver.findElement(By.className("radiun")).click();
		Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
	}
	
	public void check_secure_area(String name, String pass) {
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.linkText("Form Authentication")).click();
		Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
		
	}
	
	public void check_msg_after_logout() {
		driver.findElement(By.linkText("signout")).click();
		Assert.assertTrue(driver.findElement(By.className("flash success")).isDisplayed());
	}
	
	public void Tes5_login1() {
		click_login_auth1();
		check_login_auth1();
		check_cred_auth1_msg();
	}
	
	public void Tes5_login2() {
		click_login_auth1();
		check_login_auth1();
		check_secure_area(tomsmith, SuperSecretPassword!);
		check_msg_after_logout();
		
		check_cred_auth1_msg();
	}
}
