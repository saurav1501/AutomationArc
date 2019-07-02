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
	
	@Keyword
	public void setExclude(){
		navigation.navigateIntoDataInput()
		moreSettings()
		checkExclude()
		checkRadioAllOccupant()
		checkRegularOccupant()
		checkVisitorOccupant()
	}
	
	@Keyword
	 public void occupantEnergy()
	 {
		 navigation.navigateIntoDataInput()
		 occupant()
		 selectEnergy()
		 
		 
     }

	 @Keyword
	 public void occupantWater()
	 {
		 navigation.navigateIntoDataInput()
		 occupant()
		 selectWater()
	 }
	 
	 @Keyword
	 public void occupantWaste()
	 {
		 navigation.navigateIntoDataInput()
		 occupant()
		 selectWaste()
	 }
	 
	 @Keyword
	 public void occupantTransport()
	 {
		 navigation.navigateIntoDataInput()
		 occupant()
		 selectTransport()
		 
	 }
	 
	 @Keyword
	 public void occupantHum()
	 {
		 navigation.navigateIntoDataInput()
		 occupant()
		 selectHum()
	 }
	 
	 @Keyword
	 public void areaEnergy()
	 {
		 navigation.navigateIntoDataInput()
		 area()
		 selectEnergy()
	 }
	 @Keyword
	 public void areaWater()
	 {
		 navigation.navigateIntoDataInput()
		 area()
		 selectWater()
	 }
	 @Keyword
	 public void areaWaste()
	 {
		 navigation.navigateIntoDataInput()
		 area()
		 selectWaste()
	 }
	
} 
	 