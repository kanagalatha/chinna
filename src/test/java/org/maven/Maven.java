package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class Maven {
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		//BaseClass b=new BaseClass();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select select = new Select(skills);
		File file = new File("C:\\Users\\V.KANAGA LATHA\\eclipse-workspace\\Maven\\Excelsheets\\selenium.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("TestData");

		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {

			String text = options.get(i).getText();
			System.out.println(text);

			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(text);
			
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	
}
