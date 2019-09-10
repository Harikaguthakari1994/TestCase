package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Assignment2POM {
	public WebDriver driver;
	//Actions act = new Actions(driver);
	
	public Assignment2POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class ='sign-in']")
	public WebElement LoginLink1;
	
	public void CLickLoginLink(){
		this.LoginLink1.click();
	}
	
	@FindBy(id="user_login")
	public WebElement UN;
	
	public void EnterUsername(String username){
		this.UN.sendKeys(username);
	}
	@FindBy(id="user_pass")
	public WebElement PW;
	
	public void EnterPassword(String password){
		this.PW.sendKeys(password);
	}
	@FindBy(name="login")
	public WebElement submitLoginclick;
	
	public void submitloginbtn(){
		this.submitLoginclick.click();
	}
	
	//After Login.
	//Mouse hover on all properties
	
	@FindBy(xpath="//*[@id='menu-posts-property']/a/div[2]")
	public WebElement Propertieshover;
	
	public void  Propertieshovered(){
		Actions act1 = new Actions(driver);
		act1.moveToElement(Propertieshover).build().perform();
		
		
	}	
	
	//click on Add New
	
		@FindBy(xpath="//*[@id='menu-posts-property']/ul/li[3]/a")
	public WebElement AddnewProperty;
	
	public void AddnewPropertyClick(){
		this.AddnewProperty.click();
	}
	//Add new properties page
    // Entered Title
	
	
	@FindBy(id="title")
	public WebElement EnterTitle;
	
	public void EnterTitlevalue(String Titlevalue ){
		this.EnterTitle.sendKeys(Titlevalue);
		
	}
	//Entered Body
	
	@FindBy(id="content")
	public WebElement Enterbody1;
	
	public void EnterbodyValue1(String bodyvalue ){
		this.Enterbody1.sendKeys(bodyvalue);
		
	}
	
	// featured check box checked
	
	@FindBy(xpath="//*[@id='in-property_feature-431']")
	public WebElement featuredcheckbox;
	
	public void featuredcheckboxclick(){
		this.featuredcheckbox.click();
		
	}
	
	//RegionCheckbox
	
	@FindBy(xpath="//*[@id='in-region-57']")
	public WebElement Regionscheckbox;

	
	public void Regionscheckboxclick(){
		this.Regionscheckbox.click();
		
	driver.switchTo().defaultContent();
		
	}
	
	//Publish
	@FindBy(id="publish")
	public WebElement Publishbotton;
	
	public void Publishbottonclick() throws InterruptedException{
		Thread.sleep(3000);
		this.Publishbotton.click();
	}
	
	@FindBy(xpath="//*[@id='message']/p/text()")
	public WebElement Validation;
	
	public void Validationcheck(){
		this.Validation.isDisplayed();
		String act = this.Validation.getText();
		Assert.assertEquals(act, "Post published. ");
	}
	
		
}
