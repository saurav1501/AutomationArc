import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

   try {
	
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.loginIntoLEEDOnlineWithGlobalVariable'()
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumTwo)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.navigateToCreditsSection'() 
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheEnergyDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData,GlobalVariable.rowNumFour)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheWaterDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumFive)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheWasteDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumTwo)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheCO2DataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumEight, GlobalVariable.rowNumSeven)

	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheTVOCDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumSix)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyThePM25DataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheOzoneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheCarbonMonoxideDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheTolueneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)

	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheAcetaldehydeDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheBenzeneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheStyreneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheNaphthaleneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheDichlorobenzeneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyTheXylenesTotalDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.verifyFormaldehydeTotalDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	   
	   CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsLEEDOnline.surveyResponseRatePopulatedViaARCInDataInputSection'()
	  
	    } catch (Throwable t) {
		
		System.out.println(t.getLocalizedMessage())
		Error e1 = new Error(t.getMessage())
		e1.setStackTrace(t.getStackTrace())
		e1.printStackTrace()
    }
	   
	   
	   
	   
	   
	   
	   
	   