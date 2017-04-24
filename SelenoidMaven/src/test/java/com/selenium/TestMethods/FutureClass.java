package com.selenium.TestMethods;

import io.selendroid.exceptions.NoSuchElementException;

import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.selenium.Libraries.DataForTest;
import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;
import com.selenium.TestData.DateFunction;

public class FutureClass extends ObjectInstance1 {
	
	@Test(groups="futureClassValidation")
	public void FutureClass1() throws Exception
	{
		DataForTest test=new DataForTest();
		test.readClassData();
		//String str1=CreateData.createClass2(3);
		System.out.println("Hide Future Class");
		//str=unilist.get(3);
		//List<WebElement> list=driver.findElements(By.xpath(FileIO.getObjectData("FutureClass","ClassByDate")));
		//WebElement we=list.get(list.size()-1);
		//String s=we.getText();
		String s=driver.findElement(By.xpath("//span[contains(text(),'"+cl4+"')]/../span[@class='date']")).getText();
		value=DateFunction.dateit(s);
		if(value==true)
		{
			web=driver.findElement(By.xpath("//span[contains(text(),'"+cl4+"')]/../../../div[@class='slider']"));
			if(web.getAttribute("data-can-grade").equals("False"))
			{
				System.out.println("having value false");
				Assert.assertTrue(true);
				driver.findElement(By.xpath("//span[contains(text(),'"+cl4+"')]")).click();
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
	}
	
	@Test(groups="futureClassValidation")

	public void futureClass2() throws Exception
	{
		System.out.println("FC");
		//List<WebElement> list=driver.findElements(By.xpath(FileIO.getObjectData("FutureClass","ClassByDate")));
		//WebElement we=list.get(list.size()-1);
		
		//String s=we.getText();
		//boolean value=DateFunction.dateit(s);
		isPresent=driver.findElements(By.xpath(FileIO.getObjectData("FutureClass","MoreOption"))).size()!=0;
			if(isPresent==false)
			{
				System.out.println("True");
				Assert.assertTrue(true);
				System.out.println("True1");
				
			}
			else
			{
				Assert.assertTrue(true);
			}
		
		System.out.println("Before Clicking");
		driver.findElement(By.xpath(FileIO.getObjectData("FutureClass","HomeBrand"))).click();
		System.out.println("After Clicking");
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			}
			
			
		
		}

