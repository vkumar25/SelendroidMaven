package com.selenium.TestMethods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;

public class WaitListFunction extends ObjectInstance1{
	@Test(groups="ValidateWaitList")
	public void addToWaitList1() throws InterruptedException, NumberFormatException, FileNotFoundException, IOException
	{
	//Check Size of the class
		we=driver.findElement(By.xpath("//span[contains(text(),'AVAILABLE')]"));
		str1="AVAILABLE: 0";
		str2=driver.findElement(By.xpath("//span[@id='waitListCount']")).getText();
		i=Integer.parseInt(str2);
		j=i;
		if(we.getText().equals(str1)&&i>=0)
		{
			driver.findElement(By.xpath("//a[contains(text(),'Add')]")).click();
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			//driver.findElement(By.xpath("//a[@class='search-toggle'][@href='#']")).click();
			//Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='UserId']")).sendKeys(st4);
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));	
			
			driver.findElement(By.xpath("//section[@id='id-search']/div/button")).click();
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			/*
			//driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("w1");
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//section[@id='name-search']/div[@class='form-group']/button")).click();
			Thread.sleep(5000);*/
			//str=lststu.get(i)+""+", "+lststu.get(i)+" "+lststu.get(i).charAt(0);
			we=driver.findElement(By.xpath("//div[contains(text(),'"+st4+", "+st4+" "+st4.charAt(0)+"')]"));
			Thread.sleep(5000);
			TouchActions at=new TouchActions(driver).flick(we,300,0,0);
			at.perform();
			++j;
			System.out.println("after j incement" +j+" "+i);
			if(j==(i+1))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.fail();
			}
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test(groups="ValidateWaitList")
	public int addToWaitList2() throws InterruptedException, NumberFormatException, FileNotFoundException, IOException
	{
		System.out.println("I am inside add2");
		int wait=0;
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		list=driver.findElements(By.xpath("//div[@class='attendance-wrapper']/span[1]"));
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		System.out.println(list.size());
		//System.out.println(list.size());
		for(i=0;i<list.size();i++)
		{
			System.out.println("Inside For");
			ele=list.get(i);
			if(ele.getText().equalsIgnoreCase("Waitlist"))
			{
				++wait;
				System.out.println( "inside wait increase" +wait);

			}		
		}
		
		str=driver.findElement(By.xpath("//span[@id='waitListCount']")).getText();
		System.out.println(str);
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		s=Integer.parseInt(str);
		System.out.println(s);
		if(str.equals("1"))
		{
			Assert.assertTrue(true);
		}

		return s;
		
	}

}

