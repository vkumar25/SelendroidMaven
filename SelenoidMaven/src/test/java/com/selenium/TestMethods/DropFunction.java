package com.selenium.TestMethods;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.Libraries.DataForTest;
import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;

public class DropFunction extends ObjectInstance1{
	
		@Test(groups="validatedropping")
		  public void dropStudent() throws Exception
		  	{
			DataForTest test=new DataForTest();
			test.readStudentData();
			System.out.println("i m dropping student");
				we=driver.findElement(By.xpath("//dd[contains(text(),'"+st3+"')]")) ;
				if(we.isDisplayed())
				{
					 we=driver.findElement(By.xpath("//dt[contains(text(),'"+st3+"')]/../.."));
					 System.out.println("Start Action For dropping");
					 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
					 TouchActions at=new TouchActions(driver).flick(we,-300,0,0);
					 at.perform();
					 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
					 driver.findElement(By.xpath("//div[@class='unenroll-confirm visible']/div/button[@id='YesDrop']")).click();
					// Thread.sleep(5000);
					 we=driver.findElement(By.xpath("//span[@class='gritter-title']"));
					 System.out.println("Find drop Success message");
					 String str="Success";
					 if(we.getText().equalsIgnoreCase(str))
					 {
						 System.out.println("Inside 1st IF");
						 Assert.assertTrue(true);
						 boolean b=driver.findElements(By.xpath("//dt[contains(text(),'"+st3+"')]")).size()!=0;
						 if(b==false)
						 {
							 System.out.println(b);
							 Assert.assertTrue(true);
						 }
						 else
						 {
							 Assert.fail();
						 }
							
					  }
					
				}
				
				driver.findElement(By.xpath("//div[@class='branding']/a[@href='/EasyInstructor']")).click();
				
				Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));

			//Thread.sleep(5000);
			//driver.quit();
			//driver.findElement(By.xpath("//div[@class='branding']/a[@href='/EasyInstructor']")).click();//healthstream icon
			
			}

}
