import com.kms.katalon.core.util.KeywordUtil

//Verify the integration allowed only once

try {
	
	//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumFive)
	
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsManage.verifyMeasurablIntegrationAllowedOnce'()

 }  catch (Exception t) {
	 
	 KeywordUtil.markWarning('Integration is not done')
	 t.printStackTrace()
 }


 