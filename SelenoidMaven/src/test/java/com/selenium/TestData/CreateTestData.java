/*package com.selenium.TestData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.selenium.Libraries.ObjectInstance1;

public class CreateTestData extends ObjectInstance1{
	public  static WebDriver Firedriver=new FirefoxDriver();
	
	
//@Test(groups="createdata")
	public void createData1() throws InterruptedException
	{
		System.out.println("create class........");
		int i=0;
		Firedriver.get("http://www-sf2.team.healthstream.com/hlc/login/dir.aspx?hstm");
		Firedriver.manage().window().maximize();
		Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firedriver.findElement(By.xpath("//input[@id='ctl00_content_ctrlLogin_txtUserId']")).sendKeys("mwilson");
		Firedriver.findElement(By.xpath("//input[@id='ctl00_content_ctrlLogin_txtPassword']")).sendKeys("mwilson");
		Firedriver.findElement(By.xpath("//input[@id='ctl00_content_ctrlLogin_btnLogin']")).click();
		Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firedriver.findElement(By.xpath("//a[contains(text(),'Organizations')]")).click();
		Firedriver.findElement(By.xpath("//input[@id='txtOrgName']")).sendKeys("Acme");
		Firedriver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Firedriver.findElement(By.xpath("//a[contains(text(),'ACME HealthCare')]")).click();
		Firedriver.findElement(By.xpath("//span[contains(text(),'General')]")).click();
		Firedriver.findElement(By.xpath("//span[contains(text(),'Education')]")).click();
		Firedriver.findElement(By.xpath("//a[@id='btnAddClass']")).click();
		Firedriver.findElement(By.xpath("//input[@id='txtSearchString']")).sendKeys("c3");
		Firedriver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Firedriver.findElement(By.xpath("//a[@id='rC_ctl00_lc']/span[contains(text(),'c3')]")).click();
		while(i<3)
		{
			Firedriver.findElement(By.xpath("//a[@id='featureTitle_lnkAddClass']")).click();
			Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			Firedriver.findElement(By.xpath("//input[@id='txtName']")).clear();
			String str="VKCLS"+i;
			System.out.println(str);
			Firedriver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(str);
			Firedriver.findElement(By.xpath("//input[@id='txtMaxSize']")).clear();
			Firedriver.findElement(By.xpath("//input[@id='txtMaxSize']")).sendKeys("3");
			Firedriver.findElement(By.xpath("//input[@id='chkWaitList']")).click();
			Firedriver.findElement(By.xpath("//input[@id='txtStartDateFormInsert']")).sendKeys("06/16/2014");
			Firedriver.findElement(By.xpath("//input[@id='radStartTimeFormInsert_Input']")).click();
			Actions act=new Actions(Firedriver);
			Thread.sleep(2000);
			WebElement wd=Firedriver.findElement(By.xpath("//div[@id='radStartTimeFormInsert_DropDown']/div/ul/li[contains(text(),'6:00 AM')]"));
			act.moveToElement(wd).click().build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			Firedriver.findElement(By.xpath("//input[@id='btnAddSession']")).click();
			Firedriver.findElement(By.xpath("//input[@id='btnSave']")).click();
			Firedriver.findElement(By.xpath("//a[@id='featureTitle_lnkBack']")).click();
			unilist.add(str);
			++i;
		}
		Firedriver.findElement(By.xpath("//a[@id='featureTitle_lnkAddClass']")).click();
		Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firedriver.findElement(By.xpath("//input[@id='txtName']")).clear();
		String str="VKCLS"+i;
		Firedriver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(str);
		Firedriver.findElement(By.xpath("//input[@id='txtMaxSize']")).clear();
		Firedriver.findElement(By.xpath("//input[@id='txtMaxSize']")).sendKeys("3");
		Firedriver.findElement(By.xpath("//input[@id='chkWaitList']")).click();
		Firedriver.findElement(By.xpath("//input[@id='txtStartDateFormInsert']")).sendKeys("07/01/2014");
		Firedriver.findElement(By.xpath("//input[@id='radStartTimeFormInsert_Input']")).click();
		Actions act=new Actions(Firedriver);
		Thread.sleep(2000);
		WebElement wd=Firedriver.findElement(By.xpath("//div[@id='radStartTimeFormInsert_DropDown']/div/ul/li[contains(text(),'6:00 AM')]"));
		act.moveToElement(wd).click().build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		Firedriver.findElement(By.xpath("//input[@id='btnAddSession']")).click();
		Firedriver.findElement(By.xpath("//input[@id='btnSave']")).click();
		unilist.add(str);
		System.out.println(unilist.size());
		Firedriver.quit();
		
	}
	@Test(groups="createdata")
	//@Test(dependsOnMethods="createData1")
	public void createData2()
	{
		Firedriver.get("http://www-sf2.team.healthstream.com/hlc/login/dir.aspx?hstm");
		Firedriver.manage().window().maximize();
		Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firedriver.findElement(By.xpath("//input[@id='ctl00_content_ctrlLogin_txtUserId']")).sendKeys("mwilson");
		Firedriver.findElement(By.xpath("//input[@id='ctl00_content_ctrlLogin_txtPassword']")).sendKeys("mwilson");
		Firedriver.findElement(By.xpath("//input[@id='ctl00_content_ctrlLogin_btnLogin']")).click();
		Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firedriver.findElement(By.xpath("//a[contains(text(),'Organizations')]")).click();
		Firedriver.findElement(By.xpath("//input[@id='txtOrgName']")).sendKeys("Acme");
		Firedriver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Firedriver.findElement(By.xpath("//a[contains(text(),'ACME HealthCare')]")).click();
		Firedriver.findElement(By.xpath("//span[contains(text(),'General')]")).click();
		
		System.out.println("i m creating student...");
		//String str1=null;
		 for(int i=0;i<3;i++)
	        {
	                int j=i+1;
	                //int k=i+1;
	        
	  		Firedriver.findElement(By.xpath("//span[contains(text(),'People')]")).click();
	  		Firedriver.findElement(By.xpath("//li[@id='addS']/a[contains(text(),'Add a Student')]")).click();
	  		
			//str1.add("W"+(j));
	  		Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtLastName']")).sendKeys("pkz"+j);

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtFirstName']")).sendKeys("pkz"+j);

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtMiddleName']")).sendKeys("pkz"+j);

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtUsername']")).sendKeys("pkz"+j);

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtPassword']")).sendKeys("pkz"+j);

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtConfirmPassword']")).sendKeys("pkz"+j);

	        WebElement we=Firedriver.findElement(By.xpath("//select[@id='uc_ste_c550769c-2a8d-43da-86ad-7bdd1b5db1a2']"));

	        Select sel=new Select(we);

	        sel.selectByVisibleText("VALUE 1");

	        we=Firedriver.findElement(By.xpath("//select[@id='uc_ste_ddlDepartment']"));

	        Select sel2=new Select(we);

	        sel2.selectByVisibleText("00230-Pharmacy");

	        Firedriver.findElement(By.xpath("//input[@id='uc_btnSave']")).click();

	        System.out.println(i);
	        

	        }
		// Firedriver.quit();
	//}
	
}*/