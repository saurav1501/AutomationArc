package com.arc.ReusableMethods
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat
import java.util.concurrent.ThreadLocalRandom

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ReusableMethodsAddNewProject extends BaseClass{
	ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	WebDriver driver = DriverFactory.getWebDriver()
	SimpleDateFormat formatarDate = new SimpleDateFormat(' HH:mm:ss')
	
	@Keyword
	public void buildingAddNewProject(String sheetName , int rowNum) {
		/**************Reading data form excel sheet*************************/
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
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

		String proName
		if(sheetName.equalsIgnoreCase("USBuildingProject")){
			proName="USBuilding"
		}
		else if(sheetName.equalsIgnoreCase("ChinaBuildingProject")){
			proName="CHBuilding"
		}
		else if(sheetName.equalsIgnoreCase("BuildingIndiaProject")){
			proName="INDBuilding"
		}
		else{
			proName="CNBuilding"
		}
		//String proName= prjName.substring(0, 9)
		String ProjectName = proName +prjRating +formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)

		navigation.clickAddProject()
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'), prjCountry, false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),prjState, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		//String PaymentPageText = WebUI.getText(findTestObject('Add_Project_Details/VerifyPaymentPage_ text'))
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
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



	@Keyword
	public void buildingTransitAddNewProject(String sheetName , int rowNum) {
		/**************Reading data form excel sheet*************************/
		String prjName          = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		    = data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating    	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType        = data.getCellData(sheetName, "SpaceType", rowNum)
		String annualRider      = data.getCellData(sheetName, "annual_ridership", rowNum)
		String weekOprhrs       = data.getCellData(sheetName, "week_opr_hrs", rowNum)
		String fullTimeStaff    = data.getCellData(sheetName, "fulltime_staff", rowNum)
		String avgtimeSpent     = data.getCellData(sheetName, "avg_time_spent", rowNum)
		String ownerOrg 	    = data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	    = data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry     = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	    = data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		    = data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	    = data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		    = data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	    = data.getCellData(sheetName, "Country", rowNum)
		String prjState 	    = data.getCellData(sheetName, "State", rowNum)
		String prjZip 		    = data.getCellData(sheetName, "Zip", rowNum)
		String isStation 		= data.getCellData(sheetName, "is_station", rowNum)

		String proName
		if(sheetName.equalsIgnoreCase("USBuildingProject")){
			proName="USBuilding"
		}
		else if(sheetName.equalsIgnoreCase("ChinaBuildingProject")){
			proName="CHBuilding"
		}
		else if(sheetName.equalsIgnoreCase("BuildingIndiaProject")){
			proName="INDBuilding"
		}
		else{
			proName="CNBuilding"
		}

		String ProjectName = proName +prjRating +formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)
		navigation.clickAddProject()
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stationType'),isStation, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/annualRidership'), annualRider)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/weekelyOpreatingHours'), weekOprhrs)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/fullTimeStaff'), fullTimeStaff)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/timeSpentByRider'), avgtimeSpent)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'), prjCountry, false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),prjState, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('9'),title.indexOf('9')+10 )
		println Project_ID
		data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
		data.setCellData(sheetName,"RegDate", rowNum, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(5)
	}


	@Keyword
	public void addNewProjectCityORCom(String sheetName , int rowNum) {
		/**************Reading data form excel sheet*************************/
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjPopulation= data.getCellData(sheetName, "Population", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)


		String proName
		if(sheetName.equalsIgnoreCase("USCityProject")){
			proName="USCity"
		}
		else if(sheetName.equalsIgnoreCase("ChinaCityProject")){
			proName="CHCity"
		}
		else if (sheetName.equalsIgnoreCase("CanadaCityProject")) {
			proName="CNCity"
		}
		else if(sheetName.equalsIgnoreCase("CityIndiaProject")){
			proName="INDCity"
		}
		else if(sheetName.equalsIgnoreCase("USCommunityProject")){
			proName="USComm"
		}
		else if(sheetName.equalsIgnoreCase("ChinaCommunityProject")){
			proName="CHComm"
		}
		else if(sheetName.equalsIgnoreCase("CommunityIndiaProject")){
			proName="INDComm"
		}
		else{
			proName="CNComm"
		}

		String ProjectName = proName + prjRating + formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)
		navigation.clickAddProject()
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/population'),prjPopulation )
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/streetName'),prjAddress)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'),prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'),prjCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),prjState, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('9'),title.indexOf('9')+10 )
		println Project_ID
		data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
		data.setCellData(sheetName,"RegDate", rowNum, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(5)
	}

	@Keyword
	public void addNewProjectCityORCompop(String sheetName , int rowNum) {
		/**************Reading data form excel sheet*************************/
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
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

		String	proName="USCity"

		String ProjectName = proName + prjRating + formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)
		navigation.clickAddProject()
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/streetName'),prjAddress)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'),prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'),prjCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),prjState, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)

		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)

		/*WebUI.click(findTestObject('Page_Arc dashboard/Back'))
		 WebUI.delay(5)*/
	}




	@Keyword
	public void parkingAddNewProject(String sheetName , int rowNum) {
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType        = data.getCellData(sheetName, "SpaceType", rowNum)
		String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String parkingSpaces = data.getCellData(sheetName, "no_park_space", rowNum)
		String parkingStructure=  data.getCellData(sheetName, "park_level", rowNum)
		String dataCommisioned= data.getCellData(sheetName, "date_comm", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)


		String proName
		if(sheetName.equalsIgnoreCase("USBuildingProject")){
			proName="USParking"
		}
		else if(sheetName.equalsIgnoreCase("ChinaBuildingProject")){
			proName="CHParking"
		}
		else if(sheetName.equalsIgnoreCase("BuildingIndiaProject")){
			proName="INDParking"
		}
		else{
			proName="CNParking"
		}

		String ProjectName = proName +prjRating +formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)

		navigation.clickAddProject()
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/noOfParkingSpaces'),parkingSpaces )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/noOfParkingLevel'),parkingStructure)
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
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'), prjCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),prjState, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'),20)
		String purchase= WebUI.getText(findTestObject('Object Repository/paymentPageNewUI/paymentPageTextPurchase'))
		WebUI.verifyMatch("Purchase", purchase, false)

		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('1'),title.indexOf('1')+10 )
		println Project_ID
		data.setCellData(sheetName,"ProjectID", rowNum, Project_ID)
		data.setCellData(sheetName,"RegDate", rowNum, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(5)
	}

	//Add new project for building Other and None
	public void buildingAddNewProjectOtherNonePricing(String sheetName , int rowNum, int rowNum1, String pricingSheet, String country, String state, String zip) {
		/**************Reading data form excel sheet*************************/
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType    = data.getCellData(sheetName, "SpaceType", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		//String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		//String prjState 	= data.getCellData(sheetName, "State", rowNum)
		//String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)

		String proName
		if(sheetName.equalsIgnoreCase("USBuildingProject")){
			proName="USBuilding"
		}
		else if(sheetName.equalsIgnoreCase("ChinaBuildingProject")){
			proName="CHBuilding"
		}
		else if(sheetName.equalsIgnoreCase("BuildingIndiaProject")){
			proName="INDBuilding"
		}
		else{
			proName="CNBuilding"
		}
		//String proName= prjName.substring(0, 9)
		Date date = new Date(System.currentTimeMillis())
		String ProjectName = proName +prjRating +formatarDate.format(date)
		data.setCellData(pricingSheet,"ProjectName", rowNum1, ProjectName)

		navigation.clickAddProject()
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'), country, false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),state, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), zip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		//String PaymentPageText = WebUI.getText(findTestObject('Add_Project_Details/VerifyPaymentPage_ text'))
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('9'),title.indexOf('9')+10 )
		println Project_ID
		//WebUI.getText(findTestObject('Object Repository/Add_Project_Details/td_BuildingID'))
		//System.out.println()
		data.setCellData(pricingSheet,"ProjectID", rowNum1, Project_ID)
		data.setCellData(pricingSheet,"RegDate", rowNum1, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(5)

	}


	public void buildingAddNewProjectTransitPricing(String sheetName, int rowNum, int rowNum1, String pricingSheet, String country, String state, String zip) {
		/**************Reading data form excel sheet*************************/
		String prjName          = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		    = data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating    	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType        = data.getCellData(sheetName, "SpaceType", rowNum)
		String annualRider      = data.getCellData(sheetName, "annual_ridership", rowNum)
		String weekOprhrs       = data.getCellData(sheetName, "week_opr_hrs", rowNum)
		String fullTimeStaff    = data.getCellData(sheetName, "fulltime_staff", rowNum)
		String avgtimeSpent     = data.getCellData(sheetName, "avg_time_spent", rowNum)
		String ownerOrg 	    = data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	    = data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry     = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	    = data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		    = data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	    = data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		    = data.getCellData(sheetName, "City", rowNum)
		//String prjCountry 	    = data.getCellData(sheetName, "Country", rowNum)
		//String prjState 	    = data.getCellData(sheetName, "State", rowNum)
		String prjZip 		    = data.getCellData(sheetName, "Zip", rowNum)
		String isStation 		= data.getCellData(sheetName, "is_station", rowNum)

		String proName
		if(sheetName.equalsIgnoreCase("USBuildingProject")){
			proName="USBuilding"
		}
		else if(sheetName.equalsIgnoreCase("ChinaBuildingProject")){
			proName="CHBuilding"
		}
		else if(sheetName.equalsIgnoreCase("BuildingIndiaProject")){
			proName="INDBuilding"
		}
		else{
			proName="CNBuilding"
		}
		Date date = new Date(System.currentTimeMillis())
		String ProjectName = proName +prjRating +formatarDate.format(date)
		data.setCellData(pricingSheet,"ProjectName", rowNum1, ProjectName)
		navigation.clickAddProject()
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stationType'),isStation, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/annualRidership'), annualRider)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/weekelyOpreatingHours'), weekOprhrs)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/fullTimeStaff'), fullTimeStaff)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/timeSpentByRider'), avgtimeSpent)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'), country, false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),state, false)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), zip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('9'),title.indexOf('9')+10 )
		println Project_ID
		data.setCellData(pricingSheet,"ProjectID", rowNum1, Project_ID)
		data.setCellData(pricingSheet,"RegDate", rowNum1, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(5)
	}

	public void navigateToBuildingTransit() {
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ My Transit'))
		//WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/i_fa fa-bars fa-lg'))

		print "Making Slider On"
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/span_My Transit'))
		WebUI.verifyMatch(postNavigationLoginText,'My Transit',true)
		WebUI.delay(5)
	}

	public void navigateToBuilding() {
		WebUI.navigateToUrl(GlobalVariable.AllProjectUrl)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ Buildings'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ My Buildings'))
		String postNavigationLoginText = WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/span_My Buildings'))
		WebUI.verifyMatch(postNavigationLoginText,'My Buildings',true)
	}

	// Project registration for the pricing verification.
	@Keyword
	public void pricingProjectRegistrationBuildingOtherNone(String buildingSheet, String pricingSheet){
		//prj max value 11
		for(int prj=2; prj<=11; prj++){
			if(prj<=6){
				String country= data.getCellData(pricingSheet, "Country", prj)
				String state= data.getCellData(pricingSheet, "State", prj)
				String zip= data.getCellData(pricingSheet, "Zip", prj)
				navigateToBuilding()
				buildingAddNewProjectOtherNonePricing(buildingSheet, GlobalVariable.rowNumFive,prj,pricingSheet,  country, state, zip)
			}
			else{
				String country= data.getCellData(pricingSheet, "Country", prj)
				String state= data.getCellData(pricingSheet, "State", prj)
				String zip= data.getCellData(pricingSheet, "Zip", prj)
				navigateToBuilding()
				buildingAddNewProjectOtherNonePricing(buildingSheet, GlobalVariable.rowNumSix,prj, pricingSheet, country, state, zip)
			}
		}

	}

	@Keyword
	public void buildingAddNewProjectCountryNone(String sheetName , int rowNum) {
		/**************Reading data form excel sheet*************************/
		String prjName          = data.getCellData(sheetName,"ProjectName",rowNum)
		String prjType 		    = data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating    	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType        = data.getCellData(sheetName, "SpaceType", rowNum)
		String annualRider      = data.getCellData(sheetName, "annual_ridership", rowNum)
		String weekOprhrs       = data.getCellData(sheetName, "week_opr_hrs", rowNum)
		String fullTimeStaff    = data.getCellData(sheetName, "fulltime_staff", rowNum)
		String avgtimeSpent     = data.getCellData(sheetName, "avg_time_spent", rowNum)
		String ownerOrg 	    = data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	    = data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry     = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	    = data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		    = data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	    = data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		    = data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	    = data.getCellData(sheetName, "Country", rowNum)
		String prjState 	    = data.getCellData(sheetName, "State", rowNum)
		String prjZip 		    = data.getCellData(sheetName, "Zip", rowNum)
		String isStation 		= data.getCellData(sheetName, "is_station", rowNum)

		String proName="USBuilding"
		String ProjectName = proName +prjRating +formatarDate.format(date)

		navigation.clickAddProject()
		WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/projectName'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'),'Sri Lanka', false)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(5)
		//String PaymentPageText = WebUI.getText(findTestObject('Add_Project_Details/VerifyPaymentPage_ text'))
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
				
		WebUI.click(findTestObject('Object Repository/paymentPageNewUI/payNowButton'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		
	}

	@Keyword
	public void pricingProjectRegistrationBuildingTransit(String buildingSheet, String pricingSheet){

		for(int prj=12; prj<=21; prj++){
			if(prj<=16){
				String country= data.getCellData(pricingSheet, "Country", prj)
				String state= data.getCellData(pricingSheet, "State", prj)
				String zip= data.getCellData(pricingSheet, "Zip", prj)
				navigateToBuildingTransit()
				buildingAddNewProjectTransitPricing(buildingSheet, GlobalVariable.rowNumThree,prj, pricingSheet, country, state, zip)
			}
			else{
				String country= data.getCellData(pricingSheet, "Country", prj)
				String state= data.getCellData(pricingSheet, "State", prj)
				String zip= data.getCellData(pricingSheet, "Zip", prj)
				navigateToBuildingTransit()
				buildingAddNewProjectTransitPricing(buildingSheet, GlobalVariable.rowNumSeven,prj, pricingSheet, country, state, zip)
			}
		}

	}

}