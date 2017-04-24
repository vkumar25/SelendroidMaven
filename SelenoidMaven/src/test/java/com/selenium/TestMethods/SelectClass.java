package com.selenium.TestMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.selenium.Libraries.DataForTest;
import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;

public class SelectClass extends ObjectInstance1 {
	
	@Test(groups="ValidateClassEntry")
	public int selectClass() throws Exception
	{	
		DataForTest test=new DataForTest();
		test.readClassData();
		//String str=unilist.get(0);
		//String str=CreateData.createClass1(1);
		driver.findElement(By.xpath(FileIO.getObjectData("Class","Schedule"))).click();
		System.out.println("I am inside Validation of Class");
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Long_Wait")));
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		List<WebElement> we=driver.findElements(By.xpath(FileIO.getObjectData("Class","ClassList")));
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Long_Wait")));

		System.out.println(we.size());
		if(!we.isEmpty())
		{
			System.out.println("inside if");
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			driver.findElement(By.xpath("//span[contains(text(),'"+cl1+"')]/..")).click();

		}
		WebElement we1=driver.findElement(By.xpath((FileIO.getObjectData("Class","Roster"))));
		String str1="Roster";
		if(we1.getText().equals(str1))
		{
			System.out.println("Inside true");
			Assert.assertTrue(true);
		}
		/*else
		{

			System.out.println("Fail");
			Assert.assertTrue(false);
		}
	*/	
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		//driver.quit();
		return we.size();
		}

	/*public static int selectClass() throws Exception
	{
		System.out.println("I am inside Validation of Class");
		List<WebElement> we=driver.findElements(By.xpath(FileIO.getObjectData("Class","ClassList")));
		System.out.println(we.size());
		if(!we.isEmpty())
		{
			System.out.println("inside if");
			Thread.sleep(5000);
			we.get(3).click();
		}
		WebElement we1=driver.findElement(By.xpath((FileIO.getObjectData("Class","Roster"))));
		String str="Roster";
		if(we1.getText().equals(str))
		{
			System.out.println("Inside true");
			Assert.assertTrue(true);
		}
		else
		{

			System.out.println("Fail");
			Assert.assertTrue(false);
		}
		
		Thread.sleep(5000);
		//driver.quit();
		return we.size();
		}
*/

}
