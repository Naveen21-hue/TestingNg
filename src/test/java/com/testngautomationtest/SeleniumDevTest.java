package com.testngautomationtest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDevTest {
	
	
	@Parameters({"url"})
	@Test(groups= {"regression","smoke"})
	public void SeleniumDevTest(String url) throws InterruptedException   {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);//https://www.selenium.dev/	
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
		
		String Versiontext=driver.findElement(By.xpath("//nav[@class='td-breadcrumbs']/ol/li[2]/following-sibling::div")).getText();
		System.out.println(Versiontext);
		
		Thread.sleep(5000);
		
		driver.close();
		
		
	
	}
	
	@Test(groups= {"regression"})
	public void testcase2() {
		System.out.println("test case 2");
	}
	
	@Test(groups= {"regression","smoke"})
	public void testcase3() {
		System.out.println("test case 3");
	}
	
	@Test(groups= {"regression"})
	public void testcase4() {
		System.out.println("test case 4");
	}



}
