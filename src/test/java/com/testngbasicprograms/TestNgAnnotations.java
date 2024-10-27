package com.testngbasicprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
  
  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite()");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest()");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass()");
  }

  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod()");
  }
  
  @Test(priority=2)
  public void annotation() {
	  System.out.println("Test case-1");
  }
  
  @Test(priority=1)
  public void annotation2() {
	  System.out.println("Test case_2");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod()");
  }

  
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass()");
  }


  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest()");
  }

 
  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite()");
  }

}
