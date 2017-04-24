package com.selenium.Libraries;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.internal.seleniumemulation.IsElementPresent;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import io.selendroid.SelendroidCapabilities;
import io.selendroid.SelendroidConfiguration;
import io.selendroid.SelendroidDriver;
import io.selendroid.SelendroidLauncher;
import io.selendroid.android.JavaSdk;

	
	public class Selendrioddriver extends ObjectInstance1{	
	  
	@Test
	public void startSelendroidServer() throws Exception 
	{
		System.out.println("i m inside selendriod");
	    if (selendroidServer != null) 
	    {
	    selendroidServer.stopSelendroid();
	    }
	    SelendroidConfiguration config = new SelendroidConfiguration();

	    SelendroidLauncher selendroidServer = new SelendroidLauncher(config);
	    selendroidServer.lauchSelendroid();
	    DesiredCapabilities caps = SelendroidCapabilities.android();
	    driver = new SelendroidDriver(caps);
	  }
	  
	  @Test(dependsOnMethods= "startSelendroidServer")
	  public void launchFlip() throws InterruptedException, NumberFormatException, FileNotFoundException, IOException
	  {
		  System.out.println("i m launching url");
		  Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		  //Thread.sleep(5000);
			driver.get("https://m-sf2.team.healthstream.com/demo");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Long_Wait")));
			//Thread.sleep(60000);
			System.out.println("I have launched URL");
	  }
	 	
		
	 	@AfterGroups
	  public void stopSelendroidServer() {
	    if (driver != null) {
	      driver.quit();
	    }
	    if (selendroidServer != null) {
	      selendroidServer.stopSelendroid();
	    }
	  }
	 
	}





