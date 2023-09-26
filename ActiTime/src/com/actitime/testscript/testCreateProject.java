package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class testCreateProject extends BaseClass {
	@Test
	public void createProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("create Project",true);
		FileLib f = new FileLib();
		String pn = f.getExcelData("CreateCustomer", 1, 3);
		String pd = f.getExcelData("CreateCustomer", 1, 4);
		HomePage hp = new HomePage(driver);
		hp.setTaskTab();
		TaskListPage t = new TaskListPage(driver);
		Thread.sleep(5000);
		t.getAddNewBtn().click();
		t.getNewProjectoption().click();
		t.getEnterProjNametbx().sendKeys(pn);
		t.getSelectCustomer().click();
		t.getSelectCustOption().click();
		t.getProjectDescription().sendKeys(pd);
		t.getCreateProjectbtn().click();
		Thread.sleep(5000);
		String actualProject = t.getActualProjectTitle().getText();
		Assert.assertEquals(actualProject, pn);
		Thread.sleep(5000);
	}
}
