package com.Actitime.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.ObjectLibrary.HomePage;
import com.Actitime.ObjectLibrary.TaskPage;

public class Task extends BaseClass{

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		HomePage hp=new HomePage(driver);
		hp.getTasktab().click();
		TaskPage tp=new TaskPage(driver);
		tp.getAddNewBtn().click();
		tp.getNewCustomer().click();
		FileLibrary f=new FileLibrary();
		String customername = f.readDataFromExcel("Sheet1", 1, 1);
		tp.getCustomerName().sendKeys(customername);
		String descr = f.readDataFromExcel("Sheet1", 1, 2);
		tp.getCustoDescr().sendKeys(descr);
		tp.getCreatecust().click();
		String expectedResult = customername;
		SoftAssert s=new SoftAssert();
		String actalResult = driver.findElement(By.xpath("(//div[.='"+customername+"'])[2]")).getText();
		s.assertEquals(actalResult, expectedResult);
		s.assertAll();
	}
}
