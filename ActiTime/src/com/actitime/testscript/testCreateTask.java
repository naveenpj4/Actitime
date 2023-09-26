package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class testCreateTask extends BaseClass {
	@Test
	public void createTask() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("CreateTask",true);
		FileLib f = new FileLib();
		String tn = f.getExcelData("CreateCustomer", 1, 5);
		String td = f.getExcelData("CreateCustomer", 1, 6);
		HomePage hp = new HomePage(driver);
		hp.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		Thread.sleep(5000);
		t.getAddNewBtn().click();
		t.getNewTaskOption().click();
		t.getSelectCustomerOption().click();
	}
}
