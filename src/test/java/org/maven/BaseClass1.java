package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
WebDriver driver;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	public void loadUrl(String url) {
		driver.get(url);

	}
	public void maximize() {
		driver.manage().window().maximize();
		
	}
	public void selectOptionByText(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
	}
	public void selectOptionByIndex(WebElement element,int index) {
		
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void selectOptionByValue(WebElement element,String attributevalue)
	{
		Select select=new Select(element);
		select.selectByValue(attributevalue);
	}
	public WebElement findElementByName(String attributevalue) {
		WebElement element =driver.findElement(By.name(attributevalue));
		return element;

	}
	public WebElement findElementById(String attributevalue)
	{
		WebElement element = driver.findElement(By.id(attributevalue));
		return element;

	}
	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public void sendKeys(WebElement element, String text) {
element.sendKeys(text);
	}
	public void click(WebElement element) {
element.click();
	}
	
	public String getData(String SheetName, int rowno,int cellno) throws IOException {
		String res = null;
File f = new File("C:\\Users\\V.KANAGA LATHA\\eclipse-workspace\\Maven\\Excelsheets\\blaze.xlsx");
FileInputStream stream = new FileInputStream(f);
Workbook workbook = new XSSFWorkbook(stream);
Sheet sheet = workbook.getSheet(SheetName);
Row row = sheet.getRow(rowno);
Cell cell = row.getCell(cellno);
CellType cellType = cell.getCellType();
switch(cellType) {
case STRING : 
	res = cell.getStringCellValue();
	break;
case NUMERIC :
	if(DateUtil.isCellDateFormatted(cell)) {
		java.util.Date dateCellValue = cell.getDateCellValue();
	
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-YY");
		res = dateformat.format(dateCellValue);
	}else {
		double d = cell.getNumericCellValue();
		BigDecimal num = BigDecimal.valueOf(d);
		res =num.toString();
	}
	break;
	default:
		break;
}

return res;
	}
	
//FileOutputStream out=new FileOutputStream(f);
//workbook.write(out);

	@SuppressWarnings("resource")
	public void writeData(String sheetname, int rownum, int cellnum, String value) throws IOException {
		String res = null;
		File file=new File("C:\\Users\\V.KANAGA LATHA\\eclipse-workspace\\Maven\\Excelsheets\\blaze.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(value);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);
	}	
	
	public void selectByValue(WebElement element,String string) {
	
		Select select=new Select(element);
		select.selectByValue(string);
	}
	public void selectByIndex(WebElement element,int index) {
		// TODO Auto-generated method stub
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void selectByVisibleText(WebElement element,String string) {
		// TODO Auto-generated method stub
		Select select=new Select(element);
		select.selectByVisibleText(string);
	}
	public String getAttribute(WebElement element,String string) {
		String attribute = element.getAttribute(string);
		return attribute;
	}
	
	}










