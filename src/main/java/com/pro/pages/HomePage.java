package com.pro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	 @FindBy(xpath = "//button[@ng-click='manager()']")
		//@FindBy(xpath = "//button[@ng-click='abc()']")
		public WebElement managerLOginBtn;

		@FindBy(xpath = "//button[@ng-class='btnClass1']")

		public WebElement AddCustomerBtn;

		@FindBy(xpath = "//input[@ng-model='fName']")

		public WebElement firstName;

		@FindBy(xpath = "//input[@ng-model='lName']")

		public WebElement lastName;

		@FindBy(xpath = "//input[@ng-model='postCd']")

		public WebElement postCode;

		@FindBy(xpath = "//button[@type='submit']")

		public WebElement AddCustomer;


			
		
	
	
	
	
	
	public void bankManagerLogin() {
		
		managerLOginBtn.click();
		
		
	}
	
	
	public void addNewCustomer(String firstname,String lastname,String zipcode) {
		
		
		AddCustomerBtn.click();
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		postCode.sendKeys(zipcode);
		AddCustomer.click();
		
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	WebDriver driver;
	
	 public HomePage(WebDriver driver) {
		 
		 this.driver=driver;
		 
		 
	 }
	 @FindBy(xpath = "//button[@ng-click='manager()']")
		//@FindBy(xpath = "//button[@ng-click='abc()']")
		public WebElement managerLOginBtn;

		@FindBy(xpath = "//button[@ng-class='btnClass1']")

		public WebElement AddCustomerBtn;

		@FindBy(xpath = "//input[@ng-model='fName']")

		public WebElement firstName;

		@FindBy(xpath = "//input[@ng-model='lName']")

		public WebElement lastName;

		@FindBy(xpath = "//input[@ng-model='postCd']")

		public WebElement postCode;

		@FindBy(xpath = "//button[@type='submit']")

		public WebElement AddCustomer;
	




public void bankManagerLogin() {
	
	 managerLOginBtn.click();
	
	
}

public void addNewCustomer(String firstname,String lastname,String zipcode) {
	
	AddCustomerBtn.click();
	firstName.sendKeys(firstname);
	lastName.sendKeys(lastname);
	postCode.sendKeys(zipcode);
	AddCustomer.click();
	
	*/
	



















