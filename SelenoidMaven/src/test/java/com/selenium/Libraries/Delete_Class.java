package com.selenium.Libraries;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Delete_Class {
	public static WebDriver Firedriver=new FirefoxDriver();
	static List<WebElement> lki=new ArrayList<WebElement>();
	
	public static void delete_it() throws InterruptedException
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
		
		Firedriver.findElement(By.xpath("//span[contains(text(),'Education')]")).click();
		Firedriver.findElement(By.xpath("//a[@id='btnEditClass']")).click();
		
		for(int i=0;i<=65;i++)
		{
		Firedriver.findElement(By.xpath("//input[@id='txtCourseName']")).sendKeys("c3");
		Firedriver.findElement(By.xpath("//input[@id='btnSearch']")).click();
		Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Firedriver.findElement(By.xpath("//select[@id='pageNavigationBar2_cmbPageSize']")).click();
		WebElement we=Firedriver.findElement(By.xpath("//option[@value='250']"));
		Actions act=new Actions(Firedriver);
		act.moveToElement(we).click().build().perform();
		for(int j=0;j<=65;j++)
		{
		lki.addAll(j, Firedriver.findElements(By.xpath("//b[contains(text(),'From')]/../../span/a")));
		}
			lki.get(i).click();
			Thread.sleep(5000);
			Firedriver.findElement(By.xpath("//input[@id='btnDelete']")).click();
			Firedriver.switchTo().alert().accept();
			
			}
			
		}
		
	public static void main(String[] args) throws InterruptedException {
		delete_it();

	}

}
