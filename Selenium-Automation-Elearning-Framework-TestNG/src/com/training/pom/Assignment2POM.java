package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
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
	
	@FindBy(xpath="//*[@id='message']")
	public WebElement Validation;
	
	public void Validationcheck(){
		this.Validation.isDisplayed();
		String act = this.Validation.getText();
		Assert.assertEquals(act, "Post published. View post");
	
	}
	
	// Add feature click.
	
	@FindBy(xpath="//*[@id='property_feature-add-toggle']")
	public WebElement Addfeaturelink;

	
	public void Addfeaturelinkclick(){
		this.Addfeaturelink.click();
	}
		
	// Enter Text Box for feature Text box.
	
	@FindBy(id="newproperty_feature")
	public WebElement FeatureTextbox;
	
	
	public void EnterFeatureTextbox(String bodyvalue ){
		this.FeatureTextbox.sendKeys(bodyvalue);
		driver.switchTo().defaultContent();
	}
	
	// to Click on Add feature button
	
		@FindBy(xpath="//*[@id='property_feature-add-submit']")
		public WebElement AddFeaturebtn;
		
		public void AddFeaturebtnclick(){
			this.AddFeaturebtn.click();
		}
		
	
	//Selecting the parent feature from drop down
	
	//Select Featuredropdown = new Select(driver.findElement(By.id("newproperty_feature_parent")));  
	  // Featuredropdown.selectByVisibleText("Best");
	
	@FindBy(xpath="//*[@id='newproperty_feature_parent']")
	public WebElement Featuredropdown;
	
	public void Featuredropdowncheck(){
		Select dropdown = new Select(Featuredropdown);
		dropdown.selectByValue("436");
	
        //Actions act = new Actions(driver);
        //act.moveToElement(list).click().build().perform();
        //act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).build().perform();
        //Thread.sleep(3000);
        //act.sendKeys(Keys.ENTER).build().perform();
       //Select Featuredropdown = new Select(driver.findElement(By.id("newproperty_feature_parent")));  
	   //Featuredropdown.selectByVisibleText("Best");
	}
	
	//Click on add feature button
	
	@FindBy(id="property_feature-add-submit")
	public WebElement Addfeaturebotton;
	
	public void Addfeaturebottonclick() throws InterruptedException{
		Thread.sleep(3000);
		this.Addfeaturebotton.click();
	}
	
	// Add new New Region click.
	
		@FindBy(xpath="//a[@id='region-add-toggle']")
		public WebElement Addregionlink;

		
		public void Addregionlinkclick(){
			this.Addregionlink.click();
		}
			
		// Enter Text Box for region Text box.
		
		@FindBy(id="newregion")
		public WebElement regionTextbox;
		public void EnterregionTextbox(String bodyvalue ){
			this.regionTextbox.sendKeys(bodyvalue);
			driver.switchTo().defaultContent();
		}
		//Select the region dropdown.
		@FindBy(xpath="//*[@id='newregion_parent']")
		public WebElement regiondropdown;
		
		public void regiondropdowncheck(){
			Select regiondropdown1 = new Select(regiondropdown);
			regiondropdown1.selectByValue("50");
		}
		
		//Click on Add new  region button.
		@FindBy(xpath="//*[@id='region-add-submit']")
		public WebElement Addregionbtn;
		
		public void Addregionbtnclick(){
			this.Addregionbtn.click();
		}
		
		

	}
	
	
	
	

	
	
	
		

