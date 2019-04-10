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

//Validate the Huaman Experience Meter for the leed v4.1
try {
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumEleven)
	//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsDataInput.verifyTransportationGraphpopulatedAfterExcelUploadNewScore'(GlobalVariable.TemplateHE, GlobalVariable.rowNumTwo)

	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyThePM25DataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheCarbonMonoxideDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheOzoneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheAcetaldehydeDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheBenzeneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheStyreneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheTolueneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheNaphthaleneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheDichlorobenzeneDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyTheXylenesTotalDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSchools.verifyFormaldehydeTotalDataPopulatedViaARCInDataInputSection'(GlobalVariable.LEEDData, GlobalVariable.rowNumThree)
	
	
} catch (Throwable t) {
	System.out.println(t.getLocalizedMessage())
		Error e1 = new Error(t.getMessage())
		e1.setStackTrace(t.getStackTrace())
		e1.printStackTrace()
}