package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



public class ResuableMethodsSetting extends BaseClass{

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
		WebUI.delay(2)
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
		WebUI.waitForElementPresent(findTestObject('Analytics/17/Building Settings'),GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('Analytics/17/Building Settings'),GlobalVariable.avgAngularWait)
		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SettingPageDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/a_Occupants'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/a_Occupants'), GlobalVariable.minAngularWait)
	}

	public void occupant(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Occupants'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Occupants'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/VISITOR'),10)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/VISITOR'),10)
	
		}

	public void area(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/a_Gross Floor Area'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Settings18/a_Gross Floor Area'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/addDataButton'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/addDataButton'),GlobalVariable.minAngularWait)
	}

	public void areaVisibilty(){
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Upload1'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Upload1'),GlobalVariable.minAngularWait)
	}
	public void occupancyVisibilty(){
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
		//checkExclude()
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

	public void changedunit(){
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Unit/IP'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Unit/IP'),GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/IP'),GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('DataInput/Settings18/Unit/IP'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/SI'),GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('DataInput/Settings18/Unit/SI'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Unit/GROSS AREA'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Unit/GROSS AREA'), GlobalVariable.minAngularWait)
	}


	@Keyword
	public void changedUnit() {

		navigation.navigateIntoDataInput()

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore')).equalsIgnoreCase('')){
			WebUI.delay(10)
		}
		
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		println totalPerformaceScore
		data.setCellData(GlobalVariable.BDataInput,"ATotalScore", GlobalVariable.rowNumTwo, totalPerformaceScore)

		//******************************************Energy*********************************/
		areaEnergy()
		areaVisibilty()
		changedunit()

		//******************************************Water*********************************/
		areaWater()
		areaVisibilty()
		changedunit()

		//******************************************Waste*********************************/
		areaWaste()
		areaVisibilty()
		changedunit()

	}

	public void navigationTeam() {
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
	}
	@Keyword
	public void verifyTotalScoreShouldMore() {
		navigationTeam()
		navigation.navigateIntoDataInput()

		String totalPerformaceScore = data.getCellData(GlobalVariable.BDataInput,"ATotalScore",GlobalVariable.rowNumTwo)

		Integer totalperformaceScore = Integer.parseInt(totalPerformaceScore)

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore')).equalsIgnoreCase('')){
			WebUI.delay(10)
		}

		String mtotalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		Integer mTotalPerformaceScore = Integer.parseInt(mtotalPerformaceScore)

		if(totalperformaceScore < mTotalPerformaceScore)

			KeywordUtil.markPassed('SUCCESS: PERFORMANCE SCORE IS INCREASED AFTER CHANGING THE UNIT')

		else
			KeywordUtil.markFailed('FAIL : PERFORMANCE SCORE IS NOT INCREASED AFTER CHANGING THE UNIT')
	}


	@Keyword
	public void verifyTotalScoreShouldMore50() {
		navigationTeam()
		navigation.navigateIntoDataInput()

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore')).equalsIgnoreCase('')){
			WebUI.delay(10)
		}

		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		Integer totalperformaceScore = Integer.parseInt(totalPerformaceScore)

		if(totalperformaceScore >= 50)

			KeywordUtil.markPassed('TOTAL PERFORMANCE SCORE IS RECOMPUTED AND MORE THAN 50')

		else
			KeywordUtil.markFailed('TOTAL PERFORMANCE SCORE IS NOT RECOMPUTED AND LESS THAN 50')
	}

	@Keyword
	public void totalPerformanceScoreZero() {
		navigationTeam()
		navigation.navigateIntoDataInput()

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore')).equalsIgnoreCase('')){
			WebUI.delay(10)
		}

		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		Integer totalperformaceScore = Integer.parseInt(totalPerformaceScore)

		if(totalperformaceScore == 0)

			KeywordUtil.markPassed('TOTAL PERFORMANCE SCORE IS RECOMPUTED AS ZERO')

		else
			KeywordUtil.markFailed('TOTAL PERFORMANCE SCORE IS NOT RECOMPUTED MORE THAN ZERO')
	}
	public void deleteButtonArea() {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Unit/DeleteButton'),10)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Unit/DeleteButton'), 10)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/DeleteButton'), 10)
		WebUI.click(findTestObject('DataInput/Settings18/Unit/DeleteButton'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	public void deleteButtonOccupant() {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Unit/DeleteButton1'),10)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Unit/DeleteButton1'), 10)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/DeleteButton1'), 10)
		WebUI.doubleClick(findTestObject('DataInput/Settings18/Unit/DeleteButton1'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	public void deleteButtonOccupant1() {
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Settings18/Unit/DeleteButton2'),10)
		WebUI.waitForElementVisible(findTestObject('DataInput/Settings18/Unit/DeleteButton2'), 10)
		WebUI.waitForElementClickable(findTestObject('DataInput/Settings18/Unit/DeleteButton2'),10)
		WebUI.doubleClick(findTestObject('DataInput/Settings18/Unit/DeleteButton2'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}


	@Keyword
	public void verifyDeleteAreaEnergy() {

		//******************************************Energy*********************************/
		areaEnergy()
		areaVisibilty()
		deleteButtonArea()

	}

	@Keyword
	public void verifyDeleteAreaWater() {

		//******************************************Water*********************************/
		areaWater()
		areaVisibilty()
		deleteButtonArea()

	}

	@Keyword
	public void verifyDeleteOPGenHour() {

		//******************************************DELETE OPEPERATING HOUR*********************************/
		navigation.navigateIntoDataInput()
		buildingSettings()
		opeatingHour()
		clickGeneral()
		deleteButtonOccupant()

	}

	@Keyword
	public void verifyDeleteEnergyOPHour() {

		//******************************************DELETE OPEPERATING HOUR*********************************/
		navigation.navigateIntoDataInput()
		buildingSettings()
		opeatingHour()
		selectEnergy()
		deleteButtonOccupant()

	}
	@Keyword
	public void verifyDeleteWaterOpHour() {

		//******************************************DELETE OPEPERATING HOUR*********************************/
		navigation.navigateIntoDataInput()
		buildingSettings()
		opeatingHour()
		selectWater()
		deleteButtonOccupant()

	}
	@Keyword
	public void verifyDeleteWasteOpHour() {

		//******************************************DELETE OPEPERATING HOUR*********************************/
		navigation.navigateIntoDataInput()
		buildingSettings()
		opeatingHour()
		selectWaste()
		deleteButtonOccupant()

	}


	public void opeatingHour(){
		WebUI.delay(1)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SelectOperatingHours'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	@Keyword
	public void verifyDeleteAreaWaste() {

		//******************************************Waste*********************************/
		areaWaste()
		areaVisibilty()
		deleteButtonArea()
	}


	@Keyword
	public void verifyDeleteOccupancyEnergy(){

		//******************************************Energy*********************************/
		occupantEnergy()
		occupancyVisibilty()
		deleteButtonOccupant()

	}

	@Keyword
	public void verifyDeleteOccupancyWater(){

		//******************************************Water*********************************/
		occupantWater()
		occupancyVisibilty()
		deleteButtonOccupant()

	}
	@Keyword
	public void verifyDeleteOccupancyWaste() {
		//******************************************Waste*********************************/
		occupantWaste()
		occupancyVisibilty()
		deleteButtonOccupant()

	}

	@Keyword
	public void verifyDeleteOccupancyTransport() {

		//******************************************Transport*********************************/
		occupantTransport()
		occupancyVisibilty()
		deleteButtonOccupant1()

	}
	@Keyword
	public void verifyDeleteOccupancyHumExp() {

		//******************************************Human Experience*********************************/
		occupantHum()
		occupancyVisibilty()
		deleteButtonOccupant1()

	}
	@Keyword
	public void verifyEnergyScoreShouldZero() {


		//******************************************Energy Score*********************************/
		navigationTeam()

		navigation.navigateIntoDataInput()
		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/EnergyScore')).equalsIgnoreCase('')){
			WebUI.delay(7)
		}

		String energyPerScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/EnergyScore'))
		WebUI.verifyMatch(energyPerScore ,'0', false)

	}

	@Keyword
	public void verifyWaterScoreShouldZero() {


		//******************************************Water Score*********************************/
		navigationTeam()

		navigation.navigateIntoDataInput()
		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore')).equalsIgnoreCase('')){
			WebUI.delay(7)
		}
		String waterPfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		WebUI.verifyMatch(waterPfScore ,'0', false)

	}

	@Keyword
	public void verifyWasteScoreShouldZero() {


		//******************************************Waste Score*********************************/
		navigationTeam()

		navigation.navigateIntoDataInput()
		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/WasteScore')).equalsIgnoreCase('')){
			WebUI.delay(7)
		}
		String wastePfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WasteScore'))
		WebUI.verifyMatch(wastePfScore ,'0' , false)

	}

	@Keyword
	public void verifyTransScoreShouldZero() {


		//******************************************Transport Score*********************************/
		navigationTeam()

		navigation.navigateIntoDataInput()

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore')).equalsIgnoreCase('')){
			WebUI.delay(7)
		}


		String transPortperScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore'))
		WebUI.verifyMatch(transPortperScore ,'0', false)

	}

	@Keyword
	public void verifyHumanScoreShouldZero() {


		//******************************************Transport Score*********************************/
		navigationTeam()

		navigation.navigateIntoDataInput()

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp')).equalsIgnoreCase('')){
			WebUI.delay(7)
		}


		String humanexperience = WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp'))
		WebUI.verifyMatch(humanexperience ,'0', false)

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
