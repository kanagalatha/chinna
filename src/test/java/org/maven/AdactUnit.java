package org.maven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactUnit {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass 
	
	
public static void AfterClass() {
	// TODO Auto-generated method stub
driver.quit();
}
	@Before
	public void beforeMethod() {
		// TODO Auto-generated method stub
long start = System.currentTimeMillis();
System.out.println(start);
	}
	@After
	public void afterMethod() {
		// TODO Auto-generated method stub
long end = System.currentTimeMillis();
System.out.println(end);
	}
	@Test
	public void login() throws InterruptedException {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("naveen53");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("C1IZAU");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		Thread.sleep(300);
		

	}
	
	
}
