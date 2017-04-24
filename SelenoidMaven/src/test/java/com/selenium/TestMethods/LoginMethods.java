package com.selenium.TestMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;
//import com.selenium.Libraries.ObjectInstance1;
import com.selenium.Libraries.Selendrioddriver;

//@Test(dependsOnMethods="com.selenium.Libraries.Selendrioddriver.launchFlip")
public class LoginMethods extends ObjectInstance1{
	
	/*@Test(groups="ValidateInvalidLogin")
	public  void validateLogin1() throws Exception
	{
		 System.out.println("I am inside Validation for blank userid");
		 
		 	driver.findElement(By.xpath(FileIO.getObjectData("Login1","UserName_EditBox"))).clear();
			driver.findElement(By.xpath(FileIO.getObjectData("Login1","UserName_EditBox"))).sendKeys(FileIO.getData("Login1","UserName_EditBox"));
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			driver.findElement(By.xpath(FileIO.getObjectData("Login1","Password_EditBox"))).sendKeys(FileIO.getData("Login1","Password_EditBox"));
			driver.findElement(By.xpath(FileIO.getObjectData("Login1","Submit_Button"))).click();
			WebElement we=driver.findElement(By.xpath(FileIO.getObjectData("Login1","Submit_Button")));
			if(we.isDisplayed())
			{
				System.out.println("Inside true");
				Assert.assertTrue(true);
			}
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		}
	@Test(groups="ValidateInvalidLogin")
	 public void validateLogin2() throws Exception
		{
		 
			 System.out.println("I am inside validation of blank password");
			 driver.findElement(By.xpath(FileIO.getObjectData("Login2","UserName_EditBox"))).clear();
			 driver.findElement(By.xpath(FileIO.getObjectData("Login2","UserName_EditBox"))).sendKeys(FileIO.getData("Login2","UserName_EditBox"));
			 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			driver.findElement(By.xpath(FileIO.getObjectData("Login2","Password_EditBox"))).sendKeys(FileIO.getData("Login2","Password_EditBox"));
			driver.findElement(By.xpath(FileIO.getObjectData("Login2","Submit_Button"))).click();
			WebElement we=driver.findElement(By.xpath(FileIO.getObjectData("Login2","BlankPassword")));
				if(we.isDisplayed())
				{
					System.out.println("Inside true");
					Assert.assertTrue(true);
					System.out.println("its passs............");
				}
				Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			}
	 @Test(groups="ValidateInvalidLogin")
	 public void validateLogin3() throws Exception
		{
			 System.out.println("I am inside Validation of blank userid and password");
			 driver.findElement(By.xpath(FileIO.getObjectData("Login3","UserName_EditBox"))).clear();
			 
				driver.findElement(By.xpath(FileIO.getObjectData("Login3","UserName_EditBox"))).sendKeys(FileIO.getData("Login3","UserName_EditBox"));
				Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
				driver.findElement(By.xpath(FileIO.getObjectData("Login3","Password_EditBox"))).sendKeys(FileIO.getData("Login3","Password_EditBox"));
				driver.findElement(By.xpath(FileIO.getObjectData("Login3","Submit_Button"))).click();
				WebElement we=driver.findElement(By.xpath(FileIO.getObjectData("Login3","BlankPassword")));
				WebElement we1=driver.findElement(By.xpath(FileIO.getObjectData("Login3","BlankUserId")));
				if(we.isDisplayed()&& we1.isDisplayed())
				{
					System.out.println("Inside true");
					Assert.assertTrue(true);
					System.out.println("its passs............");
				}
				Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			}
	 @Test(groups="ValidateInvalidLogin")
	 public void validateLogin4() throws Exception
		{
			 System.out.println("I am inside Validation of incorrect user id");
			 driver.findElement(By.xpath(FileIO.getObjectData("Login4","UserName_EditBox"))).clear();
			 
				driver.findElement(By.xpath(FileIO.getObjectData("Login4","UserName_EditBox"))).sendKeys(FileIO.getData("Login4","UserName_EditBox"));
				Thread.sleep(5000);
				driver.findElement(By.xpath(FileIO.getObjectData("Login4","Password_EditBox"))).sendKeys(FileIO.getData("Login4","Password_EditBox"));
				driver.findElement(By.xpath(FileIO.getObjectData("Login4","Submit_Button"))).click();
				WebElement we=driver.findElement(By.xpath(FileIO.getObjectData("Login4","IncorrectUserID")));
				if(we.isDisplayed())
				{
					System.out.println("Inside true");
					Assert.assertTrue(true);
					System.out.println(we.toString());
				}
				Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			}
*/
	@Test(groups="ValidateLogin")
public void validate_first_time_successfullLogin() throws Exception
{
		 System.out.println("I am inside Validation of correct user id");
		 driver.findElement(By.xpath(FileIO.getObjectData("Login5","UserName_EditBox"))).clear();
		 
			driver.findElement(By.xpath(FileIO.getObjectData("Login5","UserName_EditBox"))).sendKeys(/*FileIO.getData("Login5","UserName_EditBox")*/"demo1");
			//Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			driver.findElement(By.xpath(FileIO.getObjectData("Login5","Password_EditBox"))).sendKeys(/*FileIO.getData("Login5","Password_EditBox")*/"demo1");
			driver.findElement(By.xpath(FileIO.getObjectData("Login5","Submit_Button"))).click();
		
			//driver.findElement(By.xpath("//label[@for='RememberMe']")).click();
			//driver.findElement(By.xpath("//a[@id='ctl00_content_ctrlMobileLogin_btnMobileLogin']")).click();
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			WebElement we=driver.findElement(By.xpath("//h2[@class='top-header-style top-header-layout']"));
			String str=we.getText();
			String str1="Select Affiliation";
			//System.out.println(we.getTagName());
			//System.out.println(we.toString());
			if(str.equals(str1))
			{
				System.out.println("Inside true");
				Assert.assertTrue(true);
				System.out.println(we.toString());
			}
			else
			{
				System.out.println(we.getText());
				System.out.println("Fail");
				Assert.assertTrue(false);
			}
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			//driver.quit();
}


}
