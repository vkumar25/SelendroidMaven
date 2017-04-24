package com.selenium.TestMethods;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.Libraries.DataForTest;
import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;
import com.selenium.TestData.DateFunction;

public class PastClass extends ObjectInstance1{
	@Test(groups="PastClassValidation")
	public void hiddenClass1() throws Exception
	{
		DataForTest test=new DataForTest();
		test.readClassData();
		System.out.println("Inside PastClass Method");
		driver.findElement(By.xpath("//div[@class='branding']/a[@href='/EasyInstructor']")).click();
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Long_Wait")));
		list=driver.findElements(By.xpath("//li[@id='class']"));
		
		System.out.println(list.size());
		initial=list.size();
		we=driver.findElement(By.xpath("//span[contains(text(),'"+cl2+"')]/../span[@class='date']"));
		s1=we.getText();
		value=DateFunction.dateit(s1);
		if(value==false)
		{
			System.out.println("inside 2nd if");
			we=driver.findElement(By.xpath("//span[contains(text(),'"+cl2+"')]/.."));
			System.out.println("Start Flickingver");
			TouchActions act=new TouchActions(driver).flick(we, -300, 0, 0);
			act.perform();
			System.out.println("Stop Flickingver");
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			//wv=driver.findElement(By.xpath("//label[contains(text(),'Complete "+str1+"?')]/../button[@class='btn btn-danger confirm']"));
			wv=driver.findElement(By.xpath("//label[contains(text(),'Complete "+cl2+"?')]/../button[@class='btn btn-danger confirm']"));
			if(wv.isDisplayed())
			{
				System.out.println("True");
				System.out.println("Click Confirm");
				driver.findElement(By.xpath("//label[contains(text(),'Complete "+cl2+"?')]/../button[@class='btn btn-danger confirm']")).click();
			}
			else
			{
				System.out.println("False");
			}
			System.out.println("After Clicking");
				
		}
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Longer_Wait")));

		list=driver.findElements(By.xpath("//li[@id='class']"));
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Longer_Wait")));

		Final=list.size();
		System.out.println(Final);
		Total=initial-Final;
		System.out.println(Total);
		if(Total==1)
		
		{
			System.out.println("inside final if");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
}
	//@Test(dependsOnMethods="selectClass")
	@Test(groups="PastClassValidation")
	public void hiddenClass2() throws Exception
	{
		
		System.out.println("mark class as complete");
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		le=driver.findElements(By.xpath(FileIO.getObjectData("PastClass", "ClassList")));
		driver.findElement(By.xpath("//span[contains(text(),'"+cl3+"')]/..")).click();
		str1=driver.findElement(By.xpath(FileIO.getObjectData("PastClass","ListClass"))).getText();
		wet=driver.findElement(By.xpath(FileIO.getObjectData("PastClass","MoreOptions")));
		if(wet.isDisplayed())
		{
			wet.click();
			driver.findElement(By.xpath(FileIO.getObjectData("PastClass","ClassComplete"))).click();
			driver.findElement(By.xpath(FileIO.getObjectData("PastClass","Confirm"))).click();
			wet=driver.findElement(By.xpath("//span[@class='gritter-title']"));
			str3="Success";
			if(wet.getText().equalsIgnoreCase(str3))
			{
				Assert.assertTrue(true);
				
				boolean b=driver.findElements(By.xpath("//span[contains(text(),'"+cl3+"')]")).size()!=0;
				 if(b==false)
				 {
					 System.out.println(b);
					 Assert.assertTrue(true);
				 }
				 else
				 {
					 Assert.fail();
				 }
				 
				/*wet=driver.findElement(By.xpath("//h1[contains(text(),'"+cl3+"')]"));
				if(wet.isDisplayed())
				{
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}*/
				
			}
			
			
		}
		else
		{
			Assert.assertTrue(true,"no more option is found");
		}


	}	


}
