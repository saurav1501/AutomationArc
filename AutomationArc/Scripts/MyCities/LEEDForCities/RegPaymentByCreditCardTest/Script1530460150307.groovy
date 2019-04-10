import internal.GlobalVariable

try {
	
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsPayment.selectPayNow'()
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsPayment.paymentPageBuildingCityDetails'(GlobalVariable.CitySheet, GlobalVariable.rowNumTwo)
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsPayment.paymentRegistration'(GlobalVariable.CCPayment , GlobalVariable.rowNumTwo, GlobalVariable.creditCard)
	
} catch (Throwable t) {
	CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsLogin.tearDown'()
	System.out.println(t.getLocalizedMessage())
	Error e1 = new Error(t.getMessage())
	e1.setStackTrace(t.getStackTrace())
	e1.printStackTrace()
}
	
