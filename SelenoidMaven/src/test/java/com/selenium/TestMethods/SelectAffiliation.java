package com.selenium.TestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;

public class SelectAffiliation extends ObjectInstance1{
	@Test(groups="ValidateAffiliation")
	public void selectAffiliation() throws Exception
	{
		System.out.println("Inside Affiliation");
		driver.findElement(By.xpath(FileIO.getObjectData("Affiliation","AffiliationSlat"))).click();
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		we=driver.findElement(By.xpath(FileIO.getObjectData("Affiliation","ScheduleTitle")));
		str=we.getText();
		str1="Schedule";
		if(str.equals(str1))
		{
			System.out.println("Inside true");
			Assert.assertTrue(true);
			System.out.println("Affi successful");
		}
		else
		{
			System.out.println(we.getText());
			System.out.println("Fail");
			Assert.assertTrue(false);
		}
		Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
	}


}
