package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerOption;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement enterCustNametbx;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement Descriptiontbx;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomertab;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement BBCoption;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualTitle;
	
	
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjectoption;
	
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
	private WebElement enterProjNametbx;
	
	@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement selectCustomer;
	
	@FindBy(xpath="//div[text()='Dutch_001' and @class='itemRow cpItemRow ']")
	private WebElement selectCustOption;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Add Project Description']")
	private WebElement projectDescription;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProjectbtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualProjectTitle;
	
	
	
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTaskOption;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")
	private WebElement selectCustomerOption;
	
	
	
	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return newCustomerOption;
	}

	public WebElement getEnterCustNametbx() {
		return enterCustNametbx;
	}

	public WebElement getDescriptiontbx() {
		return Descriptiontbx;
	}

	public WebElement getSelectCustomertab() {
		return selectCustomertab;
	}

	public WebElement getBBCoption() {
		return BBCoption;
	}

	public WebElement getCreateCustomerbtn() {
		return createCustomerbtn;
	}

	public WebElement getActualTitle() {
		return actualTitle;
	}
	
	
	

	public WebElement getNewProjectoption() {
		return newProjectoption;
	}

	public WebElement getEnterProjNametbx() {
		return enterProjNametbx;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getSelectCustOption() {
		return selectCustOption;
	}

	public WebElement getProjectDescription() {
		return projectDescription;
	}

	public WebElement getCreateProjectbtn() {
		return createProjectbtn;
	}

	public WebElement getActualProjectTitle() {
		return actualProjectTitle;
	}
	
	
	

	public WebElement getNewTaskOption() {
		return newTaskOption;
	}

	public WebElement getSelectCustomerOption() {
		return selectCustomerOption;
	}
	
	
}
