package com.cyient.makemytrip;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BookingTest {

	public static void main(String[] args) throws MalformedURLException ,InterruptedException 
	{
			DesiredCapabilities cap= new DesiredCapabilities();
			
			cap.setCapability("deviceName", "redmi");
			cap.setCapability("platformName", "Android");
	
			cap.setCapability("app", "D:\\cyient\\automation tranning\\components\\com.makemytrip_2021-06-08.apk");
			
			
			AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(new URL("http://localhost:4723/wd/hub"), cap);
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			String visibleText = "Flights";
	        driver.findElementByAndroidUIAutomator
	        ("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))").click();
	        
	        
	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"Airport Cabs\").index(3)").click();
	        

	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"OUTSTATION\").index(0)").click();
	       
	        
	
	        driver.findElementByAndroidUIAutomator("UiSelector().text(\"SEARCH\").index(1)").click();
	      
	}

}
