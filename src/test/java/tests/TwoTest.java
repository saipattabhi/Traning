package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.base;

public class TwoTest extends base{
	
	public   WebDriver driver;
	
	@Test
	
	public void  twotest() throws IOException
	{
		System.out.println("Annapurna akka changed my life");
		System.out.println("Sai Pattabhi Ramayya updated two test");
		System.out.println("inside two text");
		
		  driver=	intializedriver();
		  
		  driver.get("http://tutorialsninja.com/demo/");
		
		
	}
	@AfterMethod
	public void closure()
	{
		driver.close();
	}
	

}
