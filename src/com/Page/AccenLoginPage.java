package com.Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utility.ConfigReader;

public class AccenLoginPage {

	ConfigReader conf = new ConfigReader();
	WebDriver driver;

	public AccenLoginPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public void openUrl() {
		driver.get(conf.getUrl());

	}

	
		
     //Login Scenarios
		public void setUserName1() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName1());
			
				}
		  
		public void setPassWord1() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword1());
						
		}

		public void setUserName2() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName2());
			
		}
		  
		public void setPassWord2() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword2());
					
		}

		public void setUserName3() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName3());
			
		}
		  
		public void setPassWord3() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword3());
					
		}

		public void setUserName4() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName4());
			
		}
		  
		public void setPassWord4() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword4());
					
		}

		public void setUserName5() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName5());
			
		}
		  
		public void setPassWord5() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword5());
					
		}
		public void setUserName6() {
			driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName6());
			
		}
		  
		public void setPassWord6() {
			driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassword6());
					
		}
		public void clearUserNameTextbox() {
			driver.findElement(By.xpath(conf.getUserNameElement())).clear();
			
		}
		  
		public void clearPasswordTextbox() {
			driver.findElement(By.xpath(conf.getPassWordElement())).clear();
					
		}
          public void clickLogin() {
        	  
			driver.findElement(By.xpath(conf.getLoginButtonElement())).click();
			
		}
          public void clickOk() {
        	  
  			driver.findElement(By.xpath(conf.getOkButton())).click();
  			
  		}
            
		

		// enter login details
			public void setUserName() {
				driver.findElement(By.xpath(conf.getUserNameElement())).sendKeys(conf.getUserName());
				driver.switchTo().activeElement().sendKeys(Keys.ENTER);
			
			}
			
			public void setPassWord() throws InterruptedException {
			    driver.findElement(By.xpath(conf.getPassWordElement())).sendKeys(conf.getPassWord());
				
			    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
				
			}
	/*	public void clickSignIn() {
			
			WebElement element = driver.findElement(By.xpath(conf.getSignInButtonElement()));
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", element);
		}
*/

	public void uploadFileFromLocation(String str) throws InterruptedException, AWTException {
		Robot robot = new Robot();
		Thread.sleep(2000);
		StringSelection ss = new StringSelection(str);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	//Orders Page
	public void clickOnPlaceAnOrderButton() { 
		driver.findElement(By.xpath(conf.getPlaceAnOrder())).click();

	}
	public void clickOnSubmitButton() { 
		driver.findElement(By.xpath(conf.getSubmitButton())).click();

	}
	public void EnterPartnerOrderID() { 
		driver.findElement(By.xpath(conf.getPartnerOrderID())).sendKeys(conf.getPartnerOrderIDValue());

	}

	 public void selectpaymentCollection() {
			
			Select drpDown=new Select(driver.findElement(By.xpath(conf.getPaymentCollection())));
				drpDown.selectByVisibleText("Medpay");
			}
	 public void selectDeliveryPartner() {
			
			Select drpDown=new Select(driver.findElement(By.xpath(conf.getDeliveryPartner())));
				drpDown.selectByVisibleText("Self Pickup");
			}
	public void EnterName() { 
		driver.findElement(By.xpath(conf.getName())).sendKeys(conf.getNameValue());

	}
	public void EnterMobileNumber() { 
		driver.findElement(By.xpath(conf.getMobile())).sendKeys(conf.getMobileValue());

	}
	
	public void EnterAlternateMobileNumber() { 
		driver.findElement(By.xpath(conf.getAlternameMobile())).sendKeys(conf.getAlternameMobileValue());

	}
	public void EnterEmail() { 
		driver.findElement(By.xpath(conf.getEmail())).sendKeys(conf.getEmailValue());

	}
	public void EnterAddress() { 
		driver.findElement(By.xpath(conf.getAddress())).sendKeys(conf.getAddressValue());

	}
	public void EnterLandMark() { 
		driver.findElement(By.xpath(conf.getLandMark())).sendKeys(conf.getLandMarkValue());

	}
	public void EnterPinCode() { 
		driver.findElement(By.xpath(conf.getPinCode())).sendKeys(conf.getPinCodeValue());

	}
	public void EnterCity() { 
		driver.findElement(By.xpath(conf.getCity())).sendKeys(conf.getCityValue());

	}
	public void EnterState() { 
		driver.findElement(By.xpath(conf.getState())).sendKeys(conf.getStateValue());

	}
	public void ClickOnChooseFile() { 
		driver.findElement(By.xpath(conf.getChooseFile())).sendKeys(conf.getChooseFileValue());

	}
	
	public void EnterDoctorName() { 
		driver.findElement(By.xpath(conf.getDoctor())).sendKeys(conf.getDoctorName());

	}
	public void SearchMedicineName() throws InterruptedException { 
		driver.findElement(By.xpath(conf.getMedicineName())).sendKeys(conf.getMedicineNameValue());
		
	/*	List<WebElement>elements=driver.findElements(By.xpath(conf.getMedicineName()));
		System.out.println(elements.size());
		for(WebElement element:elements)
		{
			if(element.getText().equalsIgnoreCase("Crocin 650mg Advance Tab 15'S")){
				Thread.sleep(3000);
				element.click();
				break;
				
			}
					
		}
	*/	
				
	}
	public void SelectMedicine() { 
		driver.findElement(By.xpath(conf.getSelectMedicineName())).click();
	}
	public void ClickCrossButton() { 
		driver.findElement(By.xpath(conf.getCrossButton())).click();
	}
	public void AlertAccept() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			System.out.println("There is no alert");
		}
	}

	public void ClickOnYes() { 
		driver.findElement(By.xpath(conf.getYesButton())).click();
	}
	 public void selectReason() {
			
			Select drpDown=new Select(driver.findElement(By.xpath(conf.getReason())));
				drpDown.selectByIndex(1);
			}
	 public void ClickOnSubmitReason() { 
			driver.findElement(By.xpath(conf.getSubmitReason())).click();
		}
	public void ClickOnExportData() { 
		driver.findElement(By.xpath(conf.getExportData())).click();

	}
	public void ClickOnMenu() { 
		driver.findElement(By.xpath(conf.getMenu())).click();

	}
	public void ClickOnLogOut() { 
		driver.findElement(By.xpath(conf.getLogOut())).click();

	}
    
 
}
      
      
      
      
      
      
      
      
      
      
      
      
      
		
		
		
		
	
		
		
		
	



