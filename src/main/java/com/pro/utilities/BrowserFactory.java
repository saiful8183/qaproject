package com.pro.utilities;

import java.sql.Driver;
import java.time.Duration;

import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver launchApplication(WebDriver driver, String browser, String url) {

		switch (browser.toLowerCase()) {
		case "chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "edge":

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			break;

		default:

			System.out.println("This browser do not support");
			break;
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		return driver;

	}

	public static void teardown(WebDriver driver) {
		driver.close();

	}

	
}
