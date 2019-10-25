package com.arc.ReusableMethods
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.event.KeyEvent
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

import org.apache.pdfbox.pdmodel.PDDocument
import org.apache.pdfbox.text.PDFTextStripper
import org.openqa.selenium.WebDriver
import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.arc.BaseClass.CommonMethod
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
public class ReusableMethodsManage extends BaseClass {


	ReusableMethodsDataInput ReusDataInput = new ReusableMethodsDataInput()
	ReusableMethodsNavigation ReusNavigate = new ReusableMethodsNavigation()
	//ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	public CommonMethod commMethod  = new CommonMethod()
	public static Robot robot = new Robot()
	WebDriver driver  = DriverFactory.getWebDriver()
	//static final int BUFFER_SIZE = 4096
	public ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	ResuableMethodsSetting setting = new ResuableMethodsSetting()

	@Keyword
	public void trialProjectDetailsVerificationBuilding(String sheetName, int rowNum){
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String population 	= data.getCellData(sheetName, "Population", rowNum)

		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageProject'))
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'), 20)
		String projectTextVerification= WebUI.getText(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'))
		WebUI.verifyMatch("Project", projectTextVerification, false)
		if((WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.delay(10)
		}
		String projectName= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value')
		String projectId= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectId'),'value')
		//String projectUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/unitType'),'value')
		String projectAddress= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAddress'),'value')
		String projectCity= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCity'),'value')
		String projectState= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectState'),'value')
		String projectCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCountry'),'value')
		//String projectArea= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectArea'),'value')
		WebUI.verifyMatch(projectName, prjName, false)
		WebUI.verifyMatch(projectId, prjId, false)
		//WebUI.verifyMatch(projectUnit,"string:IP", false)
		WebUI.verifyMatch(projectAddress, prjAddress, false)
		WebUI.verifyMatch(projectCity, prjCity, false)
		WebUI.verifyMatch(projectState, prjState, false)
		WebUI.verifyMatch(projectCountry, prjCountry, false)
		//WebUI.verifyMatch(projectArea, prjArea, false)

	}


	@Keyword
	public void trialProjectDetailsVerificationBuildingAfterExcelUpload(String sheetName, int rowNum){
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String population 	= data.getCellData(sheetName, "Population", rowNum)

		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageProject'))
		WebUI.delay(6)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'), 20)
		String projectTextVerification= WebUI.getText(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'))
		WebUI.verifyMatch("Project", projectTextVerification, false)
		if((WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.delay(10)
		}
		String projectName= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value')
		String projectId= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectId'),'value')
		//String projectUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/unitType'),'value')
		String projectSpaceType=WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectSpaceType'), 'value')
		String projectAddress= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAddress'),'value')
		String projectCity= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCity'),'value')
		String projectState= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectState'),'value')
		String projectCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCountry'),'value')
		String projectPrivate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsPrivate'), 'value')
		String projectOwnerType= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerType'), 'value')
		String projectOwnerOrg= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerOrg'), 'value')
		String projectOwnerEmail= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerEmail'), 'value')
		String projectOwnerCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerCountry'), 'value')
		String projectIsLeedCertified= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsLeedCertified'),'value')
		String projectOtherCertPrg= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOtherCertiProgramPursued'), 'value')
		String projectContainsResUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsResidentialUnit'), 'value')
		String projectAffHigherInst= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsAffHigherEducation'), 'value')
		String projectLeedLab= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsAffLeedLab'), 'value')
		String projectYearBuilt = WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectYearBuilt'), 'value')
		String projectFloorAboveground= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectFloorAboveground'), 'value')
		String projectIntendPrecertify= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIntendToPrecertify'), 'value')
		String projectTargetCertDate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectTragetCertiDetails'), 'value')
		//String projectWeeklyOprHrs= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectWeeklyOpreatingHours'), 'value')
		//String projectOperationalDay= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOpreationalDay'), 'value')
		//String projectOccupancy= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOccupancy'), 'value')
		//String projectArea= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectArea'),'value')

		WebUI.verifyMatch(projectName, prjName, false)
		WebUI.verifyMatch(projectId, prjId, false)
		//WebUI.verifyMatch(projectUnit,"string:SI", false)
		WebUI.verifyMatch(projectAddress, prjAddress, false)
		WebUI.verifyMatch(projectSpaceType, "?", false)
		WebUI.verifyMatch(projectCity, prjCity, false)
		WebUI.verifyMatch(projectState, prjState, false)
		WebUI.verifyMatch(projectCountry, prjCountry, false)
		WebUI.verifyMatch(projectPrivate, "boolean:false", false)
		WebUI.verifyMatch(projectOwnerType, "?", false)
		WebUI.verifyMatch(projectOwnerOrg, "", false)
		WebUI.verifyMatch(projectOwnerEmail, "", false)
		WebUI.verifyMatch(projectOwnerCountry, "", false)
		WebUI.verifyMatch(projectIsLeedCertified, "boolean:false", false)
		WebUI.verifyMatch(projectOtherCertPrg, "?", false)
		WebUI.verifyMatch(projectContainsResUnit, "boolean:false", false)
		WebUI.verifyMatch(projectAffHigherInst, "boolean:false", false)
		WebUI.verifyMatch(projectLeedLab, "boolean:false", false)
		WebUI.verifyMatch(projectYearBuilt, "string:2017", false)
		WebUI.verifyMatch(projectFloorAboveground, "", false)
		WebUI.verifyMatch(projectIntendPrecertify, "boolean:false", false)
		//WebUI.verifyMatch(projectArea, prjArea, false)
		WebUI.verifyMatch(projectTargetCertDate, "", false)
		//WebUI.verifyMatch(projectWeeklyOprHrs, "30", false)
		//WebUI.verifyMatch(projectOperationalDay, "313", false)
		//WebUI.verifyMatch(projectOccupancy, "9", false)

	}


	//*************** Trial Project Building Transit Details Verification ***************//
	@Keyword
	public void trialProjectDetailsVerificationBuildingTransit(String sheetName, int rowNum){
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String stationType  = data.getCellData(sheetName, "is_station", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String annualRidership  = data.getCellData(sheetName,"annual_ridership", rowNum)
		String fullTimeStaffAtStn= data.getCellData(sheetName,"fulltime_staff", rowNum)
		String avgTimeSpent      = data.getCellData(sheetName,"avg_time_spent", rowNum)
		String weeklyOprHrs      = data.getCellData(sheetName,"week_opr_hrs", rowNum)

		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageProject'))
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'), 20)
		String projectTextVerification= WebUI.getText(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'))
		WebUI.verifyMatch("Project", projectTextVerification, false)
		if((WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.delay(10)
		}

		String projectName= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value')
		String projectId= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectId'),'value')
		String projectUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/unitType'),'value')
		String projectSpaceType= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectSpaceType'), 'value')
		String projectIsStation= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsStationType'), 'value')
		String projectAddress= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAddress'),'value')
		String projectCity= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCity'),'value')
		String projectState= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectState'),'value')
		String projectCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCountry'),'value')
		String projectPrivate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsPrivate'), 'value')
		String projectOwnerType= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerType'), 'value')
		String projectOwnerOrg= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerOrg'), 'value')
		String projectOwnerEmail= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerEmail'), 'value')
		String projectOwnerCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerCountry'), 'value')
		String projectIsLeedCertified= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsLeedCertified'),'value')
		String projectOtherCertPrg= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOtherCertiProgramPursued'), 'value')
		String projectContainsResUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsResidentialUnit'), 'value')
		String projectAffHigherInst= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsAffHigherEducation'), 'value')
		String projectLeedLab= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsAffLeedLab'), 'value')
		String projectYearBuilt = WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectYearBuilt'), 'value')
		String projectFloorAboveground= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectFloorAboveground'), 'value')
		String projectIntendPrecertify= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIntendToPrecertify'), 'value')
		String projectTargetCertDate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectTragetCertiDetails'), 'value')
		String projectAnnualRidership= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAnnulaRidership'), 'value')
		String projectFullTimeStaff= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectFullTimeStaff'), 'value')
		String projectAverageTimeSpent= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAvgTimeSpentByRider'), 'value')
		String projectWeeklyOprHrs= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectWeeklyOpreatingHours'), 'value')
		String projectOperationalDay= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOpreationalDay'), 'value')
		String projectOccupancy= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOccupancy'), 'value')
		String projectArea= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectArea'),'value')

		WebUI.verifyMatch(projectName, prjName, false)
		WebUI.verifyMatch(projectId, prjId, false)
		WebUI.verifyMatch(projectUnit,"string:IP", false)
		WebUI.verifyMatch(projectAddress, prjAddress, false)
		WebUI.verifyMatch(projectSpaceType, "?", false)
		WebUI.verifyMatch(projectIsStation, stationType, false)
		WebUI.verifyMatch(projectCity, prjCity, false)
		WebUI.verifyMatch(projectState, prjState, false)
		WebUI.verifyMatch(projectCountry, prjCountry, false)
		WebUI.verifyMatch(projectPrivate, "boolean:false", false)
		WebUI.verifyMatch(projectOwnerType, "?", false)
		WebUI.verifyMatch(projectOwnerOrg, "", false)
		WebUI.verifyMatch(projectOwnerEmail, "", false)
		WebUI.verifyMatch(projectOwnerCountry, "", false)
		WebUI.verifyMatch(projectIsLeedCertified, "boolean:false", false)
		WebUI.verifyMatch(projectOtherCertPrg, "?", false)
		WebUI.verifyMatch(projectContainsResUnit, "boolean:false", false)
		WebUI.verifyMatch(projectAffHigherInst, "boolean:false", false)
		WebUI.verifyMatch(projectLeedLab, "boolean:false", false)
		WebUI.verifyMatch(projectYearBuilt, "string:2017", false)
		WebUI.verifyMatch(projectFloorAboveground, "", false)
		WebUI.verifyMatch(projectIntendPrecertify, "boolean:false", false)
		WebUI.verifyMatch(projectArea, prjArea, false)
		WebUI.verifyMatch(projectTargetCertDate, "", false)
		WebUI.verifyMatch(projectAnnualRidership, annualRidership, false)
		WebUI.verifyMatch(projectFullTimeStaff, fullTimeStaffAtStn, false)
		WebUI.verifyMatch(projectAverageTimeSpent, avgTimeSpent, false)
		WebUI.verifyMatch(projectWeeklyOprHrs, weeklyOprHrs, false)
		WebUI.verifyMatch(projectOperationalDay, "313", false)
		//WebUI.verifyMatch(projectOccupancy, "9", false)
	}



	//*************** Trial Project Building Transit Details Verification After Excel Upload ***************//
	@Keyword
	public void trialProjectDetailsVerificationBuildingTransitAfterExcelUpload(String sheetName, int rowNum){
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String stationType  = data.getCellData(sheetName, "is_station", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String annualRidership  = data.getCellData(sheetName,"annual_ridership", rowNum)
		String fullTimeStaffAtStn= data.getCellData(sheetName,"fulltime_staff", rowNum)
		String avgTimeSpent      = data.getCellData(sheetName,"avg_time_spent", rowNum)
		String weeklyOprHrs      = data.getCellData(sheetName,"week_opr_hrs", rowNum)

		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageProject'))
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'), 20)
		String projectTextVerification= WebUI.getText(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'))
		WebUI.verifyMatch("Project", projectTextVerification, false)
		if((WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.delay(10)
		}
		String projectName= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value')
		String projectId= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectId'),'value')
		//String projectUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/unitType'),'value')
		String projectSpaceType= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectSpaceType'), 'value')
		String projectIsStation= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsStationType'), 'value')
		String projectAddress= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAddress'),'value')
		String projectCity= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCity'),'value')
		String projectState= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectState'),'value')
		String projectCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCountry'),'value')
		String projectPrivate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsPrivate'), 'value')
		String projectOwnerType= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerType'), 'value')
		String projectOwnerOrg= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerOrg'), 'value')
		String projectOwnerEmail= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerEmail'), 'value')
		String projectOwnerCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOwnerCountry'), 'value')
		String projectIsLeedCertified= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsLeedCertified'),'value')
		String projectOtherCertPrg= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOtherCertiProgramPursued'), 'value')
		String projectContainsResUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsResidentialUnit'), 'value')
		String projectAffHigherInst= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsAffHigherEducation'), 'value')
		String projectLeedLab= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsAffLeedLab'), 'value')
		String projectYearBuilt = WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectYearBuilt'), 'value')
		String projectFloorAboveground= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectFloorAboveground'), 'value')
		String projectIntendPrecertify= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIntendToPrecertify'), 'value')
		String projectTargetCertDate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectTragetCertiDetails'), 'value')
		String projectAnnualRidership= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAnnulaRidership'), 'value')
		String projectFullTimeStaff= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectFullTimeStaff'), 'value')
		String projectAverageTimeSpent= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAvgTimeSpentByRider'), 'value')
		//String projectWeeklyOprHrs= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectWeeklyOpreatingHours'), 'value')
		//String projectOperationalDay= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOpreationalDay'), 'value')
		String projectOccupancy= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectOccupancy'), 'value')
		//String projectArea= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectArea'),'value')

		WebUI.verifyMatch(projectName, prjName, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectId, prjId, false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(projectUnit,"string:IP", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectAddress, prjAddress, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectSpaceType, "?", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(projectIsStation, stationType, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectCity, prjCity, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectState, prjState, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectCountry, prjCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectPrivate, "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectOwnerType, "?", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectOwnerOrg, "", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectOwnerEmail, "", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectOwnerCountry, "", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectIsLeedCertified, "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectOtherCertPrg, "?", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectContainsResUnit, "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectAffHigherInst, "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectLeedLab, "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectYearBuilt, "string:2017", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectFloorAboveground, "", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectIntendPrecertify, "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(projectArea, "2000", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectTargetCertDate, "", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectAnnualRidership, "20000", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectFullTimeStaff, "8", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectAverageTimeSpent, "16", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(projectWeeklyOprHrs, "100", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(projectOperationalDay, "313", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(projectOccupancy, "9", false, FailureHandling.CONTINUE_ON_FAILURE)
	}


	//*********************** Trial Project Details City Comm **********************//
	@Keyword
	public void trialProjectDetailsVerificationCityCommAfterExcelUpload(String sheetName, int rowNum){
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String population 	= data.getCellData(sheetName, "Population", rowNum)


		WebUI.click(findTestObject('Object Repository/DashboardNavigationNewUI/manageProject'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'), 20)
		String projectTextVerification= WebUI.getText(findTestObject('Object Repository/DashboardNavigationNewUI/projectPageProjectTextVerification'))
		WebUI.verifyMatch("Project", projectTextVerification, false)
		if((WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.delay(10)
		}

		String projectName= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectName'),'value')
		String projectId= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectId'),'value')
		String projectUnit= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/unitType'),'value')
		String projectAddress= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectAddress'),'value')
		String projectCity= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCity'),'value')
		String projectState= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectState'),'value')
		String projectCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCountry'),'value')
		String projectArea= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectArea'),'value')
		String projectPrivate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIsPrivate'), 'value')
		String projectYearBuilt = WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectYearBuilt'), 'value')
		String projectOccupancy= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectCityPopulation'), 'value')
		String projectIntendPrecertify= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectIntendToPrecertify'), 'value')
		String projectTargetCertDate= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectTragetCertiDetails'), 'value')
		String projectManageEntityName= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectManageEntityName'), 'value')
		String projectManageEntityAdd1= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectManageEntityAdd1'), 'value')
		String projectManageEntityAdd2= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectManageEntityAdd2'), 'value')
		String projectManageEntityCity= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectManageEntityCity'), 'value')
		String projectManageEntityCountry= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectManageEntityCountry'), 'value')
		String projectManageEntityState= WebUI.getAttribute(findTestObject('Object Repository/ManageNewUI/projectManageEntityState'), 'value')

		WebUI.verifyMatch(projectName, prjName, false)
		WebUI.verifyMatch(projectId, prjId, false)

		if(GlobalVariable.environment=='dev'){
			WebUI.verifyMatch(projectUnit,"string:SI", false)
			WebUI.verifyMatch(projectArea, "48", false)		}
		else{
			WebUI.verifyMatch(projectUnit,"string:IP", false)
			WebUI.verifyMatch(projectArea, prjArea, false)
		}
		WebUI.verifyMatch(projectAddress, prjAddress, false)
		WebUI.verifyMatch(projectCity, prjCity, false)
		WebUI.verifyMatch(projectState, prjState, false)
		WebUI.verifyMatch(projectCountry, prjCountry, false)
		WebUI.verifyMatch(projectPrivate, "boolean:false", false)
		WebUI.verifyMatch(projectYearBuilt, "?", false)
		WebUI.verifyMatch(projectOccupancy, population, false)
		WebUI.verifyMatch(projectIntendPrecertify, "boolean:false", false)
		WebUI.verifyMatch(projectTargetCertDate, "", false)
		WebUI.verifyMatch(projectManageEntityName, "", false)
		WebUI.verifyMatch(projectManageEntityAdd1, "", false)
		WebUI.verifyMatch(projectManageEntityAdd2, "", false)
		WebUI.verifyMatch(projectManageEntityCity, "", false)
		WebUI.verifyMatch(projectManageEntityCountry, "? object:null ?", false)
		WebUI.verifyMatch(projectManageEntityState, "", false)


	}
	@Keyword
	public void verifyProjectDetailsCityCom(String sheetName, int rowNum) throws IOException, InterruptedException {
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String population 	= data.getCellData(sheetName, "Population", rowNum)

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.delay(10)
		}

		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value'),prjName, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectId'),'value'),prjId, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAddress'),'value'),prjAddress, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCity'),'value'), prjCity, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectState'),'value'), prjState, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCountry'),'value'),prjCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjPrivate'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerType'),'value'),"string:"+ownerType)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerOrg'),'value'),ownerOrg)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerCountry'),'value'),ownerCountry)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerEmail'),'value'),ownerEmail)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/population'),'value'),population, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/precertify'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void editProjectDetailsCityCom( String sheetName, int rowNum) throws IOException, InterruptedException {

		String editArea  = data.getCellData(sheetName, "editArea", rowNum)
		String editPopulation  = data.getCellData(sheetName, "editPopulation", rowNum)
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('Manage/Parking/Manage'))
		 WebUI.delay(1)*/
		WebUI.click(findTestObject('Manage/Parking/ManageProject'))
		WebUI.delay(2)

		WebUI.clearText(findTestObject('Manage/CityCom/input_grossArea'))
		WebUI.sendKeys(findTestObject('Manage/CityCom/input_grossArea'),editArea )
		WebUI.click(findTestObject('Object Repository/Manage/CityCom/ClickSave'))
		WebUI.delay(2)

		WebUI.clearText(findTestObject('Manage/CityCom/input_population'))
		WebUI.sendKeys(findTestObject('Manage/CityCom/input_population'),editPopulation)
		WebUI.click(findTestObject('Object Repository/Manage/CityCom/ClickSave'))
		WebUI.delay(6)

		WebUI.refresh()
		WebUI.delay(2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/CityCom/input_grossArea'),"value"),editArea ,"Not Equal")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/CityCom/input_population'),"value"), editPopulation ,"Not Equal")
	}

	@Keyword
	public editOccupanyAreaAndOpreatingHours(){

		ReusNavigate.navigateIntoDataInput()
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHourDropdown'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/OperatingHourValue168'),5)
		Thread.sleep(2000)

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHourValue168'))
		Thread.sleep(2000)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		//WebUI.click(findTestObject('Object Repository/DataInput/SaveButtonBuildingSetting'))

		/*	//Edit Occupancy
		 WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), 5)
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		 WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy'), 5)
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy'))
		 Thread.sleep(1000)
		 WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		 WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		 WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '2,000')
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		 Thread.sleep(2000)
		 WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		 WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)*/

		//WebUI.click(findTestObject('Object Repository/DataInput/SaveButtonBuildingSetting'))

		/*//Edit area
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		 WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'), 5)
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'))
		 Thread.sleep(3000)
		 WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '5500')
		 Thread.sleep(2000)
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		 Thread.sleep(2000)*/
		//WebUI.click(findTestObject('Object Repository/DataInput/SaveButtonBuildingSetting'))

		/*WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/opreating_Hours'))
		 WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/selectOpreatinghours'), 1)
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/selectOpreatinghours'))
		 WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingOccupancy'), '2,000')
		 WebUI.clearText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'))
		 WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'), '5500')
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/updateBuildingSettingButton'))*/
		//WebUI.delay(4)
	}

	@Keyword
	public editOccupanyAreaAndOpreatingHoursAnalyticManage(){

		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))

		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHourDropdown'))
		Thread.sleep(2000)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/OperatingHours160'),5)
		Thread.sleep(1000)

		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHours160'))
		Thread.sleep(5000)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'))
		Thread.sleep(1000)
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '10000')
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		Thread.sleep(5000)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/UnitTypeDorpdown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/SI'), 2)
		WebUI.click(findTestObject('Object Repository/DataInput/SI'))
		Thread.sleep(4000)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)



		/************************Verifying under Manage Section *****************************************/

		//WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		//WebUI.delay(6)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/unitType'),'value'),"string:SI", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_grossArea'),'value'),'10000', false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/week_opr_hrs'),'value'),'160', false, FailureHandling.CONTINUE_ON_FAILURE)

		/************************Verifying under Analytics Section *****************************************/

		ReusNavigate.navigateToAnalyticsTotal()

		String area = WebUI.getText(findTestObject('Analytics/TotalAnalytics/Area'))
		WebUI.verifyMatch(area,'10,000', false)

		String operatinghour = WebUI.getText(findTestObject('Analytics/TotalAnalytics/OpeartingHour'))
		WebUI.verifyMatch(operatinghour,'160', false)

		/*	String occupancy = WebUI.getText(findTestObject('Analytics/TotalAnalytics/Occupant'))
		 WebUI.verifyMatch(occupancy,'10', false)*/

		WebUI.verifyElementPresent(findTestObject('DataInput/Data/span_(sq. meters)'),2, FailureHandling.CONTINUE_ON_FAILURE)

	}


	// Building setting validation
	@Keyword
	public void validateSettingOperatingHours(){

		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(13)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle')),"Building Settings", false)
		Thread.sleep(2000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		Thread.sleep(3000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'), 10)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2019'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2019'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '169')
		WebUI.click(findTestObject('Object Repository/DataInput/SaveButtonBuildingSetting'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/OperatingHourErrorMessage'), 8)
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/OperatingHourErrorMessage'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourErrorMessage')), "Ensure this value is less than or equal to 168.", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '0')
		WebUI.click(findTestObject('Object Repository/DataInput/SaveButtonBuildingSetting'))
		WebUI.delay(6)
		if((WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourDropdown')).equals("0 Hour"))){
			KeywordUtil.markFailed("Operating Hour Should be Greater than 0 and less than 168")
		}

	}



	@Keyword
	public editOccupanyAreaAndOpreatingHoursTransit(){
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(10)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/opreating_Hours'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/selectOpreatinghours'), 1)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/selectOpreatinghours'))
		//WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingOccupancy'), '2,000')
		WebUI.clearText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'), '5500')
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/updateBuildingSettingButton'))
		WebUI.delay(4)
	}

	@Keyword
	public void downloadAndUploadArcCalculatorDataTemplate(){
		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'), 2)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/Project/calculator'))
		WebUI.delay(5)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/Manage/Project/CalculatorPopupText')), 'UPLOAD METER DATA')
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Manage/Project/excelTemplateDownload'))
		WebUI.delay(6)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(5)
		Assert.assertTrue(ReusDataInput.isFileDownloaded("Arc_Data_Template_building_v4.1.xlsm"), "Calculator template file didn't downloaded successfully")
		WebUI.delay(3)
		deleteFile(BaseClass.DownloadManageCalculatorExcel)
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/Manage/Project/uploadCalculatorTemplate'),BaseClass.UploadManageCalculatorExcel )
		WebUI.delay(6)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/Project/closeBtn'), 15)
		WebUI.click(findTestObject('Object Repository/Manage/Project/closeBtn'))
		WebUI.delay(10)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_grossArea'),'value'),'12345', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'),'value'),'50', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'),'value'),'1000', false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public geditOccupanyAreaAndOpreatingHours(){

		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/opreating_Hours'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/selectOpreatinghours'), 1)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/selectOpreatinghours'))

		WebUI.clearText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingOccupancy'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingOccupancy'), '9')

		WebUI.clearText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'), '10000')

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/updateBuildingSettingButton'))
		WebUI.delay(9)

		/*	WebUI.click(findTestObject('Portfolio/GRESB/Setting/button_CANCEL'))
		 WebUI.delay(10)
		 */

	}
	@Keyword
	public operatioanlDays(){

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Building Settings'), 60)
		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		WebUI.delay(4)

		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Setting/Setting'), 60)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Setting/Setting'), 60)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/Setting'), 10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/Setting'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/Setting'))
		WebUI.delay(5)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/a_Operational Days'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/a_Operational Days'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/a_Operational Days'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'value'),'313', false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'314')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		WebUI.delay(10)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'value'),'314', false, FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void mofifyArea(){


		navigation.navigateIntoDataInput()
		setting.buildingSettings()
		setting.area()
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'1000')
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		WebUI.delay(7)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'value'),'1000', false, FailureHandling.CONTINUE_ON_FAILURE)

	}


	@Keyword
	public gverifyOperationalDay(){

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.doubleClick(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))

		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'),3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		String oppHour = WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/opreating_Hours'))
		WebUI.verifyMatch(oppHour,'160 Hours', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingOccupancy'),'value'),'9', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/buildingArea'),'value'),'10000', false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Portfolio/GRESB/Setting/button_CANCEL'))
		WebUI.delay(7)
	}




	@Keyword
	public gErrorReEnterDataNot(){
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Setting/p_Re-enter Occupancy'),2,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Setting/p_Re-enter OPPHour'),2,FailureHandling.CONTINUE_ON_FAILURE)
		//	WebUI.verifyElementPresent(findTestObject('Portfolio/GRESB/Setting/p_Re-enterArea'),2,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.click(findTestObject('Portfolio/GRESB/Setting/button_CANCEL'))
		WebUI.delay(10)

	}

	@Keyword
	public goccupancyErrorUpdate(){

		navigation.navigateIntoDataInput()
		setting.buildingSettings()
		setting.occupant()

		String population = WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		//WebUI.verifyMatch(population,'200Re-enter or change data', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/Re-enter or changedata'), FailureHandling.CONTINUE_ON_FAILURE)


		/*WebUI.waitForAngularLoad(120, FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.scrollToElement(findTestObject('DataInput/Survey/a_ Data Input'),5)
		 WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		 WebUI.delay(8)
		 WebUI.waitForElementClickable(findTestObject('Analytics/17/Building Settings'), 60)
		 WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		 WebUI.delay(4)
		 WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Setting/Setting'), 60)
		 WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Setting/Setting'), 60)
		 WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/Setting'), 10)
		 WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/Setting'), 3)
		 WebUI.click(findTestObject('Object Repository/DataInput/Setting/Setting'))
		 WebUI.delay(5)
		 WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/a_Occupancy'), 10)
		 WebUI.scrollToElement(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/a_Occupancy'), 3)
		 WebUI.click(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/a_Occupancy'))
		 WebUI.delay(5)
		 WebUI.verifyElementVisible(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/p_Re-enter or change data'), FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'9')
		 WebUI.delay(5)
		 WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		 WebUI.delay(10)
		 WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'value'),'9', false, FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.verifyElementNotVisible(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/p_Re-enter or change data'), FailureHandling.CONTINUE_ON_FAILURE)
		 */

	}

	@Keyword
	public void opeartingHour() {
		ReusNavigate.navigateIntoDataInput()

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHourDropdown'))
		WebUI.delay(2)

		WebUI.verifyElementVisible(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/p_Re-enter or change data'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/OPHour160'),5)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/OPHour160'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(120, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourDropdown')),"160 Hour", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotVisible(findTestObject('DataInput/Occupancy/OTracker/Page_Arc dashboard/p_Re-enter or change data'), FailureHandling.CONTINUE_ON_FAILURE)

	}


	//Verify operating hours, occupancy and area after uploading the excel template. For Building None, Other, City, Community Leed, None and Other
	@Keyword
	public void verifyOperatingHrsAreaAndOccupancyAfterExcelUpload(){

		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(10)
		//WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(3)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle')),"Building Settings", false)
		/*
		 findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown')
		 findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy')
		 findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea')
		 findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours')
		 findTestObject('Object Repository/DataInput/CreateMeterBuilding/OperationalDays')
		 */
		//operating hours
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		Thread.sleep(3000)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourDropdown')),"30 Hour", false,FailureHandling.CONTINUE_ON_FAILURE)
		Thread.sleep(2000)

		//Verify Occupancy
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), 5)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy'), 5)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy'))
		Thread.sleep(3000)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingRegularOccupantsReading'),20)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingRegularOccupantsReading')), '9',false,FailureHandling.CONTINUE_ON_FAILURE)
		Thread.sleep(2000)

		//verify Area
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), 5)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'), 5)
		Thread.sleep(1000)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'))
		Thread.sleep(3000)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),20)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'value'), '5000',false,FailureHandling.CONTINUE_ON_FAILURE)
		Thread.sleep(2000)

	}

	//Verify operating hours, occupancy and area after uploading the excel template. For Building None, Other, City, Community Leed, None and Other
	@Keyword
	public void verifyOperatingHrsAreaAndOccupancyAfterExcelUploadTrasit(){
		/*WebUI.delay(5)
		 WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		 WebUI.delay(3)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		 WebUI.delay(2)*/
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(2)

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'),'value'),'9', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		//operating hours
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourDropdown')),"160 Hour", false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		//verify Area
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), 5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'), 5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),20)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'),'value'), '10000',false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}


	@Keyword
	public void calcuateWeightedOccupancy(String sheetName, int rowNum) throws IOException, InterruptedException {

		/*	WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		 WebUI.delay(2)*/

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.minAngularWait)

		String annual_ridership  = data.getCellData(sheetName, "TMAnnualRidership", rowNum);
		String full_time_staff  = data.getCellData(sheetName, "TFulltimestaff", rowNum);
		String average_time = data.getCellData(sheetName, "TAveragetime", rowNum);
		String Weekly_Operating_hours = data.getCellData(sheetName, "TWeeklyOperatinghours", rowNum);

		WebUI.clearText(findTestObject('DataInput/WeightedOcc/Annual ridership'))
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/Annual ridership'), annual_ridership);
		WebUI.click(findTestObject('DataInput/WeightedOcc/Full time staff at stati'));
		WebUI.delay(1)

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		print "Entering Annual Ridership Value"

		WebUI.clearText(findTestObject('DataInput/WeightedOcc/Full time staff at stati'));
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/Full time staff at stati'), full_time_staff);
		WebUI.click(findTestObject('DataInput/WeightedOcc/Annual ridership'));
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		print "Entering Full time Staff deatils"

		WebUI.clearText(findTestObject('DataInput/WeightedOcc/Average time spent by ri'));
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/Average time spent by ri'), average_time);
		WebUI.click(findTestObject('DataInput/WeightedOcc/Annual ridership'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		print "Entering Average time spend by staff"

		//Navigate to data input section for operating hour
		ReusNavigate.navigateIntoDataInput()
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), GlobalVariable.minAngularWait)
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		//operating hours
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHourDropdown'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/OperatingHourDropdown14'),5)
		//WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '168')

		WebUI.click(findTestObject('Object Repository/DataInput/OperatingHourDropdown14'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourDropdown')),"14 Hour", false,FailureHandling.CONTINUE_ON_FAILURE)
		String opartinghours=WebUI.getText(findTestObject('Object Repository/DataInput/OperatingHourDropdown'))
		String[] oprHrs=opartinghours.split("\\s")
		System.out.println(opartinghours)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		//navigate back to manage project
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementVisible(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/WeightedOcc/Annual ridership'), 5)
		System.out.println("Fetching value");

		String ridership = WebUI.getAttribute(findTestObject('DataInput/WeightedOcc/Annual ridership'),'value')
		System.out.println(ridership);

		String full_time = WebUI.getAttribute(findTestObject('DataInput/WeightedOcc/Full time staff at stati'),'value')
		System.out.println(full_time)

		String avg_time= WebUI.getAttribute(findTestObject('DataInput/WeightedOcc/Average time spent by ri'),'value');
		System.out.println(avg_time)

		//Verifying all fetched data form the formula .
		Double dridership=Double.parseDouble(ridership);
		Double dfull_time=Double.parseDouble(full_time);
		Double davg_time =Double.parseDouble(avg_time);
		Double dopartinghours =Double.parseDouble(oprHrs[0]);

		long CWeightedOccupancy = Math.round((dfull_time+ ( dridership/365 * davg_time/60 )/(dopartinghours/2)));

		//Converting long to string
		String CalOccpancy = Long.toString(CWeightedOccupancy);
		String AWeightedOccupancy =WebUI.getAttribute(findTestObject('DataInput/WeightedOcc/WeightedOcc'),'value');
		System.out.println(AWeightedOccupancy);
		Assert.assertEquals(AWeightedOccupancy,CalOccpancy);
		println "verified Weighted Daily Occupancy with all calcation"
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}




	@Keyword
	public void verifyBuildingProjectDetails(String sheetName, int rowNum){

		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Manage/ProjectDetailVerification/projectName'), GlobalVariable.minAngularWait)


		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value'),prjName, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectId'),'value'),prjId, false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/unitType'),'value'),"string:IP", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/spaceType'),'value'),"string:"+spaceType, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAddress'),'value'),prjAddress, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCity'),'value'), prjCity, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectState'),'value'), prjState, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCountry'),'value'),prjCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjPrivate'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerType'),'value'),"string:"+ownerType, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerOrg'),'value'),ownerOrg, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerCountry'),'value'),ownerCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerEmail'),'value'),ownerEmail, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/preLEEDCertified'),'value'), "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/containsResUnits'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedHigherEducation'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedLEEDLab'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/precertify'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_grossArea'),'value'),prjArea, false, FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void occupancyShouldNotMoreThan168(String sheetName, int rowNum) throws IOException, InterruptedException {


		WebUI.clearText(findTestObject('DataInput/WeightedOcc/OperatingHour'));
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/OperatingHour'),'169');
		WebUI.click(findTestObject('DataInput/WeightedOcc/Annual ridership'));
		Thread.sleep(3000);
		WebUI.verifyElementPresent(findTestObject('Manage/ErrorMessage/ErrorMessage1'),3)

	}

	@Keyword
	public void verifyStringFieldValidationTest(String sheetName, int rowNum) throws IOException, InterruptedException {


		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/WeightedOcc/Annual ridership'), GlobalVariable.maxAngularWait)

		WebUI.clearText(findTestObject('DataInput/WeightedOcc/Annual ridership'))
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/Annual ridership'),'SDF');
		WebUI.click(findTestObject('DataInput/WeightedOcc/Full time staff at stati'));

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/ErrorMessage/AnnualRidershipErrorMessage'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.clearText(findTestObject('DataInput/WeightedOcc/Full time staff at stati'));
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/Full time staff at stati'),'XYZ');
		WebUI.click(findTestObject('DataInput/WeightedOcc/Annual ridership'));

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.verifyElementVisible(findTestObject('Manage/ErrorMessage/ErrorMessage2'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.clearText(findTestObject('DataInput/WeightedOcc/Average time spent by ri'));
		WebUI.sendKeys(findTestObject('DataInput/WeightedOcc/Average time spent by ri'),'XYZ');
		WebUI.click(findTestObject('DataInput/WeightedOcc/Annual ridership'));

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.verifyElementVisible(findTestObject('Manage/ErrorMessage/ErrorMessage3'), FailureHandling.CONTINUE_ON_FAILURE)


	}


	@Keyword
	public void verifyTransitProjectDetails(String sheetName, int rowNum){
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String annualRidership  = data.getCellData(sheetName,"annual_ridership", rowNum)
		String fullTimeStaffAtStn= data.getCellData(sheetName,"fulltime_staff", rowNum)
		String avgTimeSpent      = data.getCellData(sheetName,"avg_time_spent", rowNum)
		String weeklyOprHrs      = data.getCellData(sheetName,"week_opr_hrs", rowNum)

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Manage/ProjectDetailVerification/projectName'), GlobalVariable.minAngularWait)
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value').equalsIgnoreCase(''))){
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value'),prjName, false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/unitType'),'value'),"string:IP", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/spaceType'),'value'),"string:"+spaceType, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAddress'),'value'),prjAddress, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCity'),'value'), prjCity, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectState'),'value'), prjState, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectCountry'),'value'),prjCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjPrivate'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerType'),'value'),"string:"+ownerType, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerOrg'),'value'),ownerOrg, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerCountry'),'value'),ownerCountry, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerEmail'),'value'),ownerEmail, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/preLEEDCertified'),'value'), "boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/containsResUnits'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedHigherEducation'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedLEEDLab'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/precertify'),'value'),"boolean:false", false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_grossArea'),'value'),prjArea, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/stationType'),'value'),"aboveground", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/annualRidership'),'value'),annualRidership, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/fullTimeStaffAtStn'),'value'),fullTimeStaffAtStn, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/avgTimeSpent'),'value'),avgTimeSpent, false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/week_opr_hrs'),'value'),weeklyOprHrs, false, FailureHandling.CONTINUE_ON_FAILURE)

	}




	@Keyword
	public void verifyEnergyPortfolioManagerAppInstallByDefault(){

		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/App/a_ Apps'),2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

		println "Verify Portfolio Manager App present"
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/BPortfolioManager'))
		/*String text = WebUI.getText(findTestObject('Object Repository/Manage/App/BPortfolioManager'))
		 WebUI.verifyMatch(text,"Added",false, FailureHandling.CONTINUE_ON_FAILURE)
		 println "Uninstalling App and check uninstalled message."
		 WebUI.click(findTestObject('Object Repository/Manage/App/BPortfolioManager'))
		 WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		 WebUI.waitForElementClickable(findTestObject('Object Repository/Manage/App/BPortfolioManager'), GlobalVariable.maxAngularWait)
		 WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/AppUninstalledMessage'), GlobalVariable.minAngularWait)
		 WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/App/AppUninstalledMessage'), GlobalVariable.minAngularWait)
		 */	}


	@Keyword
	public void verifyOccAndOprHrsNotZero(String sheetName, int rowNum){

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'), 2)

		println "Verify if the value of occupancy and operating hours are zero or not"
		Assert.assertNotEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'),'value'),0,"Not Valid")
		Assert.assertNotEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'),'value'),0,"Not Valid")
		println "Verified successfully the value of occupancy and operating hours are not zero"
	}

	@Keyword
	public void verifyManageProjectOccAndOprHrsNotZero(String sheetName, int rowNum){

		ReusNavigate.navigateIntoDataInput()

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), 10)
		//WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(1)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle')),"Building Settings", false)
		//operating hours
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOccupancy'))

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '0')
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/OccupancyErrorMessage'))
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingDataFieldOne'), '9')
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

		println "Verified successfully the value of occupancy and operating hours are not zero"
	}

	@Keyword
	public void verifyTransitOccAndOprHrsNotZero(String sheetName, int rowNum){


		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/ProjectDetailVerification/input_operatingHours'), 2)

		println "Verify if the value of occupancy and operating hours are zero or not"

		/*WebUI.clearText(findTestObject('Object Repository/Manage/ProjectDetailVerification/input_operatingHours'))
		 WebUI.sendKeys(findTestObject('Object Repository/Manage/ProjectDetailVerification/input_operatingHours'),'0')*/
		WebUI.setText(findTestObject('Object Repository/Manage/ProjectDetailVerification/input_operatingHours'),'0')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		//WebUI.click(findTestObject('Manage/ProjectdetailVerification/input_operatingHours'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/ProjectDetailVerification/oprHrsErrorMessage'))
		println "Verified successfully the value of Transit occupancy and operating hours are not zero"
	}

	@Keyword
	public void verifyFieldNumOfResUnitPresent(String sheetName, int rowNum){

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('Manage/Project/is_Residential'), 1)
		println "Verify if the text 'Number of Residential Unit' present"
		WebUI.selectOptionByLabel(findTestObject('Manage/Project/is_Residential'), 'Yes', false)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/Project/label_NumberOfResidentialunit'), 2)
		println "Verified successfully the text 'Number of Residential Unit' is present"
	}

	@Keyword
	public void verifyNameOfSchoolFieldPresent(String sheetName, int rowNum){

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/Project/Is_affiliatedHigherEducation'), 2)
		println "Verify the field 'Name of the School' is visible, if option for 'Is project affiliated with a higher education institute?' chosen as 'Yes'"
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Manage/Project/Is_affiliatedHigherEducation'), 'Yes', true)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Project/nameOfTheSchool')))
		println "Verified successfully the text 'Name of School' is present"
	}

	@Keyword
	public void VerifyGFAUnitOnChangeOfUnitsIPAndSI(String sheetName, int rowNum){

		ReusNavigate.navigateIntoDataInput()
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'),GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'),GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'), 5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingSettingTitle')),"Building Settings", false)
		println "Verify if the unit changes on the changing of unit type."
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), 10)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectGrossFloorArea'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/UnitTypeSelectButtonArea'), 20)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/UnitTypeSelectButtonArea')),"IP units (sq feet)",false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/UnitTypeHeader')), "GROSS AREA (square feet)", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		println "Verified successfully unit changes on the selection of SI and IP unit types."
	}

	@Keyword
	public void verifyCalculatorLinkPresent(String sheetName, int rowNum){
		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(3)
		println "Verify if the calculator hyperlink present on the Manage section."
		WebUI.scrollToElement(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'), 2)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/Project/calculator'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/Project/CalculatorPopupText')), 'UPLOAD METER DATA' , false)
		println "Verified successfully calculate hyperlink present on the Manage section."
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Manage/Project/CloseCalculatorPopUp'))

	}

	@Keyword
	public void verifyOccEffectiveDate(String sheetName, int rowNum){

		//String effectiveDate     = data.getCellData(sheetName, "EffectiveAt", rowNum)
		String occupancy     = data.getCellData(sheetName, "occupancy", rowNum)

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(3)
		println "Verify if the effective date visible on updating the occupancy"
		WebUI.scrollToElement(findTestObject('Manage/Project/label_occupancy'), 1)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Manage/ProjectdetailVerification/projectoccupancy'),occupancy)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/ProjectdetailVerification/input_operatingHours'))
		WebUI.delay(6)
		def effectiveDate = WebUI.getText(findTestObject('Manage/Project/effectiveDate'))
		println "............................................."+effectiveDate
		WebUI.delay(2)
		SimpleDateFormat month = new SimpleDateFormat("MMM")
		SimpleDateFormat day = new SimpleDateFormat("dd")
		SimpleDateFormat year = new SimpleDateFormat("YYYY")
		//+" at " + date.format('hh:mm a')
		def dateNew = "(Effective At: "+ month.format(new Date()) +" " +day.format(new Date()) +", " +year.format(new Date())
		println "............................................."+dateNew
		String [] effectiveDateNew = effectiveDate.split("at", 2)
		println "............................................."+ effectiveDateNew[0]
		WebUI.verifyMatch(effectiveDateNew[0], dateNew+" ", true)
		println "Verified successfully effective date visible on updating the occupancy."
	}



	public static void datePickerTargetCertiDate(){

		WebUI.click(findTestObject('Manage/ProjectDetailVerification/targetDate'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickOnCalender'))
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickDateSwitch'), 5)
		WebUI.click(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickDateSwitch'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickMonthSwitch'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickYearToSelect'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickMonthToSelect'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/ProjectDetailVerification/Target Date Picker/ClickDateToSelect'))

	}


	@Keyword
	public void EditFieldsOnBuildingManageProject(String sheetName, int rowNum){

		//ReusNavigate.navigateToManageSection()
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(3)

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)


		println "Verify if the fields on Manage project section are editable."
		String num = CommonMethod.randomNumber()
		WebUI.setText(findTestObject('Manage/ProjectDetailVerification/projectName'),"Test building None "+num)
		WebUI.delay(2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value'),"Test building None "+num,"Not Valid")

		//WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/unitType'), 'SI', false)
		//WebUI.delay(2)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/unitType'),'value'),"string:SI","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/spaceType'), 'Data Center', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/spaceType'),'value'),"string:Data Center","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/prjPrivate'), 'No', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjPrivate'),'value'),"boolean:false","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/ownerType'), 'Investor: Bank', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/ownerType'),'value'),"string:Investor: Bank","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/preLEEDCertified'), 'Yes', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/preLEEDCertified'),'value'),"boolean:true","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/otherCertiPrgrm'), 'Other', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/otherCertiPrgrm'),'value'),"string:Other","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/containsResUnits'), 'Yes', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/containsResUnits'),'value'),"boolean:true","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedHigherEducation'), 'Yes', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedHigherEducation'),'value'),"boolean:true","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedLEEDLab'), 'No', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjAffiliatedLEEDLab'),'value'),"boolean:false","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/yearBuilt'), '1992', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/yearBuilt'),'value'),"string:1992","Not Valid")

		//WebUI.clearText(findTestObject('Manage/ProjectDetailVerification/input_grossArea'))
		//WebUI.sendKeys(findTestObject('Manage/ProjectDetailVerification/input_grossArea'),"3000" )
		//WebUI.delay(1)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_grossArea'),'value'), "3000","Not Valid")

		WebUI.selectOptionByLabel(findTestObject('Manage/ProjectDetailVerification/precertify'), 'Yes', false)
		WebUI.delay(3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/precertify'),'value'),"boolean:true","Not Valid")

		WebUI.scrollToElement(findTestObject('Manage/ProjectDetailVerification/floorsAboveGround'), 1)

		WebUI.clearText(findTestObject('Manage/ProjectDetailVerification/floorsAboveGround'))
		WebUI.sendKeys(findTestObject('Manage/ProjectDetailVerification/floorsAboveGround'),"10")
		WebUI.delay(1)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/floorsAboveGround'),'value'),"10","Not Valid")

		//WebUI.clearText(findTestObject('Manage/ProjectDetailVerification/targetDate'))
		//WebUI.sendKeys(findTestObject('Manage/ProjectDetailVerification/targetDate'),"Oct 22, 2028")
		//datePickerTargetCertiDate()
		//WebUI.delay(5)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/targetDate'),'value'), "Oct 11, 2020","Not Valid")
		//WebUI.click(findTestObject('Manage/ProjectDetailVerification/floorsAboveGround'))

		//WebUI.clearText(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'))
		//WebUI.sendKeys(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'),"10")
		///WebUI.delay(1)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/input_operatingHours'),'value'),"10","Not Valid")

		//WebUI.clearText(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'))
		//WebUI.sendKeys(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'),"300")
		////WebUI.delay(1)
		///Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectoccupancy'),'value'),"300","Not Valid")

		println "Verified successfully fields are editable on Manage project section."
	}

	@Keyword
	public void EditParksmartFieldsOnManageProject(String sheetName, int rowNum){
		WebUI.clearText(findTestObject('Manage/Parking/ParkingLevels'))
		WebUI.sendKeys(findTestObject('Manage/Parking/ParkingLevels'),"10")
		WebUI.delay(1)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/Parking/ParkingLevels'),'value'),"10", false, FailureHandling.CONTINUE_ON_FAILURE)
	}


	//Manage Team Methods
	@Keyword
	public void verifyprjAdminAndArcAdministratorinTeamSection(String sheetName, int rowNum){
		String prjTeamAdminName= GlobalVariable.projectTeamAdminAndArcAdminName
		String prjTeamAdminEmail= GlobalVariable.projectTeamAdminAndArcAdminEmail
		String prjTeamArcAdministratorName= GlobalVariable.projectTeamAdminAndArcAdminName
		String prjTeamArcAdministratorEmail= GlobalVariable.projectTeamAdminAndArcAdminEmail
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/TeamModule/prjAdminName'), GlobalVariable.avgAngularWait)
		String prjAdminName= WebUI.getText(findTestObject('Object Repository/Manage/TeamModule/prjAdminName'))
		WebUI.verifyMatch(prjAdminName, prjTeamAdminName, false, FailureHandling.CONTINUE_ON_FAILURE)
		String prjAdminAuthorizationLevel = WebUI.getText(findTestObject('Manage/TeamModule/prjAdminAuthorizationLevel'))
		WebUI.verifyMatch(prjAdminAuthorizationLevel,"Project Admin", false, FailureHandling.CONTINUE_ON_FAILURE)
		String prjAdminEmail= WebUI.getText(findTestObject('Manage/TeamModule/prjAdminEmail'))
		WebUI.verifyMatch(prjAdminEmail, prjTeamAdminEmail, false, FailureHandling.CONTINUE_ON_FAILURE)
		String prjArcAdministratorName= WebUI.getText(findTestObject('Object Repository/Manage/TeamModule/ArcAdministratorName'))
		WebUI.verifyMatch(prjArcAdministratorName, prjTeamArcAdministratorName, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/ArcAdministratorAuthorizationLevel'),"Arc Administrator", false, 1)
		String prjArcAdministratorEmail= WebUI.getText(findTestObject('Object Repository/Manage/TeamModule/ArcAdministratorEmail'))
		WebUI.verifyMatch(prjArcAdministratorEmail, prjTeamArcAdministratorEmail, false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void addTeamMember(){

		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)


		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/TeamModule/TeamMembersFirstRow'),GlobalVariable.avgAngularWait,FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.scrollToElement(findTestObject('Manage/TeamModule/input_input'), 2)
		WebUI.setText(findTestObject('Manage/TeamModule/input_input'),GlobalVariable.TeamMember)
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/TeamModule/button_Add Member'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/button_Add Member'), GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/TeamModule/newMemberAddedAuthorizationLevel'),30)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/newMemberAddedAuthorizationLevel'),"Team Member", false,10)
	}

	@Keyword
	public void projectManageState(){

		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.selectOptionByLabel(findTestObject('Manage/CityCom/New/ManageCountry'),"Sri Lanka", false)
		/*************Navigating to team section **************************************************************/
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		/****************Navigating to Manage project section *********************************/
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/CityCom/New/ManageState'), 'Not Available', false, 4, FailureHandling.STOP_ON_FAILURE)


	}

	@Keyword
	public void projectDetailsValidation(){
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'SDF')
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void manageProjectEntityNotEditable(String sheetName , int rowNum){

		String ownerCity    = data.getCellData(sheetName, "OwnerCity", rowNum)
		String address1     = data.getCellData(sheetName, "Address1", rowNum)
		String address2     = data.getCellData(sheetName, "Address2", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerState    = data.getCellData(sheetName, "OwnerState", rowNum)

		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		boolean notEditableName = WebUI.setText(findTestObject('Manage/ManageEntity/Managing entity Name'),'testName', FailureHandling.OPTIONAL)
		println ("DEBUG boolean value "+notEditableName)
		KeywordUtil.logInfo("Managing entity Name Not editable")
		boolean notEditableCity = WebUI.setText(findTestObject('Manage/ManageEntity/Managing entity City'), 'testCity', FailureHandling.OPTIONAL)
		println ("DEBUG boolean value "+notEditableCity)
		KeywordUtil.logInfo("Managing entity City is not editable")

		boolean notEditableAdd1 = WebUI.setText(findTestObject('Manage/ManageEntity/ManagingEntityAdd1'), 'testAdd1', FailureHandling.OPTIONAL)
		KeywordUtil.logInfo("Managing entity Address 1 is not editable")
		println ("DEBUG boolean value "+notEditableAdd1)


		boolean notEditableAdd2 = WebUI.setText(findTestObject('Manage/ManageEntity/ManagingEntityAdd2'), 'testAdd2', FailureHandling.OPTIONAL)
		KeywordUtil.logInfo("Managing entity Address 2 is not editable")
		println ("DEBUG boolean value "+notEditableAdd2)


		boolean notEditableCountry = WebUI.setText(findTestObject('Manage/ManageEntity/Manging Country'),'India',  FailureHandling.OPTIONAL)
		KeywordUtil.logInfo("Managing entity Country is not editable")
		println ("DEBUG boolean value "+notEditableCountry)

		boolean notEditableState = WebUI.setText(findTestObject('Manage/ManageEntity/Manging Country'),'Andaman and Nico.In.',  FailureHandling.OPTIONAL)
		KeywordUtil.logInfo("Managing entity State is not editable")
		println ("DEBUG boolean value "+notEditableState)


		String entityName = 	 WebUI.getAttribute(findTestObject('Manage/ManageEntity/Managing entity Name'), 'value')
		String entityCity = 	 WebUI.getAttribute(findTestObject('Manage/ManageEntity/Managing entity City'), 'value')
		String entityAdd1 = 	 WebUI.getAttribute(findTestObject('Manage/ManageEntity/ManagingEntityAdd1'), 'value')
		String entityAdd2 = 	 WebUI.getAttribute(findTestObject('Manage/ManageEntity/ManagingEntityAdd2'), 'value')

		WebUI.verifyMatch(entityName, 'Arc',false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(entityAdd1, address1,false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(entityAdd2, 'Green Street' , false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(entityCity, ownerCity, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyOptionSelectedByLabel(findTestObject('Manage/ManageEntity/Manging Country'), ownerCountry,,false, 3)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Manage/ManageEntity/ManagingState'), ownerState, ,false,3)

	}

	@Keyword
	public void manageEditProjectDetails(String sheetName , int rowNum){

		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjId        = data.getCellData(sheetName,"ProjectID", rowNum)
		String ownerType    = data.getCellData(sheetName,"OwnerType", rowNum)
		String ownerOrg     = data.getCellData(sheetName,"OwnerOrganization", rowNum)
		String ownerEmail   = data.getCellData(sheetName,"OwnerEmail", rowNum)
		String spaceType    = data.getCellData(sheetName,"SpaceType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String population 	= data.getCellData(sheetName, "Population", rowNum)

		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('Manage/ProjectDetailVerification/projectName'),'Changed Data LEEDV4 CityCom project')
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Manage/CityCom/New/Save'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.selectOptionByLabel(findTestObject('Manage/CityCom/New/private'), 'Yes', false)
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/CityCom/New/Save'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/projectName'),'value'),'Changed Data LEEDV4 CityCom project', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/prjPrivate'),'value'),"boolean:true", false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void deleteActivity(String sheetName, int rowNum) throws IOException, InterruptedException{
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "ADeatailsValueReading1", rowNum)
		String ureading1  = data.getCellData(sheetName, "ADeatailsUnitReading1", rowNum)
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CityCom/span_Additional Data'))
		WebUI.delay(9)
		WebUI.click(findTestObject('BasePoint/CityCom/ClickDropdown'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('BasePoint/CityCom/Option'+1),10)
		WebUI.delay(2)
		WebUI.click(findTestObject('BasePoint/CityCom/Option'+1))
		WebUI.click(findTestObject('BasePoint/CityCom/AddButton'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Avalue1'), reading1)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Aunit1'), ureading1)
		WebUI.click(findTestObject('DataInput/SaveButton'+1))
		WebUI.delay(5)
		WebUI.click(findTestObject('Manage/ErrorMessage/DeleteButton'))
		WebUI.delay(5)
		WebUI.verifyTextNotPresent("Post", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextNotPresent("Delete", false, FailureHandling.CONTINUE_ON_FAILURE)


	}


	@Keyword
	public void addInvalidTeamMember(){
		/*WebUI.delay(6)
		 WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(6)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		 */		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/input_input'), 2)
		WebUI.setText(findTestObject('Manage/TeamModule/input_input'),'xyzinvalidemailformat')
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Manage/TeamModule/button_Add Member'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String invalidemailformat = WebUI.getText(findTestObject('Manage/ErrorMessage/InvalidFormtError'))
		WebUI.verifyMatch(invalidemailformat,'Not a valid email', false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.clearText(findTestObject('Manage/TeamModule/input_input'))
		WebUI.setText(findTestObject('Manage/TeamModule/input_input'),'invalidemail@gmail.com')
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Manage/TeamModule/button_Add Member'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String invalidErrorMessage = WebUI.getText(findTestObject('Manage/ErrorMessage/TeamErrorClass'))
		WebUI.verifyMatch(invalidErrorMessage,"invalidemail@gmail.com is not a registered USGBC.org user, please have the user register at https://new.usgbc.org/registration/create-user and try again.", false, FailureHandling.CONTINUE_ON_FAILURE)


	}


	@Keyword
	public void projectStateNotAvaliable(){

		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.selectOptionByLabel(findTestObject('Manage/CityCom/New/ManageCountry'),"United States", false)
		/*************Navigating to team section **************************************************************/
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		/****************Navigating to Manage project section *********************************/
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/CityCom/New/ManageState'), 'Alabama', false, 4, FailureHandling.STOP_ON_FAILURE)


	}

	@Keyword
	public void addSameTeamMemberRoleAgain(){

		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/input_input'), 10)
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/input_input'), 2)
		WebUI.setText(findTestObject('Manage/TeamModule/input_input'),GlobalVariable.TeamMember)
		WebUI.click(findTestObject('Manage/TeamModule/button_Add Member'))

		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/button_Add Member'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/TeamModule/sameRoleAddAgainErrMsg'), 20)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/TeamModule/sameRoleAddAgainErrMsg'))
		WebUI.clearText(findTestObject('Manage/TeamModule/input_input'))

	}

	@Keyword
	public void editProjectAdminRole(){

		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.verifyElementNotPresent(findTestObject('Manage/TeamModule/prjAdminEditButton'), 3)
	}

	@Keyword
	public void editArcAdministratorRole(){

		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Manage/TeamModule/ArcAuthLevelSelect'), 20)
		WebUI.click(findTestObject('Manage/TeamModule/ArcAdministratorEditButton'))
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Manage/TeamModule/ArcAuthLevelSelect'), 'Team Member', false)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/TeamModule/ArcAdmistratorSaveBtn'))
		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/ArcAdmistratorSaveBtn'),GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Manage/TeamModule/atleastOneArcAdministratorPresentMsg'))
	}

	@Keyword
	public void editTeamManagerAndAddSecondArcAdministratorRole(){
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'), 20)
		WebUI.click(findTestObject('Manage/TeamModule/button_Edit'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.selectOptionByLabel(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'), 'Arc Administrator', false)
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/TeamModule/button_Save'))
		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/button_Save'), GlobalVariable.minAngularWait)

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/TeamRole'),"Arc Administrator", false,10)

	}

	@Keyword
	public void scoretextUpdate(){
		//WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Add_Project_Details/Star/Receive emails only when y'))
		WebUI.verifyElementVisible(findTestObject('Add_Project_Details/Star/Selecting Yes will show the'))
		WebUI.verifyElementVisible(findTestObject('Add_Project_Details/Star/Make Performance score pub'))
		WebUI.verifyElementVisible(findTestObject('Add_Project_Details/Star/p_Score Animation'))
		WebUI.verifyElementVisible(findTestObject('Add_Project_Details/Star/Get a detailed report when t'))


	}

	@Keyword
	public void editTeamMemberRole(){
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'),60)
		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/button_Edit'),20)
		WebUI.click(findTestObject('Manage/TeamModule/button_Edit'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.selectOptionByLabel(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'), 'Team Manager', false)
		WebUI.delay(2)
		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/button_Save'),20)
		WebUI.click(findTestObject('Manage/TeamModule/button_Save'))
		WebUI.waitForElementClickable(findTestObject('Manage/TeamModule/button_Save'), GlobalVariable.avgAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/TeamRole'),"Team Manager", false,10)
	}
	@Keyword
	public void verifyTeamMemberDefautRoleMem(){
		/*WebUI.delay(6)
		 WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(6)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))*/
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Manage/TeamModule/button_Edit'))
		/*****************Verifying default added role as team member **************************************************/ 
		WebUI.delay(5)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/TeamRole'),"Team Member", false,10)
	}

	@Keyword
	public void editTeamNonetoMemberRole(){
		/*WebUI.delay(6)
		 WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(6)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))*/
		/*	WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		 WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		 WebUI.delay(5)*/
		WebUI.click(findTestObject('Manage/TeamModule/button_Edit'))
		WebUI.selectOptionByLabel(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'), 'Team Member', false)
		WebUI.delay(3)
		WebUI.click(findTestObject('Manage/TeamModule/button_Save'))
		/*	WebUI.delay(2)
		 WebUI.verifyElementVisible(findTestObject('Manage/TeamModule/TeamMemberUpdateSuccessMsg'))*/
		WebUI.delay(10)
		//WebUI.waitForElementNotClickable(findTestObject('Object Repository/Manage/TeamModule/TeamRole'), 40)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/TeamRole'),"Team Member", false,10)
	}


	@Keyword
	public void editAuthLevelToNone(){
		ReusableMethodsDataInput.clickCancel()

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Manage/TeamModule/button_Edit'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.selectOptionByLabel(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'), 'None', false)
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Manage/TeamModule/button_Save'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/newMemberAddedAuthorizationLevel'),'None', false,10)

	}


	@Keyword
	public void verifyOnlyOneProjectAdminPresent(){

		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/TeamModule/RoleAdmin')),"Project Admin", false)

	}


	//Permission requests section is present
	@Keyword
	public void permissionRequestFieldVerification(){

		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/PermissionRequestTitle'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/EmailField'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/DataRequestField'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/StatusField'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/ActionsField'))
	}

	//Permission requests section is not present
	@Keyword
	public void permissionRequestFieldNotPresentVerification(){
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/PermissionRequestTitle'),5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/EmailField'),5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/DataRequestField'),5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/StatusField'),5)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/Manage/TeamModule/PermissionRequestSection/ActionsField'),5)
	}

	//Manage Billing Section


	public static String verifyBillingDate() throws IOException, InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, YYYY")
		LocalDateTime now = LocalDateTime.now()
		return dtf.format(now)
		System.out.println(dtf.format(now))
	}


	public static String currentTime() throws IOException, InterruptedException {
		Calendar cal = Calendar.getInstance()
		Date date=cal.getTime()
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a")
		String formattedDate=dateFormat.format(date)

	}

	@Keyword
	public void editAuthLevelNone(){
		/*	WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		 WebUI.delay(1)*/
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.delay(6)
		WebUI.click(findTestObject('Manage/TeamModule/button_Edit'))
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Manage/TeamModule/newMemberAddedAuthorizationLevel'),'None', false)
		WebUI.delay(3)
		WebUI.click(findTestObject('Manage/TeamModule/button_Save'))
		WebUI.delay(5)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/Manage/TeamModule/newMemberAddedAuthorizationLevel'),'None', false,10)
	}


	@Keyword
	public void verifyDeactivatedMemShouldNot(){
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(10)
		String memberName = WebUI.getText(findTestObject('DataInput/Team/Energy'))
		WebUI.delay(5)
		WebUI.verifyMatch(memberName,"", false)

	}

	@Keyword
	public void dataInputTeamShouldDisplay(){

		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('DataInput/Team/TeamLabel'),4,FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Team/Next'))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('DataInput/Team/TeamLabel'),4,FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Team/Next'))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('DataInput/Team/TeamLabel'),4,FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Team/Next'))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('DataInput/Team/TeamLabel'),4,FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Team/Next'))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('DataInput/Team/TeamLabel'),4,FailureHandling.CONTINUE_ON_FAILURE)

	}



	@Keyword
	public void verifyBillingOrderFileDownload(String sheetName, int rowNum){

		//Verify the billing order file
		String orderId = data.getCellData(sheetName,"OrderId", rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		//WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.click(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/DownloadBilling'))
		WebUI.delay(6)
		KeywordUtil.markWarning("Billing order ID : " + orderId)
		print orderId +".pdf"
		Assert.assertTrue(ReusDataInput.isFileDownloaded(orderId +".pdf"), "Order File Didn't downloaded successfully")
		println "Order File downloaded and verified successfully"
	}

	@Keyword
	public void billingStatus(String sheetName, int rowNum){
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		String reviewAmt = data.getCellData(sheetName, "ReviewAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30)
		//Registration Payment details verification
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		if(GlobalVariable.environment=='dev'){

			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			WebUI.verifyMatch(regDate, registrationDate, false , FailureHandling.CONTINUE_ON_FAILURE)
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			WebUI.verifyMatch(regOrderType, "REGISTRATION", false, FailureHandling.CONTINUE_ON_FAILURE)
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
			WebUI.verifyMatch(regStatus, "Completed", false, FailureHandling.CONTINUE_ON_FAILURE)
		}else{


			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			WebUI.verifyMatch(regDate, registrationDate, false , FailureHandling.CONTINUE_ON_FAILURE)
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			WebUI.verifyMatch(regOrderType, "REGISTRATION", false, FailureHandling.CONTINUE_ON_FAILURE)
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
			WebUI.verifyMatch(regStatus, "Completed", false, FailureHandling.CONTINUE_ON_FAILURE)
			//String reviewOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/ReviewOrderId'))
			//data.setCellData(sheetName, "ReviewId", rowNum,reviewOrderId)
		}
	}


	@Keyword
	public void billingStatusTransit(String sheetName, int rowNum){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		String reviewAmt = data.getCellData(sheetName, "DiscReviewAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//Registration Payment details verification
		if(GlobalVariable.environment=='dev'){
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			WebUI.verifyMatch(regOrderType, "REGISTRATION",false, FailureHandling.CONTINUE_ON_FAILURE)
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
			WebUI.verifyMatch(regStatus, "Completed",false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regDate,registrationDate , false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			WebUI.verifyMatch(regOrderType, "REGISTRATION",false, FailureHandling.CONTINUE_ON_FAILURE)
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
			WebUI.verifyMatch(regStatus, "Completed",false, FailureHandling.CONTINUE_ON_FAILURE)
			String reviewOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/ReviewOrderId'))
			data.setCellData(sheetName, "ReviewId", rowNum,reviewOrderId)
			WebUI.verifyMatch(regDate,registrationDate , false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regAmount,regdAmt , false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}

	@Keyword
	public void billingStatusParking(String sheetName, int rowNum){
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/BillingParksmart'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/BillingParksmart'))
		//Registration Payment details verification
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
		WebUI.verifyMatch(regDate, registrationDate ,false,FailureHandling.CONTINUE_ON_FAILURE)
		String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
		data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
		String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
		WebUI.verifyMatch(regOrderType, "REGISTRATION",false)
		String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		WebUI.verifyMatch(regStatus, "Completed",false)
		// Assert.assertEquals(regAmount, regdAmt)
	}


	//Manage certification Section

	@Keyword
	public void certificationDetailVerification(String sheetName ,int rowNum){
		String certiType= data.getCellData(sheetName, "CertiType", rowNum)
		String certiLevel= data.getCellData(sheetName, "CertiLevel", rowNum)

		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Certifications'), 2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Certifications'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		String certificationType= WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationType'))
		WebUI.verifyMatch(certificationType, certiType, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String certificationLevel = WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationLevel'))
		WebUI.verifyMatch(certificationLevel,certiLevel,false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String certificationDate = WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationDateNotCertifiedProjects'))
		WebUI.verifyMatch(certificationDate, "Pending", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		print certificationDate
		Assert.assertTrue(WebUI.verifyElementNotVisible(findTestObject('Object Repository/Manage/CertificationAndScore/leedLogo')))
	}


	@Keyword
	public void certificationDetailVerificationForPointsAddedFromAdminTool(String sheetName ,int rowNum){
		String certiType= data.getCellData(sheetName, "CertiTypeForCertifiedProjects", rowNum)
		String certiDate = commMethod.dateNew()
		print certiDate
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.doubleClick(findTestObject('Manage/CertificationAndScore/a_ Certifications'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.refresh()

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementClickable(findTestObject('Manage/CertificationAndScore/CertificationType'), 50)

		String certificationType= WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationType'))
		WebUI.verifyMatch(certificationType, certiType, false, FailureHandling.CONTINUE_ON_FAILURE)

		String certificationLevel = WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationLevelPlatinum'))
		WebUI.verifyMatch(certificationLevel,'Platinum', false, FailureHandling.CONTINUE_ON_FAILURE)

		String certificationPoints= WebUI.getText(findTestObject('Manage/CertificationAndScore/subCertificationPoints'))
		WebUI.verifyMatch(certificationPoints, '80', false, FailureHandling.CONTINUE_ON_FAILURE)

		/*String certificationDate = WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationDate'))
		 Assert.assertEquals(certificationDate, certiDate,"Certification date status Didn't matched")
		 print certificationDate*/

		String certificationDate = WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationDate'))
		WebUI.verifyMatch(certificationDate, certiDate, false, FailureHandling.CONTINUE_ON_FAILURE)
		print certificationDate

		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/CertificationAndScore/leedLogo'))
	}

	@Keyword
	public void cityComcertificationDetailVerificationForPointsAddedFromAdminTool(String sheetName ,int rowNum){
		String certiType= data.getCellData(sheetName, "CertiTypeForCertifiedProjects", rowNum)
		String certiDate = commMethod.dateNew()
		print certiDate
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Certifications'),5)
		WebUI.delay(1)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Certifications'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		//WebUI.delay(5)
		/*	WebUI.refresh()
		 WebUI.delay(5)*/

		String certificationType= WebUI.getText(findTestObject('Manage/CertificationAndScore/CertificationType'))
		WebUI.verifyMatch(certificationType, 'STAR', false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.delay(1)
		String certificationLevel = WebUI.getText(findTestObject('Add_Project_Details/Star/Level'))
		WebUI.verifyMatch(certificationLevel, certiType, false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.delay(1)
		String certificationPoints= WebUI.getText(findTestObject('Add_Project_Details/Star/Point'))
		WebUI.verifyMatch(certificationPoints, 'N/A', false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.delay(1)
		String certificationDate = WebUI.getText(findTestObject('Add_Project_Details/Star/Date'))
		WebUI.verifyMatch(certificationDate, certiDate, false, FailureHandling.CONTINUE_ON_FAILURE)
		print certificationDate

	}

	@Keyword
	public void verifyLogoVisible(String sheetName ,int rowNum){
		//ReusNavigate.navigateToManageSection()
		println "Verify LOGO displayed in Certification section for Certified project."
		//WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Certifications'), 2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Certifications'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		//WebUI.refresh()
		//WebUI.delay(10)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/CertificationAndScore/leedLogo'))
		println "Verified successfully LOGO displayed in Certification section for Certified project."
	}


	// Manage Agreement section

	@Keyword
	public void verifyAgreementFileDownload(){
		deleteFile(BaseClass.ServiceAgreement)
		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Manage/VerifyAgreementFile/button_Download'), 20)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/button_Download'))
		WebUI.delay(5)
		Assert.assertTrue(ReusDataInput.isFileDownloaded('Agreement.pdf'), "Agreement File Didn't downloaded successfully")
		println "Agreemnent File downloaded and verified successfully"
	}

	@Keyword
	public void verifyAgreementDateSignAndType(){

		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		/*String dateSigned = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/dateSigned'))
		 Assert.assertEquals(dateSigned, commMethod.dateNew(),"Agreement date signed is not correct.")
		 WebUI.delay(2)*/
		String type = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/agreementType'))
		WebUI.verifyMatch(type,"Registration" ,false)
		println "Agreement File downloaded and verified successfully"
	}

	@Keyword
	public void verifyAgreementDateSignAndTypeparking(String sheetName, int rowNum)
	{
		String agreementDate = data.getCellData(sheetName, "RegDate", rowNum)
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(4)
		 WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Manage'))*/
		/*		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		 WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		 WebUI.delay(3)*/
		String dateSigned = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/dateSigned'))
		WebUI.verifyMatch(dateSigned, agreementDate, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		String type = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/agreementType'))
		WebUI.verifyMatch(type,"Registration" ,false, FailureHandling.CONTINUE_ON_FAILURE)
		println "Agreement File downloaded and verified successfully"
	}

	@Keyword
	public void verifyAgreementLOProjectsAgreementType(){
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(4)
		 WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Manage'))*/
		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.delay(6)
		String type = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/agreementTypeLO'))
		WebUI.verifyMatch(type,"Addendum" ,false)
		println "Agreement File downloaded and verified successfully"

	}


	@Keyword
	public void verifyAgreementFileDownloadParking(){
		deleteFile(BaseClass.ServiceAgreement)
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(8)
		 WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Manage'))*/
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/Parking/Manage'))
		}
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/button_Download'))
		WebUI.delay(10)
		Assert.assertTrue(ReusDataInput.isFileDownloaded('Agreement.pdf'), "Agreement File Didn't downloaded successfully")
		println "Agreemnent File downloaded and verified successfully"
	}

	@Keyword
	public void verifymeasureDownloadfileParking(){
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)*/
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		WebUI.delay(10)
		WebUI.click(findTestObject('Manage/Parking/Naviation/button_Measure Language (PDF)'))
		WebUI.delay(10)
		Assert.assertTrue(ReusDataInput.isFileDownloaded('A1 - Parking Pricing'), "Measue file Didn't downloaded successfully")
		println "Agreemnent File downloaded and verified successfully"
	}

	@Keyword
	public void verifyAgreementLOProjectsAgreementDetails(String sheetName, int rowNum){

		String name  = GlobalVariable.projectTeamAdminAndArcAdminName
		String email = GlobalVariable.projectTeamAdminAndArcAdminEmail
		String id = GlobalVariable.UserId
		String prjName = data.getCellData(sheetName, "ProjectName", rowNum)
		String ownerEmail = data.getCellData(sheetName, "OwnerEmail", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Manage'))*/
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.delay(3)
		WebUI.verifyMatch("Addendum", WebUI.getText(findTestObject('Object Repository/Manage/VerifyAgreementFile/Addenum')), false)
		/*WebUI.click(findTestObject('Manage/VerifyAgreementFile/buttonAddendumDownload'))
		 WebUI.delay(3)
		 Assert.assertTrue(ReusDataInput.isFileDownloaded('Agreement.pdf'), "Addendum agreement File Didn't downloaded successfully")
		 println "Addendum agreement File downloaded and verified successfully"
		 WebUI.delay(3)
		 FileInputStream fis = null;
		 try {
		 fis = new FileInputStream(BaseClass.Addendum);
		 }
		 catch (Exception e) {
		 e.printStackTrace();
		 }
		 PDDocument doc = PDDocument.load(fis);
		 String pdfText = new PDFTextStripper().getText(doc);
		 doc.close();
		 fis.close();
		 println(pdfText);
		 Assert.assertTrue(pdfText.contains("User Name : "+name), "PDF not contains the required user name.");
		 Assert.assertTrue(pdfText.contains("User Email : "+email), "PDF not contains the required user email.");
		 Assert.assertTrue(pdfText.contains("User ID : "+id), "PDF not contains the required user id.");
		 //Assert.assertTrue(pdfText.contains("Date of Acceptance : "+date), "PDF not contains the required date.");
		 Assert.assertTrue(pdfText.contains("Name of Project : "+prjName), "PDF not contains the required project name.");
		 Assert.assertTrue(pdfText.contains("Owner Email : "+ownerEmail), "PDF not contains the required owner email.");
		 Assert.assertTrue(pdfText.contains("http://www.usgbc.org/resources/agent-authority"), "PDF not contains the hypelink: http://www.usgbc.org/resources/agent-authority ");
		 Assert.assertTrue(pdfText.contains("http://www.usgbc.org"), "PDF not contains the hypelink: http://www.usgbc.org ");
		 Assert.assertTrue(pdfText.contains("http://www.usgbc.org/cert-guide"), "PDF not contains the hypelink: http://www.usgbc.org/cert-guide ");
		 Assert.assertTrue(pdfText.contains("http://www.usgbc.org/cert-guide/fees"), "PDF not contains the hypelink: http://www.usgbc.org/cert-guide/fees ");
		 Assert.assertTrue(pdfText.contains("http://www.usgbc.org/trademarks"), "PDF not contains the hypelink: http://www.usgbc.org/trademarks ");
		 Assert.assertTrue(pdfText.contains("http://www.usgbc.org/resources/change-of-owner"), "PDF not contains the hypelink: http://www.usgbc.org/resources/change-of-owner");
		 Assert.assertTrue(pdfText.contains("http://usgbc.org/resources/primary-owner"), "PDF not contains the hypelink: http://usgbc.org/resources/primary-owner ");
		 Assert.assertTrue(pdfText.contains("legal@gbci.org"), "PDF not contains the hypelink: legal@gbci.org");
		 */


	}


	public String usgbcDate(String date){

		// This object can interpret strings representing dates in the format MM/dd/yyyy
		DateFormat df = new SimpleDateFormat("MMM d, yyyy")
		// Convert from String to Date
		Date startDate = df.parse(date)
		// Once converted to a Date object, you can convert
		// back to a String using any desired format.
		return  df.format(startDate)
	}


	//Verify the order history
	@Keyword
	public void verifyOrderHistoryUSGBC(String sheetName, int rowNum){
		String name  = data.getCellData(sheetName, "OrderId", rowNum)
		String orderId = data.getCellData(sheetName, "ReviewId", rowNum)
		String orderDate = data.getCellData(sheetName, "RegDate", rowNum)
		String date= usgbcDate(orderDate);
		String amount = data.getCellData(sheetName, "ReviewAmountReceipt", rowNum)
		//ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.click(findTestObject('Object Repository/USGBCAccount/ClickOnAccountMenu'))
		WebUI.click(findTestObject('Object Repository/USGBCAccount/ClickOnMyAccount'))
		WebUI.delay(4)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(5)
		//ReusableMethodsLogin.waitForPageToLoadCompletely(60)
		WebUI.click(findTestObject('Object Repository/USGBCAccount/ClickOnOrderHistory'))
		WebUI.delay(20)
		WebUI.click(findTestObject('Object Repository/USGBCAccount/SearchBarUSGBC'))
		WebUI.sendKeys(findTestObject('Object Repository/USGBCAccount/SearchBarUSGBC'),orderId )
		WebUI.delay(1)
		WebUI.doubleClick(findTestObject('Object Repository/USGBCAccount/ClickOnSearchButton'))
		WebUI.delay(15)
		//	ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/USGBCAccount/OrderDate')), date, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/USGBCAccount/OrderId')), orderId, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/USGBCAccount/TotalAmount')), amount, false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/USGBCAccount/OrderStatus')), 'Completed', false, FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyElementVisible(findTestObject('Object Repository/USGBCAccount/PayNowButton'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	public static String pdfReader(String pdfFilePath){
		FileInputStream fis
		try {
			fis = new FileInputStream(pdfFilePath)
			PDDocument doc = PDDocument.load(fis)
			String pdfText = new PDFTextStripper().getText(doc)
			//String pdfText = new PDFTextStripper().getT
			doc.close()
			fis.close()
			return pdfText
		}
		catch (Exception e) {
			e.printStackTrace()
		}

	}


	@Keyword
	public void downloadAndVerifyReviewReceipt(String sheetName, int rowNum){
		String reviewId= data.getCellData(sheetName, "ReviewId", rowNum)
		String reviewAmt= data.getCellData(sheetName, "ReviewAmountReceipt", rowNum)
		String itemDesc= data.getCellData(sheetName, "ItemDesc2", rowNum)
		String reviewArea= data.getCellData(sheetName, "ReviewArea", rowNum)
		String itemDisc= data.getCellData(sheetName, "ItemDisc2", rowNum)
		String isStation = data.getCellData(sheetName, "is_station", rowNum)
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		WebUI.delay(6)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/DownloadBillingReview'))
		WebUI.delay(6)
		print reviewId +".pdf"
		Assert.assertTrue(ReusDataInput.isFileDownloaded(reviewId +".pdf"), "Order File Didn't downloaded successfully")
		if(GlobalVariable.environment=='dev'){
			KeywordUtil.markWarning("Review Order file downloaded successfully")
		}
		else{
			String pdflinks= pdfReader(downloadPath+reviewId+".pdf")
			print pdflinks
			int arr= pdflinks.indexOf(itemDesc)
			String totalPaid
			String subString= pdflinks.substring(arr, pdflinks.indexOf("Total ")+25)
			//print arr
			println subString
			def result = []
			def userName= []
			def userEmail=[]
			result = subString.split("\\r?\\n")
			String itemDescription= itemDesc+"  "+reviewArea+"     ("+ itemDisc+")  "+ reviewAmt

			totalPaid="Total Paid   "+reviewAmt
			//	WebUI.verifyMatch(itemDescription, result[0].trim() , false, FailureHandling.CONTINUE_ON_FAILURE)
			//	WebUI.verifyMatch(totalPaid, result[1].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)
		}

	}



	@Keyword
	public void verifyBillingReceiptAmountDetail(String sheetName, int rowNum){
		String orderId= data.getCellData(sheetName, "OrderId", rowNum)
		String regAmt= data.getCellData(sheetName, "RegAmountReceipt", rowNum)
		String listPrice= data.getCellData(sheetName, "ListPrice", rowNum)
		String shipping= data.getCellData(sheetName, "Shipping", rowNum)
		String salesTax= data.getCellData(sheetName, "SalesTax", rowNum)
		String itemDesc= data.getCellData(sheetName, "ItemDesc1", rowNum)
		String itemDisc= data.getCellData(sheetName, "ItemDisc1", rowNum)
		String ratingSystem = data.getCellData(sheetName, "RatingSystem", rowNum)
		String pdflinks= pdfReader(downloadPath+orderId+".pdf")
		print pdflinks
		if(GlobalVariable.environment=='dev'){
			KeywordUtil.markWarning('Billing Receipt is : '+pdflinks)
		}
		else{
			KeywordUtil.markWarning('Billing Receipt is : '+pdflinks)
			int arr= pdflinks.indexOf(itemDesc)
			String itemDescription
			println arr
			String subString= pdflinks.substring(arr, pdflinks.indexOf("Total Paid")+25)
			//print arr
			//println subString
			def result = []
			def userName= []
			def userEmail=[]
			result = subString.split("\\r?\\n")
			//println result[0].trim()
			//println result[1].trim()
			//println result[2].trim()
			//println result[3].trim()
			if(ratingSystem.equalsIgnoreCase("Parksmart")){
				itemDescription= itemDesc+" 1  "+ regAmt +"     ("+itemDisc+")  "+ regAmt
			}
			else{
				itemDescription= itemDesc+" 1.000  "+ listPrice +"     ("+itemDisc+")  "+ regAmt
			}

			String shippingHandling= "Shipping/Handling  "+ shipping
			String saleTax="Sales Tax   "+salesTax
			String totalPaid="Total Paid   "+regAmt
			WebUI.verifyMatch(itemDescription, result[0].trim() , false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(shippingHandling, result[1].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(saleTax, result[2].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(totalPaid, result[3].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}

	@Keyword
	public void verifyBillingReceiptAmountDetailDev(String sheetName, int rowNum){
		String orderId= data.getCellData(sheetName, "OrderId", rowNum)
		String regAmt= data.getCellData(sheetName, "RegAmountReceipt", rowNum)
		String listPrice= data.getCellData(sheetName, "ListPrice", rowNum)
		String shipping= data.getCellData(sheetName, "Shipping", rowNum)
		String salesTax= data.getCellData(sheetName, "SalesTax", rowNum)
		String itemDesc= data.getCellData(sheetName, "ItemDesc1", rowNum)
		String itemDisc= data.getCellData(sheetName, "ItemDisc1", rowNum)
		String ratingSystem = data.getCellData(sheetName, "RatingSystem", rowNum)
		String pdflinks= pdfReader(downloadPath+orderId+".pdf")
		print pdflinks
		KeywordUtil.markWarning('Billing Receipt is : '+pdflinks)
		int arr= pdflinks.indexOf(itemDesc)
		String itemDescription
		println arr
		String subString= pdflinks.substring(arr, pdflinks.indexOf("Total Paid")+25)
		//print arr
		//println subString
		def result = []
		def userName= []
		def userEmail=[]
		result = subString.split("\\r?\\n")
		//println result[0].trim()
		//println result[1].trim()
		//println result[2].trim()
		//println result[3].trim()
		if(ratingSystem.equalsIgnoreCase("Parksmart")){
			itemDescription= itemDesc+" 1  "+ regAmt +"     ("+itemDisc+")  "+ regAmt
		}
		else{
			itemDescription= itemDesc+" 1.000  "+ listPrice +"     ("+itemDisc+")  "+ regAmt
		}

		String shippingHandling= "Shipping/Handling  "+ shipping
		String saleTax="Sales Tax   "+salesTax
		String totalPaid="Total Paid   "+regAmt
		WebUI.verifyMatch(itemDescription, result[0].trim() , false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(shippingHandling, result[1].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(saleTax, result[2].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(totalPaid, result[3].trim(), false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void ReadAgreementPDF(String sheetName, int rowNum)
	{
		String name  = GlobalVariable.projectTeamAdminAndArcAdminName
		String email = GlobalVariable.projectTeamAdminAndArcAdminEmail
		String id = GlobalVariable.UserId
		String date = data.getCellData(sheetName, "RegDate", rowNum)
		String prjName = data.getCellData(sheetName, "ProjectName", rowNum)
		String ownerEmail = data.getCellData(sheetName, "OwnerEmail", rowNum)

		//String[] pdfText= readAgreement(BaseClass.ServiceAgreement)
		String pdflinks= pdfReader(BaseClass.ServiceAgreement)
		print pdflinks
		KeywordUtil.markWarning('Agreement details are : '+pdflinks)
		int arr= pdflinks.indexOf("User Name")
		String subString= pdflinks.substring(arr, pdflinks.length())
		print arr
		println subString
		def result = []
		def userName= []
		def userEmail=[]
		def userId=[]
		def dateOfAccept=[]
		def nameOfProject=[]
		def ownerMail=[]
		result = subString.split("\\r?\\n")
		userName= result[0].split(":")
		println userName[1].trim()
		userEmail=result[1].split(":")
		println userEmail[1].trim()
		userId=result[2].split(":")
		println userId[1].trim()
		dateOfAccept=result[3].split(":")
		dateOfAccept[1].trim()
		nameOfProject=result[4].split(":",2)
		println nameOfProject[1].trim()
		ownerMail=result[5].split(":")
		println ownerMail[1].trim()

		String string1= dateOfAccept[1].substring(0, dateOfAccept[1].indexOf("at")).trim()
		String string2=string1.substring(5)
		String agreementDate= string2.substring(3,6)+" "+ string2.substring(0,2) + ", "+ string2.substring(7)
		println(agreementDate)

		WebUI.verifyMatch(userName[1].trim(), name, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(userEmail[1].trim(), email, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(userId[1].trim(), id, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(ownerMail[1].trim(), ownerEmail , false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(nameOfProject[1].trim(), prjName, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(date,agreementDate, false, FailureHandling.CONTINUE_ON_FAILURE)

		/*)
		 //println(pdfText);
		 println("project name in excel"+prjName);
		 Assert.assertEquals(userName[1].trim(),"User Name : "+ name, "PDF not contains the required user name.")
		 Assert.assertEquals(userEmail[1].trim(),"User Email : "+ email, "PDF not contains the required user email.")
		 Assert.assertEquals(userId[1].trim(),"User ID : " + id , "PDF not contains the required user id.")
		 Assert.assertEquals(agreementDate, date, "PDF not contains the required date.")
		 Assert.assertEquals(nameOfProject[1].trim(),"Name of Project : " + prjName, "PDF not contains the required project name.")
		 Assert.assertEquals(ownerMail[1].trim(),"Owner Email : " + ownerEmail, "PDF not contains the required owner email.")
		 Assert.assertTrue(pdflinks.contains("http://www.usgbc.org/resources/agent-authority"), "PDF not contains the hypelink: http://www.usgbc.org/resources/agent-authority ");
		 Assert.assertTrue(pdflinks.contains("http://www.usgbc.org"), "PDF not contains the hypelink: http://www.usgbc.org ");
		 Assert.assertTrue(pdflinks.contains("http://www.usgbc.org/cert-guide"), "PDF not contains the hypelink: http://www.usgbc.org/cert-guide ");
		 Assert.assertTrue(pdflinks.contains("http://www.usgbc.org/cert-guide/fees"), "PDF not contains the hypelink: http://www.usgbc.org/cert-guide/fees ");
		 Assert.assertTrue(pdflinks.contains("http://www.usgbc.org/trademarks"), "PDF not contains the hypelink: http://www.usgbc.org/trademarks ");
		 Assert.assertTrue(pdflinks.contains("http://www.usgbc.org/resources/change-of-owner"), "PDF not contains the hypelink: http://www.usgbc.org/resources/change-of-owner");
		 Assert.assertTrue(pdflinks.contains("http://usgbc.org/resources/primary-owner"), "PDF not contains the hypelink: http://usgbc.org/resources/primary-owner ");
		 Assert.assertTrue(pdflinks.contains("legal@gbci.org"), "PDF not contains the hypelink: legal@gbci.org");*/

	}

	public void verifyAgreementLinks()
	{

		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/buttonAddendumDownload'))
		WebUI.delay(3)
		Assert.assertTrue(ReusDataInput.isFileDownloaded('Agreement.pdf'), "Addendum agreement File Didn't downloaded successfully")
		println "Addendum agreement File downloaded and verified successfully"
		WebUI.delay(3)
		//list = WebUI.getAllLinksOnCurrentPage(true, [])
	}


	public void deleteFile(String PDFURL)
	{
		File file = null
		boolean bool = false
		try {
			file = new File(PDFURL)
			bool = file.delete()
			println "File deleted: "+bool
		}
		catch (Exception e) {
			e.printStackTrace()
		}

	}


	// Manage Score Version

	@Keyword
	public void scoreVersionVerification(){

		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30, FailureHandling.CONTINUE_ON_FAILURE)

		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score v2.0",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		String scoreStatus= WebUI.getText(findTestObject('Manage/CertificationAndScore/h4_You are all up to date'))
		WebUI.verifyMatch(scoreStatus, "You are all up to date!",false,FailureHandling.CONTINUE_ON_FAILURE )
		print scoreStatus
	}

	@Keyword
	public void scoreVersionVerificationCity(){

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score for cities version 2.0",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		String scoreStatus= WebUI.getText(findTestObject('Manage/CertificationAndScore/h4_You are all up to date'))
		WebUI.verifyMatch(scoreStatus, "You are all up to date!",false,FailureHandling.CONTINUE_ON_FAILURE )
		print scoreStatus
	}


	@Keyword
	public void scoreVersionVerificationCommunity(){

		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30, FailureHandling.CONTINUE_ON_FAILURE)
		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score for communities version 2.0",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		String scoreStatus= WebUI.getText(findTestObject('Manage/CertificationAndScore/h4_You are all up to date'))
		WebUI.verifyMatch(scoreStatus, "You are all up to date!",false,FailureHandling.CONTINUE_ON_FAILURE )
		print scoreStatus
	}


	@Keyword
	public void scoreVersionVerComTest(){
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),5)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))

		WebUI.delay(5)
		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score v2.0",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		WebUI.click(findTestObject('Object Repository/Manage/ScoreVer/LearnMore'))
		WebUI.delay(8)
		String scoreVersion2 = WebUI.getText(findTestObject('Manage/ScoreVer/Version2'))
		int scoreversion2 = Integer.parseInt(scoreVersion2)

		int pos2Range = scoreversion2 + 2
		int neg2Range = scoreversion2 - 2
		int pos1Range = scoreversion2 + 1
		int neg1Range = scoreversion2 - 1

		String scoreVersion3 = WebUI.getText(findTestObject('Manage/ScoreVer/Version3'))
		int scoreversion3 = Integer.parseInt(scoreVersion3)

		if (scoreversion3==pos2Range || scoreversion3==neg2Range || scoreversion3==pos1Range || scoreversion3==neg1Range || scoreversion3== scoreversion2)

			KeywordUtil.markPassed('SUCCESS: Score Version Comperesion verified Successfully')

		else
			KeywordUtil.markFailed('Fail : Mismatch in Score Version Comperesion')



	}


	@Keyword
	public void scoreVersionVerification3(){

		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))
		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score v3.0",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		String scoreStatus= WebUI.getText(findTestObject('Manage/CertificationAndScore/h4_You are all up to date'))
		WebUI.verifyMatch(scoreStatus, "You are all up to date!",false,FailureHandling.CONTINUE_ON_FAILURE )
		print scoreStatus
	}
	
	
	
	public void scoreVersionVerificationCityCommunityV3(){
		
		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))
		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score for cities version 3.0",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		String scoreStatus= WebUI.getText(findTestObject('Manage/CertificationAndScore/h4_You are all up to date'))
		WebUI.verifyMatch(scoreStatus, "You are all up to date!",false,FailureHandling.CONTINUE_ON_FAILURE )
		print scoreStatus
	}


	@Keyword
	public void scoreVersionVerification1_1(){

		WebUI.scrollToElement(findTestObject('Manage/CertificationAndScore/a_ Score Version'),2)
		WebUI.click(findTestObject('Manage/CertificationAndScore/a_ Score Version'))
		String scoreVersion = WebUI.getText(findTestObject('Manage/CertificationAndScore/h3_Arc score v2.0'))
		WebUI.verifyMatch(scoreVersion, "Arc score v1.1",false, FailureHandling.CONTINUE_ON_FAILURE)
		print scoreVersion
		String scoreStatus= WebUI.getText(findTestObject('Manage/CertificationAndScore/h4_You are all up to date'))
		WebUI.verifyMatch(scoreStatus, "You are all up to date!",false,FailureHandling.CONTINUE_ON_FAILURE )
		print scoreStatus
	}

	@Keyword
	public void verifyScoreUpdatePopupAndComparisionPage(){
		WebUI.delay(6)
		WebUI.click(findTestObject('Object Repository/Manage/CertificationAndScore/scoreLearnMoreBtn'))
		WebUI.delay(5)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/CertificationAndScore/currentVersion'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/CertificationAndScore/newVersion'))
		WebUI.delay(2)
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
	}


	// Manage App Section

	@Keyword
	public void verifyAppInstalledOnDataInputPage(){

		ReusNavigate.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/App/BuildingComputerFile'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/App/buildingDropbox'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/App/buildingGoogleDrive'), 2)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/App/BuildingOnedrive'), 2)

	}

	@Keyword
	public void verifyAppInstalledOnAddSupportingDocuments(){

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GHGEmissions'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/DocumentsTab'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/DocumentsTab'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ComputerFile'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/ComputerFile'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/DropboxApp'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/DropboxApp'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/OneDriveApp'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/OneDriveApp'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/GoogleDrive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/GoogleDrive'), GlobalVariable.minAngularWait)
		
	}

	@Keyword
	public void verifyAppRemovedOnAddSupportingDocumentsCityComm(){

		WebUI.doubleClick(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/cityCommComputerFile'))
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/Manage/App/cityCommDropbox'))
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/Manage/App/cityCommGoogleDrive'))
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/Manage/App/cityCommOneDrive'))

	}

	@Keyword
	public void verifyUnInstallMsgByUnInstallingApps() throws IOException, InterruptedException {

		println "Clicking on Apps"
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/App/a_ Apps'),2)
		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		println "UnInstalling Dropbox"
		WebUI.click(findTestObject('Object Repository/Manage/App/BDropbox'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/App/AppUninstalledMessage'),20)

		println  "UnInstalling OneDrive"
		WebUI.click(findTestObject('Object Repository/Manage/App/BOneDrive'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/App/AppUninstalledMessage'),20)

		println  "UnInstalling GoogleDrive"
		WebUI.click(findTestObject('Object Repository/Manage/App/BgoogleDrive'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/App/AppUninstalledMessage'),20)

	}


	@Keyword
	public void verifyNewlyAddedAppPresent(){

		println "Clicking on Apps"
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/App/a_ Apps'),2)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/EnergyStartAppVerification'), GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/EnergyStartAppVerification'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/EnergyStartAppVerification')), "Energy Star Portfolio Manager", false)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/MeasurablAppVerification'), GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/MeasurablAppVerification'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/MeasurablAppVerification')), "Measurabl", false)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/CommutifiAppVerification'), GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/CommutifiAppVerification'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/CommutifiAppVerification')), "Commutifi", false)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/QlearAppVerification'), GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/QlearAppVerification'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/QlearAppVerification')), "QLEAR", false)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/App/ArbnWellAppVerification'), GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/ArbnWellAppVerification'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/ArbnWellAppVerification')), "arbn well", false)

	}


	@Keyword
	public void installCustomApps() throws IOException, InterruptedException {

		println "Clicking on Apps"
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/App/a_ Apps'),2)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		println "Installing Dropbox"
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/BDropbox'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/BDropbox')), "Added", false)
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		println  "Installing OneDrive"
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/BOneDrive'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/BOneDrive')), "Added", false)
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		println  "Installing GoogleDrive"
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/App/BgoogleDrive'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/App/BgoogleDrive')), "Added", false)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	//Manage Settings
	@Keyword
	public void verifySettingPageDetailsBuildingAndTransit() throws IOException, InterruptedException {

		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))
		//WebUI.delay(3)

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/lobbySurveyText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/makeScorePublicText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/receiveEmailsText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/plaqueAnimationText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/dataResourcesText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/dataReviewChecklistText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/setDefaultPageText'))

	}

	@Keyword
	public void verifySettingPageDetailsTransitDownloadUserMannual() throws IOException, InterruptedException {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/downloadUserMannualText'))

	}

	@Keyword
	public void verifySettingPageDetailsCityAndCommunity() throws IOException, InterruptedException {

		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/makeScorePublicText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/receiveEmailsText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/plaqueAnimationText'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/setDefaultPageText'))

	}


	@Keyword
	public void assignAddedTeamMem() throws IOException, InterruptedException {
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		WebUI.delay(5)

		WebUI.click(findTestObject('DataInput/Team/TeamEdit'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Team/Option1'))
		WebUI.delay(10)

		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		String memberName = WebUI.getText(findTestObject('DataInput/Team/Energy'))
		WebUI.delay(5)
		WebUI.verifyMatch(memberName,GlobalVariable.teamMemberName, false)

	}


	@Keyword
	public void verifyLobbyBtnRemailOnAfterNavigationFromOtherPage() throws IOException, InterruptedException {

		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/Setting/lobbySurveyBtn'), 15)
		WebUI.click(findTestObject('Object Repository/Manage/Setting/lobbySurveyBtn'))
		WebUI.delay(2)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Manage/Setting/lobbySurveyBtn'), GlobalVariable.avgAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('Object Repository/Manage/Setting/a_setting'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.verifyElementChecked(findTestObject('Object Repository/Manage/Setting/lobbySurveyBtnOn'), 5)
		//WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/lobbySurveyBtnOn'))

	}

	@Keyword
	public void verifyPlaqueAnimationUrlVisible() throws IOException, InterruptedException {

		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/Manage/Setting/animationLink'))
	}




	@Keyword
	public void verifyDataResourceAndDataReviewChecklistPdfDownload() throws IOException, InterruptedException {

		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/Setting/downloadResourceBtn'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(8)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/Setting/DataGuideBuilding'), 10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Manage/Setting/DataGuideBuilding'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/Setting/DataGuideBuilding'), 10)
		WebUI.click(findTestObject('Object Repository/Manage/Setting/DataGuideBuilding'))
		WebUI.delay(5)
		Assert.assertTrue(ReusDataInput.isFileDownloaded('Data Guide for Buildings.pdf'), "DataResources File Didn't downloaded successfully")
		WebUI.delay(3)
		deleteFile(BaseClass.DataResourcesPdf)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Manage/Setting/dataReviewChecklistDownloadBtn'))
		WebUI.delay(5)
		Assert.assertTrue(ReusDataInput.isFileDownloaded('Data Review Checklist.pdf'), "DataResources File Didn't downloaded successfully")
		deleteFile(BaseClass.DataReviewChecklistPdf)
	}

	@Keyword
	public void verifyPlaqueAnimationVisbleInNewWindow(String sheetName, int rowNum) throws IOException, InterruptedException {
		String name  = data.getCellData(sheetName, "ProjectName", rowNum)
		String address = data.getCellData(sheetName, "Address", rowNum)
		String country = data.getCellData(sheetName, "OwnerCountry", rowNum)
		WebDriver driver  = DriverFactory.getWebDriver()

		WebUI.scrollToElement(findTestObject('Manage/Setting/a_setting'), 5)
		WebUI.click(findTestObject('Manage/Setting/a_setting'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Manage/Setting/animationLinkCopyBtn'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		Robot r = new Robot()
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_T)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.delay(2)
		//To switch to the new tab
		WebUI.switchToWindowIndex(1)
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_V)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_V)
		WebUI.delay(2)
		r.keyPress(KeyEvent.VK_ENTER)
		r.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('Manage/Setting/projectTitleOnAnimationPage'), GlobalVariable.avgAngularWait)

		WebUI.verifyMatch(WebUI.getText(findTestObject('Manage/Setting/projectTitleOnAnimationPage')), name, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)


	}

	@Keyword
	public void verifySubmitSurveyMultipleTimes(String sheetName) throws IOException, InterruptedException {

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), 30)
		WebUI.scrollToElement(findTestObject('DataInput/Survey/div_Transportation Survey'),5)
		WebUI.doubleClick(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		String MainWindowHandle = driver.getWindowHandle()
		WebUI.scrollToElement(findTestObject('DataInput/Survey/CopySurveyLink'),5)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(1)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/English'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))

		for( int rowNum=2;rowNum<=2;rowNum++)
		{

			if(rowNum==2)
			{
				String walk1 = data.getCellData(sheetName, "Walk", rowNum)
				String walk2 = data.getCellData(sheetName, "Bus", rowNum)
				String walk3 = data.getCellData(sheetName, "Tram", rowNum)
				String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
				String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
				String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
				String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
				String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
				String name = data.getCellData(sheetName, "Name", rowNum)

				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_T)
				WebUI.delay(1)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
				//To switch to the new tab

				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
				r.keyPress(KeyEvent.VK_CONTROL)
				r.keyPress(KeyEvent.VK_V)
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_V)

				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
				r.keyPress(KeyEvent.VK_ENTER)
				r.keyRelease(KeyEvent.VK_ENTER)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
				WebUI.delay(5)
				WebUI.switchToWindowIndex(1)

				WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
				int it=1;
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
				it++
				WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
				WebUI.delay(4)
				WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('Object Repository/DataInput/Survey/ExtremelySatisfySpanText'))
				WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
				WebUI.delay(2)
				WebUI.click(findTestObject('DataInput/Survey/Submit'))
				WebUI.delay(3)
				//WebUI.verifyMatch(WebUI.getText(findTestObject('DataInput/Survey/Thank')), "Options that enhance your satisfaction", false)
				// WebUI.delay(3)
				println "Survey Submited Successufully"
			}
			WebUI.closeWindowIndex(1)
			WebUI.switchToWindowIndex(0)
		}

	}


	//verify the SEZ files in billing sesction India Project

	@Keyword
	public void verifySEZFilesBillingSection(){

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'), 10)
		//Registration Payment details verification
		WebUI.delay(6)
		String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
		WebUI.doubleClick(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZDocIcon'))
		WebUI.delay(4)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileOne')), regOrderId + "-Clause-X-Taxes.pdf", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileTwo')), "uploasExcel.xlsx", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileThree')), "uploadPng.png", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileFour')), "uploadGif.gif", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileFive')), "uploadDoc.docx", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileSix')), "txtFileUpload.txt", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/SEZFiles/SEZFileSeven')), "Parking SJ.jpg", false, FailureHandling.CONTINUE_ON_FAILURE)

	}


	public static void unzip(String zipFilePath, String destDirectory) throws IOException {

		File destDir = new File(destDirectory)
		if (!destDir.exists()) {
			destDir.mkdir()
		}
		ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath))
		ZipEntry entry = zipIn.getNextEntry()
		// iterates over entries in the zip file
		while (entry != null) {
			String filePath = destDirectory + File.separator + entry.getName()
			if (!entry.isDirectory()) {
				// if the entry is a file, extracts it
				extractFile(zipIn, filePath)
			} else {
				// if the entry is a directory, make the directory
				File dir = new File(filePath)
				dir.mkdir()
			}
			zipIn.closeEntry()
			entry = zipIn.getNextEntry()
		}
		zipIn.close()
	}

	public static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))
		byte[] bytesIn = new byte[BUFFER_SIZE]
		int read = 0
		while ((read = zipIn.read(bytesIn)) != -1) {
			bos.write(bytesIn, 0, read)
		}
		bos.close()
	}

	@Keyword
	public void verifyGBCIDocsFromZippedFolder(){
		deleteFile(sourceZipFile)
		deleteFile(sourceExtractedFile)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/DownloadGBCIDocs'))
		WebUI.delay(6)
		unzip(sourceZipFile, destinationUnZippedFolder)
		WebUI.delay(5)
		Assert.assertTrue(ReusDataInput.isFileExtracted('GBCI Citibank Cancelled Cheque.pdf'), " GBCI Citibank Cancelled Cheque File Didn't downloaded successfully")
		Assert.assertTrue(ReusDataInput.isFileExtracted('GBCI PAN Card.pdf'), "GBCI PAN Card File Didn't downloaded successfully")
		Assert.assertTrue(ReusDataInput.isFileExtracted('GBCI-Noida-GST Registration Certificate.pdf'), "GBCI-Noida-GST Registration Certificate File Didn't downloaded successfully")

	}


	@Keyword
	public void readAgreementPDFParking(String sheetName, int rowNum)
	{
		String name  = GlobalVariable.projectTeamAdminAndArcAdminName
		String email = GlobalVariable.projectTeamAdminAndArcAdminEmail
		String id = GlobalVariable.UserId
		String date = data.getCellData(sheetName, "RegDate", rowNum)
		String prjName = data.getCellData(sheetName, "ProjectName", rowNum)
		String ownerEmail = data.getCellData(sheetName, "OwnerEmail", rowNum)

		String pdfText= pdfReader(BaseClass.ServiceAgreement)

		println(pdfText)
		println("project name in excel"+prjName)
		KeywordUtil.markWarning('Agreement details are : '+pdfText)
		//Assert.assertTrue(pdfText.contains("PARKSMART™ SERVICES AGREEMENT"), "Parking Agreement is not downloaded");
		Assert.assertTrue(pdfText.contains("User Name : "+name), "PDF not contains the required user name.")
		Assert.assertTrue(pdfText.contains("User Email : "+email), "PDF not contains the required user email.")
		Assert.assertTrue(pdfText.contains("User ID : "+id), "PDF not contains the required user id.")
		Assert.assertTrue(pdfText.contains("Date of Acceptance"), "Date of Acceptance is not displays")

		Assert.assertTrue(pdfText.contains("Name of Project : "+prjName), "Downloaded agreement PDF does not contains the mandatory field project name.")
		Assert.assertTrue(pdfText.contains("Owner Email : "+ownerEmail), "PDF not contains the required owner email.")
		// Assert.assertTrue(pdfText.contains("Date of Acceptance : "+ date), "PDF not contains the required date.");

	}


	@Keyword
	public void tVOCNotificaitonTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/DataInput/Not/div_Total Volatile Organic Com'))
		WebUI.delay(6)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(7)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Not/Tvo/svg_Total Volatile Organic Com'),3)
	}

	@Keyword
	public void co2NotificationTest() throws IOException, InterruptedException {
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		//	WebUI.delay(12)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/DataInput/Not/div_Carbon Dioxide'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(7)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/Not/CO2Notification'),5)

	}
	@Keyword
	public void EnergyNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/div_AnalyticsEnergy Meter via'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(7)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/NotSym/svg_AnalyticsEnergy Meter via'),5)

	}
	@Keyword
	public void WaterNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/div_AnalyticsWater meter via u'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(10)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/NotSym/svg_AnalyticsWater meter via u'),5)

	}
	@Keyword
	public void WasteNotificationTest() throws IOException, InterruptedException {

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/CreateMeterBuilding/div_Waste Data'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/div_Waste Data'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('Object Repository/PerformanceScore/DataInput/Delete'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/NotSym/svg_Waste Data_error_symbol er'),5)

	}
	@Keyword
	public void nottVOCNotificaitonTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/Not/Tvo/svg_Total Volatile Organic Com'),3)
	}

	@Keyword
	public void notNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/Not/CO2Notification'),5)

	}
	@Keyword
	public void notEnergyNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/NotSym/svg_AnalyticsEnergy Meter via'),5)

	}
	@Keyword
	public void notWaterNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/NotSym/svg_AnalyticsWater meter via u'),5)

	}
	@Keyword
	public void notWasteNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/NotSym/svg_Waste Data_error_symbol er'),5)

	}

	@Keyword
	public void notTRNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/Notification/svg_Transportation Survey_erro'),5)

	}
	@Keyword
	public void notOCCNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/Notification/svg_Occupant Satisfaction Surv'),5)

	}

	@Keyword
	public void aqinotNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Air Quality Index_error_sy'),5)

	}
	@Keyword
	public void carbonMoxnotNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Carbon Monoxide_error_symb'),5)

	}
	@Keyword
	public void NitrogennotNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Nitrogen Dioxide_error_sym'),5)

	}

	@Keyword
	public void OzonenotNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Ozone_error_symbol error_s'),5)

	}
	@Keyword
	public void pm10NotificationTest() throws IOException, InterruptedException {
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('DataInput/TRNotification/div_Pm10'),5)
		WebUI.click(findTestObject('DataInput/TRNotification/div_Pm10'))

	}
	@Keyword
	public void pm25NotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_PM2.5_error_symbol error_s'),5)

	}
	@Keyword
	public void sulferDiol25NotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Sulfur Dioxide_error-headin'),5)

	}

	@Keyword
	public void riderShipNotificationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		println "Before Refresh."
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Ridership_error_symbol err'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.refresh()
		println "After Refresh."
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Ridership_error_symbol err'),5)


	}

	@Keyword
	public void transportsurveyNotifciationTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementVisible(findTestObject('DataInput/Notification1/Waste Data_error_symbol'))
	}

	@Keyword
	public void OccupantSatisfactionDefaultSurvey() throws IOException, InterruptedException {

		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.delay(2)
		WebUI.verifyElementPresent(findTestObject('DataInput/Notification1/Occupant Satisfaction Surv'),5)

	}
	@Keyword
	public void wasteDefaultNotification() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementVisible(findTestObject('DataInput/Notification1/Waste Data_error_symbol'))


	}


	@Keyword
	public void riderShipCreateMeterTest() throws IOException, InterruptedException {
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)


		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/TRNotification/div_Ridership'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/TRNotification/div_Ridership'),10)
		WebUI.click(findTestObject('Object Repository/DataInput/TRNotification/div_Ridership'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
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

		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'),'2323')
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void verifyNotificationEffectOtherSectionTest() throws IOException, InterruptedException {
		WebUI.delay(1)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Air Quality Index_error_sy'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Carbon Monoxide_error_symb'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Nitrogen Dioxide_error_sym'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Ozone_error_symbol error_s'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_PM2.5_error_symbol error_s'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('DataInput/TRNotification/svg_Sulfur Dioxide_error-headin'),5,FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void deleteRiderShipReadingTest() throws IOException, InterruptedException {
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/TRNotification/div_Ridership'),10)
		WebUI.click(findTestObject('Object Repository/DataInput/TRNotification/div_Ridership'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CityC/DeleteButton1'))
		WebUI.delay(5)
	}
	@Keyword
	public void billingStatusPrice(String sheetName, int rowNum){


		if(GlobalVariable.environment=='dev'){

			WebUI.delay(2)
			//String regdAmt = data.getCellData(sheetName,"BillingPrice", rowNum)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.delay(1)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))

			WebUI.delay(5)

			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
			WebUI.verifyMatch(regStatus,paymentStatus,false,FailureHandling.CONTINUE_ON_FAILURE)

		}
		else {
			WebUI.delay(2)
			String regdAmt = data.getCellData(sheetName,"BillingPrice", rowNum)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.delay(1)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
			WebUI.delay(5)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
			WebUI.verifyMatch(regAmount,regdAmt,false,FailureHandling.CONTINUE_ON_FAILURE)
		}
	}





	@Keyword
	public void billingStatusPriceIND(String sheetName, int rowNum){


		if(GlobalVariable.environment=='dev'){

			WebUI.delay(2)
			//String regdAmt = data.getCellData(sheetName,"BillingPrice", rowNum)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.delay(1)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))

			WebUI.delay(5)

			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
			WebUI.verifyMatch(regStatus,paymentStatus,false,FailureHandling.CONTINUE_ON_FAILURE)

		}
		else {
			WebUI.delay(2)
			String regdAmt = data.getCellData(sheetName,"BillingPriceIND", rowNum)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.delay(1)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
			WebUI.delay(5)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
			WebUI.verifyMatch(regAmount,regdAmt,false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regStatus,paymentStatus,false,FailureHandling.CONTINUE_ON_FAILURE)
		}
	}

	@Keyword
	public void billingStatusPrice2(String sheetName, int rowNum){
		if(GlobalVariable.environment=='dev'){

			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
			WebUI.verifyMatch(regStatus,paymentStatus,false,FailureHandling.CONTINUE_ON_FAILURE)

		}
		else {
			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			String regdAmt = data.getCellData(sheetName,"RAmount2To4", rowNum)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}

			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
			WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
			WebUI.verifyMatch(regAmount,regdAmt,false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regStatus,paymentStatus,false,FailureHandling.CONTINUE_ON_FAILURE)

		}
	}
	@Keyword
	public void billingStatusPriceCC(String sheetName, int rowNum){
		if(GlobalVariable.environment=='dev'){
			WebUI.delay(2)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.delay(1)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))

			WebUI.delay(5)

			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
		}
		else{
			WebUI.delay(2)
			String regdAmt = data.getCellData(sheetName,"BillingPrice", rowNum)
			String paymentStatus = data.getCellData(sheetName, "PaymentStatus", rowNum)
			WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
			WebUI.delay(1)
			if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
				println "Manage"
				WebUI.delay(2)
				WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			}
			WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))

			WebUI.delay(5)

			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))

			WebUI.verifyMatch(regAmount,regdAmt,false,FailureHandling.CONTINUE_ON_FAILURE)
		}
	}


	//Measurabl Methods

	//Start the Measurable step

	@Keyword
	public void NavigateToMeasurablPaymentPage(String paymentType){

		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/App/a_ Apps'),2)
		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/LearnMoreMeasurabl'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablCompanyWebsiteLink'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/GetStartedButtonForMeasurabl'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationPaymentTextOnPaymentPage'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationPaymentTextOnPaymentPage'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(3)
		if(paymentType.equals("monthly")){
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MonthlyPaymentCheckbox'))
		}
		else{
			WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablePriceYearlyCommitment'))
		}

	}
	@Keyword
	public void paymentPageMonthlyAndAnuallyPriceValidation(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/BillingSection/Measurabl/AnnualPaymentTextLabel'), GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MonthlyPaymentCheckbox'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/AnnualPaymentTextLabel')),'Annually - $120 annual payment',false,FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MonthlyPaymentTextLabel')),'Monthly - $10 per month ($120 yearly contract)',false,FailureHandling.STOP_ON_FAILURE)

	}




	@Keyword
	public void billingStatusAndDetailsMeasurabl(String sheetName, int rowNum){
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String measurablAmt = data.getCellData(sheetName, "MeasurablAmount", rowNum)
		String orderType = data.getCellData(sheetName, "MeasurablOrderType", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		//WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30)
		//Measurabl Payment details verification
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/PaymentHistoryTab'))
		WebUI.delay(2)
		String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablBillingDate'))
		WebUI.verifyMatch(regDate, registrationDate, false , FailureHandling.CONTINUE_ON_FAILURE)
		String measurablOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablOrderID'))
		data.setCellData(sheetName, "MeasurablOrderID", rowNum,measurablOrderId)
		String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablOrderType'))
		WebUI.verifyMatch(regOrderType, "MEASURABL", false, FailureHandling.CONTINUE_ON_FAILURE)
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablPaymentStatus'))
		WebUI.verifyMatch(regStatus, "Completed", false, FailureHandling.CONTINUE_ON_FAILURE)
		String measurablAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablBillingAmount'))
		WebUI.verifyMatch(measurablAmount, measurablAmt, false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void verifyMeasurablIntegrationAllowedOnce(){

		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/App/a_ Apps'),2)
		WebUI.click(findTestObject('Object Repository/Manage/App/a_ Apps'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/LearnMoreMeasurabl'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/Measurabl/MeasurablCompanyWebsiteLink'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/GetStartedButtonForMeasurabl'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Manage/BillingSection/Measurabl/VerifyMeasurablIntegrationAllowedOnceText'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Manage/BillingSection/Measurabl/VerifyMeasurablIntegrationAllowedOnceText'),GlobalVariable.minAngularWait)
		String warningMsg= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/VerifyMeasurablIntegrationAllowedOnceText'))
		WebUI.verifyMatch(warningMsg, "No integration option once integration is done", false)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/CloseWarningPopUp'))
	}

	public String nextPaymentDate(){
		Date current = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(current);
		cal.set(Calendar.MONTH, (cal.get(Calendar.MONTH)+1));
		current = cal.getTime();
		DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		String date1=  dateFormat.format(current);
		System.out.println(date1);
		return date1
	}

	@Keyword
	public void verifyTheIntegrationTabDetails(){

		String regDate = nextPaymentDate()
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationsTabs'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String nameOfIntegration= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/NameOfIntegration'))
		WebUI.verifyMatch(nameOfIntegration, "Measurabl", false, FailureHandling.CONTINUE_ON_FAILURE)
		String subscriptionPriceMonthly = WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/SubscriptionPricePerMonth'))
		WebUI.verifyMatch(subscriptionPriceMonthly, '$10.00 / month', false, FailureHandling.CONTINUE_ON_FAILURE)
		String subscriptionPriceYearly= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/SubscriptionPriceYearlyCommitment'))
		WebUI.verifyMatch(subscriptionPriceYearly, '($120 yearly contract)', false, FailureHandling.CONTINUE_ON_FAILURE)
		String nextPaymentDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/NextPaymentDateMeasurabl'))
		WebUI.verifyMatch(nextPaymentDate,regDate , false, FailureHandling.CONTINUE_ON_FAILURE)
		String payeename= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/PaymentMethodUserName'))
		WebUI.verifyMatch(nameOfIntegration, nameOfIntegration, false, FailureHandling.CONTINUE_ON_FAILURE)
		String cardDetails= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/GetThepartialCardDetails'))
		WebUI.verifyMatch(cardDetails, "VISA ending *0000", false, FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void changePaymentMethod(String sheetName, int rowNum){

		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.delay(2)
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		}
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))
		//WebUI.waitForElementPresent(findTestObject('Object Repository/Loaders/ProjectDashboardLoader'), 30)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationsTabs'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/ChangePaymentMethodButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/GetChangePaymenMethodPageText')),'Change Payment Method',false, FailureHandling.STOP_ON_FAILURE)

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

		WebUI.sendKeys(findTestObject('Object Repository/paymentPageNewUI/CardNumber'),"4012000033330026")
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
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/IntegrationsTabs'))
		String cardDetails= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Measurabl/GetThepartialCardDetails'))
		WebUI.verifyMatch(cardDetails, "VISA ending *0026", false, FailureHandling.CONTINUE_ON_FAILURE)
	}


	//Promo code billing amount and status verification

	@Keyword
	public void verifBillingDetailsForPromocodeReedemProject(String sheetName, int rowNum, String promoType){
		String regdAmt
		if(promoType=='fifty')
			regdAmt = data.getCellData(sheetName,"DiscountedFiftyPrice", rowNum)
		else
			regdAmt='$ 0.00'

		String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
		WebUI.verifyMatch(regAmount, regdAmt, false, FailureHandling.CONTINUE_ON_FAILURE)
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/Status'))
		WebUI.verifyMatch(regStatus, "Completed", false, FailureHandling.CONTINUE_ON_FAILURE)

	}


}
