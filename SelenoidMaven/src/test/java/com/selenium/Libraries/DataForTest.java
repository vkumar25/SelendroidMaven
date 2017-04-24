package com.selenium.Libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class DataForTest extends ObjectInstance1 {
	
	public  void readStudentData() throws Exception
	{
		List ClasssheetData=new ArrayList();

		String Output_Filename = "C:/Users/VINIT/Desktop/All_files/StudentData.xls";
		InputStream inputData = new FileInputStream(Output_Filename);
		HSSFWorkbook workbook=new HSSFWorkbook(inputData);
		HSSFSheet sheet=workbook.getSheetAt(0);
		/*Iterator rows = sheet.rowIterator();
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
		HSSFCell cell = (HSSFCell) list.get(3);
		cell = sheet.getRow(1).getCell(3);
		*/
		st1=sheet.getRow(2).getCell(3).toString();
		st2=sheet.getRow(3).getCell(3).toString();
		st3=sheet.getRow(4).getCell(3).toString();
		st4=sheet.getRow(5).getCell(3).toString();
		lststu.add(st1);
		lststu.add(st2);
		lststu.add(st3);
		lststu.add(st4);

	}
	public  void readClassData() throws Exception
	{
		List ClasssheetData=new ArrayList();

		String Output_Filename1 = "C:/Users/VINIT/Desktop/All_files/ClassData.xls";
		InputStream inputData = new FileInputStream(Output_Filename1);
		HSSFWorkbook workbook=new HSSFWorkbook(inputData);
		HSSFSheet sheet=workbook.getSheetAt(0);
		/*Iterator rows = sheet.rowIterator();
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
		/*for (int i = 1; i < StudentsheetData.size(); i++) {
		List list = (List) StudentsheetData.get(i);
		HSSFCell cell = (HSSFCell) list.get(3);
		cell = sheet.getRow(1).getCell(3);*/
		
		/*for(int k=1;k<5;k++)
		{
			sheet.getRow(1).getCell(3).toString()
			lstcls.addAll(k);
		}*/
		cl1=sheet.getRow(1).getCell(0).toString();
		System.out.println(cl1);
		cl2=sheet.getRow(2).getCell(0).toString();
		System.out.println(cl2);
		cl3=sheet.getRow(3).getCell(0).toString();
		System.out.println(cl3);
		cl4=sheet.getRow(4).getCell(0).toString();
		System.out.println(cl4);
		lstcls.add(cl1);
		lstcls.add(cl2);
		lstcls.add(cl3);
		lstcls.add(cl4);
	}

}

