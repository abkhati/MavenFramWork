package basic;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ReadDataJenkinsTest {

	@Test
	public void vTigertest() throws IOException {
		// TODO Auto-generated method stub

		final WebDriver  driver;
		
		FileInputStream  file = new FileInputStream("src\\test\\resources\\Frameworks.properties");
		Properties p = new  Properties();
		p.load(file);
		
//		String URL = p.getProperty("url");
//		String UN = p.getProperty("username");
//		String PW = p.getProperty("password");
//		String Bro = p.getProperty("browser");
		
		FileInputStream fil = new FileInputStream("src\\test\\resources\\FrameWork.xlsx");
		Workbook wb =  WorkbookFactory.create(fil);
		
		Sheet sh = wb.getSheet("Sheet2");
		
		Row row = sh.getRow(0);
		Cell cell = row.getCell(1);
		
		System.out.println(cell.getStringCellValue());
		
		String URL = sh.getRow(1).getCell(1).getStringCellValue();
		
		String UN = sh.getRow(2).getCell(1).getStringCellValue();
		System.out.println(UN);
		String PW = sh.getRow(3).getCell(1).getStringCellValue();
		String Bro = sh.getRow(0).getCell(1).getStringCellValue();
		
		
		if (Bro.equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (Bro.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else 
		{
			driver = new FirefoxDriver();
		}
		
		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(UN);
		driver.findElement(By.name("user_password")).sendKeys(PW);
		driver.findElement(By.id("submitButton")).click();
		
		
		
		
	}

}
