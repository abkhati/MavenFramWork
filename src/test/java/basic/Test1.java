package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void facebook()
	{
		System.out.println("Hello! Zukya Dada");
		// Mavan Command Line Plugh ins
		
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		/*
		 <build>
		 <plugins>

		       <plugin>
		         <groupId>org.apache.maven.plugins</groupId>
		         <artifactId>maven-surefire-plugin</artifactId>
		         <version>3.2.2</version>
		         <configuration>
		           <suiteXmlFiles>
		             <suiteXmlFile>testng.xml</suiteXmlFile>
		           </suiteXmlFiles>
		         </configuration>
		       </plugin>
		     
		 </plugins>
		 </build>
		 */
	}
}
