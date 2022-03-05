package org.maven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

public static void main(String[] args) throws InterruptedException, IOException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement txtUser = driver.findElement(By.id("email"));
	txtUser.sendKeys("klatha1987@gmail.com");
	WebElement password = driver.findElement(By.name("pass"));
	password.sendKeys("latha8212");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	Thread.sleep(3000);
	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File source = screenshot.getScreenshotAs(OutputType.FILE);
	File dest=new File("D://fb.png");
	FileHandler.copy(source, dest); 
	
	}
}
