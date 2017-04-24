package com.selenium.TestData;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.selenium.TestMethods.FutureClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.csvreader.CsvReader;


public class DateFunction {
	@Test
	public static boolean dateit(String str1) throws ParseException
	{
		//String str = "Friday, May 23 2014";
		java.util.Date  ss1=new Date(str1);	
		SimpleDateFormat formatter5=new SimpleDateFormat("yyyy-MM-dd");
		String formats1 = formatter5.format(ss1);
		System.out.println(formats1);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		if(ss1.before(date)){
    
		System.out.println("before today's date");
		return false;
		}

		/*if(ss1.after(date)){
    	//Do Something else
		System.out.println("After date");
		 */
		return true;
	}
	
}


/*public class TestCreate {

	 WebDriver Firedriver=new FirefoxDriver();
		public  void testCF_Add_New_Customer_Manually() {
			List StudentsheetData=new ArrayList();
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
	
	try{
	String Output_Filename = "C:/Users/VINIT/Desktop/All_files/StudentData.xls";
	InputStream inputData = new FileInputStream(Output_Filename);
	HSSFWorkbook workbook=new HSSFWorkbook(inputData);
	HSSFSheet sheet=workbook.getSheetAt(0);
    Iterator rows = sheet.rowIterator();
    while (rows.hasNext()) {
        HSSFRow row = (HSSFRow) rows.next();
        Iterator cells = row.cellIterator();

        List data = new ArrayList();
        while (cells.hasNext()) {
            HSSFCell cell = (HSSFCell) cells.next();
            data.add(cell);
        }

        StudentsheetData.add(data);
    }
    for (int i = 1; i < StudentsheetData.size(); i++) {
        List list = (List) StudentsheetData.get(i);
        HSSFCell cell = (HSSFCell) list.get(0);
            
            
            Firedriver.findElement(By.xpath("//span[contains(text(),'People')]")).click();
	  		Firedriver.findElement(By.xpath("//li[@id='addS']/a[contains(text(),'Add a Student')]")).click();
	  		
	  		Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtLastName']")).sendKeys(cell.getRichStringCellValue().getString());

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtFirstName']")).sendKeys(cell.getRichStringCellValue().getString());

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtMiddleName']")).sendKeys(cell.getRichStringCellValue().getString());

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtUsername']")).sendKeys(cell.getRichStringCellValue().getString());

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtPassword']")).sendKeys(cell.getRichStringCellValue().getString());

	        Firedriver.findElement(By.xpath("//input[@id='uc_ue_txtConfirmPassword']")).sendKeys(cell.getRichStringCellValue().getString());

	        WebElement we=Firedriver.findElement(By.xpath("//select[@id='uc_ste_c550769c-2a8d-43da-86ad-7bdd1b5db1a2']"));

	        Select sel=new Select(we);

	        sel.selectByVisibleText("VALUE 1");

	        we=Firedriver.findElement(By.xpath("//select[@id='uc_ste_ddlDepartment']"));

	        Select sel2=new Select(we);

	        sel2.selectByVisibleText("00230-Pharmacy");

	        Firedriver.findElement(By.xpath("//input[@id='uc_btnSave']")).click();

	        }
		}
    catch(Exception e)
    {
    	e.printStackTrace();
    	System.out.println("no xls found");
    }	
	}
		
		public  void testCF_Add_New_Class_Manually() throws InterruptedException {
			
			List ClasssheetData=new ArrayList();
			Firedriver.findElement(By.xpath("//span[contains(text(),'Education')]")).click();
			Firedriver.findElement(By.xpath("//a[@id='btnAddClass']")).click();
			Firedriver.findElement(By.xpath("//input[@id='txtSearchString']")).sendKeys("c3");
			Firedriver.findElement(By.xpath("//input[@id='btnSearch']")).click();
			Firedriver.findElement(By.xpath("//a[@id='rC_ctl00_lc']/span[contains(text(),'c3')]")).click();
				Firedriver.findElement(By.xpath("//a[@id='featureTitle_lnkAddClass']")).click();
				Firedriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				Firedriver.findElement(By.xpath("//input[@id='txtName']")).clear();
				try{
					String Output_Filename = "C:/Users/VINIT/Desktop/All_files/ClassData.xls";
		InputStream inputData = new FileInputStream(Output_Filename);
		HSSFWorkbook workbook=new HSSFWorkbook(inputData);
		HSSFSheet sheet=workbook.getSheetAt(0);
	    Iterator rows = sheet.rowIterator();
	    while (rows.hasNext()) {
	        HSSFRow row = (HSSFRow) rows.next();
	        Iterator cells = row.cellIterator();

	        List data = new ArrayList();
	        while (cells.hasNext()) {
	            HSSFCell cell = (HSSFCell) cells.next();
	            data.add(cell);
	        }

	        ClasssheetData.add(data);
	    }
				for (int i = 1; i < ClasssheetData.size(); i++) 
				{
					List<String> lst=new ArrayList<String>();

			        List list = (List) ClasssheetData.get(i);
			        for(int j=0;j<list.size();j++)
			        {
			        HSSFCell cell = (HSSFCell) list.get(j);
			       
			        if(HSSFCell.CELL_TYPE_STRING==cell.getCellType())
			        {
			        System.out.println(cell.getRichStringCellValue().getString());
			        lst.add(cell.getRichStringCellValue().toString());
			        System.out.println(j);
			        }
			        if(cell.getCellType()==Cell.CELL_TYPE_NUMERIC){
			            if (DateUtil.isCellDateFormatted(cell)) {
			                System.out.println(cell.getDateCellValue());
			                lst.add(new SimpleDateFormat("MM/dd/yyyy").format(cell.getDateCellValue()));
			            } else {
			                System.out.println(cell.getNumericCellValue());
			                lst.add(new BigDecimal(cell.getNumericCellValue()).toString());
			            }
			    }
			        }
			  
			        
			    Firedriver.findElement(By.xpath("//input[@id='txtName']")).clear();
				Firedriver.findElement(By.xpath("//input[@id='txtName']")).sendKeys(lst.get(0));
				Firedriver.findElement(By.xpath("//input[@id='txtMaxSize']")).clear();
				Firedriver.findElement(By.xpath("//input[@id='txtMaxSize']")).sendKeys(lst.get(1));
				Firedriver.findElement(By.xpath("//input[@id='chkWaitList']")).click();
				Firedriver.findElement(By.xpath("//input[@id='txtStartDateFormInsert']")).sendKeys(lst.get(2));
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
			Firedriver.findElement(By.xpath("//a[@id='featureTitle_lnkAddClass']")).click();
			        }
			Firedriver.quit();
				
				}
    catch(Exception e)
    {
    	e.printStackTrace();
    	System.out.println("no xls found");
    }	
				}	

		public static void main(String[] args) throws InterruptedException {
			TestCreate cr=new TestCreate();
		
		cr.testCF_Add_New_Customer_Manually();
		cr.testCF_Add_New_Class_Manually();
		
	}

*/
