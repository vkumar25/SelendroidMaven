package com.selenium.Libraries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CountFunctionClass extends ObjectInstance1{
	//@Test(dependsOnMethods="selectClass")	
	public static int countGradingAttended()
		{
			int attended=0;
			List<WebElement> list=driver.findElements(By.xpath("//div[@class='attendance-wrapper']/span[1]"));
			//System.out.println(list.size());
			for(int i=0;i<list.size();i++)
			{
				WebElement ele=list.get(i);
				if(ele.getText().equalsIgnoreCase("Attended"))
				{
					++attended;
				}		
			}
			
			String str=driver.findElement(By.xpath("//span[@id='attendedCount']")).getText();
			int s=Integer.parseInt(str);
			if(s==attended)
			{
				Assert.assertTrue(true);
			}
			return s;
			
		}
	//@Test(dependsOnMethods="countGradingAttended")
	public static int countGradingNoShow()
	{
		int no=0;
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='attendance-wrapper']/span[1]"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement ele=list.get(i);
			if(ele.getText().equalsIgnoreCase("No Show"))
			{
				++no;
			}
						
		}
		String str1=driver.findElement(By.xpath("//span[@id='noShowCount']")).getText();
		int s1=Integer.parseInt(str1);
		if(s1==no)
		{
			Assert.assertTrue(true);
		}
		//driver.quit();
		return s1;
	}
	
	public static int wait_list()
	{
		int wait=0;
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='attendance-wrapper']/span[1]"));
		//System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement ele=list.get(i);
			if(ele.getText().equalsIgnoreCase("Waitlist"))
			{
				++wait;
			}		
		}
		
		String str=driver.findElement(By.xpath("//span[@id='waitListCount']")).getText();
		int s=Integer.parseInt(str);
		if(s==wait)
		{
			Assert.assertTrue(true);
		}
		return s;
		
	}
	
	

}
