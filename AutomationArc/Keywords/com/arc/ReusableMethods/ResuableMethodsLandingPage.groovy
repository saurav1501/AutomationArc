package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.openqa.selenium.WebElement

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class ResuableMethodsLandingPage extends BaseClass {
	ReusableMethodsNavigation landingPage =new ReusableMethodsNavigation()
	Date date = new Date(System.currentTimeMillis())
	WebDriver driver = DriverFactory.getWebDriver()


	@Keyword
	public void invalidIDLoginTest() throws IOException, InterruptedException {
		/*******Verify invalid ID not able to log-in*************************/
		//landingPage.ArcLogoNavigation()
		//WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/ClickingLoginDrop'))
		/*	WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		 WebUI.delay(2)*/
		WebUI.setText(findTestObject('Page_Home  Arc/input_name'),'invalidUser@gamil.com' )
		WebUI.setText(findTestObject('Page_Home  Arc/input_pass'),'password')
		WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
		WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		String errortext = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/ErrorMessageSorry'))
		String errortextUI= errortext.replaceAll("\\s+","")
		WebUI.verifyMatch(errortextUI,'Errormessage', false)
	}

	@Keyword
	public void invalidIDNavigationTest() throws IOException, InterruptedException {
		/*******Verify Forget Password Link User Should able to log-in*************************/
		WebUI.click(findTestObject('Page_Home  Arc/Forgetpassword'))
		WebUI.delay(7)
		//String LoginModelPopup ='Please login with your user account.'
		WebUI.verifyElementPresent(findTestObject('Add_Project_Details/ResetPass'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		String url = GlobalVariable.url
		WebUI.navigateToUrl(url)
		WebUI.delay(10)


	}


	@Keyword
	public void hyperlinksCookiePolicy() throws IOException, InterruptedException {
		/*******Check hyperlinks  in Login module for 'cookie policy' clicking on the hyperlinks should redirect to correct webpage.*************************/
		/*WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		 WebUI.delay(2)
		 */

		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/a_Cookie Statement'), 12)
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_Cookie Statement'))
		WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.switchToWindowIndex(1)
		String cookiepolicyPage = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/CookiePolicyPage'))
		WebUI.verifyMatch(cookiepolicyPage,'This is the Cookie Policy for Arc, accessible from http://arcskoru.com', false)

		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(3)
		//String LoginModelPopup ='Please login with your user account.'
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/DashboardPage/LoginPopupText'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/RedirectPrdPage'))
		WebUI.delay(6)

		WebUI.switchToWindowIndex(2)
		WebUI.verifyTextPresent('Performance is the future of green building', true)
		WebUI.closeWindowIndex(2)
		WebUI.closeWindowIndex(1)


		/*******Check hyperlinks for 'cookie policy' inside banner clicking on the hyperlinks should redirect to correct webpage.*************************//*
		 WebUI.switchToWindowIndex(0)
		 WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/Banner_Cookie Statement'),2)
		 WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Banner_Cookie Statement'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(1)
		 String cookiepolicyBanner = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/CookiePolicyPage'))
		 WebUI.verifyMatch(cookiepolicyBanner,'This is the Cookie Policy for Arc, accessible from http://arcskoru.com', false)
		 WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/RedirectPrdPage'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(2)
		 WebUI.verifyTextPresent('Performance is the future of green building', true)
		 WebUI.closeWindowIndex(2)
		 WebUI.closeWindowIndex(1)
		 */		WebUI.switchToWindowIndex(0)
		/*		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		 WebUI.delay(2)*/


	}

	@Keyword
	public void hyperlinksPrivacypolicy() throws IOException, InterruptedException {
		/*******Check hyper links  in Login module for 'privacy policy' clicking on the hyperlinks should redirect to correct web-page.*************************/

		/*WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		 WebUI.delay(2)
		 */	
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/a_Privacy Statement'),6)
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_Privacy Statement'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		String privicyPage = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/Privacy Notice'))
		WebUI.verifyMatch(privicyPage,'Privacy Notice', false)

		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(3)
		//String LoginModelPopup ='Please login with your user account.'
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/DashboardPage/LoginPopupText'), 5, FailureHandling.CONTINUE_ON_FAILURE)


		/*WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/PRDPrivicy'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(2)
		 WebUI.verifyTextPresent('Your World is Alive!', true)
		 WebUI.closeWindowIndex(2)
		 */	WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	@Keyword
	public void hyperlinksTermsofuse() throws IOException, InterruptedException {
		/*******Check Hyper links  in Login module for 'privacy policy' clicking on the hyperlinks should redirect to correct web-page.*************************/
		/*		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		 WebUI.delay(2)*/
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/a_Terms of Use'),6)
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_Terms of Use'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		String termsofuse = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/Legalconditions'))
		WebUI.verifyMatch(termsofuse,'Legal terms and conditions', false)

		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(3)
		//String LoginModelPopup ='Please login with your user account.'
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/DashboardPage/LoginPopupText'), 5, FailureHandling.CONTINUE_ON_FAILURE)



		/*		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/termsarcskoru'),5)
		 WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/termsarcskoru'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(2)
		 WebUI.verifyTextPresent('Your World is Alive!', true)
		 WebUI.closeWindowIndex(2)*/
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}
	@Keyword
	public void setaccountPref() throws IOException, InterruptedException {
		/*****Verify 'User account' -->preferences , user is able to turn on/off the toggle and the functionality works fine for 'Receive email when new score version is available'****/
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/b_caret'), 4)
		WebUI.click(findTestObject('Page_Arc dashboard/b_caret'))
		WebUI.delay(1)

		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/Account/a_ Preferences'),4)
		WebUI.click(findTestObject('Page_Arc dashboard/Account/a_ Preferences'))
		WebUI.delay(5)

		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/Account/accountPref'), 4)
		WebUI.click(findTestObject('Page_Arc dashboard/Account/accountPref'))

		String popuptext = WebUI.getText(findTestObject('Page_Arc dashboard/Account/ValidationPopup'))
		WebUI.verifyMatch(popuptext,'Receive email when new score version is available', false)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/Account/CloseAccountPrefPopup'))
		WebUI.delay(5)
	}




	@Keyword
	public void hyperlinksEndUser() throws IOException, InterruptedException {
		/*******Check hyperlinks  in Login module for End User License Agreement.  clicking on the hyperlinks should redirect to correct web-page.*************************/
		//landingPage.ArcLogoNavigation()
		/*		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		 WebUI.delay(2)*/
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_End User License Agreement'))
		WebUI.delay(7)
		WebUI.switchToWindowIndex(1)
		String termsofuse = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/End User License Agreement'))
		//WebUI.verifyMatch(termsofuse,'End User License Agreement', false)
		WebUI.verifyTextPresent('End User License Agreement', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(3)
		//String LoginModelPopup ='Please login with your user account.'
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/DashboardPage/LoginPopupText'), 5, FailureHandling.CONTINUE_ON_FAILURE)


		/*	WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/End_Arc Privacy Notice'),10)
		 WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/End_Arc Privacy Notice'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(2)
		 //String Logintext = WebUI.getText(findTestObject('Page_Home  Arc/Click_Log in'))
		 WebUI.verifyTextPresent('Your World is Alive!', true)
		 WebUI.closeWindowIndex(2)
		 */	WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}
	@Keyword
	public void sidebarcollapsing() throws IOException, InterruptedException {
		/*******Verify if side bar collapsing .*************************/
		WebUI.delay(1)
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/SideCollpsingBar'), 10)
		WebUI.delay(5)
		WebUI.verifyElementClickable(findTestObject('Page_Arc dashboard/DashboardPage/SideCollpsingBar'))
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/SideCollpsingBar'))
		WebUI.delay(2)
	}
	@Keyword
	public void verifyIaccepttheEULATest() throws IOException, InterruptedException {
		/*******Verify checkbox functionality for 'I accept the EULA' at the login window should give error message if left unchecked.*************************/
		WebUI.click(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'))
		WebUI.delay(2)

		WebUI.setText(findTestObject('Page_Home  Arc/input_name'),'invalidUser@gamil.com' )
		WebUI.setText(findTestObject('Page_Home  Arc/input_pass'), 'password')
		WebUI.delay(2)
		WebUI.click(findTestObject('Page_Home  Arc/input_field_policy_accept'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Page_Home  Arc/button_Log in'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		String errortext = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/IAcceptValidationText'))
		WebUI.verifyMatch(errortext,'Please read through and accept our aforementioned Privacy Documents and Terms to be able to proceed to your account. For any questions, you may write to us at info@usgbc.org', false)
	}

	@Keyword
	public void verifyMyAccountNavigation() throws IOException, InterruptedException {
		/*******Verify My Account Navigate to correct page *************************/
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/b_caret'), 4)
		WebUI.click(findTestObject('Page_Arc dashboard/b_caret'))
		WebUI.delay(1)
		WebUI.scrollToElement(findTestObject('Page_Arc dashboard/DashboardPage/a_ My Account'), 2)
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_ My Account'))
		WebUI.delay(6)
		WebUI.switchToWindowIndex(1)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		String Logintext = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/ARCs account'))
		WebUI.verifyMatch(Logintext,'Manage your projects and register new projects on LEED Online.', false)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}
	@Keyword
	public void verifyAddProjectButton() {
		/**********Project Details : Verify Add project is available on project dashboard*******************/
		WebUI.scrollToElement(findTestObject('Object Repository/Add_Project_Details/button_ Add'), 3)
		String addButton = WebUI.getText(findTestObject('Object Repository/Add_Project_Details/button_ Add'))
		WebUI.delay(1)
		WebUI.verifyMatch(addButton,'+ Add',false)
	}

	@Keyword
	public void projectRegistrationZipCodeLen() {
		/**********Verify if Project Registration page is open when add project is clicked on *******************/
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), '1111111111')
		WebUI.verifyElementNotPresent(findTestObject('Manage/ErrorMessage/ErrorMess'),3, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.clearText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Manage/ErrorMessage/ErrorMess'),3, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), '11111')
		WebUI.verifyElementNotPresent(findTestObject('Manage/ErrorMessage/ErrorMess'),3, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void projectRegistrationCityLen() {
		/**********Verify if Project Registration page is open when add project is clicked on *******************/
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), 'Validate Max City Len up to 40 character')
		WebUI.verifyElementNotPresent(findTestObject('Manage/ErrorMessage/ErrorMess'),3, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.clearText(findTestObject('Object Repository/AddProjectNewUI/cityName'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Manage/ErrorMessage/ErrorMess'),3, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), 'Special City #  & + 2 ,..- 09')
		WebUI.verifyElementNotPresent(findTestObject('Manage/ErrorMessage/ErrorMess'),3, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void projectRegistrationPage() {
		/**********Verify if Project Registration page is open when add project is clicked on *******************/
		WebUI.delay(4)

		WebUI.clearText(findTestObject('Object Repository/AddProjectNewUI/projectName'))

		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), 'ProjectName')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), 'Buildings', true)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),'2000' )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), 'U.S. Green Building Council, 2101 L Street')
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), 'DC')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'),'United States', false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),'Washington', false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), '3500')
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/Page_Arc dashboard/ProjectZipCode'),3, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void projectRegistrationPagearea() {
		/**********Verify if Project Registration page is open when add project is clicked on *******************/

		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), 'ProjectName')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), 'Buildings', true)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),'21499999')
		WebUI.verifyElementPresent(	findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/Page_Arc dashboard/span_Exceeded maximum value'), 2)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),'21.01112')
		WebUI.verifyElementNotPresent(findTestObject('DashboardNavigationNewUI/AreaValidation'), 2)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),'xxxxx')
		WebUI.verifyElementPresent(findTestObject('DashboardNavigationNewUI/AreaValidation'), 2)
	}
	@Keyword
	public void projectRegistrationPageAddress() {
		/**********Verify if Project Registration page is open when add project is clicked on *******************/

		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), 'U.S. Green Building Council, 2101 L Street')
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/Page_Arc dashboard/LocationErrorMessage'),5)
	}
	@Keyword
	public void addProjectSearchNav() {
		/**********Verify if Navigation Search in Add Project Section*******************/
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/a_ Data Input'))
	}
	@Keyword
	public void projectRegistrationCountryState() {
		/**********Verify if Project Registration page is open when add project is clicked on *******************/

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.clearText(findTestObject('Object Repository/AddProjectNewUI/projectName'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'),'India', false)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/AllProject/select_Andaman and Nico.In.And'), 'Andaman and Nico.In.', false, 5)
		/*	WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/Page_Arc dashboard/StateThis field is required'),7)
		 WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/Page_Arc dashboard/StateValidation2'),7)
		 */
	}

	@Keyword
	public void verifyProjectRegFieldDetails() {
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		/*WebUI.scrollToElement(findTestObject('Object Repository/Add_Project_Details/button_ Add'), 3)
		 WebUI.click(findTestObject('Object Repository/Add_Project_Details/button_ Add'))*/
		String optionValue = WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/ProjectTypeOption'))
		String optionPresent= optionValue.replaceAll("\\s+","")
		WebUI.verifyMatch(optionPresent,"CommunitiesCitiesBuildingsBuildings-TransitBuildings-Parking(Parksmart)", false)
	}

	@Keyword
	public verifyValidationAreaUnit() {
		/**********Verify the radio buttons for the Units & tool tip text .*******************/
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)

		WebUI.scrollToElement(findTestObject('Object Repository/Add_Project_Details/button_ Add'), 3)
		WebUI.click(findTestObject('Object Repository/Add_Project_Details/button_ Add'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), 'Buildings', true)

		/*WebUI.selectOptionByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_Square feetSquare meter'), 'IP units (feet)', false)
		 WebUI.verifyElementPresent(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/EnterAreaIP'),4)                  
		 WebUI.selectOptionByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_Square feetSquare meter'), 'SI units (meters)', false)
		 WebUI.verifyElementPresent(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/square meters'),4)
		 */
	}
	@Keyword
	public verifyValidationSpecialCharacter() {
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		WebUI.scrollToElement(findTestObject('Object Repository/Add_Project_Details/button_ Add'), 3)
		WebUI.click(findTestObject('Object Repository/Add_Project_Details/button_ Add'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)

		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'),'ProjectNameUp40CharacterTestVerifyUPTo40')
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/New Folder/Page_Arc dashboard/StateThis field is required'),7)

		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '& + / :  , - . #')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'),2)

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '!')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '@')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '$')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '%')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '^')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '*')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '(')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))

		WebUI.clearText(findTestObject('Object Repository/Add_Project_Details/input_name'))
		WebUI.setText(findTestObject('Object Repository/Add_Project_Details/input_name'), '?')
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/Reg/label_Project Name'))
		WebUI.delay(2)
		WebUI.verifyElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/Reg/ErrorMessageSpecialcharacters'))
	}

	@Keyword
	public verifyDashboadAllProjectDetail() {
		WebUI.delay(8)
		WebDriver driver  = DriverFactory.getWebDriver()
		WebUI.scrollToPosition(0,1000)
		WebUI.delay(10)

		ArrayList numberofProject = driver.findElements(By.xpath("//td[@class='vertical-align-middle cursor-pointer']/span[@class='ng-binding']"))
		int projectID = numberofProject.size()
		println projectID
		if(projectID>=30)
			println "Dashborad have all the Projects with the PorjectId and belwo are the  xpath for project ID"
		else
			Assert.fail("Dashborad have less than 30 with the below projects ID xpath ")
		Iterator iterator = numberofProject.iterator()
		while (iterator.hasNext()) {
			String projectid = iterator.next()
			println projectid
		}

		ArrayList numberofProjectName = driver.findElements(By.xpath("//span[@class = 'fw-semi-bold ng-binding']"))
		int numberOfCountSizeName = numberofProjectName.size()
		println numberOfCountSizeName
		if(numberOfCountSizeName>=30)
			println "Dashborad have all Project name with below xpath"
		else
			Assert.fail("Dashborad have less than 30  with the below projects Name xpath ")
		Iterator iteratorname = numberofProjectName.iterator()
		while (iteratorname.hasNext()) {
			String projectName = iteratorname.next()
			println projectName
		}

		ArrayList numberofProjectstatusReg = driver.findElements(By.xpath("//*[(text() = 'Registered' or . = 'Registered')]"))
		int numberofProjectstatusreg = numberofProjectstatusReg.size()
		println numberofProjectstatusreg
		if(numberofProjectstatusreg>=30)
			println "Dashborad have all the project with registered status with below xpath"
		else
			Assert.fail("Dashborad have less then 30 projects")
		Iterator iteratornamestatusReg = numberofProjectstatusreg.iterator()
		while (iteratornamestatusReg.hasNext()) {
			String projectNamestaus = iteratornamestatusReg.next()
			println projectNamestaus
		}

		ArrayList numberofProjectscore = driver.findElements(By.xpath("//*[@class = 'smallScorepuckBlank ng-scope']"))
		int numberofProjectScore = numberofProjectscore.size()
		println numberofProjectScore
		if(numberofProjectScore>=30)
			println "Dashborad have all projects score with below xpath "
		else
			Assert.fail("Dashborad have less then 30 project with Score xpath")
		Iterator numberofprojectScore = numberofProjectscore.iterator()
		while (numberofprojectScore.hasNext()) {
			String projectScore = numberofprojectScore.next()
			println projectScore
		}
	}

	@Keyword
	public void submitFeedback(String sheetName , int rowNum) {
		/**********Project Details : Verify Add project is available on project dashboard*******************/
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/happy'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/okay'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/unhappy'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.setText(findTestObject('Page_Arc dashboard/Feedback/ProjectId'),projectId)
		WebUI.setText(findTestObject('Page_Arc dashboard/Feedback/textarea_feedback'),"submiting the survery feedback")
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/Submit'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/Feedback/span_Feedback Sent'),10)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void feedbackValidation(String sheetName , int rowNum) {
		/**********Verify project id should be filled by default and display based on selection of project*******************/
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		String userId =  WebUI.getAttribute(findTestObject('Page_Arc dashboard/Feedback/UserName'),'value')
		WebUI.verifyMatch(GlobalVariable.teamMemName,userId, false)

		String projectid = WebUI.getAttribute(findTestObject('Page_Arc dashboard/Feedback/ProjectId'),'value')
		WebUI.verifyMatch(projectId, projectid, false)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void feedbackBlankFieldTest(String sheetName , int rowNum) {
		/**********Verify project id should be filled by default and display based on selection of project*******************/
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.setText(findTestObject('Page_Arc dashboard/Feedback/ProjectId'),projectId)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/Submit'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		/************Verifying the blank value in the feedback *********************************************/
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/Feedback/span_Error Sending Feedback'),10)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
	}

	@Keyword
	public void feedbacInformativeFieldTest(String sheetName , int rowNum) {
		/**********Verify project id should be filled by default and display based on selection of project*******************/
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/happy'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/IinfoOkay'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/InfoUnhappy'))

		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/WellHappy'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/okay'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/Wellunhappy'))

		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/PerformanceHappy'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/PerformanceOkay'))
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/unhappy'))

		WebUI.setText(findTestObject('Page_Arc dashboard/Feedback/ProjectId'),projectId)
		WebUI.setText(findTestObject('Page_Arc dashboard/Feedback/textarea_feedback'),"submiting the survery feedback")
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/Submit'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('Page_Arc dashboard/Feedback/span_Feedback Sent'),10)
		WebUI.click(findTestObject('Page_Arc dashboard/Feedback/FeedBackButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void verifyBuildingPopup(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/Add_Project_Details/BuildingPop/yourBuildingScore'), 15)
		String popup = WebUI.getText(findTestObject('Object Repository/Add_Project_Details/BuildingPop/yourBuildingScore'))

		WebUI.verifyMatch(popup, "Your Building's Score", false)

		WebUI.click(findTestObject('PaymenntLocator/NextButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void verifyNavigationPopup(){
		String DataInput = WebUI.getText(findTestObject('Object Repository/Add_Project_Details/BuildingPop/DataInput'))
		WebUI.verifyMatch(DataInput, "Data Input", false)
	}
}
