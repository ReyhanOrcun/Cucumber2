package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class AddDependentsPageElements extends CommonMethods{
	
	
	@FindBy(xpath = "//*[@id=\"socialMediaDiv\"]/div/a/i")
	public WebElement add;
	
	
	@FindBy(xpath= "//span[text()='Assigned Dependents']")
	public WebElement assignedDependents;
	
	
	
	
	
	
	public AddDependentsPageElements() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	

}
