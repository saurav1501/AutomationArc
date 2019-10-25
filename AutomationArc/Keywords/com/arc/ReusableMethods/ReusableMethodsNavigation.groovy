package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import io.qameta.allure.Step

public class ReusableMethodsNavigation {
	WebDriver driver=DriverFactory.getWebDriver()

	@Keyword
	public void navigateToBuilding() {
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'), 10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ My Buildings'))
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/span_My Buildings'))
		WebUI.verifyMatch(postNavigationLoginText,'My Buildings',true)
	}

	@Keyword
	public void clickAddProject() {
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/Add_Project_Details/button_ Add'), 3)
		WebUI.click(findTestObject('Object Repository/Add_Project_Details/button_ Add'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(2)
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/Add_Project_Details/h1_Project Registration'))
		WebUI.verifyMatch(postNavigationLoginText,'Project Registration',true)
	}

	@Keyword
	public void navigateToCities(){
		WebUI.delay(3)
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/a_ My Cities'),20)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ My Cities'))
		WebUI.delay(3)
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/span_My Cities'))
		WebUI.verifyMatch(postNavigationLoginText,'My Cities',false)
	}

	@Keyword
	public void navigateToCommunities(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ My Communities'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String postNavigationLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Communities'))
		WebUI.verifyMatch(postNavigationLoginText,'My Communities',false)
	}

	@Keyword
	public void navigateToParking(){
		WebUI.delay(3)
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'),10)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Page_Arc dashboard/a_ My Parking'))
		WebUI.delay(4)
		String postNavigationLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Parking'))
		WebUI.verifyMatch(postNavigationLoginText,'My Parking',false)
	}


	@Keyword
	public void navigateToPortfolio(){
		WebUI.delay(3)
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.delay(2)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'), 10)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/Common/a_ My Portfolios'))
		WebUI.click(findTestObject('Portfolio/Common/span_My Portfolios'))
		WebUI.delay(4)
		String postNavigationLoginText = WebUI.getText(findTestObject('Page_Arc dashboard/span_My Portfolios'))
		WebUI.verifyMatch(postNavigationLoginText,'My Portfolios',false)
	}

	//@Step("Type {user.name} / {user.password}.")
	@Keyword
	@Step
	public void navigateToBuildingTransit() {
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'), 10)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ My Transit'))
		//WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/i_fa fa-bars fa-lg'))

		print "Making Slider On"
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/span_My Transit'))
		WebUI.verifyMatch(postNavigationLoginText,'My Transit',true)
		WebUI.delay(5)
	}

	@Keyword
	public void navigateToTransitDataInput(){
		//WebUI.setViewPortSize(1500,800)
		WebUI.delay(3)
		/*WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		 WebUI.delay(2)*/
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))

	}

	@Keyword
	public void navigateToDataTransport(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}
	@Keyword
	public void navigateToDataAQI(){

		WebUI.delay(1)
		WebUI.click(findTestObject('Analytics/Gra/td_Air Quality Index'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.delay(6)
	}
	@Keyword
	public void navigateToDataCO(){

		WebUI.delay(1)
		WebUI.click(findTestObject('Analytics/Gra/td_Carbon Monoxide'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.delay(6)
	}

	@Keyword
	public void navigateToDataND(){
		WebUI.delay(1)
		WebUI.click(findTestObject('Analytics/Gra/td_Nitrogen Dioxide'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.delay(6)
	}
	@Keyword
	public void navigateToDataOS(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Analytics/Gra/td_Occupant Satisfaction Surve'),10)
		WebUI.click(findTestObject('Analytics/Gra/td_Occupant Satisfaction Surve'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}
	@Keyword
	public void navigateToDataOzone(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Analytics/Gra/td_Ozone'),10)
		WebUI.click(findTestObject('Analytics/Gra/td_Ozone'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}
	@Keyword
	public void navigateToDataPM10(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/td_PM10'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}
	@Keyword
	public void navigateToDataPM25(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/td_PM2.5'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}
	@Keyword
	public void navigateToDataRid(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/td_Ridership'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void navigateToDataSD(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/td_Sulfur Dioxide'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void navigateToDataInput(){
		WebUI.delay(1)
		WebUI.click(findTestObject('Analytics/Gra/td_Sulfur Dioxide'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Gra/span_Details'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}


	@Keyword
	public void ArcLogoNavigation() throws IOException, InterruptedException {
		/*******Verify clicking on the ARC LOGO takes you back to the ARC log-in page *************************/
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_appLogo'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		String Logintext = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/a_About'))
		WebUI.verifyMatch(Logintext,'ABOUT', false)
	}
	@Keyword
	public void ArclogoNavigation() throws IOException, InterruptedException {
		/*******Verify clicking on the ARC LOGO takes you back to the ARC log-in page *************************/
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/a_appLogo'))
		WebUI.delay(5)
		/*	String LogOut = WebUI.getText(findTestObject('DashboardNavigationNewUI/Dash/Logout'))
		 WebUI.verifyMatch(LogOut,'Logout', false)
		 WebUI.click(findTestObject('DashboardNavigationNewUI/Dash/Logout'))
		 */		
	}

	@Keyword
	public void navigateToManageSection(){
		WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait, FailureHandling.OPTIONAL)
	}


	@Keyword
	public void navigateToAnalyticsTotal() {
		WebUI.scrollToElement(findTestObject('Object Repository/Analytics/ClickOnAnalyticsTotal'),5)
		WebUI.click(findTestObject('Object Repository/Analytics/ClickOnAnalyticsTotal'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		boolean notTrue= WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		if(notTrue==false)
		{
			WebUI.refresh()
			WebUI.click(findTestObject('Object Repository/Analytics/ClickOnAnalyticsTotal'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		}
	}

	@Keyword
	public void navigateCreditAction(){
		/***Verify clicking on Credit/Actions shows All Actions , Prerequisites , Base Points , Data Inputs , My Actions and collapses to close the details**/

		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/DashboardPage/NavigationCreditAction/a_ All Actions'))
		String allAction = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/AllActions'))
		WebUI.verifyMatch(allAction,'All Actions',, false)

		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/a_ Prerequisites'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String Logintext = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/h1_Prerequisites'))
		WebUI.verifyMatch(Logintext,'Prerequisites', false)

		WebUI.scrollToElement(findTestObject('Object Repository/BasePoint/a_ Base Points (1)'), 10)
		WebUI.doubleClick(findTestObject('Object Repository/BasePoint/a_ Base Points (1)'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String basePoint = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/h1_Base Points'))
		WebUI.verifyMatch(basePoint,'Base Points', false)

		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String dataInput1 = WebUI.getText(findTestObject('DataInput/Data/span_Data Input'))
		WebUI.verifyMatch(dataInput1,'Data Input', false)

		WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/span_Meters  Surveys'), 40)
		WebUI.waitForElementVisible(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/span_Meters  Surveys'), 40)
		String dataInput = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/span_Meters  Surveys'))
		WebUI.verifyMatch(dataInput,'Meters & Surveys', false)


		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/a_ My Actions'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String myAction = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/NavigationCreditAction/h1_My Actions'))
		WebUI.verifyMatch(myAction,'My Actions', false)
	}

	@Keyword
	public void navigateToAnalyticsEnergy() {
		WebUI.waitForElementClickable(findTestObject('Analytics/Nav/a_ Energy'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Nav/a_ Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


	}
	@Keyword
	public void navigateToAnalyticsWater() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Analytics/Nav/a_ Water'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Analytics/Nav/a_ Water'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void navigateToAnalyticsWaste() {
		WebUI.waitForElementClickable(findTestObject('Analytics/Nav/a_ Waste'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Nav/a_ Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}

	@Keyword
	public void navigateToAnalyticstransport() {
		WebUI.waitForElementClickable(findTestObject('Analytics/Nav/a_ Transportation'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Nav/a_ Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}
	@Keyword
	public void navigateToAnalyticsHumExp() {
		WebUI.waitForElementClickable(findTestObject('Analytics/Nav/a_ Human Experience'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Analytics/Nav/a_ Human Experience'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}


	public void clickHiddenElement(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

	@Keyword
	public void clickOnSidebar(String suitId){
		if((suitId.contains("Cities")) || (suitId.contains("Com"))){
			//WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions'), FailureHandling.CONTINUE_ON_FAILURE)
			if((WebUI.getAttribute(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){

				println "credit action "
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			}
			if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Scores"
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//WebUI.delay(2)
			}
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			}
		}


		else if((suitId.contains("Building")) || (suitId.contains("BuildingOther")) || (suitId.contains("Transit")) || (suitId.contains("MySchools")) ) {
			//WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions'), FailureHandling.OPTIONAL)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			if((WebUI.getAttribute(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "credit action "
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions'))
			}
			if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){

				println WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score1'),"class")
				println "Scores"
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			}

			if((WebUI.getAttribute(findTestObject('Object Repository/Analytics/ClickOnAnalytics1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Analytics"
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/Analytics/ClickOnAnalytics'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			}


			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){

				println "Manage"
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			}
		}
	}


	//Individual Section Click operation


	public static void  clickScoreLabel(){
		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score1'), "aria-expanded", FailureHandling.OPTIONAL).equals("null"))){
			println "Scores"
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		}
	}

	public static void clickAnalyticsLabel(){
		if((WebUI.getAttribute(findTestObject('Object Repository/Analytics/ClickOnAnalytics1'), "aria-expanded", FailureHandling.OPTIONAL).equals("null"))){
			println "Analytics"
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/Analytics/ClickOnAnalytics'))
		}

	}

	public static void clickManageLabel(){
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "aria-expanded", FailureHandling.OPTIONAL).equals("null"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}
	}



	public static void closeFullAccessPopup(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/PayNowPopupTextVerification'),20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/payNowButton'),20)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/closeButtonPayNowPop'))
	}


	//verify if the Pay now popup is not present after the registration payment
	public static void verifyFullAccessPopupNotVisible(){
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/paymentPageNewUI/PayNowPopupTextVerification'), 2, FailureHandling.CONTINUE_ON_FAILURE)
		//	WebUI.verifyElementNotVisible(findTestObject('Object Repository/paymentPageNewUI/PayNowPopupTextVerification'), FailureHandling.)
	}


	@Keyword
	public static void payNow(){
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.scrollToElement(findTestObject('Manage/ProjectDetailVerification/a_ Manage'), 5)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'), 10)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'))
		WebUI.delay(5)
		String purhanse = WebUI.getText(findTestObject("Object Repository/paymentPageNewUI/Purchase"))
		WebUI.verifyMatch(purhanse,'Purchase', false)
	}

	@Keyword
	public void projectDashboardNavigationEndToEnd(){

		//WebUI.click(findTestObject('Object Repository/SubmitReview/a_ Review'))
		//closeFullAccessPopup()
		//WebUI.delay(2)
		/*WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreBasePoint'))
		 closeFullAccessPopup()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreEnergy'))
		 closeFullAccessPopup()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWater'))
		 closeFullAccessPopup()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWaste'))
		 closeFullAccessPopup()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreTransportation'))
		 closeFullAccessPopup()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreHumanExperience'))
		 closeFullAccessPopup()*/
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsTotal'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsEnergy'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsWater'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsWaste'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsTransportation'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsHumanExperience'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageTeam'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageTeam'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'))
		closeFullAccessPopup()
		WebUI.delay(2)
		/*WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageScoreVersion'), 4)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageScoreVersion'))
		 closeFullAccessPopup()*/

	}


	@Keyword
	public void projectDashboardNavigationEndToEndAfterPaymentBuildingTransit(){

		WebUI.click(findTestObject('Object Repository/SubmitReview/a_ Review'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreBasePoint'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreEnergy'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWater'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWaste'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreTransportation'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreHumanExperience'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsTotal'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsEnergy'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsWater'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsWaste'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsTransportation'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsHumanExperience'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageTeam'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageScoreVersion'))
		verifyFullAccessPopupNotVisible()
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/CreditFileupload/AllActions'))
		KeywordUtil.logInfo("All Action Button is Visible")
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/preRequisiteCreditAction'))
		KeywordUtil.logInfo("Pre Requisite Button is Visible")
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/basePointCreditAction'))
		KeywordUtil.logInfo("Base Point Button is Visible")
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/myActionCreditAction'))
		KeywordUtil.logInfo("My Action Button is Visible")
	}


	@Keyword
	public void projectDashboardNavigationEndToEndAfterPaymentBOtherNone(){


		//WebUI.click(findTestObject('Object Repository/SubmitReview/a_ Review'))
		//verifyFullAccessPopupNotVisible()
		//WebUI.delay(2)
		/*WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreBasePoint'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreEnergy'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWater'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWaste'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreTransportation'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreHumanExperience'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)*/
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsTotal'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsEnergy'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsWater'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsWaste'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsTransportation'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/analyticsHumanExperience'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageTeam'), 5)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageTeam'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'), 5)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'), 5)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'), 5)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'), 5)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/Add_Project_Details/a_Projects'))
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'), 4)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		/*WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageScoreVersion'), 4)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageScoreVersion'))
		 verifyFullAccessPopupNotVisible()
		 */
	}

	@Keyword
	public void projectDashboardNavigationCityCommEndToEnd(){


		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		String dataInputText=WebUI.getText(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'))
		WebUI.verifyMatch(dataInputText,"Data Input", false)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.click(findTestObject('Object Repository/SubmitReview/a_ Review'))
		//closeFullAccessPopup()
		//WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'), 3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'),GlobalVariable.minAngularWait )
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'), 3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'),GlobalVariable.minAngularWait )
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'), 3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'),GlobalVariable.minAngularWait )
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'), 3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'),GlobalVariable.minAngularWait )
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'))
		closeFullAccessPopup()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'), 3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'))
		closeFullAccessPopup()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}



	@Keyword
	public void projectDashboardNavigationAfterPaymentCityCommEndToEnd(){

		//WebUI.click(findTestObject('Object Repository/Add_Project_Details/a_Projects'))
		/*WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		 String dataInputText=WebUI.getText(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'))
		 WebUI.verifyMatch(dataInputText,"Data Input", false)
		 WebUI.click(findTestObject('Object Repository/dataInputNewUI/wasteCityComm'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		 WebUI.click(findTestObject('Object Repository/dataInputNewUI/transportationCityComm'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		 WebUI.click(findTestObject('Object Repository/dataInputNewUI/humanExpCityComm'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		 WebUI.click(findTestObject('Object Repository/dataInputNewUI/additionalDataCityComm'))
		 verifyFullAccessPopupNotVisible()*/
		//WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/SubmitReview/a_ Review'))
		//WebUI.waitForElementClickable(findTestObject('SubmitReview/button_Continue'),15)
		//WebUI.delay(7)
		//verifyFullAccessPopupNotVisible()
		//WebUI.delay(2)
		/*WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreBasePoint'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreEnergy'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWater'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreWaste'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreTransportation'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/scoreHumanExperience'))
		 verifyFullAccessPopupNotVisible()
		 WebUI.delay(2)*/
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'), 3)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageCertification'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'), 3)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageApps'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'), 3)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageBilling'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'), 3)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageAgreement'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'), 3)
		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageSettings'))
		verifyFullAccessPopupNotVisible()
		WebUI.delay(2)
		/*WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageScoreVersion'))
		 verifyFullAccessPopupNotVisible()*/
	}

	public void navigateIntoDataInput(){
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/a_ Data Input'),GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),GlobalVariable.minAngularWait)

		boolean notvisiable = WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'),GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)

		if(notvisiable==false){
			WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'),GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)

		}
		notvisiable = WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'),2,FailureHandling.OPTIONAL)
		if(notvisiable==false){
			WebUI.refresh()
			WebUI.delay(10)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),GlobalVariable.minAngularWait)
			WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'),GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		}

	}

	@Keyword
	public void verifyViewAppNavigatesToAppsSection(){
		navigateIntoDataInput()
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/ViewAppLinkWasteMeter'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/ViewAppLinkWasteMeter'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/EnergyStartAppVerification'), GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/EnergyStartAppVerification'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/EnergyStartAppVerification')), "Energy Star Portfolio Manager", false)


	}


}
