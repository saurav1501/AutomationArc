import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable



try{
	
	
	
	
	if(GlobalVariable.environment=='dev')
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsDataInput.devsurveySubmit'(GlobalVariable.BDataInput)
	else
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsDataInput.surveySubmitTr'(GlobalVariable.BDataInput)
	
	
	/*//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumSeven)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsNavigation.navigateToTransitDataInput'()
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsDataInput.surveySubmitTr'(GlobalVariable.BDataInput)
*/
} catch (Throwable t) {
	WebUI.closeWindowIndex(1)
	WebUI.delay(2)
	WebUI.switchToWindowIndex(0)
	System.out.println(t.getLocalizedMessage())
	Error e1 = new Error(t.getMessage())
	e1.setStackTrace(t.getStackTrace())
	e1.printStackTrace()
}
