package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



public class ReusableMethodsSearch extends BaseClass{

	public static WebDriver driver = DriverFactory.getWebDriver()

	/*************Search By Project ID **************************************/
	@Keyword
	public void searchProgram(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName, "ProjectID" ,rowNum)

		navigationSearch()
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)

		boolean returnFalse = WebUI.waitForElementVisible(findTestObject('Page_Arc dashboard/no_Project (1 project)'),GlobalVariable.minAngularWait)

		if(returnFalse==false){
			navigationSearch()
			WebUI.clearText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
			WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
			WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
			WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		}

		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
	}

	public void navigationSearch(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'),5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'),5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
	}
	@Keyword
	public void searchProgram(String projectID) {

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectID)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Page_Arc dashboard/no_Project (1 project)'),GlobalVariable.avgAngularWait)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (1 project)'))
		println nuberOfProjects

		WebUI.delay(1)
		WebUI.verifyMatch(nuberOfProjects,'Project (1 project)', false)
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void searchProgramCity(String sheetName , int rowNum) {
		int rowNum1  = data.getCellData(GlobalVariable.CitySheet,"rowNum",2)
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum1)

		//	WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		//	if(WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))!= null)
		//	WebUI.clearText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('Page_Arc dashboard/no_Project (1 project)'),4)
		//	WebUI.waitForElementPresent(findTestObject('Page_Arc dashboard/no_Project (1 project)'),3)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (1 project)'))
		println nuberOfProjects
		WebUI.verifyMatch(nuberOfProjects,'Project (1 project)', false)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void searchProgramForNoProjectPresent(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		//	WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))

		//	if(WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))!= null)
		//	WebUI.clearText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))

		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (0 project)'))
		println nuberOfProjects
		WebUI.verifyMatch(nuberOfProjects,'Project (0 projects)', false)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		/*WebUI.closeWindowIndex(1)
		 WebUI.delay(3)
		 WebUI.switchToWindowIndex(0)*/
	}

	/*************Search By Project Name **************************************/
	@Keyword
	public void searchProgramByName(String sheetName , int rowNum) {
		String projectName = data.getCellData(sheetName,"ProjectName",rowNum)

		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.clearText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))

		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectName)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (1 project)'))
		println nuberOfProjects
		WebUI.verifyMatch(nuberOfProjects,'Project (1 project)', false)
	}


	@Keyword
	public void searchProgramPortfolio(String sheetName, int rowNum) {
		String projectName = data.getCellData(sheetName,"ProjectName",rowNum)
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectName)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		String nuberOfProtfolio = WebUI.getText(findTestObject('Portfolio/Common/TNoPortfolio (1 portfolio)'))
		println nuberOfProtfolio
		WebUI.verifyMatch(nuberOfProtfolio,'Portfolio (1 portfolio)', false)

		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/search_Result'), 10)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.delay(8)
		WebUI.waitForAngularLoad(120, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
	}

	@Keyword
	public void searchProgramPortfolioId(String sheetName, int rowNum) {
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		String projectName = data.getCellData(sheetName,"PortfolioID",rowNum)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectName)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		String nuberOfProtfolio = WebUI.getText(findTestObject('Portfolio/Common/TNoPortfolio (1 portfolio)'))
		println nuberOfProtfolio
		WebUI.verifyMatch(nuberOfProtfolio,'Portfolio (1 portfolio)', false)
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Arc dashboard/search_Result'),10)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.delay(7)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait,FailureHandling.OPTIONAL)
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
	}
	@Keyword
	public void searchLEEDProgram(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"LTestProjID",rowNum)
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
		WebUI.delay(5)
	}


	public static void searchSchools(){
		//Search the schools using the 2 character of alphabet
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/SearchBarSchools'))
		String searchSchool=getAlphaNumericString(GlobalVariable.rowNumTwo)
		WebUI.setText(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/SearchBarSchools'), searchSchool)
		//Wait for the visibility of the element rows per page
		WebUI.waitForElementVisible(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/RowsPerPage'), 10)
		//Click on rows per page
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/RowsPerPage'))
		//click on 100 rows per page
		WebUI.click(findTestObject('Object Repository/SchoolsLocators/SearchSchoolsLocators/ClickOnHundredRowsPerPage'))
	}


	public static void claimASchool(){

		searchSchools()

		List<WebElement> schoolsName = driver.findElements(By.xpath("//tr[@data-ng-repeat='school in myschools']/td[4]"))

		println schoolsName.size()
		int size=schoolsName.size()

		for(WebElement ele : schoolsName){

			println(ele.getText())
			if((ele.getText().equalsIgnoreCase("Claim now"))){
				ele.click()
			}
			else
				size=size-1;
			if ((size==0)){
				searchSchools()
				size= schoolsName.size()
			}
		}
	}



	// function to generate a random string of length n
	public static String getAlphaNumericString(int n){

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

	@Keyword
	public void searchProjectPromocode(String sheetName, int rowNum, String promoType) {
		
		String projectId
		
		if(promoType=='hundred'){
		projectId= dataExcelTemplate.getCellData(sheetName,"ProjectIDHundred",rowNum)
		}
		else{
			projectId= dataExcelTemplate.getCellData(sheetName,"ProjectIDFifty",rowNum)
		}
		println "Hi"
		println projectId
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementVisible(findTestObject('Page_Arc dashboard/no_Project (1 project)'),GlobalVariable.avgAngularWait)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (1 project)'))
		println nuberOfProjects

		WebUI.delay(1)
		WebUI.verifyMatch(nuberOfProjects,'Project (1 project)', false)
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	
	
	
}

