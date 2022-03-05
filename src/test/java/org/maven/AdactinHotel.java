package org.maven;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdactinHotel {
	

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\V.KANAGA LATHA\\eclipse-workspace\\Feb19\\Driver\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		BaseClass baseclass = new BaseClass();
		baseclass.getDriver();
		baseclass.loadUrl("https://adactinhotelapp.com/");
		baseclass.maximize();
		
		
		//driver.get("https://adactinhotelapp.com/");
		//driver.manage().window().maximize();
		//WebElement txtUser = driver.findElement(By.id("username"));
		
		WebElement user=baseclass.findElementById("username");
		String name= baseclass.getData("sheet1", 1, 0);
		baseclass.sendKeys(user, name);
		
		//txtUser.sendKeys("naveen53");
		//WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement pass = baseclass.findElementById("password");
		String word = baseclass.getData("sheet1", 1, 1);
		//txtPassword.sendKeys("C1IZAU");
		baseclass.sendKeys(pass, word);
		
		//WebElement buttonLogin = driver.findElement(By.id("login"));
		WebElement btnLogin = baseclass.findElementById("login");
		//buttonLogin.click();
		baseclass.click(btnLogin);
		
		WebElement location = baseclass.findElementById("location");
		String value = baseclass.getData("sheet1", 1, 2);
				baseclass.selectByValue(location, value);
				
		WebElement hotels = baseclass.findElementById("hotels");
		String data2 = baseclass.getData("sheet1", 1, 3);
		baseclass.selectByVisibleText(hotels,data2);
		
		WebElement room = baseclass.findElementById("room_type");
		String type = baseclass.getData("sheet1", 1, 4);
		baseclass.selectByVisibleText(room, type);
		WebElement roomnumber = baseclass.findElementById("room_nos");
		String number1 = baseclass.getData("sheet1", 1, 5);
				baseclass.selectByVisibleText(roomnumber,number1);
				
		WebElement adult = baseclass.findElementById("adult_room");
		String aroom = baseclass.getData("sheet1", 1, 6);
		baseclass.selectByVisibleText(adult,aroom);
		
		WebElement childRoom = baseclass.findElementById("child_room");
		String croom = baseclass.getData("sheet1", 1, 7);
		baseclass.selectByVisibleText(childRoom, croom);
		WebElement search = baseclass.findElementById("Submit");
		baseclass.click(search);
		WebElement radioBttn = baseclass.findElementById("radiobutton_0");
		baseclass.click(radioBttn);
		WebElement con = baseclass.findElementById("continue");
		baseclass.click(con);
		WebElement first = baseclass.findElementById("first_name");
		String fname = baseclass.getData("sheet1", 1, 8);
		baseclass.sendKeys(first, fname);
		WebElement last = baseclass.findElementById("last_name");
		String lname = baseclass.getData("sheet1", 1, 9);
		baseclass.sendKeys(last, lname);
		WebElement address = baseclass.findElementById("address");
		String street = baseclass.getData("sheet1", 1, 10);
		baseclass.sendKeys(address, street);
		
		WebElement credit = baseclass.findElementById("cc_num");
		String card = baseclass.getData("sheet1", 1, 11);
		baseclass.sendKeys(credit, card);
		WebElement credittype = baseclass.findElementById("cc_type");
		String visa = baseclass.getData("sheet1", 1, 12);
		
		baseclass.selectByVisibleText(credittype, visa);
		WebElement month = baseclass.findElementById("cc_exp_month");
		String select = baseclass.getData("sheet1", 1, 13);
		baseclass.selectByVisibleText(month, select);
		WebElement year = baseclass.findElementById("cc_exp_year");
		String yname = baseclass.getData("sheet1", 1, 14);
		baseclass.sendKeys(year, yname);
		
		WebElement cvv = baseclass.findElementById("cc_cvv");
		String data = baseclass.getData("sheet1", 1, 15);
		baseclass.sendKeys(cvv, data);
		WebElement book = baseclass.findElementById("book_now");
		baseclass.click(book);
		Thread.sleep(30000);
		WebElement orderId = baseclass.findElementById("order_no");
		String attributeValue = baseclass.getAttribute(orderId, data);
		baseclass.writeData("sheet1",1, 16, attributeValue);
	     //baseclass.getText();
		

	}
	}

	


