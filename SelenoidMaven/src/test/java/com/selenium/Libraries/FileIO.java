package com.selenium.Libraries;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class FileIO {
	
	static String ObjectData="./src/test/java/DataFolder/ObjectData.xml";

	static String TestData="./src/test/java/DataFolder/emp.xml";
	
	static String constant="./src/test/java/DataFolder/constant.properties";
	
	public static String getObjectData(String PageElementTagName, String ElementName) throws Exception {		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				org.w3c.dom.Document document = builder.parse(new File(ObjectData));
				Element root = 	document.getDocumentElement();			
				
				NodeList departments =	root.getElementsByTagName("page");
				for(int i=0; i<departments.getLength(); i++) {
					Element department = (Element)departments.item(i);						
					String department1 = department.getAttribute("name");					
					
							if (department1.equals(PageElementTagName))	{
								NodeList groups = department.getElementsByTagName("uiobject");								
									for(int j=0; j<groups.getLength(); j++) {
										Element group = (Element)groups.item(j);
										String department2 = group.getAttribute("name");
										
										if (department2.equals(ElementName)){
											root.normalize();
											String body = group.getFirstChild().getNodeValue();											
																						
											return body;
											
											}			
									
										}
							}
					}
				return null;
			}

	public static String getData(String PageElementTagName, String ElementName) throws Exception {		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = factory.newDocumentBuilder();
				org.w3c.dom.Document document = builder.parse(new File(TestData));
				Element root = 	document.getDocumentElement();			
				
				NodeList departments =	root.getElementsByTagName("page");
				for(int i=0; i<departments.getLength(); i++) {
					Element department = (Element)departments.item(i);						
					String department1 = department.getAttribute("name");					
					
							if (department1.equals(PageElementTagName))	{
								NodeList groups = department.getElementsByTagName("uiobject");								
									for(int j=0; j<groups.getLength(); j++) {
										Element group = (Element)groups.item(j);
										String department2 = group.getAttribute("name");
										
										if (department2.equals(ElementName)){
											root.normalize();
											String body = group.getFirstChild().getNodeValue();											
																						
											return body;
											
											}			
									
										}
							}
					}
				return null;
			}
	
	public static String getConfigData(String property_name) throws FileNotFoundException, IOException
	{
		String property_value=null;
		Properties prop=new Properties();
		prop.load(new FileInputStream(constant));
		property_value=prop.getProperty(property_name);
		
		return property_value;
		
	}

}
