package com.flowerorder.bookings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PriceTest {

	WebDriver driver;
	
	@Test
	public void memberDiscount(){
		driver = new  FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://www.freshflowers.com.au/home.aspx");
		
		driver.findElement(By.linkText("Prices")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("MEMBER DISCOUNTS")).click();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
