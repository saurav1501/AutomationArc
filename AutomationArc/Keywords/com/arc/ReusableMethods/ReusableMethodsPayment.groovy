package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.ThreadLocalRandom

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ReusableMethodsPayment extends BaseClass{
	ReusableMethodsSubmitReview submitReviewObj = new ReusableMethodsSubmitReview()
	ReusableMethodsSearch reusableMethodsSearch = new ReusableMethodsSearch()
	WebDriver driver = DriverFactory.getWebDriver()
	//select for the project trial
	@Keyword
	public void selectTrial(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'), 20)
		String projectSetUpText= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch("Project Setup", projectSetUpText, false)
		String daysForFreeTrialText= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/90DaysTrialText'))
		WebUI.verifyMatch("90 Days", daysForFreeTrialText, false)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/freeTrialButtonPaymentPage'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/introTooltipProjectDashboard'), 20)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/navigateToProjectButtonDashBoard'))
		WebUI.delay(3)
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/PayNowPopupTextVerification'),20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'),20)
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/closeButtonPayNowPop'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Add_Project_Details/a_Projects'))

	}

	//select to pay the registration fee of the project registered
	@Keyword
	public void selectPayNow(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'), 20, FailureHandling.CONTINUE_ON_FAILURE)
		String projectSetUpText= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch("Project Setup", projectSetUpText, false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	public static void noOfYearSubscribed(int yearOfSubscription){
		//************* Select the yearly subscription *****************//
		if(yearOfSubscription==1)
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/oneYearSubscription'))
		else if(yearOfSubscription==2)
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/twoYearSubscription'))
		else if(yearOfSubscription==3)
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/threeYearSubscription'))
		else if(yearOfSubscription==4)
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/fourYearSubscription'))
		else if(yearOfSubscription==5)
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/fiveYearSubscription'))
	}

	@Keyword
	public void paymentPageBuildingOtherNoneDetails(String sheetName , int rowNum, int yearOfSubscription){

		int counter=0
		payment:

		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/spaceType'))
		List<WebElement> list= driver.findElements(By.xpath("//*[@ng-repeat='type in spaceType']"))
		int size = list.size()
		int randonNumber = ThreadLocalRandom.current().nextInt(0, size)
		println list.get(randonNumber).getText()
		data.setCellData(sheetName, "SpaceType", rowNum ,list.get(randonNumber).getText())
		WebUI.delay(3)
		list.get(randonNumber).click()
		if((list.get(randonNumber).getText()=="Industrial Manufacturing") || (list.get(randonNumber).getText()=="Laboratory") || (list.get(randonNumber).getText()=="Data Center") ||
		(list.get(randonNumber).getText()=="Warehouse: Nonrefrigerated Distribution/Shipping") || (list.get(randonNumber).getText()=="Warehouse: Refrigerated")|| (list.get(randonNumber).getText()=="Warehouse: Self Storage Units") ||
		(list.get(randonNumber).getText()=="Warehouse: General")){
			uniqueSpaceTypesFlag=true
		}
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/ownerType'))
		List<WebElement> list1= driver.findElements(By.xpath("//*[@ng-repeat='type in ownerType']"))
		int size1 = list1.size()
		int randonNumber1 = ThreadLocalRandom.current().nextInt(0, size1)
		println list1.get(randonNumber1).getText()
		list1.get(randonNumber1).click()
		data.setCellData(sheetName, "OwnerType", rowNum,list1.get(randonNumber1).getText())
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/organization'),ownerOrg)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/organization'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Add_Project_Details/span_Habitat for Humanity'))
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/ownerEmail'), ownerMail)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ownerCountry'), ownerCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'), prjRating , false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait, FailureHandling.OPTIONAL)
		WebUI.waitForElementClickable(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'), GlobalVariable.maxAngularWait, FailureHandling.OPTIONAL)

		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String[] arc=title.split("/");
		Project_ID_Promocode= arc[4]
		println Project_ID_Promocode
		if(WebUI.waitForElementPresent(findTestObject('Object Repository/paymentPageNewUI/oneYearSubscription'),10, FailureHandling.OPTIONAL) && WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/oneYearSubscription'), 10, FailureHandling.OPTIONAL) ){
			Project_ID_Created=arc[4]
			//************* Select the yearly subscription *****************//
			if(yearOfSubscription==1)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/oneYearSubscription'))
			else if(yearOfSubscription==2)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/twoYearSubscription'))
			else if(yearOfSubscription==3)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/threeYearSubscription'))
			else if(yearOfSubscription==4)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/fourYearSubscription'))
			else if(yearOfSubscription==5)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/fiveYearSubscription'))
			WebUI.delay(10)
			data.setCellData(sheetName,"ProjectID", rowNum, Project_ID_Promocode)
			SAPSyncFlag=true
		}
		else{
			counter++
			if(counter==3){
				KeywordUtil.markFailed("Project ID Not Created (SAP not Synched)")
				return
			}
			WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			reusableMethodsSearch.searchProgram(sheetName,rowNum)
			if(WebUI.waitForElementPresent(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'), 10, FailureHandling.OPTIONAL)){
				WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'), GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'))
				WebUI.waitForElementPresent(findTestObject("Object Repository/paymentPageNewUI/Purchase"), GlobalVariable.minAngularWait)
				String purhanse = WebUI.getText(findTestObject("Object Repository/paymentPageNewUI/Purchase"))
				WebUI.verifyMatch(purhanse,'Purchase', false)
			}
			else{
				selectPayNow()
			}
			continue payment
		}
	}


	@Keyword
	public void paymentPageBuildingCityDetails(String sheetName , int rowNum){

		int counter=0
		payment:

		String prjRating = data.getCellData(sheetName, "RatingSystem", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_LEED for CitiesOtherNon'), prjRating , false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'),GlobalVariable.maxAngularWait, FailureHandling.OPTIONAL )
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String[] arc=title.split("/");
		String Project_ID= arc[4]
		println Project_ID
		if(Project_ID.charAt(0)=='1'){
			Project_ID_Created=arc[4]
			data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
			KeywordUtil.markWarning("Project ID : " +Project_ID )
			KeywordUtil.markPassed("Project ID Created (SAP Synched)")
			SAPSyncFlag=true
		}
		else{
			counter++
			if(counter==3){
				KeywordUtil.markFailed("Project ID Not Created (SAP not Synched)")
				SAPSyncFlag=false
				return
			}
			WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			reusableMethodsSearch.searchProgram(sheetName,rowNum)
			if(WebUI.waitForElementPresent(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'), 10)){
				WebUI.waitForElementPresent(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'), GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'))
				WebUI.waitForElementPresent(findTestObject("Object Repository/paymentPageNewUI/Purchase"), GlobalVariable.minAngularWait)
				String purhanse = WebUI.getText(findTestObject("Object Repository/paymentPageNewUI/Purchase"))
				WebUI.verifyMatch(purhanse,'Purchase', false)
			}
			else{
				selectPayNow()
			}
			continue payment
		}
	}

	@Keyword
	public void paymentPageCityratingSystemDetails(String sheetName , int rowNum){

		String prjRating = data.getCellData(sheetName, "RatingSystem", rowNum)
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_LEED for CitiesOtherNon'), prjRating , false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'),10)
		boolean notEditable = WebUI.setText(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_LEED for CitiesOtherNon'),'None', FailureHandling.OPTIONAL)
		println ("DEBUG boolean value "+notEditable)
		println ("Existing Rating System " +prjRating)
		/*WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_LEED for CitiesOtherNon'), prjRating, false, rowNum)
		 WebUI.selectOptionByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_LEED for CitiesOtherNon'),'Other' , false)
		 WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		 WebUI.delay(4)
		 WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/DashboardNavigationNewUI/Dash/select_LEED for CitiesOtherNon'), prjRating, false, rowNum)
		 */
	}

	@Keyword
	public void navigationTrial(String sheetName , int rowNum){

		WebUI.click(findTestObject('Page_Arc dashboard/Back'))
		WebUI.delay(5)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'), 20)
		String projectSetUpText= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch("Project Setup", projectSetUpText, false)
		String daysForFreeTrialText= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/90DaysTrialText'))
		WebUI.verifyMatch("90 Days", daysForFreeTrialText, false)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/freeTrialButtonPaymentPage'))
		WebUI.delay(15)
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/introTooltipProjectDashboard'), 20)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/navigateToProjectButtonDashBoard'))
		WebUI.delay(15)

		WebUI.waitForElementClickable(findTestObject('Add_Project_Details/PayNow'), 6)
		WebUI.click(findTestObject('Add_Project_Details/PayNow'))
		WebUI.delay(8)

		String purhanse = WebUI.getText(findTestObject("Object Repository/paymentPageNewUI/Purchase"))
		WebUI.verifyMatch(purhanse,'Purchase', false)



	}

	@Keyword
	public void invalidcreditCardValidation(String sheetName , int rowNum){
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton'),20)
		WebUI.delay(5)

	}



	@Keyword
	public void paymentPageCommunityDetails(String sheetName , int rowNum){

		int counter=0
		payment:

		String prjRating = data.getCellData(sheetName, "RatingSystem", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)
		WebUI.selectOptionByLabel(findTestObject('DashboardNavigationNewUI/Dash/select_LEED for CommunitiesOth'), prjRating , false)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'), GlobalVariable.avgAngularWait )
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String[] arc=title.split("/");
		String Project_ID= arc[4]
		println Project_ID
		if(Project_ID.charAt(0)=='1'){
			Project_ID_Created=arc[4]
			data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
			KeywordUtil.markWarning("Project ID : " +Project_ID )
			KeywordUtil.markPassed("Project ID Created (SAP Synched)")
			SAPSyncFlag=true
		}
		else{
			counter++
			if(counter==3){
				KeywordUtil.markFailed("Project ID Not Created (SAP not Synched)")
				SAPSyncFlag=false
				return
			}
			WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			reusableMethodsSearch.searchProgram(sheetName,rowNum)
			selectPayNow()
			continue payment
		}
	}

	@Keyword
	public void paymentPageBuildingTrasit(String sheetName , int rowNum){

		int counter=0
		payment:
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType    = data.getCellData(sheetName, "SpaceType", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/spaceType'))
		List<WebElement> list= driver.findElements(By.xpath("//*[@ng-repeat='type in spaceType']"))
		int size = list.size()
		int randonNumber = ThreadLocalRandom.current().nextInt(0, size)
		println list.get(randonNumber).getText()
		data.setCellData(sheetName, "SpaceType", rowNum,list.get(randonNumber).getText())
		list.get(randonNumber).click()
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)
		String stype=list.get(randonNumber).getText()

		if((stype.equals("Industrial Manufacturing")) || (stype.equals("Laboratory")) || (stype.equals("Data Center")) ||
		(stype.equals("Warehouse: Nonrefrigerated Distribution/Shipping")) || (stype.equals("Warehouse: Refrigerated"))|| (stype.equals("Warehouse: Self Storage Units")) ||
		(stype.equals("Warehouse: General"))){
			uniqueSpaceTypesFlag=true
		}
		println uniqueSpaceTypesFlag
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/ownerType'))
		List<WebElement> list1= driver.findElements(By.xpath("//*[@ng-repeat='type in ownerType']"))
		int size1 = list1.size()
		int randonNumber1 = ThreadLocalRandom.current().nextInt(0, size1)
		println list1.get(randonNumber1).getText()
		list1.get(randonNumber1).click()
		data.setCellData(sheetName, "OwnerType", rowNum,list1.get(randonNumber1).getText())
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/organization'),ownerOrg)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/organization'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('Add_Project_Details/span_Habitat for Humanity'), 60)
		WebUI.click(findTestObject('Add_Project_Details/span_Habitat for Humanity'))
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/ownerEmail'), ownerMail)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ownerCountry'), ownerCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'), prjRating , false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait,FailureHandling.OPTIONAL)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait, FailureHandling.OPTIONAL)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String[] arc=title.split("/");
		String Project_ID= arc[4]
		println Project_ID
		if(Project_ID.charAt(0)=='1'){
			Project_ID_Created=arc[4]
			data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
			KeywordUtil.markWarning("Project ID : " +Project_ID )
			KeywordUtil.markPassed("Project ID Created (SAP Synched)")
			SAPSyncFlag=true
		}
		else{
			counter++
			if(counter==3){
				KeywordUtil.markFailed("Project ID Not Created (SAP not Synched)")
				SAPSyncFlag=false
				return
			}
			WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			reusableMethodsSearch.searchProgram(sheetName,rowNum)
			selectPayNow()
			continue payment
		}

	}


	@Keyword
	public void paymentPageBillingDetailsIndiaProject(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		String cardName   = data.getCellData(sheetName, "CardName", rowNum)
		String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
		String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
		String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String phone      = data.getCellData(sheetName, "Mobile", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/billingName'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , false)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )

	}


	@Keyword
	public void paymentRegistration(String sheetName , int rowNum, String paymentMode){
		/********************Fetching the data via Excel Sheet ******************************/
		if(SAPSyncFlag){

			int counter=0
			payment:
			String cardName   = data.getCellData(sheetName, "CardName", rowNum)
			String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
			String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
			String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
			String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
			String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
			String address    = data.getCellData(sheetName, "Address", rowNum)
			String city       = data.getCellData(sheetName, "City", rowNum)
			String country    = data.getCellData(sheetName, "Country", rowNum)
			String state      = data.getCellData(sheetName, "State", rowNum)
			String zip        = data.getCellData(sheetName, "Zip", rowNum)
			String phone      = data.getCellData(sheetName, "Mobile", rowNum)

			WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
			WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
			WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
			WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
			WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
			WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
			WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
			WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , false)
			WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
			WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )
			//*********************** Select the payment mode *******************//
			if((paymentMode.equalsIgnoreCase("creditCard"))){

				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayNowOption'))

				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

				WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/CardNumber'),cardNum)
				WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/ccExpiary'),cardDate)
				WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/cvvCreditCard'),cardCvv)
				//promocode field in case if used
				//WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/promoCode'),promocode)
				//WebUI.delay(3)

				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			}
			else{
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayByCheckOption'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			}
			//WebUI.delay(30)
			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			if((uniqueSpaceTypesFlag==true)){
				println "Space type matched"
				WebUI.waitForElementVisible(findTestObject('Object Repository/PayNowRegistrationPaymentUSTest/RegistrationPaymentConfirmationPopCloseButton'), 70)
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.click(findTestObject('Object Repository/PayNowRegistrationPaymentUSTest/RegistrationPaymentConfirmationPopCloseButton'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
				uniqueSpaceTypesFlag=false
			}
			else{
				println "Space type not matched"
				uniqueSpaceTypesFlag=false
			}
			//WebUI.delay(10)

			if(WebUI.waitForElementPresent(findTestObject('PaymenntLocator/NextButton'), GlobalVariable.avgAngularWait, FailureHandling.OPTIONAL) && WebUI.waitForElementVisible(findTestObject('PaymenntLocator/NextButton'), GlobalVariable.avgAngularWait, FailureHandling.OPTIONAL)){
				WebUI.click(findTestObject('PaymenntLocator/NextButton'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait,FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait, FailureHandling.CONTINUE_ON_FAILURE)
				KeywordUtil.markPassed("Project Created Successfully")
			}
			else{
				counter++
				if(counter==3){
					KeywordUtil.markFailed("Project Payment Unsuccessful")
					return
				}
				WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				reusableMethodsSearch.searchProgram(Project_ID_Created)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				continue payment
			}

		}
		else{
			KeywordUtil.markFailed("Project ID Not Created (SAP not Synched)")
		}
	}

	@Keyword
	public void regPaymentUsingPromocode(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		String regPromocode   = data.getCellData(sheetName, "RegPromocode", rowNum)
		String discRegPrice    = data.getCellData(sheetName, "DisRegPrice", rowNum)
		String regdAmount    = data.getCellData(sheetName, "RegAmount", rowNum)
		String amountDiscounted    = data.getCellData(sheetName, "DiscountedAmountRegd", rowNum)

		WebUI.sendKeys(findTestObject('Object Repository/PaymenntLocator/InputPromocode'), regPromocode)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickToApplyPromocode'))
		WebUI.delay(8)
		String subTotalAmount= WebUI.getText(findTestObject('Object Repository/PaymenntLocator/SubTotalRegdAmount'))
		WebUI.verifyEqual(regdAmount + " for 5 years", subTotalAmount )
		String discAmount= WebUI.getText(findTestObject('Object Repository/PaymenntLocator/AmountDiscountedRegd'))
		WebUI.verifyEqual(amountDiscounted, discAmount )
		String discPrice= WebUI.getText(findTestObject('PaymenntLocator/DiscountedPriceRegd'))
		WebUI.verifyEqual(discRegPrice, discPrice)
	}

	@Keyword
	public void invalidCardDetais(String sheetName , int rowNum, String paymentMode){
		/********************Fetching the data via Excel Sheet ******************************/
		String cardName   = data.getCellData(sheetName, "CardName", rowNum)
		String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
		String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
		String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String phone      = data.getCellData(sheetName, "Mobile", rowNum)

		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , false)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )

		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayNowOption'))
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/CardNumber'),'4012000010000135013')
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/ccExpiary'),cardDate)
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/cvvCreditCard'),cardCvv)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))

		WebUI.delay(15)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/CardNumber'))
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/CardNumber'),cardNum)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
		WebUI.delay(15)
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/NextButton'))


	}


	@Keyword
	public void reviewPaymentUsingPromocode(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		String reviewPromocode   = data.getCellData(sheetName, "RevPromocode", rowNum)
		String discReviewPrice   = data.getCellData(sheetName, "DisReviewPrice", rowNum)
		String reviewAmount      = data.getCellData(sheetName, "ReviewAmount", rowNum)
		String discountedAmount  = data.getCellData(sheetName, "DiscountedAmountReview", rowNum)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/PaymenntLocator/InputPromocodeReview'), reviewPromocode)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickToApplyPromocode'))
		WebUI.delay(5)
		String discAmountReview= WebUI.getText(findTestObject('Object Repository/PaymenntLocator/DiscountedAmountReiew'))
		WebUI.verifyEqual(discountedAmount , discAmountReview)
		String subTotal= WebUI.getText(findTestObject('Object Repository/PaymenntLocator/SubTotalReviewAmount'))
		WebUI.verifyEqual(reviewAmount, subTotal)
		String discPriceReview= WebUI.getText(findTestObject('Object Repository/PaymenntLocator/DiscountedPriceReview'))
		WebUI.verifyEqual(discReviewPrice, discPriceReview)
	}

	@Keyword
	public void regPaymentByCheckIND(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		String cardName   = data.getCellData(sheetName, "CardName", rowNum)
		String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
		String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
		String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String phone      = data.getCellData(sheetName, "Mobile", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/billingName'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , false)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )
		WebUI.waitForElementClickable(findTestObject('Object Repository/paymentPageNewUI/submitPayment'), 10)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/ContinueButtonIndiaPaymentPopUp'), 10)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/ContinueButtonIndiaPaymentPopUp'))
		WebUI.delay(20)
		if((uniqueSpaceTypesFlag==true)){
			println "Space type matched"
			WebUI.waitForElementVisible(findTestObject('Object Repository/PayNowRegistrationPaymentUSTest/RegistrationPaymentConfirmationPopCloseButton'), 70)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/PayNowRegistrationPaymentUSTest/RegistrationPaymentConfirmationPopCloseButton'))
			uniqueSpaceTypesFlag=false
		}
		else{
			println "Space type not matched"
			uniqueSpaceTypesFlag=false
		}
		WebUI.waitForElementVisible(findTestObject('PaymenntLocator/NextButton'), 40)
		WebUI.click(findTestObject('PaymenntLocator/NextButton'))
		WebUI.delay(5)


	}

	@Keyword
	public void regPaymentByCheckINT(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/CheckRadio'))
		WebUI.delay(2)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
		Assert.assertEquals(WebUI.verifyElementClickable(findTestObject('PaymenntLocator/PromoCodeTextfieldRegPayment')),true)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_party_name'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_party_name'),partyName)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_email'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_email'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_street'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_street'), address)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_city'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_city'), city)
		WebUI.selectOptionByLabel(findTestObject('PaymenntLocator/Country'), country, false)
		WebUI.selectOptionByLabel(findTestObject('PaymenntLocator/Select_State'),state , false)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_zip_code'),zip )
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/button_Next'))
		WebUI.delay(15)
		Boolean testCongratulations = WebUI.verifyTextPresent('Congratulations', false)
		Assert.assertTrue(testCongratulations)
		WebUI.click(findTestObject('PaymenntLocator/NextButton'))

	}
	@Keyword
	public void regPaymentByCheckCN(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(4)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_party_name'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_party_name'),partyName)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_email'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_email'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_street'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_street'), address)
		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_city'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_city'), city)
		WebUI.selectOptionByLabel(findTestObject('PaymenntLocator/Country'), country, false)
		WebUI.selectOptionByLabel(findTestObject('PaymenntLocator/Select_State'),state , false)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_zip_code'),zip )
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/button_Next'))
		WebUI.delay(15)
		Boolean testCongratulations = WebUI.verifyTextPresent('Congratulations', false)
		Assert.assertTrue(testCongratulations)
	}

	@Keyword
	public void payNowRegistrationPaymentIND(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(3)
		//WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_ Manage'))
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}
		WebUI.scrollToElement(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'), 2)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'))
		WebUI.waitForElementVisible(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'), 10)
		WebUI.verifyElementPresent(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'), 5)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'))
		WebUI.switchToWindowTitle('')
		//WebUI.switchToWindowIndex(1)
		WebUI.delay(3)
		WebUI.setText(findTestObject('PayNowRegistrationPaymentIN/input_phone'), '9486861522')
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/button_Continue'))
		WebUI.delay(5)
		WebUI.selectOptionByValue(findTestObject('PayNowRegistrationPaymentIN/select_Select Bank'), 'AvenuesTest', true)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_Make Payment'))
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/returnToMerchantSite'))
		WebUI.switchToWindowTitle('Arc dashboard')
		WebUI.delay(8)
		WebUI.waitForElementPresent(findTestObject('PayNowRegistrationPaymentIN/checkStatusCompleted'), 20)
		WebUI.waitForElementVisible(findTestObject('PayNowRegistrationPaymentIN/checkStatusCompleted'), 20)
		Assert.assertEquals(WebUI.getText(findTestObject('PayNowRegistrationPaymentIN/checkStatusCompleted')),'Completed')

	}
	@Keyword
	public void verifyNavigationPageFrize(){
		/*WebUI.click(findTestObject('DashboardNavigationNewUI/payment/Cancel'))
		 WebUI.delay(5)*/
		WebUI.click(findTestObject('DashboardNavigationNewUI/payment/FirstProjectScore'))
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/a_ Data Input'),5, FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void payNowSubmitReviewPaymentIND(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(1)
		//WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_ Manage'))
		WebUI.delay(3)
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}
		WebUI.scrollToElement(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'), 2)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'))
		WebUI.delay(4)
		WebUI.verifyElementPresent(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'), 10)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'))
		WebUI.switchToWindowTitle('')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentIN/input_phone'), '9486861522')
		WebUI.delay(3)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/button_Continue'))
		WebUI.delay(5)
		WebUI.selectOptionByValue(findTestObject('PayNowRegistrationPaymentIN/select_Select Bank'), 'AvenuesTest', true)
		WebUI.delay(2)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_Make Payment'))
		WebUI.delay(3)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/returnToMerchantSite'))
		WebUI.switchToWindowTitle('Arc dashboard')
		WebUI.delay(10)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/PayNowSubmitReviewPaymentIN/submitReviewPaymentStatus')),'Completed')
	}


	@Keyword
	public void payNowRegistrationPaymentINT(){

		WebUI.scrollToElement(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'), 2)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'))
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_firstname'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_firstname'), 'Saurav')
		WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_lastname'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_lastname'), 'K')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_cardnumber'), '4012000010000')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_CC_expiry'), '02/2025')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_CC_number'), '999')
		//WebUI.click(findTestObject('PayNowRegistrationPaymentUSTest/div_Street Address  This field'))
		//WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_streetaddress'))
		WebUI.selectOptionByLabel(findTestObject('PayNowRegistrationPaymentUSTest/select_AfghanistanAland Island'), 'United States', false)
		WebUI.delay(3)
		WebUI.selectOptionByLabel(findTestObject('RegistrationPaymentCheck/select_Select StateAlabamaAlas'), 'Alabama', false)
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_streetaddress'), 'GBCI BUILDING')
		//WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_city'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_city'), 'Gurgaon')
		//WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_postalcode'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_postalcode'), '35006')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_phone'), '9486861522')
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('PayNowRegistrationPaymentUSTest/button_Pay now_1'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'), GlobalVariable.minAngularWait)

		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		Assert.assertEquals(regStatus, "Completed")
	}


	@Keyword
	public void payNowReviewPaymentUS(){
		WebUI.scrollToElement(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'), 2)
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/a_ Billing'))
		WebUI.click(findTestObject('PayNowRegistrationPaymentIN/button_Pay now'))
		WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_firstname'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_firstname'), 'Saurav')
		WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_lastname'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_lastname'), 'K')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_cardnumber'), '4012000010000')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_CC_expiry'), '02/2025')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_CC_number'), '999')
		//WebUI.click(findTestObject('PayNowRegistrationPaymentUSTest/div_Street Address  This field'))
		WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_streetaddress'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_streetaddress'), 'GBCI BUILDING')
		WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_city'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_city'), 'Gurgaon')
		WebUI.selectOptionByLabel(findTestObject('PayNowRegistrationPaymentUSTest/select_AfghanistanAland Island'), 'United States', false)
		WebUI.selectOptionByLabel(findTestObject('RegistrationPaymentCheck/select_Select StateAlabamaAlas'), 'Alabama', false)
		WebUI.clearText(findTestObject('PayNowRegistrationPaymentUSTest/input_postalcode'))
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_postalcode'), '35006')
		WebUI.setText(findTestObject('PayNowRegistrationPaymentUSTest/input_phone'), '9486861522')
		WebUI.delay(2)
		WebUI.click(findTestObject('PayNowRegistrationPaymentUSTest/button_Pay now_1'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/ReviewPaymentStatus'),10)
		WebUI.delay(10)
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/ReviewPaymentStatus'))
		Assert.assertEquals(regStatus, "Completed")
	}

	@Keyword
	public void clickCheckOptionRegistration(){

		WebUI.click(findTestObject('Object Repository/PaymenntLocator/SelectOptionCheck'))
	}

	@Keyword
	public void clickCheckOptionReview(){
		WebUI.delay(5)
		WebUI.click(findTestObject('ReviewPaymentByCheckUS/input_payment-type'))
	}


	@Keyword
	public void reviewPaymentByCheckINT(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Assert.assertEquals(WebUI.verifyElementClickable(findTestObject('Object Repository/SubmitReview/PromocodeTextFieldReviewPayment')),true)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/payment-typeCheck'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.clearText(findTestObject('ReviewPaymentByCheckUS/input_firstname2'))
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_firstname2'), 'Saurav')
		WebUI.clearText(findTestObject('ReviewPaymentByCheckUS/input_lastname2'))
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_lastname2'), 'K')
		WebUI.clearText(findTestObject('ReviewPaymentByCheckUS/input_streetaddress2'))
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_streetaddress2'), 'GBCI')
		WebUI.clearText(findTestObject('ReviewPaymentByCheckUS/input_city2'))
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_city2'), 'Gurgaon')
		WebUI.selectOptionByLabel(findTestObject('ReviewPaymentByCheckUS/select_AfghanistanAland Island'), 'India', false)
		WebUI.selectOptionByLabel(findTestObject('ReviewPaymentByCheckUS/select_Select StateAndaman and'), 'Haryana', false)
		WebUI.clearText(findTestObject('ReviewPaymentByCheckUS/input_postalcode2'))
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_postalcode2'), '122018')
		WebUI.clearText(findTestObject('ReviewPaymentByCheckUS/input_email2'))
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_email2'), 'saurav@groupten.com')
		WebUI.setText(findTestObject('ReviewPaymentByCheckUS/input_phone2'), '9486861522')
		WebUI.click(findTestObject('ReviewPaymentByCheckUS/button_Continue'))
	}





	@Keyword
	public void verifyCheckOptionHasPreFilledValueWithOptionToEnterphoneNo(String sheetName, rowNum){
		String firstName  = data.getCellData(sheetName, "CardName", rowNum)
		String lastName  = data.getCellData(sheetName, "CardLast", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)

		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review")
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('SubmitReview/button_Continue'), 20)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('SubmitReview/button_Continue'), 20)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/payment-typeCheck'))
		WebUI.delay(2)
		switch(country) {
			case 'India':
				country='IN'
				break
			case 'United States':
				country= 'US'
				break
		}

		switch(state) {
			case 'Virginia':
				state='string:VA'
				break
			case 'Indiana':
				state='string:IN'
				break
		}
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_firstname2'),'value'), firstName)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_lastname2'),'value'), lastName)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_streetaddress2'),'value'), address)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_city2'),'value'), city)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/select_AfghanistanAland Island'),'value'), country)
		println WebUI.getAttribute(findTestObject('Object Repository/RegistrationPaymentCheck/StatesReviewPayment'),'label')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/RegistrationPaymentCheck/StatesReviewPayment'),'value'), state)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_postalcode2'),'value'), zip)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_email2'),'value'), partyEmail)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_phone2'),'value'), '')
	}

	//validate if the credit card belongs to the correct service provider submit review
	@Keyword
	public void validateCreditCardSubmitReview(){
		//for visa card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/VisaCard'), 2), true)
		WebUI.setText(findTestObject('SubmitReview/input_cardnumber'), '4012000010000')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/VisaCard'), 2), true)
		println "Visa Card label is present"

		WebUI.delay(3)

		//for master card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/MasterCard'), 2), true)
		WebUI.setText(findTestObject('SubmitReview/input_cardnumber'), '5499740000000057')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/MasterCard'), 2), true)
		println "Master Card label is present"

		WebUI.delay(3)

		//for amex card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/AmexCard'), 2), true)
		WebUI.setText(findTestObject('SubmitReview/input_cardnumber'), '371449635392376')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/AmexCard'), 2), true)
		println "AMEX Card label is present"

		//for discover card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/DiscoverCard'), 2), true)
		WebUI.setText(findTestObject('SubmitReview/input_cardnumber'), '6011000990099818')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/DiscoverCard'), 2), true)
		println "Discover Card label is present"

	}


	//validate if the credit card belongs to the correct service provider registration payment
	@Keyword
	public void validateCreditCardRegistrationPayment(){
		//for visa card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/VisaCard'), 2), true)
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_CC_number'), '4012000010000')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/VisaCard'), 2), true)
		println "Visa Card label is present"

		WebUI.delay(3)

		//for master card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/MasterCard'), 2), true)
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_CC_number'), '5499740000000057')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/MasterCard'), 2), true)
		println "Master Card label is present"

		WebUI.delay(3)

		//for amex card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/AmexCard'), 2), true)
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_CC_number'), '371449635392376')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/AmexCard'), 2), true)
		println "AMEX Card label is present"

		WebUI.delay(3)

		//for discover card
		Assert.assertEquals(WebUI.verifyElementNotPresent(findTestObject('Object Repository/SubmitReview/DiscoverCard'), 2), true)
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_CC_number'), '6011000990099818')
		Assert.assertEquals(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/DiscoverCard'), 2), true)
		println "Discover Card label is present"
	}


	// verify if the element CC, CVV and Expiary date fields are enabled
	@Keyword
	public void verifyPaymentByCCHasCCExpiaryAndCVVEnabled(){
		Assert.assertTrue(WebUI.verifyElementClickable(findTestObject('SubmitReview/input_cardnumber')))
		Assert.assertTrue(WebUI.verifyElementClickable(findTestObject('SubmitReview/input_CC_expiry')))
		Assert.assertTrue(WebUI.verifyElementClickable(findTestObject('SubmitReview/input_CC_number')))
		println "Verify if the Payment by credit card has fields CC, CVV and Expiary date enabled"
	}


	@Keyword
	public void reviewPaymentByCheckIND(){

		WebUI.delay(5)
		Assert.assertEquals(WebUI.verifyElementClickable(findTestObject('Object Repository/SubmitReview/PromocodeTextFieldReviewPayment')),true)
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_firstname2'), 'Saurav')
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_lastname2'), 'K')
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_streetaddress2'), 'GBCI Gurgaon')
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_city2'), 'Gurgaon')
		WebUI.selectOptionByLabel(findTestObject('ReviewPaymentByCheckIND/select_Select StateAndaman and'), 'Haryana', false)
		WebUI.delay(3)
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_postalcode2'), '122018')
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_email2'), 'testuser@gmail.com')
		WebUI.setText(findTestObject('ReviewPaymentByCheckIND/input_phone2'), '9486861522')
		WebUI.click(findTestObject('ReviewPaymentByCheckIND/button_Continue'))
		WebUI.delay(3)
		WebUI.click(findTestObject('ReviewPaymentByCheckIND/button_Continue_1'))
		WebUI.delay(2)
	}

	@Keyword
	public void reviewPaymentByCreditcardINT(String sheetName, int rowNum){
		WebUI.delay(6)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.verifyElementClickable(findTestObject('Object Repository/SubmitReview/PromocodeTextFieldReviewPayment')),true)
		Assert.assertTrue(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/CreditCardOptionButton'), 2))
		Assert.assertTrue(WebUI.verifyElementPresent(findTestObject('Object Repository/SubmitReview/CheckOptionButton'), 2))
		WebUI.clearText(findTestObject('SubmitReview/input_firstname'))
		WebUI.setText(findTestObject('SubmitReview/input_firstname'), 'Saurav')
		WebUI.clearText(findTestObject('SubmitReview/input_lastname'))
		WebUI.setText(findTestObject('SubmitReview/input_lastname'), 'K')
		WebUI.setText(findTestObject('SubmitReview/input_cardnumber'), '4012000010000')
		WebUI.setText(findTestObject('SubmitReview/input_CC_expiry'), '09/2025')
		WebUI.setText(findTestObject('SubmitReview/input_CC_number'), '999')
		WebUI.clearText(findTestObject('SubmitReview/input_streetaddress'))
		WebUI.setText(findTestObject('SubmitReview/input_streetaddress'), address)
		WebUI.clearText(findTestObject('SubmitReview/input_city'))
		WebUI.setText(findTestObject('SubmitReview/input_city'), city)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/SubmitReview/ReviewPaymentSelectCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/SubmitReview/SelectStatesReviewPayment'), state, false)
		WebUI.clearText(findTestObject('Object Repository/SubmitReview/postalcode'))
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/postalcode'), zip)
		WebUI.setText(findTestObject('SubmitReview/input_email'), partyEmail)
		WebUI.setText(findTestObject('SubmitReview/input_phone'), '9486861522')
		WebUI.click(findTestObject('SubmitReview/span_Continue'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}



	@Keyword
	public void verifyPaymentByCCHasPreFilledDataWithOptionToFillPhoneNo(String sheetName, int rowNum){

		String firstName  = data.getCellData(sheetName, "CardName", rowNum)
		String lastName  = data.getCellData(sheetName, "CardLast", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)

		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review")
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('SubmitReview/button_Continue'), 20)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('SubmitReview/button_Continue'), 20)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		switch(country)
		{
			case 'India':
				country='IN'
				break
			case 'United States':
				country= 'US'
				break
		}

		switch(state)
		{
			case 'Virginia':
				state='string:VA'
				break

			case 'Indiana':
				state='string:IN'
				break
		}


		Assert.assertEquals(WebUI.getAttribute(findTestObject('SubmitReview/input_firstname'),'value'), firstName)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('SubmitReview/input_lastname'),'value'), lastName)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('SubmitReview/input_streetaddress'),'value'), address)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('SubmitReview/input_city'),'value'), city)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/ReviewPaymentSelectCountry'),'value'), country)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/RegistrationPaymentCheck/StatesReviewPayment'),'value'), state)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/postalcode'),'value'), zip)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('SubmitReview/input_email'),'value'), partyEmail)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('ReviewPaymentByCheckUS/input_phone2'),'value'), '')
	}

	//review payment cancel button navigates to selection page
	@Keyword
	public void verifyClickingReviewPaymentCancelNavigatesToSelectionPage(){
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/SubmitReview/CancelButtonReviewPayment'))
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SelectionPageTitle')),'Certification Type and Reporting Period')
	}

	//review payment submit section edit button navigates to payment page
	@Keyword
	public void verifyEditButtonAtSubmitSectionNavigatesToPaymentSection(){

		WebUI.click(findTestObject('Object Repository/SubmitReview/EditButtonSubmitPage'))
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/PaymentPageVerifyText')), 'Enter Payment Information')
	}


	//verify submit page frequency details
	@Keyword
	public void validateDetailsAtSubmitSectionPaymentReview(String sheetName, int rowNum ){

		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)

		/*switch(country)
		 {
		 case 'IN':
		 country='India'
		 break
		 case 'US':
		 country= 'United States'
		 break
		 }*/

		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/Frequency')),'One-time payment of '+submitReviewObj.reviewAmount.replaceAll("\\s",""))
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/Address')), address+", "+city)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/StateAndPinCode')), state+" "+zip)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/Country')), country)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/EmailId')), partyEmail)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/MobileNo')),'9486861522' )
	}


	//edit payment details and verify if the changes reflects
	@Keyword
	public void editSubmitReviewPaymentDetails(){

		WebUI.clearText(findTestObject('SubmitReview/input_streetaddress'))
		WebUI.setText(findTestObject('SubmitReview/input_streetaddress'), 'GBCI')
		WebUI.clearText(findTestObject('SubmitReview/input_city'))
		WebUI.setText(findTestObject('SubmitReview/input_city'), 'gurgaon')
		WebUI.selectOptionByLabel(findTestObject('Object Repository/SubmitReview/ReviewPaymentSelectCountry'), 'India', false)
		WebUI.selectOptionByLabel(findTestObject('SubmitReview/select_Select StateAndaman and'), 'Haryana', false)
		WebUI.clearText(findTestObject('Object Repository/SubmitReview/postalcode'))
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/postalcode'), '122018')
		WebUI.setText(findTestObject('SubmitReview/input_email'), 'abhishekkumar@groupten.com')
		WebUI.setText(findTestObject('SubmitReview/input_phone'), '9486861520')
		WebUI.click(findTestObject('SubmitReview/span_Continue'))
		WebUI.delay(8)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/Address')), 'GBCI, gurgaon')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/StateAndPinCode')), 'Haryana'+" "+'122018')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/Country')), 'India')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/EmailId')), 'abhishekkumar@groupten.com')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitSection/MobileNo')),'9486861520' )
	}



	@Keyword
	public void paymentPageFieldDetailsVerification() {
		WebUI.delay(1)
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/span_Credit card'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/span_Check'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Name on Card'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Credit Card Number'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/span_Credit card'))

		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Expiration Date'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_CVV'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Bill-to-party name'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Bill-to-party email'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Address 1'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Address 2'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_City'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_CountryRegion'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_State'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/label_Zip Code'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/span_Credit card'))
		WebUI.verifyElementVisible(findTestObject('PaymenntLocator/DashbordPayment/span_Credit card'))

		WebUI.verifyImagePresent(findTestObject('PaymenntLocator/DashbordPayment/img_card_img amex'))
		WebUI.verifyImagePresent(findTestObject('PaymenntLocator/DashbordPayment/img_card_img discover'))
		WebUI.verifyImagePresent(findTestObject('PaymenntLocator/DashbordPayment/img_card_img mastercard'))
		WebUI.verifyImagePresent(findTestObject('PaymenntLocator/PaymenntLocator/DashbordPayment/img_card_img visa'))
	}

	@Keyword
	public void paymentPageProjectDetailsVerification(String sheetName , int rowNum ,String prjRating ,String member) {
		/*Verify if the project details are appearing correctly on the right side with ( Project ID , Name , Rating system) for Buildings - LEED V4 O+M: EB (WP), City- , Community - Transit - , Parksmart */

		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		String projectName = data.getCellData(sheetName,"ProjectName",rowNum)

		String regPriceNonMem = data.getCellData(sheetName,"RegAmount",rowNum)

		String regPriceNonmem = regPriceNonMem.concat(" for 5 years")
		//	println regPriceNonmem

		/*	String projectIDUI = WebUI.getText(findTestObject('PaymenntLocator/projectDetails/ProjectNameID'))
		 WebUI.verifyMatch(projectIDUI,projectId, false)
		 String projectNameUI= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/ProjectName'))
		 WebUI.verifyMatch(projectNameUI,projectName, false)
		 String ratingSystem= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/RatingSystem'))
		 WebUI.verifyMatch(prjRating,ratingSystem, false)
		 */
		String toregPrince= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/TotalRegPrice'))
		WebUI.verifyMatch(toregPrince,'$1,500.00', false)

		//String memberUI= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/USGBCMember'))
		//WebUI.verifyMatch(memberUI,member, false)

	}


	@Keyword
	public void paymentPageprojectFeeNavigation() {
		/*Verify the link to view certification fees and member discount and when clicked takes you to http://www.usgbc.org/cert-guide/fees */
		WebUI.click(findTestObject('PaymenntLocator/projectDetails/a_View certification fees and'))
		WebUI.delay(15)
		WebUI.switchToWindowIndex(1)
		String usgbcregPaymentPage = WebUI.getText(findTestObject('PaymenntLocator/projectDetails/h2_LEED Certification Fees'))
		Assert.assertEquals(usgbcregPaymentPage,"LEED Certification Fees")
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	@Keyword
	public void paymentPageProjectDetailsVerificationparking(String sheetName , int rowNum ,String prjRating ,String member) {
		/*Verify if the project details are appearing correctly on the right side with ( Project ID , Name , Rating system) for Buildings - LEED V4 O+M: EB (WP), City- , Community - Transit - , Parksmart */

		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		String projectName = data.getCellData(sheetName,"ProjectName",rowNum)

		String regPriceNonMem = data.getCellData(sheetName,"RegAmount",rowNum)

		String projectIDUI = WebUI.getText(findTestObject('PaymenntLocator/projectDetails/ProjectNameID'))
		WebUI.verifyMatch(projectIDUI,projectId, false)

		String projectNameUI= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/ProjectName'))
		WebUI.verifyMatch(projectNameUI,projectName, false)

		String ratingSystem= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/RatingSystem'))
		WebUI.verifyMatch(prjRating,ratingSystem, false)

		String toregPrince= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/TotalRegPrice'))
		WebUI.verifyMatch(regPriceNonMem,toregPrince, false)

		String memberUI= WebUI.getText(findTestObject('PaymenntLocator/projectDetails/USGBCMember'))
		//WebUI.verifyMatch(memberUI,member, false)
	}


	@Keyword
	public void paymentPageSpecialCharValidationTest() {
		/*Verify the special characters where applicable drop-down  where applicable */

		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayNowOption'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/CardNumber'), '122!@#$%^&*(@#$%^&*#$%^&$')
		WebUI.click(findTestObject('PaymenntLocator/DashbordPayment/label_CVV'))
		WebUI.verifyElementPresent(findTestObject('PaymenntLocator/projectDetails/span_Please enter valid credit'),2)

		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/ccExpiary'),'12/2017')
		WebUI.click(findTestObject('PaymenntLocator/DashbordPayment/label_CVV'))
		WebUI.verifyElementPresent(findTestObject('PaymenntLocator/projectDetails/span_Please enter valid expiry'),2)

		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/cvvCreditCard'),'@#3')
		WebUI.click(findTestObject('PaymenntLocator/DashbordPayment/label_CVV'))
		WebUI.verifyElementPresent(findTestObject('PaymenntLocator/projectDetails/span_Please enter valid CVV.'),2)
		WebUI.click(findTestObject('Page_Arc dashboard/Back'))
		WebUI.delay(5)
	}

	@Keyword
	public void regPaymentCheckAddress(){
		/********************Verify for Check - check the verbiage on InstructionsUpon completing the billing form below and clicking Generate Invoice, an invoice will be generated and emailed to the bill-to-party email address listed below.Mail the invoice and check to the following address:Green Business Certification Inc.P.O. Box 822964Philadelphia, PA 19182-2964To avoid delays in processing, please write the invoice number on the check.Once GBCI receives the check, please allow 2-3 business days for processing. ******************************/
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/CheckRadio'))
		WebUI.delay(3)
		String address = "InstructionsUpon completing the billing form above and clicking Generate Invoice, an invoice will be generated and emailed to your email address.Mail the invoice and check to the following address:Green Business Certification Inc. P.O. Box 822964 Philadelphia, PA 19182-2964To avoid delays in processing, please write the invoice number on the check.Once GBCI receives the check, please allow 2-3 business days for processing."
		println address

		String addresscheck= address.replaceAll("\\s+","")

		String  checkAddress = WebUI.getText(findTestObject('PaymenntLocator/projectDetails/InstructionsUpon completing'))
		println checkAddress

		String addresscheckUI= checkAddress.replaceAll("\\s+","")
		WebUI.verifyMatch(addresscheck, addresscheckUI, false)

	}

	@Keyword
	public void ratingSystem(){

	}


	// verify the tax on selecting the other state and uttar pradesh
	@Keyword
	public void verifyRegistrationAmountWithTaxIndia(String sheetName, int rowNum){

		String state = data.getCellData(sheetName, 'State', rowNum)
		String regAmount = data.getCellData(sheetName, 'RegAmount', rowNum)
		String taxAmount = data.getCellData(sheetName, 'IGST', rowNum)
		String subTotal = data.getCellData(sheetName, 'SubTotal', rowNum)

		if(state.equalsIgnoreCase('Uttar Pradesh')){

			//pending for uttar pradesh
		}else{

			WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/TotalRegistrationAmountAfterTaxIND')), regAmount + " for 1 Year"  )
			WebUI.waitForElementPresent(findTestObject('Object Repository/PaymenntLocator/SubTotalRegistrationAmountIND'), 10)
			WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/SubTotalRegistrationAmountIND')),subTotal + " for 1 Year")
			WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/IGSTTaxApplicableOnSubTotalRegAmountIND')),taxAmount)

		}
	}



	@Keyword
	public void verifySezCheckBoxPresentAndClausePopUpOpens(){
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementClickable(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'))
		WebUI.check(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/ClauseTaxesPopupText')), "Clause X: Taxes", false, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PaymenntLocator/SEZAgreeButton'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PaymenntLocator/SEZCancelButton'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/SEZCancelButton'))
		WebUI.verifyElementNotChecked(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'), 5, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PaymenntLocator/IGSTTaxApplicableOnSubTotalRegAmountIND'),10,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		/*WebUI.check(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'))
		 WebUI.delay(3)*/
	}

	@Keyword
	public void verifyOnclickingSezCheckBoxTaxBecomeZero(){
		WebUI.scrollToElement(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'), 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.check(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/PaymenntLocator/ClauseTaxesPopupText'), 10)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/ClauseTaxesPopupText')), "Clause X: Taxes", false, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/SEZAgreeButton'))
		WebUI.delay(5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PaymenntLocator/IGSTTaxApplicableOnSubTotalRegAmountIND'),10, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		WebUI.check(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'))
		WebUI.delay(3)
	}


	@Keyword
	public void SezFileUploadAndVerifyItIsDisplaying(){
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'), 10)
		WebUI.check(findTestObject('Object Repository/PaymenntLocator/SEZCheckBox'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/SEZAgreeButton'))
		WebUI.delay(5)
		//pdf file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		WebUI.delay(5)
		//text file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadTextFile)
		WebUI.delay(5)
		//jpg file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadJpeg)
		WebUI.delay(5)
		//png file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadPng)
		WebUI.delay(5)
		//gif file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadGif)
		WebUI.delay(5)
		//xls file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadXls)
		WebUI.delay(5)
		//doc file upload
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/ClickOnUploadButtonSEZ'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(UploadDocs)
		WebUI.delay(5)

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZOne')), "uploadDoc.docx", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZTwo')), "uploasExcel.xlsx", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZThree')), "uploadGif.gif", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZFour')), "uploadPng.png", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZFive')), "Parking SJ.jpg", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZSix')), "txtFileUpload.txt", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZSeven')), "USGBC.pdf", false, FailureHandling.CONTINUE_ON_FAILURE)
		println "Uploaded files are displaying"
		//delete sez file
		WebUI.click(findTestObject('Object Repository/PaymenntLocator/DeleteSEZFile'))
		WebUI.delay(5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/PaymenntLocator/UploadedFileSEZSeven'), 4)
		println "File deleted successfully"
	}



	//Verify pricing Amount after applying discount
	public void verifyPricingDetailsAfterDiscount(String pricingSheet, int rowNum){

		String regPrice= data.getCellData(pricingSheet, "RegistrationPrice", rowNum)
		String discount= data.getCellData(pricingSheet, "Discount", rowNum)
		String discountedPrice= data.getCellData(pricingSheet, "DiscountedPrice", rowNum)
		println WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/subTotalAmount'))
		//println WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/discountedAmount'))
		//println WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/totalAmount'))
		WebUI.verifyMatch(regPrice,WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/subTotalAmount')) , false)
		//WebUI.verifyMatch(discount, WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/discountedAmount')), false)
		//WebUI.verifyMatch(discountedPrice, WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/totalAmount')), false)
	}

	//apply promocode fifty percent
	@Keyword
	public void applyPromocodeFifty(String dataSheet, int rowNum){
		String promoCode= dataExcelTemplate.getCellData(dataSheet, GlobalVariable.promocodeRegistrationFifty, rowNum)
		String discountedPrice = dataExcelTemplate.getCellData(dataSheet, "DiscountedFiftyPrice", rowNum)
		WebUI.scrollToElement(findTestObject('Object Repository/paymentPageNewUI/promoCode'), 5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/paymentPageNewUI/promoCode'), 10)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/promoCode'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/promoCode'), promoCode)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/promocodetext'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Promocode/PromocodeDiscount'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Promocode/PromocodeDiscount')), "-"+discountedPrice, false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Promocode/TotalAmountAfterDiscount')),discountedPrice , false)
		dataExcelTemplate.setCellData(dataSheet, "ProjectIDFifty", rowNum, Project_ID_Promocode)
		//findTestObject('Object Repository/Promocode/PromocodeDiscount')
		//findTestObject('Object Repository/Promocode/TotalAmountAfterDiscount')
	}

	//apply promocode hundred percent
	@Keyword
	public void applyPromocodeHundred(String dataSheet, int rowNum){
		String promoCode= dataExcelTemplate.getCellData(dataSheet, GlobalVariable.promocodeRegistrationHundred, rowNum)
		String discountedPrice = dataExcelTemplate.getCellData(dataSheet, "DiscountedHundredPrice", rowNum)

		WebUI.scrollToElement(findTestObject('Object Repository/paymentPageNewUI/promoCode'), 5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/paymentPageNewUI/promoCode'), 10)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/promoCode'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/promoCode'), promoCode)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/promocodetext'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Promocode/PromocodeDiscount'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Promocode/PromocodeDiscount')), "-"+discountedPrice, false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Promocode/TotalAmountAfterDiscount')), '$0.00' , false)
		dataExcelTemplate.setCellData(dataSheet, "ProjectIDHundred", rowNum, Project_ID_Promocode)
	}


	public void paymentPageProjectDetails(String sheetName, String pricingSheet, int rowNum,int rowNum1, int yearOfSubscription){

		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		//String spaceType    = data.getCellData(sheetName, "SpaceType", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		//String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)

		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/spaceType'))
		List<WebElement> list= driver.findElements(By.xpath("//*[@ng-repeat='type in spaceType']"))
		int size = list.size()
		int randonNumber = ThreadLocalRandom.current().nextInt(0, size)
		println list.get(randonNumber).getText()
		data.setCellData(sheetName, "SpaceType", rowNum,list.get(randonNumber).getText())
		list.get(randonNumber).click()
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/ownerType'))
		List<WebElement> list1= driver.findElements(By.xpath("//*[@ng-repeat='type in ownerType']"))
		int size1 = list1.size()
		int randonNumber1 = ThreadLocalRandom.current().nextInt(0, size1)
		println list1.get(randonNumber1).getText()
		list1.get(randonNumber1).click()
		data.setCellData(sheetName, "OwnerType", rowNum,list1.get(randonNumber1).getText())
		/*WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/spaceType'), spaceType, true)
		 WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ownerType'), ownerType, true)*/
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/organization'),ownerOrg)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/organization'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Add_Project_Details/span_Habitat for Humanity'))
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/ownerEmail'), ownerMail)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ownerCountry'), ownerCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'), prjRating , false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.delay(5)

		//************* Select the yearly subscription *****************//
		noOfYearSubscribed(yearOfSubscription)
		WebUI.delay(10)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('1'),title.indexOf('1')+10 )
		println Project_ID
		data.setCellData(pricingSheet,"ProjectID", rowNum1, Project_ID)

	}

	public void paymentRegistrationPricing(String sheetName , int rowNum, String paymentMode){
		/********************Fetching the data via Excel Sheet ******************************/
		String cardName   = data.getCellData(sheetName, "CardName", rowNum)
		String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
		String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
		String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String phone      = data.getCellData(sheetName, "Mobile", rowNum)

		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)

		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , true)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )
		//*********************** Select the payment mode *******************//
		if(paymentMode.equalsIgnoreCase("creditCard")){
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayNowOption'))
			WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/CardNumber'),cardNum)
			WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/ccExpiary'),cardDate)
			WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/cvvCreditCard'),cardCvv)
			//promocode field in case if used
			//WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/promoCode'),promocode)
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
		}
		else{
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayByCheckOption'))
			WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
		}
		WebUI.delay(20)
		WebUI.click(findTestObject('PaymenntLocator/NextButton'))
		WebUI.delay(5)
	}


	public void searchProject(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		println projectId
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (1 project)'))
		println nuberOfProjects
		WebUI.verifyMatch(nuberOfProjects,'Project (1 project)', false)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.delay(1)
	}

	public void clickPayNow(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'), 20,FailureHandling.CONTINUE_ON_FAILURE)
		String projectSetUpText= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextProjetSetup'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch("Project Setup", projectSetUpText, false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton'),FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void payNowRegistrationDetailsVerification(String buildingSheet, String pricingSheet, String paymentSheet){

		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/allProjectTextSpan'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DashboardNavigationNewUI/MyProjectTextSpan'), 20)
		//prj max value 21
		for(int prj=2; prj<=11; prj++){
			int yearOfSubscription
			if(prj<=6){
				if(prj==2)
					yearOfSubscription=1
				else if(prj==3)
					yearOfSubscription=2
				else if(prj==4)
					yearOfSubscription=3
				else if(prj==5)
					yearOfSubscription=4
				else if(prj==6)
					yearOfSubscription=5

				searchProject(pricingSheet , prj)
				clickPayNow()
				paymentPageProjectDetails(buildingSheet, pricingSheet,GlobalVariable.rowNumFive, prj,  yearOfSubscription)
				//applyPromocode(pricingSheet, prj)
				verifyPricingDetailsAfterDiscount(pricingSheet, prj)
				paymentRegistrationPricing(paymentSheet ,GlobalVariable.rowNumTwo, "creditCard")
			}
			else if(prj>6 && prj<=11){
				if(prj==7)
					yearOfSubscription=1
				else if(prj==8)
					yearOfSubscription=2
				else if(prj==9)
					yearOfSubscription=3
				else if(prj==10)
					yearOfSubscription=4
				else if(prj==11)
					yearOfSubscription=5
				searchProject(pricingSheet , prj)
				clickPayNow()
				paymentPageProjectDetails(buildingSheet ,pricingSheet, GlobalVariable.rowNumSix, prj, yearOfSubscription)
				//applyPromocode(pricingSheet, prj)
				verifyPricingDetailsAfterDiscount(pricingSheet, prj)
				paymentRegistrationPricing(paymentSheet ,GlobalVariable.rowNumTwo, "creditCard")
			}
			else{
				/*paymentPageProjectDetails(buildingSheet ,rowNum, int yearOfSubscription)
				 applyPromocode(String pricingSheet, int rowNum)
				 paymentRegistrationPricing(String sheetName , int rowNum, String paymentMode)*/
			}
		}
	}


	//verify the billing details and project details
	@Keyword
	public void verifyBillingDetailsAndProjectDetails(String sheetName){

		//verify the billing details

		/*for(int prj=2; prj<=5; prj++){
		 searchProject(sheetName , prj)
		 String billingDate= data.getCellData(sheetName, "RegDate", prj)
		 String billingAmount= data.getCellData(sheetName, "BillingPrice", prj)
		 WebUI.delay(5)
		 WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		 WebUI.delay(6)
		 String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
		 String regPrice=WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
		 WebUI.verifyMatch(billingDate, regDate, false,FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.verifyMatch(billingAmount, regPrice, false,FailureHandling.CONTINUE_ON_FAILURE)
		 //Verify the project details
		 String prjCountry 	= data.getCellData(sheetName, "Country", prj)
		 String prjState 	= data.getCellData(sheetName, "State", prj)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		 WebUI.delay(3)
		 WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectState'),'value'), prjState, false, FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCountry'),'value'),prjCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		 */	for(int prj=2; prj<=11; prj++){
			searchProject(sheetName , prj)
			data.setCellData(sheetName, "Status", prj, "")
			String billingDate= data.getCellData(sheetName, "RegDate", prj)
			String billingAmount= data.getCellData(sheetName, "BillingPrice", prj)
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
			WebUI.delay(6)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regPrice=WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			WebUI.verifyMatch(billingDate, regDate, false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(billingAmount, regPrice, false,FailureHandling.CONTINUE_ON_FAILURE)

			//Verify the project details
			String prjCountry 	= data.getCellData(sheetName, "Country", prj)
			String prjState 	= data.getCellData(sheetName, "State", prj)

			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
			WebUI.delay(3)
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectState'),'value'), prjState, false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCountry'),'value'),prjCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
			data.setCellData(sheetName, "Status", prj, "Pass")

		}
	}


	@Keyword
	public void paymentRegistrationCheck(String sheetName , int rowNum, String paymentMode){
		/********************Fetching the data via Excel Sheet ******************************/
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String phone      = data.getCellData(sheetName, "Mobile", rowNum)

		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , false)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )
		//*********************** Select the payment mode *******************//

		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/paymentPagePayByCheckOption'))
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))

		WebUI.delay(20)
		WebUI.waitForElementVisible(findTestObject('PaymenntLocator/NextButton'), 40)

	}


	//Subscription payment Measurabl
	@Keyword
	public void paymentForMeasurablSubscription(String sheetName , int rowNum, String paymentMode){
		/********************Fetching the data via Excel Sheet ******************************/

		String cardName   = data.getCellData(sheetName, "CardName", rowNum)
		String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
		String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
		String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)
		String phone      = data.getCellData(sheetName, "Mobile", rowNum)

		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingName'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingName'),partyName)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingEmail'), partyEmail)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingAddress'), address)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingCity'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingCity'), city)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingCountry'), country, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/paymentPageNewUI/billingState'), state , false)
		WebUI.clearText(findTestObject('Object Repository/paymentPageNewUI/billingZip'))
		WebUI.setText(findTestObject('Object Repository/paymentPageNewUI/billingZip'),zip )
		//*********************** Select the payment mode *******************//

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/CardNumber'),cardNum)
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/ccExpiary'),cardDate)
		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/cvvCreditCard'),cardCvv)
		//promocode field in case if used
		//WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/promoCode'),promocode)
		//WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/submitPayment'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationsTabs'), GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationsTabs'), GlobalVariable.maxAngularWait)
	}

}










