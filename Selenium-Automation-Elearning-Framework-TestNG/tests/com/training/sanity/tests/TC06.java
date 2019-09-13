package com.training.sanity.tests;
import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TC06 {
	private WebDriver driver;
	private String baseUrl;
	private com.training.pom.Assignment2POM Assignment2POM;
	private static Properties properties;
	private ScreenShot screenShot;
	

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		Assignment2POM = new com.training.pom.Assignment2POM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
		//@AfterMethod
				//public void tearDown() throws Exception {
					//Thread.sleep(1000);
					//driver.quit();

				//}
				@Test
				public void AddPropertyTest() throws InterruptedException {
					Assignment2POM.CLickLoginLink();
					Assignment2POM.EnterUsername("admin");
					Assignment2POM.EnterPassword("adminuser@12345");
					Assignment2POM.submitloginbtn();
			// Logged as admin
					
					Assignment2POM.Propertieshovered();
					Assignment2POM.AddnewPropertyClick();
				    Assignment2POM.Addregionlinkclick();
					Assignment2POM.EnterregionTextbox("BTMBanglore");
					Assignment2POM.regiondropdowncheck();
				 Thread.sleep(5000);
					//Assignment2POM.Featuredropdowncheck();
					//driver.findElement(By.id("newproperty_feature_parent"));
					//driver.switchTo().frame(driver.findElement(By.id("newproperty_feature_parent")));
					//Select Featuredropdown = new Select(driver.findElement(By.id("newproperty_feature_parent")));  
					//Featuredropdown.selectByValue("436");
					//driver.findElement(By.id("property_feature-add-submit")).click();
					//driver. findElement(By.id("property_feature-add-submit")).sendKeys(Keys.F5);
					Assignment2POM.Addregionbtnclick();
					driver.navigate().refresh();
					//WebElement checkbox =driver.findElement(By.xpath("//label[text()=' Harika4']/preceding-sibling::input[@type='checkbox']"));
					//checkbox.click();
					//String[] holdme = null;
				java.util.List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id='regionchecklist']/li)"));
				for(int i =0;i<=checkbox.size();i++){
					System.out.println(checkbox.get(i).getText());
					if(checkbox.contains("BTMBanglore")){
						driver.findElement(By.xpath("//*[@id='property_feature-436']/ul[1]/li")).click();
						System.out.println("checked the checkbox");
						break;
						
						
					}
					
					Assignment2POM.EnterTitlevalue("IBM Testing1211");
					Assignment2POM.EnterbodyValue1("IBM Testing1");
					Assignment2POM.Publishbottonclick();
					Assignment2POM.Validationcheck();
				}
				
					
					/*//java.util.List<WebElement> temp = driver.findElements(By.xpath("//*[@id='property_feature-436']/ul[1]/li"));
                    System.out.println("TEST IS:"+temp.size());
                  
                    WebElement test=driver.findElement(By.xpath("//*[@id='property_feature-436']/ul[1]"));
				  
                    if(test.cont)
                	{
                		driver.findElement(By.xpath("//*[@id='property_feature-436']/ul[1]")).click();
                		break;
                	}
//                    for(int i=0;i<temp.size();i++)
//                    {  
//						int temp1=i+1;
//                    	String st="//*[@id='property_feature-436']/ul[1]/li["+temp1+"]";
//                    	holdme[i]=driver.findElement(By.xpath(st)).getText();
//                  
//                    
//                  
//                    	if(holdme[i].equals("Harika3"))
//                    	{
//                    		driver.findElement(By.xpath(st)).click();
//                    		break;
//                    	}
                    
					// To refresh the page by F5 Key.
                    }
					
					//To refresh the page by refresh
					//driver.navigate().refresh();*/
					
					
					
					
				
					   
					   
}
	}
