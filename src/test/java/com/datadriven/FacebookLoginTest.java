package com.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLoginTest {
	
	@Test(dataProvider="getdata")
	public void facebooklogin(String uname,String password) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		
	    driver.findElement(By.id("email")).sendKeys("kaithepallinav@gmail.com");
	    
	    driver.findElement(By.id("pass")).sendKeys("naveen@123");
	    
	    driver.findElement(By.name("login")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
		
	}
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data =new Object[3][2];
		
		data[0][0]="kaithepalli@gmail.com";
		data[0][1]="Naveen@123";
		
		data[1][0]="kaithepalli@gmail.com";
		data[1][1]="Naveen@123";
		
		data[2][0]="9542570889";
		data[2][1]="Naveen@343";
		return data;
		
				
				
		
	}
}

