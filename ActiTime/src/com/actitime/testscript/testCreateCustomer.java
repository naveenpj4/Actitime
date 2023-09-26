package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class testCreateCustomer extends BaseClass {
	@Test
	public void CreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("Create Customer",true);
		FileLib f = new FileLib();
		String cn = f.getExcelData("CreateCustomer", 1, 1);
		String cd = f.getExcelData("CreateCustomer", 1, 2);
		Thread.sleep(10000);
		HomePage hp = new HomePage(driver);
		hp.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerOption().click();
		t.getEnterCustNametbx().sendKeys(cn);
		t.getDescriptiontbx().sendKeys(cd);
		t.getSelectCustomertab().click();
		t.getBBCoption().click();
		t.getCreateCustomerbtn().click();
		Thread.sleep(5000);
		String actualCustomer = t.getActualTitle().getText();
		Assert.assertEquals(actualCustomer, cn);
		Thread.sleep(5000);
	}
}
