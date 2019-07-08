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
import org.openqa.selenium.Keys as Keys


	try {	
		
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsPayment.selectPayNow'()
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.paymentPageSchoolsDetails'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumEleven,5)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsPayment.paymentRegistration'(GlobalVariable.CCPayment , GlobalVariable.rowNumSix, GlobalVariable.creditCard)
	 
	} catch (Throwable t) {
			CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.tearDown'()
			System.out.println(t.getLocalizedMessage())
			Error e1 = new Error(t.getMessage())
			e1.setStackTrace(t.getStackTrace())
			e1.printStackTrace()
	}

