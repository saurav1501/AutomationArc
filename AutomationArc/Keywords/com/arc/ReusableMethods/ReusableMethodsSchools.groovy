package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.concurrent.ThreadLocalRandom

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ReusableMethodsSchools extends BaseClass{
	public  WebDriver driver = DriverFactory.getWebDriver()
	ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	ReusableMethodsSearch reusableMethodsSearch = new ReusableMethodsSearch()
	ReusableMethodsPayment reusablePayment = new ReusableMethodsPayment()
	
	@Keyword
	public void addNewSchoolProjectRegistration(String sheetName, int rowNum){

		int counter=0
		project:

		clickClaimYourSchool()
		claimASchool()

		String projectArea =data.getCellData(sheetName, "Area", rowNum)
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/grossArea'), projectArea)
		String prjName      = WebUI.getAttribute(findTestObject('Object Repository/AddProjectNewUI/projectName'),'value')
		String prjType 		= WebUI.getText(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'))
		String prjAddress 	= WebUI.getAttribute(findTestObject('Object Repository/AddProjectNewUI/streetName'),'value')
		String prjCity 		= WebUI.getAttribute(findTestObject('Object Repository/AddProjectNewUI/cityName'),'value')
		String prjState 	= WebUI.getText(findTestObject('Object Repository/AddProjectNewUI/GetSchoolStateName'))
		String prjZip 		= WebUI.getAttribute(findTestObject('Object Repository/AddProjectNewUI/zipCode'),'value')
		data.setCellData(sheetName, "ProjectName", rowNum, prjName)
		data.setCellData(sheetName, "ProjectType", rowNum, prjType)
		data.setCellData(sheetName, "Address", rowNum, prjAddress)
		data.setCellData(sheetName, "City", rowNum, prjCity)
		String prjCountry 	= WebUI.getText(findTestObject('Object Repository/AddProjectNewUI/GetSchoolCountryName'))
		data.setCellData(sheetName, "Country", rowNum, prjCountry )
		data.setCellData(sheetName, "State", rowNum, prjState)
		data.setCellData(sheetName, "Zip", rowNum, prjZip)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		//String PaymentPageText = WebUI.getText(findTestObject('Add_Project_Details/VerifyPaymentPage_ text'))
		//String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		if(WebUI.waitForElementPresent(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'),GlobalVariable.minAngularWait,FailureHandling.OPTIONAL) && WebUI.waitForElementVisible(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'),GlobalVariable.minAngularWait,FailureHandling.OPTIONAL))
		{
			WebUI.verifyMatch(WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup')),'Project Setup',true)
			String title= DriverFactory.getWebDriver().getCurrentUrl()
			println title
			String Project_ID= title.substring(title.indexOf('9'),title.indexOf('9')+10 )
			println Project_ID
			//WebUI.getText(findTestObject('Object Repository/Add_Project_Details/td_BuildingID'))
			//System.out.println()
			data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
			data.setCellData(sheetName,"RegDate", rowNum, ReusableMethodsManage.verifyBillingDate())
			WebUI.delay(5)
		}
		else{
			counter++
			if(counter==3){
				KeywordUtil.markFailed("Project not created")
				return
			}
			navigateToBuildingSchools()
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			continue project
		}
	}



	@Keyword
	public void paymentPageSchoolsDetails(String sheetName , int rowNum, int yearOfSubscription){

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
		data.setCellData(sheetName, "SpaceType", rowNum,list.get(randonNumber).getText())
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
		//WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'), prjRating , false)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'), GlobalVariable.maxAngularWait, FailureHandling.OPTIONAL)
		//fetch the current url to get the project id
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String[] arc=title.split("/");
		Project_ID_Promocode= arc[4]
		println Project_ID_Promocode
		if(WebUI.waitForElementPresent(findTestObject('Object Repository/paymentPageNewUI/oneYearSubscription'), GlobalVariable.maxAngularWait , FailureHandling.OPTIONAL) && WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/oneYearSubscription'), 10, FailureHandling.OPTIONAL) ){
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
			if(WebUI.waitForElementPresent(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'),GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)){
				WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'), GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton1'))
				WebUI.waitForElementPresent(findTestObject("Object Repository/paymentPageNewUI/Purchase"), GlobalVariable.minAngularWait)
				String purhanse = WebUI.getText(findTestObject("Object Repository/paymentPageNewUI/Purchase"))
				WebUI.verifyMatch(purhanse,'Purchase', false)
			}
			else{
				reusablePayment.selectPayNow()
			}
			continue payment
		}

	}


	@Keyword
	public void billingStatus(String sheetName, int rowNum){
		WebUI.delay(2)
		String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		String reviewAmt = data.getCellData(sheetName, "ReviewAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))*/
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		//Registration Payment details verification
		WebUI.delay(5)
		String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
		WebUI.verifyMatch(regDate, registrationDate, false , FailureHandling.CONTINUE_ON_FAILURE)
		String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
		data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
		String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
		WebUI.verifyMatch(regOrderType, "REGISTRATION", false, FailureHandling.CONTINUE_ON_FAILURE)
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		WebUI.verifyMatch(regStatus, "Completed", false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void billingStatusDev(String sheetName, int rowNum){
		WebUI.delay(2)
		//	String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		//	String reviewAmt = data.getCellData(sheetName, "ReviewAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))*/
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		//Registration Payment details verification
		WebUI.delay(5)
		String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
		WebUI.verifyMatch(regDate, registrationDate, false , FailureHandling.CONTINUE_ON_FAILURE)
		String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
		data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
		String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
		WebUI.verifyMatch(regOrderType, "REGISTRATION", false, FailureHandling.CONTINUE_ON_FAILURE)
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		WebUI.verifyMatch(regStatus, "Completed", false, FailureHandling.CONTINUE_ON_FAILURE)
	}
	//Upload Data Template Schools
	@Keyword
	public void uploadArcDataTemplateSchools(){

		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(7)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTempleteSchools )
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(10)
	}



	//Building and Schools
	@Keyword
	public void trialProjectDetailsLabelVerification(){

		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageProject'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'), 20)
		String projectTextVerification= WebUI.getText(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'))
		WebUI.verifyMatch("Project", projectTextVerification, false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectName')), "Name", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectId')), "Project ID", false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectUnitType')), "Unit type", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectSpaceType')), "Space type", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectAddress')), "Address", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectCity')), "City", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectState')), "State", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectCountryOrRegion')), "Country/Region", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectIsPrivate')), "Private", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOwnerType')), "Owner Type", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOwnerOrg')), "Owner Organization", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOwnerEmail')), "Owner Email", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOwnerCountryOrRegion')), "Owner Country/Region", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectPreviouslyLeedCertified')), "Previously LEED Certified?", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOtherCertificationProgramPursued')), "Other certification programs pursued", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectContainsResidentialUnit')), "Contains residential units?", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectAffWithHigherOrg')), "Is project affiliated with a higher education institute?", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectAffliatedLEED')), "Is project affiliated with a LEED Lab?", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectYearBuilt')), "Year Built", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectFloorsAboveground')), "Floors above ground", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectIntendToPrecertify')), "Intend to precertify?", false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectGrossFloorArea')), "Gross floor area", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectTargetCertificationDate')), "Target certification date", false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectWeeklyOprHours')), "Weekly Operating Hours", false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOperationaldays')), "Operational days", false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOccupancy')), "Occupancy", false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/Project/ManageProjectLabels/projectOccupancy'), 5)

	}


	//Validate Data Input Meter Human experience After v4.1 Excel Upload

	//Co2 Data
	@Keyword
	public void verifyTheCO2DataPopulatedViaARCInDataInputSection(String sheetName, int rowNum1, rowNum2){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate1", rowNum1)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate1", rowNum1)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading2", rowNum1)
		String startDate1  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum2)
		String endDate1  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum2)
		String reading2  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum2)

		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Carbon Dioxide'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Carbon Dioxide'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)


		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Carbon Dioxide",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate2'),'value'),startDate1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate2'),'value'),endDate1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingTwo'),'value'),reading2,FailureHandling.CONTINUE_ON_FAILURE)



		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//TVOC
	@Keyword
	public void verifyTheTVOCDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)


		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Total Volatile Organic Com'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Total Volatile Organic Com'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Total Volatile Organic Compounds",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//PM2.5
	@Keyword
	public void verifyThePM25DataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)


		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_PM2.5'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_PM2.5'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Atmospheric Particulate Matter (PM2.5)",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	//Ozone
	@Keyword
	public void verifyTheOzoneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Ozone'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Ozone'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Ozone",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	//Carbon Monoxide
	@Keyword
	public void verifyTheCarbonMonoxideDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Carbon Monoxide'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Carbon Monoxide'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Carbon Monoxide",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Toluene
	@Keyword
	public void verifyTheTolueneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)


		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Toluene'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Toluene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Toluene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//Acetaldehyde
	@Keyword
	public void verifyTheAcetaldehydeDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Acetaldehyde'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Acetaldehyde'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Acetaldehyde",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Benzene
	@Keyword
	public void verifyTheBenzeneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)


		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Benzene'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Benzene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Benzene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//Styrene
	@Keyword
	public void verifyTheStyreneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Styrene'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Styrene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Styrene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//Naphthalene
	@Keyword
	public void verifyTheNaphthaleneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Naphthalene'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Naphthalene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Naphthalene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Dichlorobenzene
	@Keyword
	public void verifyTheDichlorobenzeneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Dichlorobenzene'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Dichlorobenzene'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Dichlorobenzene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	//Xylenes-total
	@Keyword
	public void verifyTheXylenesTotalDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Xylenes-total'),3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Xylenes-total'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Xylenes-total",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Formaldehyde

	@Keyword
	public void verifyFormaldehydeTotalDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Formaldehyde'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/div_Formaldehyde'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/MeterName'), "Formaldehyde",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/DataInput/V4MeterHumanExperience/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	public void clickClaimYourSchool() {

		WebUI.delay(2)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/SchoolsLocators/SchoolNavigation/ClaimYourSchoolsButton'), 3)
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SchoolNavigation/ClaimYourSchoolsButton'))
		WebUI.delay(2)
		String postNavigationClaimSchoolText = WebUI.getText(findTestObject('Object Repository/SchoolsLocators/SchoolNavigation/Claim_a_SchoolPageText'))
		WebUI.verifyMatch(postNavigationClaimSchoolText,'Claim a School',true)
	}

	@Keyword
	public void navigateToBuildingSchools() {
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SchoolNavigation/NavigateToMySchools'))
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/SchoolsLocators/SchoolNavigation/SchoolsDashboardPage'))
		WebUI.verifyMatch(postNavigationLoginText,'My Schools',true)
	}

	//Search School
	public void searchSchools(){

		//Search the schools using the 2 character of alphabet
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/SearchBarSchools'))
		String searchSchool= getAlphaNumericString(1)
		WebUI.setText(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/SearchBarSchools'), searchSchool)
		//Wait for the visibility of the element rows per page
		WebUI.delay(3)
		WebUI.waitForElementVisible(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/RowsPerPage'), 30)
		//Click on rows per page
		WebUI.delay(7)
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/RowsPerPage'))
		WebUI.delay(3)
		//click on 100 rows per page
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/ClickOnHundredRowsPerPage'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
	}


	public void selectSchool(){
		List<WebElement> schoolsName = driver.findElements(By.xpath("//*[@ng-click='addProject(school)']"))
		println schoolsName.size()
		int size=schoolsName.size()

		for(WebElement ele : schoolsName){
			println(ele.getText())
			if((ele.getText().equalsIgnoreCase("Claim now"))){
				ele.click()
				break
			}
			else{
				size=size-1
				println size
			}
			if ((size<=0)){
				println "Hi"
				searchSchools()
				println "Hi1"
				WebUI.delay(5)
				schoolsName = driver.findElements(By.xpath("//*[@ng-click='addProject(school)']"))
				println schoolsName.size()
				//int size=schoolsName.size()
				size= schoolsName.size()
			}
		}
	}

	//Claim A School
	public void claimASchool(){

		searchSchools()

		WebUI.delay(5)
		//WebUI.waitForElementPresent(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/ClaimNowButton'), 30)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/ClaimNowButton'), 20)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/ClaimNowButton'), 30,FailureHandling.OPTIONAL))){
			selectSchool()
		}else{

			for(int next=1;next<900;next++){
				WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/NextSchoolRecord'))
				if((WebUI.waitForElementPresent(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/ClaimNowButton'), 30,FailureHandling.OPTIONAL))){
					selectSchool()
					break
				}
			}
		}

		WebUI.waitForElementVisible(findTestObject('Object Repository/Add_Project_Details/h1_Project Registration'), 20)
		String projectRegistrationText = WebUI.getText(findTestObject('Object Repository/Add_Project_Details/h1_Project Registration'))
		WebUI.verifyMatch(projectRegistrationText,'Project Registration',true)
	}



	// function to generate a random string of length n
	public String getAlphaNumericString(int n){

		// chose a Character random from this String
		String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

		// create StringBuffer size of AlphaNumericString
		StringBuilder sb = new StringBuilder(n);

		for (int i = 0; i < n; i++) {

			// generate a random number between
			//AlphaNumericString variable length
			int index = (int)(AlphaNumericString.length()* Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}
}
