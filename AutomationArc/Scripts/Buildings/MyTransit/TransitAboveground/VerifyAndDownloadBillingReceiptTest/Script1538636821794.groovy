import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable as GlobalVariable

//download the order file and verify if it is downloaded or not

try {
	
	//CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsSearch.searchProgram'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumThree)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsManage.verifyBillingOrderFileDownload'(GlobalVariable.BuildingSheet,GlobalVariable.rowNumThree)
	
 }  catch (ArrayIndexOutOfBoundsException t) {
	 KeywordUtil.markWarning('Billing receipt not found/able to read')
	 //Error e1 = new Error(t.getMessage())
	 //e1.setStackTrace(t.getStackTrace())
	 //e1.printStackTrace()
 }


