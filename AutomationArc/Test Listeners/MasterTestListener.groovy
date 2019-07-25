import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterGroups
import org.testng.annotations.BeforeMethod

import com.arc.BaseClass.BaseClass
import com.kms.katalon.composer.report.*
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownIfError
import com.kms.katalon.core.annotation.TearDownIfPassed
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class MasterTestListener extends BaseClass {
	public String FailedSheet='FailedTestsSheet'
	public String sheetName
	public String testCaseName
	public String result
	public String[]  testSuiteId 
	public String[]  testCaseId
	String flag
	String Country
	public String[] testSuite = ['USTransitAboveground', 'USTransitUnderground', 'USBuildingOther', 'USBuildingNone','USMyParking', 'USLEEDForCities', 'USCitiesOther', 'USCitiesNone', 'USLEEDForCommunities','USCommunitiesOther', 'USCommunitiesNone', 'USMyPortfolios','INBuildingNone', 'USDashboardPage']					
	int suiteIndex=0
	int Counter=13
	int count
	public static int count1
	public static String [] testName
	//Count the no of test Cases
	public static int TestCount
	public static  int TestCasePass
	public static  int TestCaseFail
	
	@BeforeTestSuite
	public void beforeTestSuiteListener(TestSuiteContext testSuite)
	{
				
		println "This is before Test Suit"
		println("Before Test Suite Listener : " + testSuite.getTestSuiteId())
		KeywordUtil.markWarning("Before Test Suite Listener : " + testSuite.getTestSuiteId())
		KeywordLogger log = new KeywordLogger()
		testSuiteId = testSuite.getTestSuiteId().split("/")
		count= testSuiteId.size()
		println count
		println testSuiteId[count-1] 
		
		String currentRatings = testSuiteId[count-1]
		data.setCellData(GlobalVariable.BDataInput,"currentRatings", 2,currentRatings)
		
		
		Country= testSuiteId[count-1].substring(0,2)
		println Country
		WebUI.openBrowser('')
		//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithGlobalVariable'()
		CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithGlobalVariableAppUrl'()

	}
	
	
	@BeforeTestCase
	public void beforeTestListener(TestSuiteContext testSuite, TestCaseContext testCase)
	{
		println "Test Description"
		println RunConfiguration.getProjectDir()
		println RunConfiguration.getExecutionProfile()
		println RunConfiguration.getExecutionSource()
		println RunConfiguration.getExecutionSourceDescription()
		println RunConfiguration.getExecutionSourceName()
		println RunConfiguration.getHostAddress()
		println RunConfiguration.getHostName()
		println RunConfiguration.getOS()
		println RunConfiguration.getProjectDir()
		println RunConfiguration.getAppVersion()
		
		/*if((DriverFactory.getWebDriver().getCurrentUrl()).equalsIgnoreCase(GlobalVariable.url)){
			CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithGlobalVariable'()
		}*/
		
		println "Hey"
		println testCase.getTestCaseId()
		testCaseId = testCase.getTestCaseId().split("/")
		int testCount= testCaseId.size()
		
		println testCount
		println testCaseId[testCount-1]
		println "Test Suite ID: "
		println testSuiteId[count-1]
		if((testCaseId[testCount-2].contains("LEEDOnline") || testCaseId[testCount-1].contains("AddNewProject") || testCaseId[testCount-1].contains("PaymentByCreditCard") || testCaseId[testCount-1].contains("RegistrationPaymentCC") || testCaseId[testCount-1].contains("PaymentByCheck")|| testCaseId[testCount-1].contains("Login") || testCaseId[testCount-1].contains("INDVerifyTaxZeroIfSezIsCheckedTest") || testCaseId[testCount-1].contains("INDSEZCheckBoxVisibilityAndClausePopUpTest") || testCaseId[testCount-1].contains("INDPaymentPageTaxAndRegAmountVerificationTest") || testCaseId[testCount-1].contains("INDVerifyUploadedFileSEZAreVisibleToTheUserTest") || testCaseId[testCount-1].contains("VerifyThePriceTextOnTheMeasurablPaymentPageTest") || testCaseId[testCount-1].contains("PaymentForMeasurableSubscriptionTest"))){
			KeywordUtil.markWarning("LEED Online Test : " + testCaseId[testCount-1])
		}
		else{
		CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsNavigation.clickOnSidebar'(testSuiteId[count-1])
			
		//***********Login by Remote MySQL Database environment stg , qas , dev ***********************************************//*
	     //    CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.LoginToArcWithRemoteDBMySQL'()
			
		//**********Login by global variable by change the environment stg , qas , dev **************************************//*
			
			//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithGlobalVariable'()
			//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithGlobalVariableAppUrl'()
			
			
		//*************Login by excel sheet by change the row number 1 stg , 2 qas , 3 dev , 4 prd only ********************//*
		 //   CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcWithExcelData'()
			
		//*************Login by enter URL & username & passowrd by parameter ************************************************//*
		 //  CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.loginIntoArcApplication'("http://www.stg.arconline.io/","Saurav@groupten.com","LEEDg10")
		}
	}
	
	
	@BeforeMethod
	public void beforeTestMethod(TestCaseContext testCase)
	{

	}
	
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		
		println Thread.currentThread().getId()
		println "Test Case Id :"
		println testCaseContext.getTestCaseId()
	}
	
	@TearDown
	void TearDown(TestCaseContext testCase){
	   println("[--- This is Tear Down Method    1111---]")
        
	   println testCase.getTestCaseStatus()
	    //WebUI.closeBrowser()
		//DriverFactory.closeWebDriver()
		
	}
	
	
	@TearDownIfPassed
	void TearDownOnPass(){
		println("[--- This is Tear Down Method on Pass ---]")
	}
	
	@TearDownIfError
	void TearDownOnError(){
		println("[--- This is Tear Down Method on Error ---]")
	}
	
	@AfterTestCase
	public void afterTestCase(TestCaseContext testCase){
		//CustomKeywords.'com.helper.login.LoginHelper.logoutFromArcApplication'()
		WebUI.switchToDefaultContent()
		KeywordUtil.markWarning("Test Case Name : " + testCase.getTestCaseId())
		KeywordUtil.markWarning("Test Case Status : " + testCase.getTestCaseStatus())
		
		result = testCase.getTestCaseStatus()
		//cunt the tota no of test cases
		TestCount+=1
		//Count the test cases passed or failed
		if(result.equals('PASSED')){
			TestCasePass+=1
		}
		else{
			TestCaseFail+=1
		}
		testName = testCase.getTestCaseId().split("/")
		count1 =testName.size()
		println count1
		println testName[count1-1]
		testCaseName=testName[count1-1]
		sheetName= Country+testName[count1-2]
		
		/*if(sheetName.equals(testSuite[0])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumTAG, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumTAG, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumTAG, result, fontWhite, Red)
			 rowNumTAG=rowNumTAG+1
		}
		
		else if(sheetName.equals(testSuite[1])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumTUG, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumTUG, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumTUG, result, fontWhite, Red)
			rowNumTUG=rowNumTUG+1
		}
		
		else if(sheetName.equals(testSuite[2])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumBO, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumBO, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumBO, result, fontWhite, Red)
			 rowNumBO=rowNumBO+1
		}
			
		else if(sheetName.equals(testSuite[3])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumBN, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumBN, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumBN, result, fontWhite, Red)
			 rowNumBN=rowNumBN+1
		}
		else if(sheetName.equals(testSuite[4])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumMP, testCaseName)
			print RunConfiguration.getExecutionSourceDescription()
			print RunConfiguration.getOS()
			arcSheet.setCellData(sheetName, "Description", rowNumMP, RunConfiguration.getExecutionSourceDescription())
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumMP, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumMP, result, fontWhite, Red)
			 rowNumMP=rowNumMP+1
		}
		else if(sheetName.equals(testSuite[5])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumCL, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumCL, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumCL, result, fontWhite, Red)
			 rowNumCL=rowNumCL+1
		}
		else if(sheetName.equals(testSuite[6])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumCO, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumCO, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumCO, result, fontWhite, Red)
			 rowNumCO=rowNumCO+1
		}
		else if(sheetName.equals(testSuite[7])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumCN, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumCN, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumCN, result, fontWhite, Red)
			 rowNumCN=rowNumCN+1
		}
		else if(sheetName.equals(testSuite[8])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumCOML, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumCOML, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumCOML, result, fontWhite, Red)
			 rowNumCOML=rowNumCOML+1
		}
		else if(sheetName.equals(testSuite[9])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumCOMO, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumCOMO, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumCOMO, result, fontWhite, Red)
			 rowNumCOMO=rowNumCOMO+1
		}
		else if(sheetName.equals(testSuite[10])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumCOMN, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumCOMN, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumCOMN, result, fontWhite, Red)
			 rowNumCOMN=rowNumCOMN+1
		}
		else if(sheetName.equals(testSuite[11])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumPORT, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumPORT, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumPORT, result, fontWhite, Red)
			 rowNumPORT=rowNumPORT+1
		}
		else if(sheetName.equals(testSuite[12])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumINBN, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumINBN, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumINBN, result, fontWhite, Red)
			 rowNumINBN=rowNumINBN+1
		}
		
		else if(sheetName.equals(testSuite[13])){
			//Record the Test Name
			arcSheet.setCellData(sheetName, "TestCase", rowNumDASH, testCaseName)
			//Record the Test Result
			if(result.equals('PASSED'))
			arcSheet.setCellData(sheetName, "Status", rowNumDASH, result,fontWhite, Green)
			else
			arcSheet.setCellData(sheetName, "Status", rowNumDASH, result, fontWhite, Red)
			 rowNumDASH=rowNumDASH+1
		}
		
		if(result.equals('FAILED')){
		arcSheet.setCellData(FailedSheet, "TestCase", rowNumError, sheetName +"/"+ testCaseName)
		arcSheet.setCellData(FailedSheet, "Status", rowNumError, result,fontWhite, Red)
		rowNumError=rowNumError+1
	    }*/
		//WebUI.closeBrowser()
	     
	}
	
	@AfterTestSuite
	public void afterTestSuite(TestSuiteContext testSuite){
		
		println TestCount
		println TestCasePass
		println TestCaseFail
		/*data.setCellIntData(GlobalVariable.Result, "Total", GlobalVariable.rowNumTwo,TestCount)
		data.setCellIntData(GlobalVariable.Result, "Passed", GlobalVariable.rowNumTwo,TestCasePass)
		data.setCellIntData(GlobalVariable.Result, "Failed", GlobalVariable.rowNumTwo,TestCaseFail)*/

		 //data.setCellData(GlobalVariable.Result, "Duration", GlobalVariable.rowNumTwo, duration)
		 //SendEmail.sendStatusReport(TestCaseFail, TestCaseFail, TestCaseFail)
		KeywordUtil.markWarning("After Test Suite Listener : " + testSuite.getTestSuiteId())
		WebUI.closeBrowser()
		
	
	}
	
	
}