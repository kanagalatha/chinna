package org.maven;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationRegister {
	public static void main(String[] args) throws IOException {
		BaseClass b=new BaseClass();
		b.getDriver();
		b.loadUrl("http://demo.automationtesting.in/Register.html");
		b.maximize();
		WebElement first = b.findElementByXpath("//input[@placeholder='First Name']");
		String name = b.getData("sheet1", 1, 0);
		b.sendKeys(first, name);
		WebElement last = b.findElementByXpath("//input[@placeholder='Last Name']");
		String name1 = b.getData("sheet1", 1, 1); 
		b.sendKeys(last, name1);
		WebElement address = b.findElementByXpath("//textarea[@ng-model='Adress']");
		String type = b.getData("sheet1", 1, 2);
		b.sendKeys(address, type);
		WebElement mail = b.findElementByXpath("//input[@type='email']");
		String e = b.getData("sheet1", 1, 3);
		b.sendKeys(mail, e);
		WebElement phone = b.findElementByXpath("//input[@type='tel']");
		String number = b.getData("sheet1", 1,4);
		b.sendKeys(phone, number);
		WebElement genderMale = b.findElementByXpath("//input[@value='Male']");
		genderMale.click();
		WebElement hobbies = b.findElementByXpath("//input[@value='Cricket']");
		hobbies.click();
	WebElement language = b.findElementById("msdd");
	String select = b.getData("sheet1", 1, 5);
	b.sendKeys(language, select);
	WebElement skills = b.findElementById("Skills");
	String need = b.getData("sheet1", 1, 6);
	b.selectByVisibleText(skills, need);
		
		
		
	
		
		

	}

}

