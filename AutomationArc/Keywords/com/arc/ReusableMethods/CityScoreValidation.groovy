package com.arc.ReusableMethods

import java.io.IOException
import java.text.SimpleDateFormat

import org.openqa.selenium.WebDriver

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class CityScoreValidation extends BaseClass{


	ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	WebDriver driver = DriverFactory.getWebDriver()
	SimpleDateFormat formatarDate = new SimpleDateFormat(' HH:mm:ss')


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
		Date date = new Date(System.currentTimeMillis())

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
		if(GlobalVariable.environment=='dev'){
			WebUI.selectOptionByLabel(findTestObject('Object Repository/Add_Project_Details/UnitType'), 'Square kilo meters', false)
			WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/grossArea'),'48')
		}
		else{
			WebUI.sendKeys(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
		}
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
	
	
	@Keyword
	public void createEnergyMeterReadingTrial(String sheetName, int rowNum) throws IOException, InterruptedException{

		String reading1  = data.getCellData(sheetName, "EReading1", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		WebUI.delay(10)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		WebUI.delay(8)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading1)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
		WebUI.delay(5)
		
	}


	@Keyword
	public void createWaterMeterReadingTrial(String sheetName, int rowNum ) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "WaterReading1", rowNum)
		
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(2)
		WebUI.doubleClick(findTestObject('DataInput/CityCom/span_Water'))
		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 3)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		WebUI.delay(8)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Next Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading1)
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
		WebUI.delay(6)	
	 }

	 public void createEnergyReadingAndValidateScore(String sheetName, int rowNum){
		 
		 String score= data.getCellData(sheetName, "Score",rowNum)
		 WebUI.click(findTestObject('Object Repository/TrialScore/scoreTotal'))
		 WebUI.delay(10)
		 String performanceScoreText = WebUI.getText(findTestObject('Object Repository/TrialScore/scorePerformanceScoreText'))
		 WebUI.verifyMatch(performanceScoreText, "Performance Score", false)
		 WebUI.delay(15)
		 WebUI.waitForElementPresent(findTestObject('Object Repository/TrialScore/plaqueEnergyScore'), 20)
		 //WebUI.waitForElementVisible(findTestObject('Object Repository/TrialScore/plaqueEnergyScore'), 20)
		 String energyScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueEnergyScore'))
		 
		
	 }
	
	
	
}
