package com.Test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
//Negative Login Scenarios
public class LoginScenarios extends OrdersPage{

	@Test(testName = "Login1",dependsOnMethods="OrdersPageWorkFlow")
	public void login1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login1", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName1();
		logger.log(LogStatus.INFO, "UserName1 Entered");
		Thread.sleep(3000);
		home.setPassWord1();
		logger.log(LogStatus.INFO, "Password1 Entered");
		
		
		
	}
	@Test(testName = "Login2" ,dependsOnMethods="login1")
	public void login2() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login2", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName2();
		logger.log(LogStatus.INFO, "UserName2 Entered");
		home.setPassWord2();
		logger.log(LogStatus.INFO, "Password2 Entered");
		home.clickLogin();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
	}
	@Test(testName = "Login3",dependsOnMethods="login2")
	public void login3() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login3", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName3();
		logger.log(LogStatus.INFO, "UserName3 Entered");
		home.setPassWord3();
		logger.log(LogStatus.INFO, "Password3 Entered");
		home.clickLogin();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		home.clickOk();
		
	}

	@Test(testName = "Login4" ,dependsOnMethods="login3")
	public void login4() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login4", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName4();
		logger.log(LogStatus.INFO, "UserName4 Entered");
		home.setPassWord4();
		logger.log(LogStatus.INFO, "Password4 Entered");
		home.clickLogin();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		home.clickOk();
		
		
	}

	@Test(testName = "Login5",dependsOnMethods="login4")
	public void login5() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login5", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName5();
		logger.log(LogStatus.INFO, "UserName5 Entered");
		home.setPassWord5();
		logger.log(LogStatus.INFO, "Password5 Entered");
		home.clickLogin();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		home.clickOk();
		
	}

	@Test(testName = "Login6" ,dependsOnMethods="login5")
	public void login6() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		logger = report.startTest("login6", "Providing Credetials and Login").assignCategory("Functional");
		home.clearUserNameTextbox();
		home.clearPasswordTextbox();
		Thread.sleep(3000);
		home.setUserName6();
		logger.log(LogStatus.INFO, "UserName6 Entered");
		home.setPassWord6();
		logger.log(LogStatus.INFO, "Password6 Entered");
		home.clickLogin();
		logger.log(LogStatus.INFO, "Clicked on SignIn Button");
		home.clickOk();
		
	}
}
