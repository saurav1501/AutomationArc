package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.io.IOException
import java.text.SimpleDateFormat

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ResuableMethodsGRESB extends BaseClass {
	ReusableMethodsDataInput reusableMethodsDataInput = new ReusableMethodsDataInput()
	ReusableMethodsNavigation reusableMethodsNavigation = new ReusableMethodsNavigation()
	ReusableMethodsSearch reusableMethodsSearch = new 	ReusableMethodsSearch()

	SimpleDateFormat formatarDate = new SimpleDateFormat(' HH:mm:ss')


	@Keyword
	public void  downloadGresbtemplete() throws IOException, InterruptedException {
		WebUI.delay(5)

		WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		WebUI.delay(5)

		WebUI.click(findTestObject('Portfolio/GRESB/a_Download GRESB Template'))
		WebUI.delay(7)

		WebUI.click(findTestObject('Portfolio/GRESB/a_Download GRESB Template'))
		WebUI.delay(7)
		Assert.assertTrue(reusableMethodsDataInput.isFileDownloaded('2019-GRESB-Asset-Spreadsheet.xlsx'), 'Failed to download Expected document')

		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/a_template'))
		WebUI.delay(6)
		Assert.assertTrue(reusableMethodsDataInput.isFileDownloaded('2019-GRESB-Asset-Spreadsheet.xlsx'), 'Failed to download Expected document')
		WebUI.delay(3)
	}

	@Keyword
	public void  createGresbData(String sheetName, int rowNum) throws IOException, InterruptedException {

		String ownerType 	= data.getCellData(sheetName, "GOwnerType", rowNum);
		String ownerOrg 	= data.getCellData(sheetName, "GOwnerOrganization", rowNum);
		String ownerMail 	= data.getCellData(sheetName, "GOwnerEmail", rowNum);
		String ownerCountry = data.getCellData(sheetName, "GOwnerCountry", rowNum);

		WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		WebUI.delay(5)
		Date date = new Date(System.currentTimeMillis())
		data.setCellData(sheetName,"ProjectName",5, "GRESB Portfolio" +" " +formatarDate.format(date))
		String prjName 	= data.getCellData(sheetName, "ProjectName",5)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/New/PortfolioName'), prjName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Portfolio/GRESB/select_Select Owner TypeBusine'), ownerType, false)
		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'), ownerOrg)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/div_U.S. Army'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/input_Owner Email_form-control'), ownerMail)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Portfolio/GRESB/OwnerCountry'),ownerCountry, false)
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/button_Browse'))
		WebUI.delay(2)
		ReusableMethodsDataInput.uploadFile(gresbUpload)
		//WebUI.sendKeys(findTestObject('Portfolio/GRESB/button_Browse'),BaseClass.gresbUpload )
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/button_UPLOAD'))
		WebUI.delay(250)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

	}


	@Keyword
	public void  createGresbDataIND(String sheetName, int rowNum) throws IOException, InterruptedException {

		String ownerType 	= data.getCellData(sheetName, "GOwnerType", rowNum);
		String ownerOrg 	= data.getCellData(sheetName, "GOwnerOrganization", rowNum);
		String ownerMail 	= data.getCellData(sheetName, "GOwnerEmail", rowNum);
		String ownerCountry = data.getCellData(sheetName, "GOwnerCountry", rowNum);

		Date date = new Date(System.currentTimeMillis())
		data.setCellData(sheetName,"ProjectName",5, "INDGRESB Portfolio" +" " +formatarDate.format(date))
		WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		WebUI.delay(5)
		String prjName 	= data.getCellData(sheetName, "ProjectName",5)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/New/PortfolioName'), prjName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Portfolio/GRESB/select_Select Owner TypeBusine'), ownerType, false)
		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'), ownerOrg)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/div_U.S. Army'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/input_Owner Email_form-control'), ownerMail)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Portfolio/GRESB/OwnerCountry'),ownerCountry, false)
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/button_Browse'))
		WebUI.delay(2)
		ReusableMethodsDataInput.uploadFile(gresbUploadIND)
		//WebUI.sendKeys(findTestObject('Portfolio/GRESB/button_Browse'),BaseClass.gresbUpload )
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/button_UPLOAD'))
		WebUI.delay(30)
		WebUI.delay(500)

	}

	@Keyword
	public void  ownerCountry(String sheetName, int rowNum) throws IOException, InterruptedException {


		String ownerOrg = data.getCellData(sheetName, "GOwnerOrganization", rowNum);
		String ownerMail 	= data.getCellData(sheetName, "GOwnerEmail", rowNum);
		String ownerCountry = data.getCellData(sheetName, "GOwnerCountry", rowNum);

		WebUI.verifyOptionSelectedByLabel(findTestObject('Portfolio/GRESB/OwnerCountry'), "United States", false,2, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Portfolio/GRESB/input_Owner Email_form-control'),'Not Valid')
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/New/EmailValidation'),4, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Portfolio/Common/button_CANCEL'))
		WebUI.delay(7)
	}
	@Keyword
	public void goalCarbon(String sheetName, int rowNum) throws IOException, InterruptedException {
		/****** Methods Verifying the annual carbon emission, goal calculation & validating the text area is saving the text or not after refresh *****/
		String baseYear = data.getCellData(sheetName, "BaseYear", rowNum)
		String targetYear = data.getCellData(sheetName,"TargetYear", rowNum)


		WebUI.click(findTestObject('Object Repository/Portfolio/Goal/a_ Goals'))
		WebUI.delay(5)

		println "Test started verifying acheive goal in percentage"
		WebUI.verifyOptionSelectedByLabel(findTestObject('Portfolio/Goal/Carbon_base_year'), baseYear, false,2, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(1)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Portfolio/Goal/carbon_target_year'), targetYear,false,2, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(1)
	}


	@Keyword
	public void  validateName(String sheetName, int rowNum) throws IOException, InterruptedException {
		/*********************Verifying the special character of the GRESB Project Name***********************/
		WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		WebUI.delay(5)


		String prjName = 'Special Character!@#$%^&*'

		WebUI.sendKeys(findTestObject('Portfolio/GRESB/New/PortfolioName'), prjName)

		String errorMessage= WebUI.getText(findTestObject('Portfolio/GRESB/New/ErrorName'))
		WebUI.verifyMatch(errorMessage,"Please enter a valid name. Allowed special characters are & + / : ' , - . #", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.clearText(findTestObject('Portfolio/GRESB/New/PortfolioName'))
		WebUI.delay(1)
		String prjNameMore40Char = '1234567891234567891234567891234567891234'
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/New/PortfolioName'), prjNameMore40Char)

		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/button_UPLOAD'))
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/GRESB/New/ErrorName'),4)
	}

	@Keyword
	public void  addOwnerOrg(String sheetName, int rowNum) throws IOException, InterruptedException {

		String ownerType 	= data.getCellData(sheetName, "GOwnerType", rowNum);
		String ownerOrg 	= data.getCellData(sheetName, "GOwnerOrganization", rowNum);
		String ownerMail 	= data.getCellData(sheetName, "GOwnerEmail", rowNum);
		String ownerName = data.getCellData(sheetName, "GOwnerOrg", rowNum);
		Date date = new Date(System.currentTimeMillis())


		/*	WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		 WebUI.delay(5)*/

		WebUI.click(findTestObject('Portfolio/GRESB/Owner/a_Click here'))
		WebUI.delay(2)

		String ownerName1= ownerName.substring(0, 9)
		String OwnerName = ownerName1 +formatarDate.format(date)
		data.setCellData(sheetName,"GOwnerOrg", rowNum, OwnerName)

		WebUI.sendKeys(findTestObject('Portfolio/GRESB/Owner/input_Organization Name_name'), OwnerName)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/Owner/input_Owner Contact Email_owne'), ownerMail)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/Owner/input_concat(Owner  s Represen'), ownerMail)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/Owner/input_Website_form-control ng'),'www.testautomation.com')

		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/Owner/button_ADD'))
		WebUI.delay(4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Owner/GRESBImportImage'),2)
		WebUI.delay(4)
	}


	@Keyword
	public void addOwnerOrgProjInValid(String sheetName, int rowNum){
		String ownerType 	= data.getCellData(sheetName, "GOwnerType", rowNum);
		String ownerOrg 	= data.getCellData(sheetName, "GOwnerOrganization", rowNum);
		String ownerMail 	= data.getCellData(sheetName, "GOwnerEmail", rowNum);


		WebUI.click(findTestObject('Add_Project_Details/Payment/ClickHere'))
		WebUI.delay(2)
		String ownerName = "test"
		WebUI.sendKeys(findTestObject('Add_Project_Details/Payment/OwnerName'), ownerName)
		WebUI.sendKeys(findTestObject('Add_Project_Details/Payment/Email'), ownerMail)
		WebUI.sendKeys(findTestObject('Add_Project_Details/Payment/OwnerRepresentative'), ownerMail)
		WebUI.sendKeys(findTestObject('Add_Project_Details/Payment/WebSite'),'www.testautomation.com')

		WebUI.delay(2)
		WebUI.click(findTestObject('Add_Project_Details/Payment/Add'))
		WebUI.delay(4)
		WebUI.verifyElementPresent(findTestObject('Add_Project_Details/Payment/OwnerOrgError'),2)
		WebUI.delay(4)
	}

	@Keyword
	public void regPaymentBillDetailTest(String sheetName){

		String name 	= data.getCellData(sheetName, "BillDetail", 2)
		String email 	= data.getCellData(sheetName, "BillDetail", 3)
		String address 	= data.getCellData(sheetName, "BillDetail", 4)
		String city 	= data.getCellData(sheetName, "BillDetail", 5)

		println name

		String UIname = WebUI.getAttribute(findTestObject('Object Repository/paymentPageNewUI/billingName'),'value')
		WebUI.verifyMatch(UIname, name, false, FailureHandling.CONTINUE_ON_FAILURE)

		String UIemail=	WebUI.getAttribute(findTestObject('Object Repository/paymentPageNewUI/billingEmail'),'value')
		WebUI.verifyMatch(UIemail, email, false, FailureHandling.CONTINUE_ON_FAILURE)

		String UIaddress = WebUI.getAttribute(findTestObject('Object Repository/paymentPageNewUI/billingAddress'),'value')
		WebUI.verifyMatch(UIaddress, address, false, FailureHandling.CONTINUE_ON_FAILURE)

		String UIcity = WebUI.getAttribute(findTestObject('Object Repository/paymentPageNewUI/billingCity'),'value')
		WebUI.verifyMatch(UIcity, city, false, FailureHandling.CONTINUE_ON_FAILURE)
	}




	@Keyword
	public void  addOwnerOrgProjValid(String sheetName, int rowNum) throws IOException, InterruptedException {

		String ownerName = data.getCellData(sheetName, "GOwnerOrg", rowNum);

		/*WebUI.click(findTestObject('Portfolio/GRESB/Owner/a_Click here'))
		 WebUI.delay(2)*/
		Date date = new Date(System.currentTimeMillis())

		String ownerName1= ownerName.substring(0, 9)
		String OwnerName = ownerName1 +formatarDate.format(date)
		data.setCellData(sheetName,"GOwnerOrg", rowNum, OwnerName)


		WebUI.clearText(findTestObject('Add_Project_Details/Payment/OwnerName'))
		WebUI.sendKeys(findTestObject('Add_Project_Details/Payment/OwnerName'), OwnerName)

		WebUI.delay(2)
		WebUI.click(findTestObject('Add_Project_Details/Payment/Add'))
		WebUI.delay(4)
		WebUI.verifyElementNotPresent(findTestObject('Add_Project_Details/Payment/OwnerOrgError'),5)
		WebUI.delay(4)
	}
	@Keyword
	public void  searchAddedOwnerOrgP(String sheetName, int rowNum) throws IOException, InterruptedException {

		String OwnerName = data.getCellData(sheetName, "GOwnerOrg", rowNum);

		WebUI.clearText(findTestObject('Object Repository/AddProjectNewUI/organization'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/organization'))
		WebUI.delay(1)

		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/organization'), OwnerName)
		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/organization'))
		WebUI.delay(5)

		String regMemberName = WebUI.getText(findTestObject('Add_Project_Details/Payment/SearchOwner'))
		WebUI.verifyMatch(regMemberName,OwnerName,false )
		WebUI.delay(5)
	}


	@Keyword
	public void  searchAddedOwnerOrg(String sheetName, int rowNum) throws IOException, InterruptedException {

		String OwnerName = data.getCellData(sheetName, "GOwnerOrg", rowNum);

		WebUI.clearText(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'))
		WebUI.delay(2)

		WebUI.sendKeys(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'), OwnerName)
		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/input_Click here_gresb-search'))
		WebUI.delay(10)

		String regMemberName = WebUI.getText(findTestObject('Object Repository/Portfolio/GRESB/Owner/OwnerOrgList'))
		WebUI.verifyMatch(regMemberName,OwnerName,false )
		WebUI.delay(5)
	}

	@Keyword
	public void signAggrementScoreComp(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Portfolio/GRESB/Owner/ISTProj'),GlobalVariable.maxAngularWait)
		String protfolioID = WebUI.getText(findTestObject('Portfolio/GRESB/Owner/ISTProj'))
		data.setCellData(sheetName,"PortfolioID",2, protfolioID)

		reusableMethodsSearch.searchProgramPortfolioId(GlobalVariable.PortfoliosSheet,GlobalVariable.rowNumTwo)
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Owner/button_Sign Agreement1'),2)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Owner/ScoreComp1'),2)

		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Owner/button_Sign Agreement2'),2)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Owner/ScoreComp2'),2)
	}

	@Keyword
	public void redAlertPopShouldNotDisplay() throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/GRESB/Owner/button_Sign Agreement2'),2)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/GRESB/Owner/ScoreComp2'),2)
	}

	@Keyword
	public void acceptAggrement(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.click(findTestObject('Portfolio/GRESB/Owner/SignAgg1'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('Portfolio/GRESB/Owner/Accept1'),GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Portfolio/GRESB/Owner/Accept1'),GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Portfolio/GRESB/Owner/Accept1'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String projestatus = WebUI.getText(findTestObject('Portfolio/GRESB/Owner/Trial1'))
		WebUI.verifyMatch(projestatus,'Trial', false)
	}

	@Keyword
	public void acceptAggrementFromDashboardPage(String sheetName, int rowNum) throws IOException, InterruptedException {

		String projectID = WebUI.getText(findTestObject('Portfolio/GRESB/SecProj'))
		data.setCellData(sheetName,"ProjectID",2, projectID)

		reusableMethodsNavigation.navigateToBuilding()

		reusableMethodsSearch.searchProgram(GlobalVariable.PortfoliosSheet,GlobalVariable.rowNumTwo)
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('Portfolio/GRESB/SignAcceptButton'),GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Portfolio/GRESB/SignAcceptButton'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		String status = WebUI.getText(findTestObject('Portfolio/GRESB/New/Reg1'))
		WebUI.verifyMatch(status,'Trial',false)
	}

	@Keyword
	public void OwnerOrg(String sheetName, int rowNum) throws IOException, InterruptedException {

		String ownerMail 	= data.getCellData(sheetName, "GOwnerEmail", rowNum)

		WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/input_Owner Email_form-control'), ownerMail)
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/input_Owner Email_form-control'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('Portfolio/Common/p_Please enter valid email.'), rowNum)
		WebUI.click(findTestObject('Portfolio/Common/button_CANCEL'))
		WebUI.delay(7)
	}

	@Keyword
	public void OwnerType(String sheetName, int rowNum) throws IOException, InterruptedException {
		String ownerType 	= data.getCellData(sheetName, "GOwnerType", rowNum);

		WebUI.click(findTestObject('Portfolio/GRESB/button_Import from GRESB'))
		WebUI.delay(5)

		/***********Verifying newly added default owner Type ************************************************/
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Portfolio/GRESB/select_Select Owner TypeBusine'), 'Business Improvement District', false,5)
		WebUI.click(findTestObject('Portfolio/Common/button_CANCEL'))
		WebUI.delay(6)
	}

	@Keyword
	public void gresbPortfolioDetails(String sheetName, int rowNum) throws IOException, InterruptedException {

		String projectName   = data.getCellData(sheetName, "ProjectName", 5)
		String organization  = data.getCellData(sheetName, "GOwnerOrganization", 2)
		String orgCountry 	 = data.getCellData(sheetName, "orgCountry",2)
		String orgContact    = data.getCellData(sheetName, "orgContact",5)
		String email         = data.getCellData(sheetName, "GOwnerEmail",2)
		String prjDesc       = data.getCellData(sheetName, "portfolioDesc",5)

		WebUI.click(findTestObject('Portfolio/Total/a_ Manage'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Portfolio/Common/PortfolioPage'))
		WebUI.delay(5)

		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/portfolio_name'),"value").contains(projectName),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_Email'),"value").contains(email),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_organization'),"value").contains(organization),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/org_country'),"value").contains("US"),"Not Valid")
		//Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_Mob'),"value").contains(orgContact),"Not Valid")
		//Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_Description'),"value").contains(prjDesc),"Not Valid")
	}

	@Keyword
	public void gresbPortfolioDetailsIND(String sheetName, int rowNum) throws IOException, InterruptedException {

		String projectName   = data.getCellData(sheetName, "ProjectName", 5)
		String organization  = data.getCellData(sheetName, "GOwnerOrganization", 2)
		String orgCountry 	 = data.getCellData(sheetName, "orgCountry",2)
		String orgContact    = data.getCellData(sheetName, "orgContact",5)
		String email         = data.getCellData(sheetName, "GOwnerEmail",2)
		String prjDesc       = data.getCellData(sheetName, "portfolioDesc",5)

		WebUI.click(findTestObject('Portfolio/Total/a_ Manage'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Portfolio/Common/PortfolioPage'))
		WebUI.delay(5)

		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/portfolio_name'),"value").contains(projectName),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_Email'),"value").contains(email),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_organization'),"value").contains(organization),"Not Valid")
		Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/org_country'),"value").contains("IN"),"Not Valid")
		//Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_Mob'),"value").contains(orgContact),"Not Valid")
		//Assert.assertTrue(WebUI.getAttribute(findTestObject('Portfolio/Total/textarea_Description'),"value").contains(prjDesc),"Not Valid")
	}

	@Keyword
	public void verifyErrorNotification(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/Districtheating'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/ElectricityMeter'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/FuelMeter'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/WaterMeter'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/WasteData'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/TransportationSurvey'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/Occupant Satisfaction Surv'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/CarbonDioxide'),4)
		WebUI.verifyElementPresent(findTestObject('Portfolio/ErrorNotification/TotalVolatileOrganic'),4)
	}

	@Keyword
	public void verifyEstimatedScore() throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/GRESB/Setting/span_Estimated'),GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void verifyNoErrorNotification() throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/Districtheating'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/ElectricityMeter'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/FuelMeter'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/WaterMeter'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/WasteData'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/TransportationSurvey'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/Occupant Satisfaction Surv'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/CarbonDioxide'),4)
		WebUI.verifyElementNotPresent(findTestObject('Portfolio/ErrorNotification/TotalVolatileOrganic'),4)
	}

	@Keyword
	public void modifyDataForEnergy(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Portfolio/ErrorNotification/Energy/td_District heating and Coolin'),10)
		WebUI.click(findTestObject('Portfolio/ErrorNotification/Energy/td_District heating and Coolin'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Portfolio/Project/InputTextBox'),'100')
		WebUI.click(findTestObject('Portfolio/GRESB/SaveButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)


		WebUI.click(findTestObject('Portfolio/ErrorNotification/Energy/td_Electricity Meter'))
		WebUI.setText(findTestObject('Portfolio/Project/InputTextBox'),'100')
		WebUI.delay(3)
		WebUI.click(findTestObject('Portfolio/GRESB/SaveButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)

		WebUI.click(findTestObject('Portfolio/ErrorNotification/Energy/td_Fuel Meter'))
		WebUI.setText(findTestObject('Portfolio/Project/InputTextBox'),'100')
		WebUI.delay(3)
		WebUI.click(findTestObject('Portfolio/GRESB/SaveButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	@Keyword
	public void modifyDataForWater(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.delay(4)
		WebUI.click(findTestObject('Portfolio/GRESB/Section/td_Water Meter'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Portfolio/Project/InputTextBox'),'100')
		WebUI.delay(3)
		WebUI.click(findTestObject('Portfolio/GRESB/SaveButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)
	}

	@Keyword
	public void modifyDataForWaste(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.delay(4)
		WebUI.click(findTestObject('Portfolio/GRESB/Section/td_Waste Data'))
		WebUI.delay(4)
		WebUI.clearText(findTestObject('Portfolio/GRESB/Waste/wasteGen'))
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/Waste/wasteGen'), '.012')
		WebUI.delay(1)
		WebUI.clearText(findTestObject('Portfolio/GRESB/Waste/WasteDiv'))
		WebUI.delay(1)
		WebUI.sendKeys(findTestObject('Portfolio/GRESB/Waste/WasteDiv'), '.011')
		//	WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/source') ,'office')
		WebUI.click(findTestObject('Portfolio/GRESB/Waste/upload'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)

	}
	@Keyword
	public void modifyDataForCo2(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.delay(4)
		WebUI.click(findTestObject('Portfolio/GRESB/Section/td_Carbon Dioxide'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))

		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))

		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))

		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'),'23')
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	@Keyword
	public void modifyDataForTVOC(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.delay(4)
		WebUI.click(findTestObject('Portfolio/GRESB/Section/td_Total Volatile Organic Comp'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))

		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'),'23')
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void verifyGreenSymbol() throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForAngularLoad(120, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/GresbGreen'),5)
	}
	@Keyword
	public void verifyOrangeSymbol() throws IOException, InterruptedException {
		WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Orange'),GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void verifyProjectStatus() throws IOException, InterruptedException {
		WebUI.delay(8)
		/*WebUI.click(findTestObject('Portfolio/Total/a_ Manage (1)'))
		 WebUI.delay(5)*/
		WebUI.click(findTestObject('Portfolio/Common/PortfolioPage'))
		WebUI.delay(5)
		String status = WebUI.getText(findTestObject('Portfolio/GRESB/ManageProtfolioPrj1Status'))
		WebUI.verifyMatch(status,'Trial', false)

		String status2 = WebUI.getText(findTestObject('Portfolio/GRESB/ManagePortfolioPrj2Status'))
		WebUI.verifyMatch(status,'Trial', false)
	}

	@Keyword
	public void projectFieldValidationEmptyValueTest() throws IOException, InterruptedException {
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/Common/PortfolioPage'))
		WebUI.delay(3)

		//String projectName   = data.getCellData(sheetName, "ProjectName", 3)
		WebUI.click(findTestObject('Portfolio/Total/span_Edit'))
		WebUI.delay(2)
		WebUI.clearText(findTestObject('Portfolio/Total/portfolio_name'))
		WebUI.sendKeys(findTestObject('Portfolio/Total/portfolio_name'), " ")
		WebUI.click(findTestObject('Portfolio/Total/span_Save'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('LoginArc/Page_Arc Skoru  Sustainability perf/Required'),5)
	}

	@Keyword
	public void gresbAddanddeleteproject(String sheetName, int rowNum) throws IOException, InterruptedException {
		String projectId 	= data.getCellData(sheetName,"ID",8)

		String portfolioName = data.getCellData(sheetName,"PortfolioID",2)

		/*WebUI.click(findTestObject('Portfolio/Total/a_ Manage'))
		 WebUI.delay(3)
		 */		
		WebUI.click(findTestObject('Portfolio/Common/PortfolioPage'))
		WebUI.delay(5)

		WebUI.scrollToElement(findTestObject('Portfolio/manage/AddProject'), 4)
		WebUI.click(findTestObject('Portfolio/manage/AddProject'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('Portfolio/Common/input_searchBarPort'), projectId)
		WebUI.click(findTestObject('Portfolio/Common/input_searchBarPort'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/Common/SelectProjectInPortfolio'))
		WebUI.setText(findTestObject('Portfolio/Common/input_searchBarPortfolio'),portfolioName)
		WebUI.click(findTestObject('Portfolio/Common/input_searchBarPortfolio'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/Common/SelectPortfolio'))
		WebUI.click(findTestObject('Portfolio/Common/button_Add'))
		WebUI.delay(10)
		WebUI.waitForElementVisible(findTestObject('Portfolio/Common/button_Done'),6)
		WebUI.click(findTestObject('Portfolio/Common/button_Done'))
		WebUI.delay(9)

		WebUI.scrollToElement(findTestObject('Portfolio/Common/ClickScore'),2)
		WebUI.click(findTestObject('Portfolio/Common/ClickScore'))
		WebUI.delay(5)

		WebUI.click(findTestObject('Portfolio/Common/PortfolioPage'))
		WebUI.delay(5)

		WebUI.scrollToElement(findTestObject('Object Repository/Portfolio/GRESB/Third'), 3)
		WebUI.click(findTestObject('Object Repository/Portfolio/GRESB/Third'))
		WebUI.delay(9)

		/***************Verifying project is deleted successfully by count no of projects ********************/
		WebDriver driver  = DriverFactory.getWebDriver()
		ArrayList numberOfCount = driver.findElements(By.xpath("//*[@class='vertical-align-middle']"))
		int numberOfCountSize = numberOfCount.size()

		Iterator<Integer> iterator = numberOfCountSize.iterator()

		// while loop iterating the value
		while (iterator.hasNext()) {
			int value =  iterator.next()
			String actualtotalCount= value
			WebUI.verifyMatch(actualtotalCount,'2', false)
		}

	}

}

