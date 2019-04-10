package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat
import java.util.regex.Matcher
import java.util.regex.Pattern

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ReusableMethodValidation extends BaseClass{

	ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	SimpleDateFormat formatarDate = new SimpleDateFormat(' HH:mm:ss')
	final String regArea = "^[+]?([0-9]+(\\.[0-9]+)?|\\.[0-9]+)\$"
	final String regPrjName = "^[ A-Za-z0-9.&\\+-:'*,#/]*\$"
	public static void logInfo(String msg){
		KeywordUtil.logInfo("This is allowed => "+ msg)
	}

	public static void logInfoSingleValue(String msg1){
		KeywordUtil.logInfo("List of allowed Values below :")
		KeywordUtil.logInfo(msg1)
	}

	public static void logInfo(String msg1, String msg2, String msg3, String msg4, String msg5 ){

		KeywordUtil.logInfo("List of allowed Values below :")
		KeywordUtil.logInfo(msg1)
		KeywordUtil.logInfo(msg2)
		KeywordUtil.logInfo(msg3)
		KeywordUtil.logInfo(msg4)
		KeywordUtil.logInfo(msg5)
	}


	public static void logInfo(String msg1, String msg2, String msg3, String msg4 ){

		KeywordUtil.logInfo("List of allowed Values below :")
		KeywordUtil.logInfo(msg1)
		KeywordUtil.logInfo(msg2)
		KeywordUtil.logInfo(msg3)
		KeywordUtil.logInfo(msg4)
	}

	public static void markFail(String msg){
		KeywordUtil.markFailed("This is not allowed "+ msg)
	}

	//Building Registration page validation


	public static void validateForm(String regex, String value, String locator){
		String flag="false"

		//final String string = "20499999.000"

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE)
		final Matcher matcher = pattern.matcher(value);

		while (matcher.find()) {
			println("Full match: " + matcher.group(0))
			float num=Float.parseFloat(value)
			println(num)
			if((locator=="projectArea")){
				if((matcher.group(0)==value) && (Double.parseDouble(value)<=20499999))
				{
					println("Full match: " + matcher.group(0))
					if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/'+locator),FailureHandling.CONTINUE_ON_FAILURE)==true)){
						flag="true"
					}
					else{
						markFail(value)
						flag="false"
					}

				}
			}
			if((matcher.group(0)==value))
			{
				println("Full match: " + matcher.group(0))
				if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/'+locator),FailureHandling.CONTINUE_ON_FAILURE)==true)){
					flag="true"
				}
				else{
					markFail(value)
					flag="false"
				}

			}
		}
		if((flag==false)){
			WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/'+locator),FailureHandling.CONTINUE_ON_FAILURE)

		}

	}



	@Keyword
	public void buildingAddNewProjectPageValidation(String sheetName , int rowNum1) {
		String val1, val2, val3, val4, val5
		String validation
		navigation.clickAddProject()
		for(int rowNum =rowNum1 ; rowNum<=10 ; rowNum++){

			/**************Reading data form excel sheet*************************/
			String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
			String prjNameTest      = data.getCellData(sheetName,"ProjectNameTest", rowNum)
			String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
			String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
			String spaceType    = data.getCellData(sheetName, "SpaceType", rowNum)
			String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
			String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
			String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
			String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
			String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
			String prjAreaTest 		= data.getCellData(sheetName, "AreaTest", rowNum)
			String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
			String prjAddressTest 	= data.getCellData(sheetName, "AddressTest", rowNum)
			String prjCity 		= data.getCellData(sheetName, "City", rowNum)
			String prjCityTest 		= data.getCellData(sheetName, "CityTest", rowNum)
			String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
			String prjState 	= data.getCellData(sheetName, "State", rowNum)
			String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)

			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/projectName'), prjName)
			WebUI.delay(2)
			WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/errorMessage'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/projectName'), prjNameTest)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'), prjType, true)
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjArea )
			WebUI.delay(2)
			WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectArea'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/grossArea'),prjAreaTest )
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddress)
			if(prjAddress==""){
				WebUI.delay(2)
				WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/errorMessage'), FailureHandling.STOP_ON_FAILURE)
				WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/streetName'), prjAddressTest)
			}
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCity)
			WebUI.delay(2)
			WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectCity'), FailureHandling.STOP_ON_FAILURE)
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/cityName'), prjCityTest)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/countryName'), prjCountry, false)
			WebUI.delay(2)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/stateName'),prjState, false)
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/zipCode'), prjZip)

			/*validateForm(regPrjName,prjName,"projectName")
			 validateForm(regArea,prjArea , "projectArea")
			 validateForm(regPrjName, prjCity, "projectCity")*/


			/*if(rowNum==8 || rowNum==9 ||rowNum==10){
			 if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectName'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjName)
			 val1="The project name => "+ prjName +"   allowed"
			 }
			 else{
			 markFail(prjName)
			 val1="The project name => "+ prjName +"   not allowed"
			 }
			 }
			 else{
			 if((WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectName'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjName)
			 val1="The project name => "+ prjName +"   not allowed"
			 }
			 else{
			 markFail(prjName)
			 val1="The project name => "+ prjName +"   not allowed"
			 }
			 }
			 if(rowNum==6 || rowNum==8 || rowNum==9 ||rowNum==10){
			 if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectArea'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjArea)
			 val2="The project area => "+prjArea +"   allowed"
			 }
			 else{
			 markFail(prjArea)
			 val2="The project area => "+prjArea +"   not allowed"
			 }
			 }
			 else{
			 if((WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectArea'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjArea)
			 val2="The project area => "+prjArea +" not  allowed"
			 }
			 else{
			 markFail(prjArea)
			 val2="The project area => "+prjArea +" not allowed"
			 }
			 }
			 if(rowNum==7){
			 if((WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectAddress'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjAddress)
			 val3="The project address =>  "+prjAddress +" not allowed"
			 }
			 else{
			 markFail(prjAddress)
			 val3="The project address =>  "+prjAddress +"  not allowed"
			 }
			 }
			 else{
			 if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectAddress'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjAddress)
			 val3="The project address =>  "+prjAddress +"  allowed"
			 }
			 else{
			 markFail(prjAddress)
			 val3="The project address =>  "+prjAddress +"  not allowed"
			 }
			 }	
			 if(rowNum==8 || rowNum==9 || rowNum==10){
			 if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectCity'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjCity)
			 val4="The project city => "+prjCity +"  allowed"
			 }
			 else{
			 markFail(prjCity)
			 val4="The project city => "+prjCity +"  not allowed"
			 }
			 }
			 else{
			 if((WebUI.verifyElementVisible(findTestObject('Object Repository/ErrorLocators/AddProject/projectCity'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjCity)
			 val4="The project city => "+prjCity +"  not allowed"
			 }
			 else{
			 markFail(prjCity)
			 val4="The project city => "+prjCity +"  not allowed"
			 }
			 }
			 if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/AddProject/prjZip'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
			 logInfo(prjZip)
			 val5="The project zip => "+prjZip +"  allowed"
			 }
			 else{
			 markFail(prjZip)
			 val5="The project zip => "+prjZip +"  not allowed"
			 }
			 logInfo(val1, val2, val3, val4, val5)
			 */
			//logInfo(val1, val2, val3, val4, val5)
		}
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/clickOnSignAgreement'))
		WebUI.click(findTestObject('Object Repository/AddProjectNewUI/addProjectNextButton'))
		WebUI.delay(10)
		//String PaymentPageText = WebUI.getText(findTestObject('Add_Project_Details/VerifyPaymentPage_ text'))
		String PaymentPageText = WebUI.getText(findTestObject('paymentPageNewUI/paymentPageTextProjetSetup'))
		WebUI.verifyMatch(PaymentPageText,'Project Setup',true)
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('9'),title.indexOf('9')+10 )
		println Project_ID
		//WebUI.getText(findTestObject('Object Repository/Add_Project_Details/td_BuildingID'))
		//System.out.println()
		data.setCellData(sheetName,"ProjectID", rowNum1, Project_ID)
		//data.setCellData(sheetName,"RegDate", rowNum, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(5)

	}

	//Building payment page validation
	@Keyword
	public void paymentPageProjectDataValidation(String sheetName, int rowNum1, int yearOfSubscription){

		String val1
		for(int rowNum=rowNum1; rowNum<=10; rowNum++){
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
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/spaceType'), spaceType, true)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ownerType'), ownerType, true)
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/organization'),ownerOrg)
			WebUI.click(findTestObject('Object Repository/AddProjectNewUI/organization'))
			WebUI.delay(2)
			WebUI.click(findTestObject('Add_Project_Details/span_Habitat for Humanity'))
			//WebUI
			WebUI.setText(findTestObject('Object Repository/AddProjectNewUI/ownerEmail'), ownerMail)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ownerCountry'), ownerCountry, false)
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'), prjRating , false)
			WebUI.click(findTestObject('Object Repository/AddProjectNewUI/saveButtonProjectDetails'))
			WebUI.delay(5)

			if((WebUI.verifyElementNotVisible(findTestObject('Object Repository/ErrorLocators/PaymentPage/projectOwnerEmail'),FailureHandling.CONTINUE_ON_FAILURE)==true)){
				logInfo(ownerMail)
				val1="The owner email => "+ ownerMail +"   allowed"
			}
			else{
				markFail(ownerMail)
				val1="The owner email => "+ ownerMail +"   not allowed"
			}
			logInfoSingleValue(val1)

		}
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
		String title= DriverFactory.getWebDriver().getCurrentUrl()
		println title
		String Project_ID= title.substring(title.indexOf('1'),title.indexOf('1')+10 )
		println Project_ID
		data.setCellData(sheetName,"ProjectID", rowNum1, Project_ID)

	}



}

