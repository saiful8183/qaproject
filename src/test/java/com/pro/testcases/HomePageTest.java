package com.pro.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pro.pages.Base;
import com.pro.pages.HomePage;
import com.pro.utilities.BrowserFactory;

public class HomePageTest  {

	 WebDriver driver;

	 @BeforeTest
		public void setup() {

			driver = BrowserFactory.launchApplication(driver, "edge",
					"https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

		}

		@AfterTest
		public void teardown() {

			BrowserFactory.teardown(driver);


		}

	

	@Test
	public void bankManagerlogin() throws InterruptedException {

		// Bank manager login
		driver.findElement(By.xpath("//button[@ng-click='manager()']")).click();
		// click on add customer button

		driver.findElement(By.xpath("//button[@ng-class='btnClass1']")).click();

		// adding customer details // Add first name
		driver.findElement(By.xpath("//input[@ng-model='fName']")).sendKeys("saiful"); // Add last name
		driver.findElement(By.xpath("//input[@ng-model='lName']")).sendKeys("Fleming"); // Add post code
		driver.findElement(By.xpath("//input[@ng-model='postCd']")).sendKeys("14214");

		// clicking on add customer button
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(10);

	}
	}