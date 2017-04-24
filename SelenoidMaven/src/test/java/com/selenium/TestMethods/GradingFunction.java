package com.selenium.TestMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.selenium.Libraries.CountFunctionClass;
import com.selenium.Libraries.FileIO;
import com.selenium.Libraries.ObjectInstance1;

public class GradingFunction extends ObjectInstance1{
	
	//@Test(dependsOnMethods="addStudent")
	@Test(groups="ValidateGrading")
	  public void gradeStudentAttended1() throws Exception
	  	{
			we=driver.findElement(By.xpath("//dd[contains(text(),'"+st1+"')]")) ;
			if(we.isDisplayed())
			{
				 we=driver.findElement(By.xpath("//dt[contains(text(),'"+st1+"')]/../.."));
				 System.out.println("Start Action For grading");
				 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
				 TouchActions at=new TouchActions(driver).flick(we,100,0,0);
				 at.perform();
				 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
				 driver.findElement(By.xpath(FileIO.getObjectData("Grading","More"))).click();
				 driver.findElement(By.xpath(FileIO.getObjectData("Grading","SubmitAttendance"))).click();
				// Thread.sleep(5000);
				 we=driver.findElement(By.xpath(FileIO.getObjectData("Grading","SuccessTitle1")));
				// System.out.println("Find No Show Success message");
				 str="Success";
				 if(we.getText().equalsIgnoreCase(str))
				 {
					 System.out.println("Inside 1st IF");
					 we=driver.findElement(By.xpath("//dt[contains(text(),'"+st1+"')]/../../div[@class='attendance-wrapper']/span[contains(text(),'Attended')]"));
				   	 str="Attended";
					 if(we.getText().equalsIgnoreCase(str))	
						{
							Assert.assertTrue(true);
						}
					
				}
			}
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
			/*driver.quit();*/
	  	}
		
	@Test(groups="ValidateGrading")
	  public void gradeStudentAttended2() throws Exception
	  	{
			WebElement we=driver.findElement(By.xpath("//dd[contains(text(),'"+st2+"')]")) ;
			if(we.isDisplayed())
			{
				 we=driver.findElement(By.xpath("//dt[contains(text(),'"+st2+"')]/../.."));
				 System.out.println("Start Action For No Show");
				 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
				 TouchActions at=new TouchActions(driver).flick(we,-100,0,0);
				 at.perform();
				 Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
				 driver.findElement(By.xpath(FileIO.getObjectData("Grading","More"))).click();
				 driver.findElement(By.xpath(FileIO.getObjectData("Grading","SubmitAttendance"))).click();
				// Thread.sleep(5000);
				 we=driver.findElement(By.xpath(FileIO.getObjectData("Grading","SuccessTitle1")));
				 System.out.println("Find No Show Success message");
				 str="Success";
				 if(we.getText().equalsIgnoreCase(str))
				 {
					 System.out.println("Inside 1st IF");
					 we=driver.findElement(By.xpath("//dt[contains(text(),'"+st2+"')]/../../div[@class='attendance-wrapper']/span[contains(text(),'No Show')]"));
				   	 str="No Show";
					 if(we.getText().equalsIgnoreCase(str))	
						{
							Assert.assertTrue(true);
						}
				  }
				
			}
				 
			else{
				System.out.println("failed.......................");
			}
			
			Thread.sleep(Long.parseLong(FileIO.getConfigData("Short_Wait")));
		/*driver.quit();*/
		
		}

	///@Test(dependsOnMethods="countGradingNoShow")
	@Test(groups="ValidateGrading")
	public void gradeStudentAttended3() throws Exception
	{
		System.out.println("Mark all as attended");
		driver.findElement(By.xpath(FileIO.getObjectData("Grading","More"))).click();
		we=driver.findElement(By.xpath(FileIO.getObjectData("Grading","MarkAllAttended")));
		System.out.println("Not Enabled");
			we.click();
			driver.findElement(By.xpath(FileIO.getObjectData("Grading","SubmitAttendance"))).click();
			//Thread.sleep(50000);
		we1=driver.findElement(By.xpath(FileIO.getObjectData("Grading","SuccessTitle1")));
		list=driver.findElements(By.xpath(FileIO.getObjectData("Grading","AttendedStatus")));
		size=list.size()-CountFunctionClass.wait_list();
		str1="Success";
		 if(we1.getText().equalsIgnoreCase(str1))
		 {
			 Assert.assertTrue(true);
			 /*System.out.println(CountFunctionClass);
			 System.out.println(countGradingAttended());
			 System.out.println(size);
			 System.out.println(wait_list());*/
			 if(CountFunctionClass.countGradingNoShow()==0 && CountFunctionClass.countGradingAttended()==size)
			 {
				 Assert.assertTrue(true);
			 }

		 }
	}	 
	/*@Test(groups="validateGrading")
	public void gradeStudentAttend4() throws InterruptedException
	{
		String str1=driver.findElement(By.xpath("//h1")).getText();
		List<WebElement>lst=driver.findElements(By.xpath("//dl[@class='student jsStudent']"));
		if(lst.size()>=1)
			{
				WebElement wet=driver.findElement(By.xpath("//a[@id='more-options']"));
				if(wet.isDisplayed())
				{
					wet.click();
					driver.findElement(By.xpath("//label[@for='classComplete']")).click();
					driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
					Thread.sleep(50000);
					wet=driver.findElement(By.xpath("//span[@class='gritter-title']"));
					String str="Success";
					if(wet.getText().equalsIgnoreCase(str))
					{
						Assert.assertTrue(true);
						wet=driver.findElement(By.xpath("//span[contains(text(),'str1')]"));
						if(!wet.isDisplayed())
						{
							Assert.assertTrue(true);
						}
						
					}
					
					
				}
				
				
				
			}

	}

*/
	/*@Test(groups="ValidateGrading")
	public void gradeStudentAttend4() throws Exception
	{
		if(driver.findElement(By.xpath("//a[@id='more-options']")).isDisplayed())
		{
			driver.findElement(By.xpath("//a[@id='more-options']")).click();
			driver.findElement(By.xpath("//label[@for='classComplete']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
		}
		driver.findElement(By.xpath("//div[@class='branding']/a[@href='/EasyInstructor']")).click();
		List<WebElement> we=driver.findElements(By.xpath("//div[@class='details']"));
		if(SelectClass.selectClass()-we.size()==1)
		{
			Assert.assertTrue(true);
		}
	}
	
	*/
	}

