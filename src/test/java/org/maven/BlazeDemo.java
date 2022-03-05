package org.maven;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlazeDemo {
public static void main(String[] args) throws IOException {
	BaseClass1 base=new BaseClass1();
	base.getDriver();
	base.loadUrl("https://blazedemo.com/");
	base.maximize();
	WebElement from = base.findElementByName("fromPort");
	String city = base.getData("sheet1", 1, 0);
	base.sendKeys(from, city);
	WebElement to = base.findElementByName("toPort");
	String dest = base.getData("sheet1", 1, 1);
	base.selectByVisibleText(to, dest);
	WebElement flight = base.findElementByXpath("//input[@value='Find Flights']");
	base.click(flight);
	WebElement choose = base.findElementByXpath("//input[@class='btn btn-small']");
	base.click(choose);
	WebElement first = base.findElementById("inputName");
	String name = base.getData("sheet1", 1, 2);
	base.sendKeys(first, name);
	WebElement address = base.findElementById("address");
	String street = base.getData("sheet1", 1, 3);
	base.sendKeys(address, street);
	WebElement location = base.findElementById("city");
	String area = base.getData("sheet1", 1, 4);
	base.sendKeys(location, area);
	WebElement our = base.findElementById("state");
	String state = base.getData("sheet1", 1, 5);
	base.sendKeys(our, state);
	WebElement zip = base.findElementById("zipCode");
	String code = base.getData("sheet1", 1, 6);
	base.sendKeys(zip, code);
	WebElement card = base.findElementById("cardType");
	String type = base.getData("sheet1", 1, 7);
	base.sendKeys(card, type);
	WebElement creditCard = base.findElementById("creditCardNumber");
	String number = base.getData("sheet1", 1, 8);
	base.sendKeys(creditCard, number);
	WebElement nameOn = base.findElementById("nameOnCard");
	String onCard = base.getData("sheet1", 1, 9);
	base.sendKeys(nameOn, onCard);
	WebElement flights = base.findElementByXpath("//input[@class='btn btn-primary']");
	base.click(flights);
	WebElement table = base.findElementByXpath("//table[@class='table']");
	List<WebElement> elements = table.findElements(By.tagName("tr"));
	for(int i=0;i<elements.size();i++)
	{
		String text = elements.get(i).getText();
		System.out.println(text);
		base.writeData("sheet1", 1, 10, text);
		
	}
			}
}

