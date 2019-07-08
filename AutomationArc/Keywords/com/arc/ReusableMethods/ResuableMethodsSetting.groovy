package com.arc.ReusableMethods

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



public class ResuableMethodsSetting {

	public ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()

	public void moreSettings() {
		WebUI.scrollToElement(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.scrollToElement(findTestObject('DataInput/Settings18/MoreSettings'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/MoreSettings'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/MoreSettings'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/MoreSettings'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/MoreSettings'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
	}

	public void checkExclude(){
		WebUI.scrollToElement(findTestObject('DataInput/Settings18/ExcludeSpaces'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/ExcludeSpaces'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/ExcludeSpaces'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/ExcludeSpaces'), GlobalVariable.minAngularWait)
		WebUI.check(findTestObject('DataInput/Settings18/ExcludeSpaces'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	public void checkRadioAllOccupant(){
		WebUI.scrollToElement(findTestObject('DataInput/Settings18/AllOccupants'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/AllOccupants'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/AllOccupants'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/AllOccupants'), GlobalVariable.minAngularWait)
		WebUI.check(findTestObject('DataInput/Settings18/AllOccupants'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/button_Close'), GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Settings18/button_Close'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	public void checkRegularOccupant(){
		WebUI.scrollToElement(findTestObject('DataInput/Settings18/RegularBuildingOccupant'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/RegularBuildingOccupant'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/RegularBuildingOccupant'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/RegularBuildingOccupant'), GlobalVariable.minAngularWait)
		WebUI.check(findTestObject('DataInput/Settings18/RegularBuildingOccupant'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/button_Close'), GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Settings18/button_Close'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	public void checkVisitorOccupant(){
		WebUI.scrollToElement(findTestObject('DataInput/Settings18/Visitors_radiobtn'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Visitors_radiobtn'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Visitors_radiobtn'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Visitors_radiobtn'), GlobalVariable.minAngularWait)
		WebUI.check(findTestObject('DataInput/Settings18/Visitors_radiobtn'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/button_Close'), GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Settings18/button_Close'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	public void buildingSettings(){
		WebUI.waitForElementClickable(findTestObject('Analytics/17/Building Settings'),GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Analytics/17/Building Settings'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Setting/Setting'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Setting/Setting'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/Setting'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/Setting'), 2)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/Setting'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/a_Occupants'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/a_Occupants'), GlobalVariable.minAngularWait)
	}

	public void occupant(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Occupants'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Occupants'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/VISITOR'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/VISITOR'),GlobalVariable.minAngularWait)
	}

	public void area(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Gross Floor Area'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Gross Floor Area'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/addDataButton'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/addDataButton'),GlobalVariable.minAngularWait)
	}

	public void areaVisibilty(){
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/AreaTotalValue'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/AreaTotalValue'),GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Upload1'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Upload1'),GlobalVariable.minAngularWait)
	}
	public void occupancyVisibilty(){
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/TotalValue'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/TotalValue'),GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Upload'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Upload'),GlobalVariable.minAngularWait)
	}


	public void clickGeneral(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/General'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/General'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/a_General'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/a_General'),GlobalVariable.minAngularWait)
	}

	public void addrowVisibility(){
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/addDataButton'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/addDataButton'),GlobalVariable.minAngularWait)
	}
	public void selectEnergy(){
		clickGeneral()
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Energy'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Energy'))
		addrowVisibility()
	}

	public void selectWater(){
		clickGeneral()
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Water'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Water'))
		addrowVisibility()
	}
	public void selectWaste(){
		clickGeneral()
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Waste'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Waste'))
		addrowVisibility()
	}
	public void selectTransport(){
		clickGeneral()
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Transportation'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Transportation'))
		addrowVisibility()
	}

	public void selectHum(){
		clickGeneral()
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Human Experience'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Human Experience'))
		addrowVisibility()
	}

	public void setExclude(){
		navigation.navigateIntoDataInput()
		moreSettings()
	}

	@Keyword
	public void checkAllOccpant() {
		setExclude()
		checkExclude()
		checkRadioAllOccupant()
	}

	@Keyword
	public void checkRegular() {
		setExclude()
		checkRegularOccupant()
	}

	@Keyword
	public void checkVisitor() {
		setExclude()
		checkVisitorOccupant()
	}


	public void occupantGen() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		occupant()
		clickGeneral()
	}
	public void occupantEnergy() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		occupant()
		selectEnergy()
	}


	public void occupantWater() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		occupant()
		selectWater()
	}


	public void occupantWaste() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		occupant()
		selectWaste()
	}


	public void occupantTransport() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		occupant()
		selectTransport()
	}


	public void occupantHum() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		occupant()
		selectHum()
	}


	public void areaGeneral() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		area()
		clickGeneral()
	}

	public void areaEnergy() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		area()
		selectEnergy()
	}

	public void areaWater() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		area()
		selectWater()
	}

	public void areaWaste() {
		navigation.navigateIntoDataInput()
		buildingSettings()
		area()
		selectWaste()
	}

	@Keyword
	public void verifyareaAfterDataUpload(String sheetName,int rowNum) {
		//******************************************General*********************************/
		areaGeneral()
		areaVisibilty()
		String area =WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		println area
		WebUI.verifyMatch(area,'3000' , false, FailureHandling.CONTINUE_ON_FAILURE)


		//******************************************Energy*********************************/
		areaEnergy()
		areaVisibilty()
		area =WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		WebUI.verifyMatch(area,'1000' , false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Water*********************************/
		areaWater()
		areaVisibilty()
		area =WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		WebUI.verifyMatch(area,'2000' , false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Waste*********************************/
		areaWaste()
		areaVisibilty()
		area =WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		WebUI.verifyMatch(area, '3000' , false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	public void changedUnit(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/IP'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/Unit/IP'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/SI'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/Unit/SI'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Unit/GROSS AREA'), GlobalVariable.minAngularWait)
	    WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Unit/GROSS AREA'), GlobalVariable.minAngularWait)
	
		
	}
	
	
	@Keyword
	public void changedUnit(String sheetName,int rowNum) {
		
		//******************************************Energy*********************************/
		areaEnergy()
		areaVisibilty()
		changedUnit()

		//******************************************Water*********************************/
		areaWater()
		areaVisibilty()
		area =WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		WebUI.verifyMatch(area,'2000' , false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Waste*********************************/
		areaWaste()
		areaVisibilty()
		area =WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		WebUI.verifyMatch(area, '3000' , false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	
	@Keyword
	public void verifyOccupupantAfterDataUpload(String sheetName,int rowNum) {

		//******************************************General*********************************/
		occupantGen()
		occupancyVisibilty()
		String population = WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		WebUI.verifyMatch(population,'9', false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Energy*********************************/
		occupantEnergy()
		occupancyVisibilty()
		population = WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		WebUI.verifyMatch(population,'9', false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Water*********************************/
		occupantWater()
		occupancyVisibilty()
		population =WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		WebUI.verifyMatch(population,'9', false, FailureHandling.CONTINUE_ON_FAILURE)


		//******************************************Waste*********************************/
		occupantWaste()
		occupancyVisibilty()
		population =WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		WebUI.verifyMatch(population,'9', false, FailureHandling.CONTINUE_ON_FAILURE)


		//******************************************Transport*********************************/
		occupantTransport()
		occupancyVisibilty()

		//******************************************Total***********************************/
		population =WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		WebUI.verifyMatch(population,'9', false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Regular*********************************/
		String regpopulation =WebUI.getText(findTestObject('DataInput/Settings18/RegularOccupaint'))
		WebUI.verifyMatch(regpopulation,'5' , false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Visitor*********************************/
		String visitorpopulation =WebUI.getText(findTestObject('DataInput/Settings18/VISITOR'))
		WebUI.verifyMatch(visitorpopulation, '4', false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************HumanExpericence*********************************/
		occupantHum()
		occupancyVisibilty()
		//******************************************Total***********************************/
		population =WebUI.getText(findTestObject('DataInput/Settings18/TotalValue'))
		WebUI.verifyMatch(population,'9', false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Regular*********************************/
		regpopulation =WebUI.getText(findTestObject('DataInput/Settings18/RegularOccupaint'))
		WebUI.verifyMatch(regpopulation,'5' , false, FailureHandling.CONTINUE_ON_FAILURE)

		//******************************************Visitor*********************************/
		visitorpopulation =WebUI.getText(findTestObject('DataInput/Settings18/VISITOR'))
		WebUI.verifyMatch(visitorpopulation, '4', false, FailureHandling.CONTINUE_ON_FAILURE)


	}
}
