package com.Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class OrdersPage extends AccenLoginTest{
	@Test(testName="Orders",dependsOnMethods="login")

	  
	// Adding Working Centers and validating
	public void OrdersPageWorkFlow() throws InterruptedException, AWTException {
	    
		logger = report.startTest("OrderPage", "Order Screen Validations").assignCategory("Functional");

        Thread.sleep(2000);
		home.clickOnPlaceAnOrderButton();
		logger.log(LogStatus.PASS, "click On Place An Order Button");
		Thread.sleep(2000);
	
		home.EnterPartnerOrderID();
		logger.log(LogStatus.PASS, "Enter Partner OrderID");
		home.selectpaymentCollection();
		logger.log(LogStatus.PASS, "select payment Collection");
		home.selectDeliveryPartner();
		logger.log(LogStatus.PASS, "select Delivery Partner");
		
		home.EnterName();
		logger.log(LogStatus.PASS, "Enter Name");
		
		home.EnterMobileNumber();
		logger.log(LogStatus.PASS, "Enter MobileNumber");
	
		home.EnterAlternateMobileNumber();
		logger.log(LogStatus.PASS, "Enter AlternateMobileNumber");
		
		home.EnterEmail();
		logger.log(LogStatus.PASS, "Enter Email");
		
		home.EnterAddress();
		logger.log(LogStatus.PASS, "Enter Address");
	
		home.EnterLandMark();
		logger.log(LogStatus.PASS, "Enter LandMark");
		
		home.EnterPinCode();
		logger.log(LogStatus.PASS, "Enter PinCode");
			
		home.EnterCity();
		logger.log(LogStatus.PASS, "Enter City");
		
		home.EnterState();
		logger.log(LogStatus.PASS, "Enter State");
		
		home.EnterDoctorName();
		logger.log(LogStatus.PASS, "Enter DoctorName");
		
		home.SearchMedicineName();
		logger.log(LogStatus.PASS, "Search MedicineName");
		Thread.sleep(2000);
		
		
		home.SelectMedicine();
		logger.log(LogStatus.PASS, "Select Medicine");
		
		home.clickOnSubmitButton();
		logger.log(LogStatus.PASS, "click On Submi tButton");
		Thread.sleep(2000);
		
		home.ClickCrossButton();
		logger.log(LogStatus.PASS, "Click on CrossButton");
		
	
		home.ClickOnYes();
		logger.log(LogStatus.PASS, "Click on yes");
		Thread.sleep(3000);
		
		home.selectReason();
		logger.log(LogStatus.PASS, "Select Reason");
		Thread.sleep(3000);
		
		home.ClickOnSubmitReason();
		logger.log(LogStatus.PASS, "Click On Submit Reason");
		Thread.sleep(3000);
		
		home.ClickOnExportData();
		logger.log(LogStatus.PASS, "Click On Export Data");
		Thread.sleep(2000);
		
		home.ClickOnMenu();
		logger.log(LogStatus.PASS, "Click On Menu");
		Thread.sleep(3000);
		
		home.ClickOnLogOut();
		logger.log(LogStatus.PASS, "Click On LogOut");
		Thread.sleep(2000);
		
		home.AlertAccept();
		logger.log(LogStatus.PASS, "Accept alert");
		Thread.sleep(2000);
}
}

