import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

//Verify the integration allowed only once

try {
	
	//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumFive)
	
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsManage.verifyMeasurablIntegrationAllowedOnce'()

 }  catch (Exception t) {
     WebUI.click(findTestObject('Object Repository/Manage/BillingSection/Measurabl/CloseWarningPopUp'))
	 KeywordUtil.markWarning('Integration is not done')
	 t.printStackTrace()
 }


 