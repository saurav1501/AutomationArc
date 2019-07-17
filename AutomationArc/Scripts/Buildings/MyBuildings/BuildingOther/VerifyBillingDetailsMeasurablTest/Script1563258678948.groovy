import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable as GlobalVariable

//Verify the billing details in the measurabl section

try {
	
	//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumFive)
	
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsManage.billingStatusAndDetailsMeasurabl'(GlobalVariable.BuildingSheet,GlobalVariable.rowNumFive)

 }  catch (Exception t) {
	 KeywordUtil.markWarning('Billing details are not found')
 }


 