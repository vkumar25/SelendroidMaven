package com.selenium.TestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.selenium.Libraries.DataForTest;
import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;

public class AddFunction extends ObjectInstance1 {
	int i=1;
	@Test(groups="validateaddstudent")
	public void calladd() throws Exception
	{
		DataForTest test=new DataForTest();
		test.readStudentData();
		for(i=0; i<3;i++)
		{
			add1();
			add2();
		}
	}
	public void add1() throws Exception
	  { 
		System.out.println("I am inside Add Validation of Class");
		driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","AddTab"))).click();
		we1=driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","Search")));
		str="Search by Name";
		Assert.assertEquals(we1.getText(),str);
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		//driver.quit();
		}
	
	public  void add2() throws Exception
	{
		System.out.println("I am inside Add student Validation of Class");
		//String s;
		driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","UserId"))).sendKeys(lststu.get(i));
		driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","Button"))).click();
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		str="Search Results";
		WebElement we=driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","Text1")));
		if(we.getText().equalsIgnoreCase(str))
		{
			Assert.assertTrue(true, "you are not ON SEARCH PAGE");
			 str=lststu.get(i)+""+", "+lststu.get(i)+" "+lststu.get(i).charAt(0);
			 System.out.println(str);
			 we=driver.findElement(By.xpath("//div[contains(text(),'"+str+"')]"));
			
			 if(we.getText().equalsIgnoreCase(str))
			 {
				 Assert.assertTrue(true,"No such student found");
				 driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","FlickStudent")));
				 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
					System.out.println("Start the action");
				 TouchActions at=new TouchActions(driver).flick(we,300,0,0);
				 at.perform();
				 //Thread.sleep(5000);
				 we=driver.findElement(By.xpath(FileIO.getObjectData("AddStudent","SuccessTitle")));
				 str="Success";
				 if(we.getText().equalsIgnoreCase(str))
				 {
					 Assert.assertTrue(true);
					 we=driver.findElement(By.xpath(FileIO.getObjectData("AddStudent", "MoreButton")));
					 str="More";
					 if(we.getText().equalsIgnoreCase(str))
					 {
						 Assert.assertTrue(true);
					 }

				 }
				 
				
			 }
			
		}
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		//driver.quit();
		
		}


}