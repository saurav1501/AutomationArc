package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ReusableMethodsMeasuresParking extends BaseClass {

	@Keyword
	public void measureMangementPoint()throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for (int i = 0; i <= 15; i++) {
			WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			if(i==0) {
				println "Measure A1 - Parking Pricing total point Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A1 - Parking Pricing total points Verified Successully"
			}

			if(i==1) {
				println "Measure A2 - Shared Parking total points Test Started"
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A2 - Shared Parking total points Verified Successully"
			}

			if(i==2) {
				println "Measure A3 - Transportation Management total points Test Started"
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A3 - Transportation Management total points Verified Successully"
			}

			if(i==3) {
				println "Measure A4 - Recycling Program total points Test Started"
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				//WebUI.delay(5)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A4 - Recycling Program total points Verified Successully"
			}

			if(i==4) {
				println "Measure A5 - Sustainable Purchasing Program total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure A5 - Sustainable Purchasing Program total points Verified Successully"
			}

			if(i==5) {
				println  "Measure A6 - Proactive Operational Maintenance total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A6 - Proactive Operational Maintenance total points Verified Successully"
			}


			if(i==6) {
				println "Measure A7 - Cleaning Procedures - Occupied Spaces total points Test"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure A7 - Cleaning Procedures - Occupied Spaces total points Verified Successully"
			}

			if(i==7) {
				println "Measure A8 - Cleaning Procedures - Parking Decks total points Verified Successully"
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox9'))
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println  "Measure A8 - Cleaning Procedures - Parking Decks total points Verified Successully"
			}

			if(i==8) {
				println "Measure A9 - Building Systems Commissioning total points Test Started"
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println "Measure A9 - Building Systems Commissioning total points Verified Successully"
			}
			if(i==9) {
				println  "Measure A10 - Construction Waste Management total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println  "Measure A10 - Construction Waste Management total points Verified Successully"
			}
			if(i==10) {
				println "Measure A11 - Regional Materials for New Construction, Rehabilitation, or Retrofit total points Test Started"
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure A11 - Regional Materials for New Construction, Rehabilitation, or Retrofit total points Verified Successully"
			}

			if(i==11) {
				println "Measure A12 - Regional Labor for New Construction, Rehabilitation, or Retrofit total points Test Started"
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A12 - Regional Labor for New Construction, Rehabilitation, or Retrofit total points Verified Successully"
			}
			if(i==12) {
				println  "Measure A13 - Reused, Repurposed or Recycled Materials total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println  "Measure A13 - Reused, Repurposed or Recycled Materials total points Verified Successully"
			}
			if(i==13) {
				println  "Measure A14 - Third Party Sustainability Certification total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "12 of 12 Points Pursued", true)
				println "Measure  A14 - Third Party Sustainability Certification total points Verified Successully"
			}
			if(i==14) {
				println "Measure A15 - Credentialed Management total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure A15 - Credentialed Management total points Verified Successully"
			}
			if(i==15) {
				println "Measure A16 - Life-cycle Assessment total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println "Measure A16 - Life-cycle Assessment total points Verified Successully"
			}
			//WebUI.scrollToElement(findTestObject('Page_Arc dashboard/button_Next'), 3)
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}

	}

	@Keyword
	public void measureProgramsPoint()throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Programs'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_B1 - Placemaking'))
		WebUI.waitForPageLoad(10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for (int i = 0; i <= 12; i++) {
			WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			if(i==0) {
				println "Measure B1 - Placemaking total point Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox2'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				//Reported Issue Here
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B1 - Placemaking total point Test Started total points Verified Successully"
			}
			if(i==1) {
				println "Measure B2 - Access to Mass Transit total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B2 - Access to Mass Transit total points Verified Successully"
			}
			if(i==2) {
				println "Measure B3 - Wayfinding Systems - External total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B3 - Wayfinding Systems - External total points Verified Successully"
			}
			if(i==3) {
				println "Measure B4 - Wayfinding Systems - Internal total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B4 - Wayfinding Systems - Internal total points Verified Successully"
			}
			if(i==4) {
				println "Measure B5 - Traffic Flow Plan total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B5 - Traffic Flow Plan total points Verified Successully"
			}
			if(i==5) {
				println "Measure B6 - Carshare Program total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B6 - Carshare Program total points Verified Successully"
			}
			if(i==6) {
				println "Measure B7 - Rideshare Program total points Test"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox7'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B7 - Rideshare Program total points Verified Successully"
			}
			if(i==7) {
				println "Measure B8 - Low-emitting and Fuel-efficient Vehicle Program total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B8 - Low-emitting and Fuel-efficient Vehicle Program total points Verified Successully"
			}

			if(i==8) {
				println "Measure B9 - Alternative Fuel Vehicles total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B9 - Alternative Fuel Vehicles total points Verified Successully"
			}
			if(i==9) {

				println "Measure B10 - Alternative Fuel Fleet Vehicles total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B10 - Alternative Fuel Fleet Vehicles total points Verified Successully"
			}
			if(i==10) {

				println "Measure B11 - Bicycle Parking total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox6'))
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B11 - Bicycle Parking points Verified Successully"
			}
			if(i==11) {
				println "Measure B12 - Bicycle Sharing/Rental total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure B12 - Bicycle Sharing/Rental total points Verified Successully"
			}
			if(i==12) {
				println "Measure B13 - Marketing/Educational Program total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure B13 - Marketing/Educational Program total points Verified Successully"
			}

			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
	}

	@Keyword
	public void measureTechnologyDesignPoint()throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Technology  Structure Desig'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_C1 - Idle Reduction Payme'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		
		for (int i = 0; i <= 17; i++) {
			WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			if(i==0) {
				println  "Measure C1 - Idle Reduction Payment Systems total point Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println  "Measure C1 - Idle Reduction Payment Systems total points Verified Successully"
			}

			if(i==1) {
				println  "Measure C2 - Fire Suppression Systems total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println  "Measure C2 - Fire Suppression Systems total points Verified Successully"
			}
			if(i==2) {
				WebUI.println "Measure C3 - No/Low-VOC Coatings, Paints and Sealants total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox2'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.delay(3)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				WebUI.println "Measure C3 - No/Low-VOC Coatings, Paints and Sealants total points Verified Successully"
			}

			if(i==3) {
				WebUI.println  "Measure C4 - Tire Inflation Stations total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure C4 - Tire Inflation Stations total points Verified Successully"
			}

			if(i==4) {
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				println "Measure C5 - Electric Vehicle (EV) Charging Stations total points Test Started"
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C5 - Electric Vehicle (EV) Charging Stations total points Verified Successully"
			}

			if(i==5) {
				println "Measure C6 - HVAC Systems - Occupied Spaces total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox8'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox13 '))
				//WebUI.delay(5)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C6 - HVAC Systems - Occupied Spaces total points Verified Successully"
			}
			if(i==6) {
				println "Measure C7 - Ventilation Systems - Parking Decks total points Test"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox7'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C7 - Ventilation Systems - Parking Decks total points Verified Successully"
			}

			if(i==7) {
				println "Measure C8 - Lighting Controls total points Verified Successully"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println  "Measure C8 - Lighting Controls total points Verified Successully"
			}

			if(i==8) {
				println  "Measure C9 - Energy-efficient Lighting System total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				//Reported issue
				WebUI.verifyMatch(totalPoint, "8 of 8 Points Pursued", true)
				println "Measure C9 - Energy-efficient Lighting System total points Verified Successully"


			}
			if(i==9) {
				println "Measure C10 - Stormwater Management total points Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C10 - Stormwater Management total points Verified Successully"
			}
			if(i==10) {
				println  "Measure C11 - Rainwater Harvesting total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				println "Measure C11 - Rainwater Harvesting total points Verified Successully"
			}
			if(i==11) {
				println  "Measure C12 - Greywater Reuse total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println  "Measure C12 - Greywater Reuse total points Verified Successully"
			}
			if(i==12) {
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				println "Measure C13 - Indoor Water-efficiency total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure C13 - Indoor Water-efficiency total points Verified Successully"
			}
			if(i==13) {
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				println "Measure C14 - Water-efficient Landscaping total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "2 of 2 Points Pursued", true)
				println "Measure C14 - Water-efficient Landscaping total points Verified Successully"
			}
			if(i==14) {
				println "Measure C15 - Roofing Systems total points Test Started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C15 - Roofing Systems total points Verified Successully"
			}
			if(i==15) {
				println "Measure C16 - Renewable Energy Generation total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "12 of 12 Points Pursued", true)
				println "Measure C16 - Renewable Energy Generation total points Verified Successully"
			}

			if(i==16) {
				println "Measure C17 - Design for Durability total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure C17 - Design for Durability total points Verified Successully"
			}
			if(i==17) {
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				//WebUI.delay(7)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				println  "Measure C18 - Energy Resiliency - Storage total points Test started"
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "4 of 4 Points Pursued", true)
				WebUI.println  "Measure C18 - Energy Resiliency - Storage total points Verified Successully"
			}
			WebUI.scrollToElement(findTestObject('Page_Arc dashboard/button_Next'), 3)
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		//	WebUI.click(findTestObject('Page_Arc dashboard/sideBar'))
		/*	WebUI.click(findTestObject('Page_Arc dashboard/a_ Measures'))
		 WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Technology  Structure Desig'))*/
		WebUI.println "Verified Total Points By Marking all credit for Management section successuflly"
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void measureInnovationPoint()throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Innovation'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_D1 - Innovative Approach'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('BasePoint/CityCom/Checkbox1'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for (int i = 0; i < 1; i++) {
			if(i==0) {
				println "Measure D1 - Innovative Approach total point Test Started"
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox2'))
			
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox3'))
				
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox4'))
				
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('BasePoint/CityCom/Checkbox5'))
				
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//Issue here
				String totalPoint = WebUI.getText(findTestObject('Page_Arc dashboard/TotalPoint'))
				WebUI.verifyMatch(totalPoint, "6 of 6 Points Pursued", true)
				println "Measure D1 - Innovative Approach points Verified Successully"

			}
			WebUI.scrollToElement(findTestObject('Page_Arc dashboard/button_Next'), 3)
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		WebUI.println "Verified Total Points By Marking all credit for Management section successuflly"
		WebUI.delay(2)
	}

	@Keyword
	public void uploadImageParking() throws IOException, InterruptedException {
		
		WebUI.click(findTestObject('Manage/Parking/ManageProject'))
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Manage/Parking/input_projectWebsite'), 4)
		WebUI.click(findTestObject('Manage/Parking/span_Upload'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Manage/Parking/ParkPdfUpload'), parkImageUpload)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		ReusableMethodsDataInput.clickCancel()
		String uploadImage = WebUI.getText(findTestObject('Manage/Parking/span_Parking SJ.jpg'))
		WebUI.verifyMatch(uploadImage, "Parking SJ.jpg", false)
		println "Parking image file Uploaded successfully"
	}

	@Keyword
	public void uploadSuppotingDocMeasure() throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Programs'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/span_B1 - Placemaking'))
		WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.mouseOver(findTestObject('Manage/Parking/UploadDoccumentParking'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Manage/Parking/UploadDoccumentParking'))
		WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Manage/Parking/ParkPdfUpload'), pdfFile)
		WebUI.delay(7)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		ReusableMethodsDataInput.clickCancel()
		String uploadImage = WebUI.getText(findTestObject('Manage/Parking/span_USGBC.pdf'))
		WebUI.verifyMatch(uploadImage, "USGBC.pdf", false)
		println "Parking meausre pdf file Uploaded successfully"
		WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.mouseOver(findTestObject('Manage/Parking/UploadDoccumentParking'))
		WebUI.click(findTestObject('Manage/Parking/UploadDoccumentParking'))
		WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Manage/Parking/ParkPdfUpload'), pdfFile)
		WebUI.delay(7)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		ReusableMethodsDataInput.clickCancel()
		String duplicate = WebUI.getText(findTestObject('Manage/Parking/Naviation/span_USGBC(2).pdf'))
		WebUI.verifyMatch(duplicate, "USGBC(2).pdf", false)
		println "Parking meausre pdf file Uploaded successfully"
	}

	@Keyword
	public void deleteUploadPdf() throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.doubleClick(findTestObject('Page_Arc dashboard/a_ Programs'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/Naviation/span_B2 - Access to Mass Trans'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.mouseOver(findTestObject('Manage/Parking/UploadDoccumentParking'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Manage/Parking/UploadDoccumentParking'))
		WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Manage/Parking/ParkPdfUpload'), pdfFile)
		WebUI.delay(7)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		ReusableMethodsDataInput.clickCancel()
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String uploadImage = WebUI.getText(findTestObject('Manage/Parking/span_USGBC.pdf'))
		WebUI.verifyMatch(uploadImage, "USGBC.pdf", false)
		println "Parking meausre pdf file Uploaded successfully"
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/Navigation/DeleteButton'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementNotPresent(findTestObject('Manage/Parking/span_USGBC.pdf'),5)
		println "Parking meausre pdf file deleted successfully"

	}

	@Keyword
	public void editProjectDetailsParking() throws IOException, InterruptedException {
		
		WebUI.clearText(findTestObject('Manage/Parking/input_noOfParkingSpace'))
		WebUI.sendKeys(findTestObject('Manage/Parking/input_noOfParkingSpace'),"50")
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/input_noOfParkingLevels'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.clearText(findTestObject('Manage/Parking/input_noOfParkingLevels'))
		WebUI.sendKeys(findTestObject('Manage/Parking/input_noOfParkingLevels'),"50")
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/ClickSave'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/input_projectWebsite'))
		WebUI.sendKeys(findTestObject('Manage/Parking/input_projectWebsite'),"http://www.parking-net.com")
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/ClickSave'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Manage/Parking/textarea_projectInfo'),"When assigned parking is provided, designated accessible parking.")
		WebUI.click(findTestObject('Manage/Parking/ClickSave'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		println "Verifying edited functionlity for no of parking space , level , website , about parking fields after refresh"
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/input_noOfParkingSpace'),"value"),"50","Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/input_noOfParkingLevels'),"value"),"50","Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/input_projectWebsite'),"value"),"http://www.parking-net.com","Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/textarea_projectInfo'),"value"),"When assigned parking is provided, designated accessible parking.","Not Valid")
		println  "Verifying edited functionlity for no of parking space , level , website , about parking fields after refresh"
	}


	@Keyword
	public void verifyUnitTypeParking() throws IOException, InterruptedException {
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementVisible(findTestObject('Manage/Parking/Project/Unit type'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Manage/Parking/Project/td_Gross floor area'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('Manage/Parking/Project/Space type'),4, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void verifyProjectDetailsParking(String sheetName,int rowNum) throws IOException, InterruptedException {

		String prjId 		  = data.getCellData(sheetName, "ProjectID", rowNum)
		String ownerOrg 	  = data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerCountry   = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	  = data.getCellData(sheetName, "OwnerEmail", rowNum)
		String dataCommisioned= data.getCellData(sheetName, "date_comm", rowNum)
		String prjAddress 	  = data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		  = data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	  = data.getCellData(sheetName, "Country", rowNum)
		String prjState 	  = data.getCellData(sheetName, "State", rowNum)

		
		if((WebUI.getAttribute(findTestObject('Manage/ProjectDetailVerification/a_ Manage1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Manage"
			WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		
		WebUI.click(findTestObject('Manage/Parking/ManageProject'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		println "Verify if  registered project  project id , address , city  , country , owner details , data commissioned , project country & satate fields displays the correct data."
		Assert.assertEquals(WebUI.getText(findTestObject('Manage/Parking/project_ID')),prjId,"Not Valid")
		//WebUI.scrollToElement(findTestObject('Manage/Parking/Owner_organization'), 2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/Owner_organization')),ownerOrg,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/projectOwnerCounty')),ownerCountry,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/project_owneremail')),ownerMail,"Not Valid")
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/project_DateComissioned'),"value"),dataCommisioned,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/Project_Address')),prjAddress,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/project_City')),prjCity,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/projectCountry')),prjCountry,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Manage/Parking/Porject_State')),prjState,"Not Valid")
		println "Verified successfully  registered project project id , address , city  , country , owner details , data commissioned , project country & satate fields"
	}

	@Keyword
	public void faqNavigation()throws IOException, InterruptedException {
	
		sidebarMeasures()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/Naviation/a_FAQs'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.switchToWindowIndex(1)
		String faqtesxt  = WebUI.getText(findTestObject('Manage/Parking/Naviation/h1_FAQs'))
		WebUI.verifyMatch(faqtesxt,"FAQs", false)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	@Keyword
	public void parksmartResourceNavigation()throws IOException, InterruptedException {
		
		sidebarMeasures()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Manage/Parking/Naviation/a_Parksmart Resources'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.switchToWindowIndex(1)
		String restext  = WebUI.getText(findTestObject('Manage/Parking/Naviation/h1_Resources'))
		WebUI.verifyMatch(restext,"Resources", false)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	
	public void sidebarMeasures(){
		
		if((WebUI.getAttribute(findTestObject('Object Repository/Page_Arc dashboard/SidebarMeasures'), "class", FailureHandling.OPTIONAL).equals("option sidebar-projects-link collapsed"))){
			println "Measures"
			WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/SidebarMeasures'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
	}
	
	@Keyword
	public void contactHyperlink()throws IOException, InterruptedException {
		
		/*sidebarMeasures()
		WebUI.delay(2)
		
	*/	WebUI.click(findTestObject('Page_Arc dashboard/a_ Management'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('Manage/Parking/Naviation/a_Contact us'),10)

	}

	@Keyword
	public void PaymentPageTextNotVisible(){
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementNotVisible(findTestObject('Add_Project_Details/Par/p_LETS GET STARTED'))
		WebUI.verifyElementNotPresent(findTestObject('Add_Project_Details/Par/p_Select a term to access the'),3)
	}

	@Keyword
	public void RegPageValidation(){

		WebUI.delay(3)
		WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/AddProjectNewUI/selectProjectType'),'Buildings - Parking (Parksmart)', false, 5)
		WebUI.verifyElementPresent(findTestObject('Add_Project_Details/Par/img'),3)
		WebUI.verifyElementPresent(findTestObject('Add_Project_Details/Par/Area'), 2)
		WebUI.verifyElementPresent(findTestObject('Add_Project_Details/Par/Unit'), 2)
		WebUI.verifyElementNotPresent(findTestObject('Add_Project_Details/Par/SpaceType'), 4)

	}

	@Keyword
	public void toolTip()throws IOException, InterruptedException {
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/span_A1 - Parking Pricing'))
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for (int i = 0; i <= 46; i++) {
			/********Verifying status button should not display*******************/
			WebUI.verifyElementNotPresent(findTestObject('Manage/Parking/Naviation/ToolTipText'),1)

			WebUI.click(findTestObject('Manage/Parking/Naviation/ToolTip'))
			WebUI.delay(1)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.verifyElementPresent(findTestObject('Manage/Parking/Naviation/ToolTipText'),10)
			WebUI.scrollToElement(findTestObject('Manage/Parking/Naviation/h3_Activity'),2)
			WebUI.doubleClick(findTestObject('Manage/Parking/Naviation/h3_Activity'))
			WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.scrollToElement(findTestObject('Page_Arc dashboard/button_Next'),3)
			WebUI.click(findTestObject('Page_Arc dashboard/button_Next'))
			WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		}
		/************Verifying the last credit after Clicking on the Next/Back button ******************/
		WebUI.verifyElementPresent(findTestObject('Manage/Parking/Naviation/span_Measure D1 - Innovative A'),10)

	}

	@Keyword
	public void permissionRequestsTeamMan()throws IOException, InterruptedException {
		/*WebUI.delay(2)
		 WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))*/
		/*	WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		 WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		 WebUI.delay(5)*/
		WebUI.verifyElementNotPresent(findTestObject('Manage/Parking/Naviation/Date Requested'),2)
		WebUI.verifyElementNotPresent(findTestObject('Manage/Parking/Naviation/TextPermission Requests'),2)
		WebUI.verifyOptionNotPresentByLabel(findTestObject('Object Repository/Manage/TeamModule/TeamRole'),"Team Manager", false, 1)

	}

}

