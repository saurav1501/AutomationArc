package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



public class ReusableMethodsSearch extends BaseClass{
	
	public static WebDriver driver = DriverFactory.getWebDriver()
	
	/*************Search By Project ID **************************************/
	@Keyword
	public void searchProgram(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		//	WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		//	if(WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))!= null)
		//	WebUI.clearText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
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

	@Keyword
	public void searchProgramForNoProjectPresent(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		//	WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))

		//	if(WebUI.getText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))!= null)
		//	WebUI.clearText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))

		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (0 project)'))
		println nuberOfProjects
		WebUI.verifyMatch(nuberOfProjects,'Project (0 projects)', false)
		WebUI.delay(2)
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
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectName)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		String nuberOfProtfolio = WebUI.getText(findTestObject('Portfolio/Common/TNoPortfolio (1 portfolio)'))
		println nuberOfProtfolio
		WebUI.verifyMatch(nuberOfProtfolio,'Portfolio (1 portfolio)', false)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
	}

	@Keyword
	public void searchProgramPortfolioId(String sheetName, int rowNum) {
		String projectName = data.getCellData(sheetName,"PortfolioID",rowNum)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectName)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.delay(3)
		String nuberOfProtfolio = WebUI.getText(findTestObject('Portfolio/Common/TNoPortfolio (1 portfolio)'))
		println nuberOfProtfolio
		WebUI.verifyMatch(nuberOfProtfolio,'Portfolio (1 portfolio)', false)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.delay(7)
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

}

