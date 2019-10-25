package com.arc.ReusableMethods
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.event.KeyEvent
import java.sql.*
import java.text.DateFormat
import java.text.SimpleDateFormat

import org.openqa.selenium.By
import org.openqa.selenium.Dimension
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ReusableMethodsLogin extends BaseClass{
	//ReusableMethodsLogin login = new ReusableMethodsLogin()
	Robot robot = new Robot()
	String download
	@Keyword
	public void LoginToArcWithRemoteDBMySQL() {
		Class.forName("com.mysql.cj.jdbc.Driver")
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ArcTestData", "root", "")
		java.sql.Statement stmt = connection.createStatement()
		java.sql.ResultSet relsultSet = stmt.executeQuery("Select Url ,UserName , Password from LoginToArc where Env='stg'" )
		while(relsultSet.next()) {
			Object url = relsultSet.getObject('Url')
			println(url)
			Object userName = relsultSet.getObject('UserName')
			println(userName)
			Object password = relsultSet.getObject('Password')
			println(password)
			WebUI.openBrowser(url)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(GlobalVariable.timeOut)
			WebUI.click(findTestObject('Page_Home  Arc/button_ACCEPT AND CLOSE'))
			WebUI.click(findTestObject('Page_Home  Arc/Click_Log in'))
			WebUI.setText(findTestObject('Page_Home  Arc/input_name'), userName)
			WebUI.setText(findTestObject('Page_Home  Arc/input_pass'), password)
			WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
			WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
			WebUI.delay(5)
		}
	}

	@Keyword
	public void loginIntoArcApplication(String Username,String Password) {

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'), GlobalVariable.maxAngularWait)

		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(2)

		WebUI.setText(findTestObject('Page_Home  Arc/input_name'), Username)
		WebUI.setText(findTestObject('Page_Home  Arc/input_pass'), Password)

		WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Home  Arc/ClickNavProjectText'), 10)
		WebUI.click(findTestObject('Object Repository/Page_Home  Arc/ClickNavProjectText'))
		WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'), 30)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		String postLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Projects'))
		WebUI.verifyMatch(postLoginText, 'My Projects',true)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
	}

	@Keyword
	public void tearDown(){
		KeywordLogger log = new KeywordLogger()
		log.logInfo("[--- This is Tear Down Method For unsuccessful payment Project---]")
		WebUI.delay(2)
		WebUI.closeBrowser()
		System.exit(1)
	}


	@Keyword
	public void loginIntoArcWithGlobalVariable() {


		String url = GlobalVariable.url
		String userName= GlobalVariable.userName
		String password= GlobalVariable.password
		WebUI.openBrowser('')
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize()
		println screenSize.getHeight()
		println screenSize.getWidth()
		WebUI.setViewPortSize(1366,1280)
		//WebUI.maximizeWindow()
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.navigateToUrl(url)
		waitForPageLoad(60)
		//RemoteWebDriver  driver= DriverFactory.getWebDriver()
		//driver.setFileDetector(new LocalFileDetector())
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/button_ACCEPT AND CLOSE'))
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input__name'), userName)
		WebUI.sendKeys(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input__pass'), password)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input_Forgot Password_field_po'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/button_Log in'))
		waitForPageLoad(60)
		WebUI.delay(5)
		//WebUI.click(findTestObject('Object Repository/Page_Home  Arc/WelcomeArcText'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Home  Arc/ClickNavProjectText'), 30)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/span_Projects'))
		WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'), 30)
		WebUI.delay(10)
		waitForloaderToDisappear(60)
		String postLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Projects'))
		WebUI.verifyMatch(postLoginText, 'My Projects',true)
		WebUI.delay(10)
	}
	@Keyword
	public void loginIntoArcWithGlobalVariableT() {
		String url = GlobalVariable.url
		String userName= GlobalVariable.userName
		String password= GlobalVariable.password
		WebUI.openBrowser('')
		//WebUI.maximizeWindow()
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.navigateToUrl(url)
		waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/button_ACCEPT AND CLOSE'))
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.setText(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input__name'), userName)
		WebUI.setText(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input__pass'), password)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input_Forgot Password_field_po'))
		//WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/button_ACCEPT AND CLOSE'))
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/button_Log in'))
		WebUI.setViewPortSize(1366,1280)
		waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/Page_Home  Arc/WelcomeArcText'))
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/span_Projects'))
		WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'), 30)
		WebUI.delay(3)
	}
	@Keyword
	public void navigateToURL() {


		String url = GlobalVariable.url
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.navigateToUrl(url)
		waitForPageLoad(60)

	}
	@Keyword
	public void loginArcGlobalVariable() {
		String url = GlobalVariable.url
		String userName= GlobalVariable.userName
		String password= GlobalVariable.password
		//WebUI.click(findTestObject('Page_Home  Arc/Click_Log in'))
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.setText(findTestObject('Page_Home  Arc/input_name'), userName)
		WebUI.setText(findTestObject('Page_Home  Arc/input_pass'), password)
		WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
		WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
		WebUI.delay(10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Home  Arc/ClickNavProjectText'), 30)
		WebUI.click(findTestObject('Object Repository/Page_Home  Arc/ClickNavProjectText'))
		WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'), 30)
		String postLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Projects'))
		WebUI.verifyMatch(postLoginText, 'My Projects',true)
		WebUI.delay(3)
	}



	@Keyword
	public void loginIntoArcWithGlobalVariableAppUrl() {

		loginIntoArcAppUrl()

		boolean myProject = WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'),GlobalVariable.maxAngularWait)

		if(myProject==false)
			for(int i=0;i<5;i++)
				loginIntoArcAppUrl()
		myProject = WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'),GlobalVariable.maxAngularWait)


	}
	public void loginIntoArcAppUrl(){
		String userName= GlobalVariable.userName
		String password= GlobalVariable.password
		String appUrl = GlobalVariable.appUrl
		java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize()
		print screenSize.getHeight()
		print screenSize.getWidth()
		Dimension size = new Dimension(1500, 1068)

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)

		WebUI.navigateToUrl(appUrl)
		WebUI.getViewportHeight()
		WebUI.getViewportWidth()
		WebUI.getViewportLeftPosition()
		WebUI.getViewportTopPosition()
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)

		WebUI.setViewPortSize(1366,1280)
		WebUI.getViewportHeight()
		WebUI.getViewportWidth()
		WebUI.getViewportLeftPosition()
		WebUI.getViewportTopPosition()

		WebUI.click(findTestObject('Object Repository/LoginViaAppUrl/CookieACCEPTANDCLOSE'),FailureHandling.OPTIONAL)
		WebUI.setText(findTestObject('Object Repository/LoginViaAppUrl/UserName'), userName)
		WebUI.setText(findTestObject('Object Repository/LoginViaAppUrl/UserPassword'), password)
		WebUI.check(findTestObject('Object Repository/LoginViaAppUrl/AcceptAgreement'))
		//WebUI.click(findTestObject('Object Repository/LoginViaAppUrl/AcceptAgreement'))
		WebUI.click(findTestObject('Object Repository/LoginViaAppUrl/ClickLOGIN'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)

	}



	@Keyword
	public void loginArcAdminToolWithGlobalVariable() {
		String url = GlobalVariable.adminUrl
		String userName= GlobalVariable.adminUserName
		String password= GlobalVariable.adminPassword

		Robot r = new Robot()

		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_T)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

		//To switch to the new tab
		WebUI.switchToWindowIndex(1)
		//WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.navigateToUrl(url)

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.setText(findTestObject('PerformanceScore/Username'), userName)
		WebUI.setText(findTestObject('PerformanceScore/Password'), password)
		WebUI.check(findTestObject('PerformanceScore/AcceptCheckbox'))
		WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.check(findTestObject('PerformanceScore/AcceptCheckbox'))
		WebUI.click(findTestObject('PerformanceScore/LOG IN'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String postLoginText = WebUI.getText(findTestObject('PerformanceScore/VerifyTextTeam'))
		WebUI.verifyMatch(postLoginText,'Team',false)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

	}
	@Keyword
	public void loginIntoArcWithExcelData() {
		/*** Please change/select row number 1 Stg & 2 Qas, 3 Dev , 4 Prd **********/

		TestData excelData = findTestData('Test Data')
		int row = 2
		String url = excelData.getValue('ArcURL' , row)
		WebUI.openBrowser(url)
		WebUI.maximizeWindow()
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.click(findTestObject('Page_Home  Arc/button_ACCEPT AND CLOSE'))
		WebUI.click(findTestObject('Page_Home  Arc/Click_Log in'))
		WebUI.setText(findTestObject('Page_Home  Arc/input_name'),excelData.getValue('UserName', row))
		WebUI.setText(findTestObject('Page_Home  Arc/input_pass'), excelData.getValue('Password', row))
		WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
		WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
		WebUI.delay(5)
		String postLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Projects'))
		WebUI.verifyMatch(postLoginText, 'My Projects',true)
		WebUI.delay(2)
	}

	@Keyword
	public void logoutFromArcApplication() {
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/b_caret'), 4)
		WebUI.click(findTestObject('Page_Arc dashboard/b_caret'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/logout'), 2)
		WebUI.click(findTestObject('Page_Arc dashboard/logout'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}

	@Keyword
	public void loginWithValidId() {

		String userName= GlobalVariable.userName
		String password= GlobalVariable.password

		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input__name'), userName)

		WebUI.sendKeys(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input__pass'), password)

		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/input_Forgot Password_field_po'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/button_Log in'))

		WebUI.delay(20)
		WebUI.click(findTestObject('Object Repository/Page_Home  Arc/WelcomeArcText'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Home  Arc/ClickNavProjectText'), 30)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/span_Projects'))
		WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/span_My Projects'), 30)
		waitForloaderToDisappear(60)
		String postLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Projects'))
		WebUI.verifyMatch(postLoginText, 'My Projects',true)
		WebUI.delay(3)


	}
	@Keyword
	public void loginWithBlankValue() {
		/*	WebUI.click(findTestObject('LoginArc/Page_Arc Skoru  Sustainability perf/Logout'))
		 WebUI.delay(6)
		 */	WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
		WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
		WebUI.delay(5)
		WebUI.verifyTextPresent('Email field is required.', true)
		WebUI.verifyTextPresent('Password field is required.',true)
	}


	public static void waitForPageToLoadCompletely(int timeout){
		// KatalonWebDriverBackedSelenium.WAIT_FOR_PAGE_TO_LOAD_IN_SECONDS

		// wait some number of seconds for page to load
		println 'wait'
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, timeout)
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"loading\";"))
		//wait.until(((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete"))
		//wait.until(ExpectedConditions.((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"))
		JavascriptExecutor js = (JavascriptExecutor) driver
		println js.executeScript("return document.readyState").toString()
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"))
		WebUI.delay(3)
	}

	public static void waitForPageLoad(int timeout){
		// KatalonWebDriverBackedSelenium.WAIT_FOR_PAGE_TO_LOAD_IN_SECONDS
		//WebUI.waitForElementNotPresent(findTestObject('Object Repository/Page_Arc dashboard/LoaderMainPage'), 60, FailureHandling.CONTINUE_ON_FAILURE)

		// wait some number of seconds for page to load
		println 'wait'
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, timeout)
		//wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"loading\";"))
		//wait.until(((JavascriptExecutor)driver).executeScript("return document.readyState").toString().equals("complete"))
		//wait.until(ExpectedConditions.((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete"))
		JavascriptExecutor js = (JavascriptExecutor) driver
		println js.executeScript("return document.readyState").toString()

		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"))
		//println js.executeScript("return jQuery('.pace.pace-active').length").toString().equals("1")
		//println js.executeScript("return jQuery('.pace.pace-active').length").toString()

	}


	public static void waitForloaderToDisappear(int timeout){
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, timeout)
		JavascriptExecutor js = (JavascriptExecutor) driver
		WebUI.delay(4)
		//wait.until(ExpectedConditions.jsReturnsValue("return jQuery('.pace.pace-active').length==1;"))
		wait.until(ExpectedConditions.jsReturnsValue("return jQuery('.pace.pace-inactive').length==1;"))
		//println js.executeScript("return jQuery('.pace.pace-inactive').length").toString().equals("1")
		//println js.executeScript("return jQuery('.pace.pace-inactive').length").toString()

	}
	public static void waitForIframeLoad(int timeout){

		// wait some number of seconds for page to load
		WebDriver driver = DriverFactory.getWebDriver()
		WebDriverWait wait = new WebDriverWait(driver, timeout)
		wait.until(ExpectedConditions.jsReturnsValue("return jQuery('#datainput-widget').contents().context.readyState=='complete';"))
		WebUI.delay(3)

	}



	public static void getCurrentTimeUsingDate() {
		Date date = new Date()
		String strDateFormat = "hh:mm:ss a"
		DateFormat dateFormat = new SimpleDateFormat(strDateFormat)
		String formattedDate= dateFormat.format(date)
		System.out.println("Current time of the day using Date - 12 hour format: " + formattedDate)
	}
	@Keyword
	public static void verifyLink() {
		String murl = GlobalVariable.url
		WebUI.openBrowser(murl)
		WebUI.delay(50)

		String url = "";
		WebDriver driver  = DriverFactory.getWebDriver()
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("size:" + ele.size());
		boolean isValid = false;
		for (int i = 0; i < ele.size(); i++) {

			isValid = getResponseCode(ele.get(i).getAttribute("href"));
			if (isValid) {
				System.out.println("ValidLinks:" + ele.get(i).getAttribute("href"));
				driver.get(ele.get(i).getAttribute("href"));
				List<WebElement> ele1 = driver.findElements(By.tagName("a"));
				System.out.println("InsideSize:" + ele1.size());
				for (int j=0; j<ele1.size(); j++){
					isValid = getResponseCode(ele.get(j).getAttribute("href"));
					if (isValid) {
						System.out.println("ValidLinks:" + ele.get(j).getAttribute("href"));
					}
					else{
						System.out.println("InvalidLinks:"+ ele.get(j).getAttribute("href"));
					}
				}
			} else {
				System.out.println("InvalidLinks:"
						+ ele.get(i).getAttribute("href"));
			}
		}
	}
	public static int getResponseCode(String urlString) {
		try {
			URL u = new URL(urlString);
			HttpURLConnection h =  (HttpURLConnection)  u.openConnection();
			h.setRequestMethod("GET");
			h.connect();
			return h.getResponseCode();
		} catch (MalformedURLException e) {
			return -1;
		}
	}
}

