package com.arc.ReusableMethods

import static com.googlecode.javacv.Parallel.Looper.*
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ResuableMethodsPerformanceScore extends BaseClass {

	ReusableMethodsLogin reusableMethodsLogin = new ReusableMethodsLogin()
	ReusableMethodsSearch reusableMethodsSearch = new ReusableMethodsSearch()

	@Keyword
	public void genratePerformanceScoreAdminTool(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.delay(15)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 60)
		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))
		String basePointScore = WebUI.getText(findTestObject('PerformanceScore/Score/BasePointPScore'))

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double basepointscore = Double.parseDouble(basePointScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore + basepointscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore

		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Search the project
		reusableMethodsSearch.searchProgram(sheetName,rowNum)
		WebUI.delay(15)
		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Scores"
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.delay(2)
		}

		//WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.delay(25)
		//Verifying the Performance score
		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalperformanceScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/BasePointScore'),10)
		String basepointScore = WebUI.getText(findTestObject('PerformanceScore/Score/BasePointScore'))
		WebUI.verifyMatch(basepointScore , basePointScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/EnergyPerScore'),10)
		String energyperScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyPerScore'))
		WebUI.verifyMatch(energyperScore , energyScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WaterPerScore'),10)
		String waterpfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterPerScore'))
		WebUI.verifyMatch(waterpfScore ,waterScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WastePerSocre'),10)
		String wastepfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WastePerSocre'))
		WebUI.verifyMatch(wastepfScore ,wasteScore , false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TransportperScore'),10)
		String transportperScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportperScore'))
		WebUI.verifyMatch(transportperScore ,transportScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/HumanExpScore'),10)
		String humanExperience = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExpScore'))
		WebUI.verifyMatch(humanExperience ,humanExpScore, false)

		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))
		WebUI.delay(14)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),10)
		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		WebUI.verifyMatch(totalPerformaceScore ,totalperformanceScore, false)

		String energyPerScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/EnergyScore'))
		WebUI.verifyMatch(energyPerScore , energyScore, false)

		String waterPfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		WebUI.verifyMatch(waterPfScore ,waterScore, false)

		String wastePfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WasteScore'))
		WebUI.verifyMatch(wastePfScore ,wasteScore , false)

		String transPortperScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore'))
		WebUI.verifyMatch(transPortperScore ,transportScore, false)

		String humanexperience = WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp'))
		WebUI.verifyMatch(humanexperience ,humanExpScore, false)

	}
	@Keyword
	public void trialScoreVerifica(){
	}




	@Keyword
	public void genratePerformanceScoreAdminToolOtherNone(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))

		boolean keepGoing = WebUI.waitForAngularLoad(240, FailureHandling.CONTINUE_ON_FAILURE)

		if(keepGoing== false)

			for(int i=0;i<=1;i++){
				WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
				WebUI.delay(3)
				WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
				WebUI.delay(2)
				WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			}

		/*		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		 WebUI.delay(3)
		 WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		 WebUI.delay(2)
		 WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		 WebUI.waitForAngularLoad(240, FailureHandling.CONTINUE_ON_FAILURE)*/

		/*WebUI.delay(22)
		 WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 20)
		 */	
		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		//saving the data into the excel sheet for verifying with leed online.

		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "energyScore", GlobalVariable.rowNumTwo, energyScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "waterScore", GlobalVariable.rowNumTwo, waterScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "wasteScore", GlobalVariable.rowNumTwo, wasteScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "transportation", GlobalVariable.rowNumTwo, transportScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "humanExperience", GlobalVariable.rowNumTwo, humanExpScore)

		KeywordUtil.markWarning("Transportation Score : " + transportScore)
		KeywordUtil.markWarning("Human Experience : " + humanExpScore )

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore
		KeywordUtil.markWarning("Total Score : " + totalperformanceScore)

		totalScore= Double.toString(totalPerformanceScore)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Search the project
		reusableMethodsSearch.searchProgram(sheetName,rowNum)

		WebUI.delay(15)
		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			println "Scores"
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.delay(2)
		}

		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.delay(15)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalperformanceScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.delay(12)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/EnergyPerScore'),10)
		String energyperScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyPerScore'))
		WebUI.verifyMatch(energyperScore , energyScore, false)
		//String carbonIntensity= WebUI.getText(findTestObject('Object Repository/Analytics/Score/CarbonIntensity'),FailureHandling.CONTINUE_ON_FAILURE)
		//String energyIntensity= WebUI.getText(findTestObject('Object Repository/Analytics/Score/EnergyIntensity'),FailureHandling.CONTINUE_ON_FAILURE)

		/*if((Double.parseDouble(carbonIntensity)==0))
		 KeywordUtil.markFailed("Carbon Intensity is zero(0)")
		 if((Double.parseDouble(energyIntensity)==0))
		 KeywordUtil.markFailed("Energy Intensity is zero(0)")*/

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(12)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WaterPerScore'),10)
		String waterpfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterPerScore'))
		WebUI.verifyMatch(waterpfScore ,waterScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.delay(12)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WastePerSocre'),10)
		String wastepfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WastePerSocre'))
		WebUI.verifyMatch(wastepfScore ,wasteScore , false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.delay(12)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TransportperScore'),10)
		String transportperScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportperScore'))
		WebUI.verifyMatch(transportperScore ,transportScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.delay(12)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/HumanExpScore'),10)
		String humanExperience = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExpScore'))
		WebUI.verifyMatch(humanExperience ,humanExpScore, false)

		String occupantSatisfaction= WebUI.getText(findTestObject('Object Repository/Analytics/Score/OccupantSatisfaction'))
		//String co2Level= WebUI.getText(findTestObject('Object Repository/Analytics/Score/CO2Level'))
		//String voc= WebUI.getText(findTestObject('Object Repository/Analytics/Score/VOCLevel'))

		/*if((Integer.parseInt(occupantSatisfaction)==0))
		 KeywordUtil.markFailed("Occupant Satisfaction is zero(0)")
		 if((Integer.parseInt(co2Level)==0))
		 KeywordUtil.markFailed("Co2 Level is zero(0)")
		 if((Integer.parseInt(voc)==0))
		 KeywordUtil.markFailed("VOC Level is zero(0)")
		 */

		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))
		WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		WebUI.verifyMatch(totalPerformaceScore ,totalperformanceScore, false)

		String energyPerScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/EnergyScore'))
		WebUI.verifyMatch(energyPerScore , energyScore, false)

		String waterPfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		WebUI.verifyMatch(waterPfScore ,waterScore, false)

		String wastePfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WasteScore'))
		WebUI.verifyMatch(wastePfScore ,wasteScore , false)

		String transPortperScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore'))
		WebUI.verifyMatch(transPortperScore ,transportScore, false)

		String humanexperience = WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp'))
		WebUI.verifyMatch(humanexperience ,humanExpScore, false)

	}


	@Keyword
	public void genratePerformanceScoreAdminTool200Survey(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))

		boolean keepGoing = WebUI.waitForAngularLoad(240, FailureHandling.CONTINUE_ON_FAILURE)

		if(keepGoing== false)

			for(int i=0;i<=1;i++){
				WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
				WebUI.delay(3)
				WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
				WebUI.delay(2)
				WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			}

		/*		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		 WebUI.delay(3)
		 WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		 WebUI.delay(2)
		 WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		 WebUI.waitForAngularLoad(240, FailureHandling.CONTINUE_ON_FAILURE)*/

		/*WebUI.delay(22)
		 WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 20)
		 */	String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		//saving the data into the excel sheet for verifying with leed online.

		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "energyScore", GlobalVariable.rowNumTwo, energyScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "waterScore", GlobalVariable.rowNumTwo, waterScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "wasteScore", GlobalVariable.rowNumTwo, wasteScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "transportation", GlobalVariable.rowNumTwo, transportScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "humanExperience", GlobalVariable.rowNumTwo, humanExpScore)

		KeywordUtil.markWarning("Transportation Score : " + transportScore)
		KeywordUtil.markWarning("Human Experience : " + humanExpScore )

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore
		KeywordUtil.markWarning("Total Score : " + totalperformanceScore)

		totalScore= Double.toString(totalPerformanceScore)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Search the project
		reusableMethodsSearch.searchProgram(sheetName,rowNum)

		WebUI.delay(15)

		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))
		WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		WebUI.verifyMatch(totalPerformaceScore ,totalperformanceScore, false)

		String energyPerScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/EnergyScore'))
		WebUI.verifyMatch(energyPerScore , energyScore, false)

		String waterPfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		WebUI.verifyMatch(waterPfScore ,waterScore, false)

		String wastePfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WasteScore'))
		WebUI.verifyMatch(wastePfScore ,wasteScore , false)

		String transPortperScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore'))
		WebUI.verifyMatch(transPortperScore ,transportScore, false)

		String humanexperience = WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp'))
		WebUI.verifyMatch(humanexperience ,humanExpScore, false)

	}


	@Keyword
	public void verifyTheScoreAfter200Survey(String sheetName, int rowNum){

		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))

		boolean keepGoing = WebUI.waitForAngularLoad(240, FailureHandling.CONTINUE_ON_FAILURE)

		if(keepGoing== false)

			for(int i=0;i<=1;i++){
				WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
				WebUI.delay(3)
				WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
				WebUI.delay(2)
				WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			}

		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		KeywordUtil.markWarning("Transportation Score : " + transportScore)
		KeywordUtil.markWarning("Human Experience : " + humanExpScore )

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore
		KeywordUtil.markWarning("Total Score : " + totalperformanceScore )
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Search the project
		reusableMethodsSearch.searchProgram(sheetName,rowNum)

		WebUI.delay(15)


		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))
		WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		if(totalPerformaceScore.equals(totalScore)){
			KeywordUtil.markFailed("Total Score not Changed")
		}
		else
			KeywordUtil.markPassed("Total Score Changed")

		String transPortperScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore'))
		if(transPortperScore.equals(data.getCellData(GlobalVariable.LEEDData, "transportation", GlobalVariable.rowNumTwo))){
			KeywordUtil.markFailed("Transportation Score not Changed")
		}
		else
			KeywordUtil.markPassed("Transportation Score Changed")

		String humanexperience = WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp'))
		if(humanexperience.equals(data.getCellData(GlobalVariable.LEEDData, "humanExperience", GlobalVariable.rowNumTwo))){
			KeywordUtil.markFailed("Human Experience Score not Changed")
		}
		else
			KeywordUtil.markPassed("Human Experience Score Changed")

	}


	@Keyword
	public void analyticsgenratePerformanceScoreAdminToolOtherNone(String sheetName,int rowNum) throws IOException, InterruptedException {
		WebUI.switchToWindowIndex(1)
		WebUI.delay(2)

		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))

		boolean keepGoing = WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait, FailureHandling.CONTINUE_ON_FAILURE)

		if(keepGoing== false)

			for(int i=0;i<=2;i++){
				WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
				WebUI.delay(3)
				WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
				WebUI.delay(2)
				WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait,GlobalVariable.avgAngularWait, FailureHandling.CONTINUE_ON_FAILURE)
				keepGoing = WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait, FailureHandling.CONTINUE_ON_FAILURE)
			}

		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		int energyscore = Integer.parseInt(energyScore)
		int waterscore =  Integer.parseInt(waterScore)
		int wastescore =  Integer.parseInt(wasteScore)
		int transportscore = Integer.parseInt(transportScore)
		int humexpscore =    Integer.parseInt(humanExpScore)

		int totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		println totalPerformanceScore

		String ptotalPerformanceScore = totalPerformanceScore.toString()
		data.setCellData(GlobalVariable.BDataInput,"ATotalScore", GlobalVariable.rowNumTwo, ptotalPerformanceScore)

		//Save the admin tool score in the Excel data verification sheet
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "energyScore", GlobalVariable.rowNumTwo, energyScore )
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "waterScore", GlobalVariable.rowNumTwo, waterScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "wasteScore", GlobalVariable.rowNumTwo, wasteScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "transportation", GlobalVariable.rowNumTwo, transportScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "humanExperience", GlobalVariable.rowNumTwo, humanExpScore)


		/*	WebUI.closeWindowIndex(1)
		 WebUI.delay(2)*/
		WebUI.switchToWindowIndex(0)
		WebUI.delay(2)
	}

	@Keyword
	public void analyticsgenratePerformanceScoreAdminToolOtherNone1(String sheetName,int rowNum) throws IOException, InterruptedException {

		WebUI.switchToWindowIndex(1)
		WebUI.delay(2)

		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait, FailureHandling.OPTIONAL)

		boolean keepGoing = WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
		if(keepGoing== false)
			for(int i=0;i<=1;i++){
				WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
				WebUI.delay(3)
				WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
				WebUI.delay(2)
				WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)
				keepGoing = WebUI.waitForAngularLoad(GlobalVariable.minAngularWait, FailureHandling.OPTIONAL)

			}

		WebUI.switchToWindowIndex(0)
		WebUI.delay(1)
	}

	@Keyword
	public void analyticsgenratePerformanceScoreAdminToolOtherNone2(String sheetName,int rowNum) throws IOException, InterruptedException {

		WebUI.switchToWindowIndex(1)
		WebUI.delay(1)

		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.delay(22)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 60)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(2)
	}
	@Keyword
	public void PerformanceScoreAdminToolOtherNone(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 40)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)


	}

	@Keyword
	public void genratePerformanceScoreAdminToolAnalytics(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"LTestProjID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.delay(22)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 60)
		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore

		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Search the project
		reusableMethodsSearch.searchLEEDProgram(GlobalVariable.PortfoliosSheet, GlobalVariable.rowNumFour)

		WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.delay(15)
		//Verifying the Performance score
		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalperformanceScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/EnergyPerScore'),10)
		String energyperScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyPerScore'))
		WebUI.verifyMatch(energyperScore , energyScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WaterPerScore'),10)
		String waterpfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterPerScore'))
		WebUI.verifyMatch(waterpfScore ,waterScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WastePerSocre'),10)
		String wastepfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WastePerSocre'))
		WebUI.verifyMatch(wastepfScore ,wasteScore , false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TransportperScore'),10)
		String transportperScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportperScore'))
		WebUI.verifyMatch(transportperScore ,transportScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/HumanExpScore'),10)
		String humanExperience = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExpScore'))
		WebUI.verifyMatch(humanExperience ,humanExpScore, false)

		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))
		WebUI.delay(14)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),10)
		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		WebUI.verifyMatch(totalPerformaceScore ,totalperformanceScore, false)

		String energyPerScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/EnergyScore'))
		WebUI.verifyMatch(energyPerScore , energyScore, false)

		String waterPfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		WebUI.verifyMatch(waterPfScore ,waterScore, false)

		String wastePfScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WasteScore'))
		WebUI.verifyMatch(wastePfScore ,wasteScore , false)

		String transPortperScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TransportScore'))
		WebUI.verifyMatch(transPortperScore ,transportScore, false)

		String humanexperience = WebUI.getText(findTestObject('PerformanceScore/DataInput/HumanExp'))
		WebUI.verifyMatch(humanexperience ,humanExpScore, false)

	}


	@Keyword
	public void genratePerformanceScoreAdminToolCityComLEED(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 60)
		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))
		////String basePointScore = WebUI.getText(findTestObject('PerformanceScore/Score/BasePointPScore'))

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		//double basepointscore = Double.parseDouble(basePointScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore //+ basepointscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore

		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)


		//Search the project
		reusableMethodsSearch.searchProgram(sheetName,rowNum)

		WebUI.delay(5)
		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'), "class", FailureHandling.OPTIONAL).equals("pl20 collapsed"))){
			println "Scores"
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		}
		//WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.delay(15)
		//Verifying the Performance score
		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalperformanceScore, false)

		/*WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		 WebUI.delay(12)
		 WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/BasePointScore'),10)
		 String basepointScore = WebUI.getText(findTestObject('PerformanceScore/Score/BasePointScore'))
		 WebUI.verifyMatch(basepointScore , basePointScore, false)*/
		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'), "class", FailureHandling.OPTIONAL).equals("pl20 collapsed"))){
			println "Scores"
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/EnergyPerScore'),10)
		String energyperScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyPerScore'))
		WebUI.verifyMatch(energyperScore , energyScore, false)

		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'), "class", FailureHandling.OPTIONAL).equals("pl20 collapsed"))){
			println "Scores"
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WaterPerScore'),10)
		String waterpfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterPerScore'))
		WebUI.verifyMatch(waterpfScore ,waterScore, false)

		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'), "class", FailureHandling.OPTIONAL).equals("pl20 collapsed"))){
			println "Scores"
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WastePerSocre'),10)
		String wastepfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WastePerSocre'))
		WebUI.verifyMatch(wastepfScore ,wasteScore , false)

		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'), "class", FailureHandling.OPTIONAL).equals("pl20 collapsed"))){
			println "Scores"
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TransportperScore'),10)
		String transportperScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportperScore'))
		WebUI.verifyMatch(transportperScore ,transportScore, false)

		if((WebUI.getAttribute(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'), "class", FailureHandling.OPTIONAL).equals("pl20 collapsed"))){
			println "Scores"
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/HumanExpScore'),10)
		String humanExperience = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExpScore'))
		WebUI.verifyMatch(humanExperience ,humanExpScore, false)

	}

	@Keyword
	public void genratePerformanceScoreAdminToolCityComOtherNone(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		//WebUI.delay(15)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 60)
		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore

		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)


		//Search the project
		reusableMethodsSearch.searchProgram(sheetName,rowNum)

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.delay(15)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForJQueryLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//Verifying the Performance score
		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalperformanceScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/EnergyPerScore'),10)
		String energyperScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyPerScore'))
		WebUI.verifyMatch(energyperScore , energyScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WaterPerScore'),10)
		String waterpfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterPerScore'))
		WebUI.verifyMatch(waterpfScore ,waterScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/WastePerSocre'),10)
		String wastepfScore = WebUI.getText(findTestObject('PerformanceScore/Score/WastePerSocre'))
		WebUI.verifyMatch(wastepfScore ,wasteScore , false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TransportperScore'),10)
		String transportperScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportperScore'))
		WebUI.verifyMatch(transportperScore ,transportScore, false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(12)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/HumanExpScore'),10)
		String humanExperience = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExpScore'))
		WebUI.verifyMatch(humanExperience ,humanExpScore, false)

	}

	@Keyword
	public void setdefaultpagePerformanceScore(String sheetName, int rowNum) throws IOException, InterruptedException {
		/*WebUI.waitForPageLoad(10)
		 WebUI.delay(5)
		 WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('Manage/Parking/Manage'))
		 WebUI.delay(1)*/
		WebUI.scrollToElement(findTestObject('PerformanceScore/a_ Settings'),5)
		WebUI.click(findTestObject('PerformanceScore/a_ Settings'))
		//WebUI.delay(7)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('PerformanceScore/span_All Actions'),5)
		WebUI.click(findTestObject('PerformanceScore/span_All Actions'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/PerformanceScore'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//Verifying the default functionality of performance score
		reusableMethodsSearch.searchProgram(sheetName, rowNum)
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String performaceScore = WebUI.getText(findTestObject('PerformanceScore/span_Performance Score'))
		WebUI.verifyMatch(performaceScore , 'Performance Score', false)
	}

	@Keyword
	public void setdefaultpagePerformanceScoreOtherNone(String sheetName, int rowNum) throws IOException, InterruptedException {
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('PerformanceScore/a_ Settings'), 5)
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/a_ Settings'))
		//WebUI.delay(7)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.focus(findTestObject('Page_Arc dashboard/DashboardPage/AllProject/span_Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Page_Arc dashboard/DashboardPage/AllProject/span_Data Input'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/PerformanceScore'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//Verifying the default functionality of performance score
		reusableMethodsSearch.searchProgram(sheetName, rowNum)
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		String performaceScore = WebUI.getText(findTestObject('PerformanceScore/span_Performance Score'))
		WebUI.verifyMatch(performaceScore , 'Performance Score', false)
	}


	@Keyword
	public void verifyCompleteScoreSection() throws IOException, InterruptedException {
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)*/
		String TotalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		WebUI.verifyMatch(TotalperformaceScore , 'Performance Score', false)
	}
	@Keyword
	public void totalPerformanceScoreUIAllFieldVerification() throws IOException, InterruptedException {
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		 WebUI.delay(1)*/
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		String performaceScore = WebUI.getText(findTestObject('PerformanceScore/span_Performance Score'))
		WebUI.verifyMatch(performaceScore , 'Performance Score', false)

		String total = WebUI.getText(findTestObject('PerformanceScore/Score/span_Total'))
		WebUI.verifyMatch(total ,"TOTAL", false)

		String higestScoretotal = WebUI.getText(findTestObject('PerformanceScore/Score/TotalHigestScore100'))
		WebUI.verifyMatch(higestScoretotal ,"100", false)

		String lowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/Score/TotalLowestSocre0'))
		WebUI.verifyMatch(lowestSocreTotal ,"0", false)

		String energy = WebUI.getText(findTestObject('PerformanceScore/Score/span_Energy'))
		WebUI.verifyMatch(energy ,"ENERGY", false)

		String higestScoreEnergy = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyHighestSocre100'))
		WebUI.verifyMatch(higestScoretotal ,"100", false)

		String lowestSocreEnergy = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyLowestSocre0'))
		WebUI.verifyMatch(lowestSocreEnergy ,"0", false)

		String water = WebUI.getText(findTestObject('PerformanceScore/Score/span_Water'))
		WebUI.verifyMatch(water ,"WATER", false)

		String waste = WebUI.getText(findTestObject('PerformanceScore/Score/span_Waste'))
		WebUI.verifyMatch(waste ,"WASTE", false)

		String transport = WebUI.getText(findTestObject('PerformanceScore/Score/span_Transportation'))
		WebUI.verifyMatch(transport ,"TRANSPORTATION", false)

		String humanExp = WebUI.getText(findTestObject('PerformanceScore/Score/span_Human Experience'))
		WebUI.verifyMatch(humanExp ,"HUMAN EXPERIENCE", false)

		//String basePoint = WebUI.getText(findTestObject('PerformanceScore/Score/span_Base Points'))
		//WebUI.verifyMatch(basePoint ,"BASE POINTS", false)
	}
	
	
	
	@Keyword
	public void individualScoreUIAllFieldVerificationCityV3() throws IOException, InterruptedException {
		
		
		/********* Verifying all fields UI  Score for individual Energy , Water , Waste , Transport , Human Exp , Base Point ************* */
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		
		String lowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(lowestSocreTotal ,"0", false)
		String higestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/BasePointMax_10'))
		WebUI.verifyMatch(higestScoretotal ,"10", false)
		String basePoint = WebUI.getText(findTestObject('PerformanceScore/FieldScore/BaseScore'))
		WebUI.verifyMatch(basePoint ,"BASE SCORE", false)
		
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String energylowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
	    WebUI.verifyMatch(energylowestSocreTotal ,"0", false)
		String energyhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/MaxEnergy_33'))
		WebUI.verifyMatch(energyhigestScoretotal ,"14", false)
		String energy = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Energy'))
		WebUI.verifyMatch(energy ,"ENERGY", false)
		
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String waterlowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(waterlowestSocreTotal ,"0", false)
		String waterhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/WaterMax_15'))
		WebUI.verifyMatch(waterhigestScoretotal ,"6", false)
		String water = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Water'))
		WebUI.verifyMatch(water ,"WATER", false)
		
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String wastelowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(wastelowestSocreTotal ,"0", false)
		String wastehigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/WasteMax_8'))
		WebUI.verifyMatch(wastehigestScoretotal ,"4", false)
	    String waste = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Waste'))
		WebUI.verifyMatch(waste ,"WASTE", false)
		
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(5)
		String translowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(translowestSocreTotal ,"0", false)
		String transhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/Transportation_14'))
		WebUI.verifyMatch(transhigestScoretotal ,"6", false)
		String transportation = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Transportation'))
		WebUI.verifyMatch(transportation ,"TRANSPORTATION", false)
		
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String humlowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(humlowestSocreTotal ,"0", false)
		String humhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/HumanExperienceMax_20'))
		WebUI.verifyMatch(humhigestScoretotal ,"6", false)
		String humExp = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_HumanExperience'))
		WebUI.verifyMatch(humExp ,"HUMAN EXPERIENCE", false)
	}
	
	
	@Keyword
	public void individualScoreUIAllFieldVerification() throws IOException, InterruptedException {


		/********* Verifying all fields UI  Score for individual Energy , Water , Waste , Transport , Human Exp , Base Point ************* */	
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		String lowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(lowestSocreTotal ,"0", false)
		String higestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/BasePointMax_10'))
		WebUI.verifyMatch(higestScoretotal ,"10", false)
		String basePoint = WebUI.getText(findTestObject('PerformanceScore/FieldScore/BaseScore'))
		WebUI.verifyMatch(basePoint ,"BASE SCORE", false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String energylowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(energylowestSocreTotal ,"0", false)
		String energyhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/MaxEnergy_33'))
		WebUI.verifyMatch(energyhigestScoretotal ,"33", false)
		String energy = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Energy'))
		WebUI.verifyMatch(energy ,"ENERGY", false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String waterlowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(waterlowestSocreTotal ,"0", false)
		String waterhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/WaterMax_15'))
		WebUI.verifyMatch(waterhigestScoretotal ,"15", false)
		String water = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Water'))
		WebUI.verifyMatch(water ,"WATER", false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String wastelowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(wastelowestSocreTotal ,"0", false)
		String wastehigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/WasteMax_8'))
		WebUI.verifyMatch(wastehigestScoretotal ,"8", false)
		String waste = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Waste'))
		WebUI.verifyMatch(waste ,"WASTE", false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(5)
		String translowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(translowestSocreTotal ,"0", false)
		String transhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/Transportation_14'))
		WebUI.verifyMatch(transhigestScoretotal ,"14", false)
		String transportation = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_Transportation'))
		WebUI.verifyMatch(transportation ,"TRANSPORTATION", false)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String humlowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/minPoint_0'))
		WebUI.verifyMatch(humlowestSocreTotal ,"0", false)
		String humhigestScoretotal = WebUI.getText(findTestObject('PerformanceScore/FieldScore/HumanExperienceMax_20'))
		WebUI.verifyMatch(humhigestScoretotal ,"20", false)
		String humExp = WebUI.getText(findTestObject('PerformanceScore/FieldScore/span_HumanExperience'))
		WebUI.verifyMatch(humExp ,"HUMAN EXPERIENCE", false)
	}


	@Keyword
	public void totalPerformanceScoreUIAllFieldVerificationCityComOtherNone() throws IOException, InterruptedException {


		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String performaceScore = WebUI.getText(findTestObject('PerformanceScore/span_Performance Score'))
		WebUI.verifyMatch(performaceScore , 'Performance Score', false)

		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		WebUI.verifyMatch(totalperformaceScore ,"0", false)

		String total = WebUI.getText(findTestObject('PerformanceScore/Score/span_Total'))
		WebUI.verifyMatch(total ,"TOTAL", false)

		String higestScoretotal = WebUI.getText(findTestObject('PerformanceScore/Score/TotalHigestScore100'))
		WebUI.verifyMatch(higestScoretotal ,"100", false)

		String lowestSocreTotal = WebUI.getText(findTestObject('PerformanceScore/Score/TotalLowestSocre0'))
		WebUI.verifyMatch(lowestSocreTotal ,"0", false)

		String energy = WebUI.getText(findTestObject('PerformanceScore/Score/span_Energy'))
		WebUI.verifyMatch(energy ,"ENERGY", false)

		String higestScoreEnergy = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyHighestSocre100'))
		WebUI.verifyMatch(higestScoretotal ,"100", false)

		String lowestSocreEnergy = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyLowestSocre0'))
		WebUI.verifyMatch(lowestSocreEnergy ,"0", false)

		String water = WebUI.getText(findTestObject('PerformanceScore/Score/span_Water'))
		WebUI.verifyMatch(water ,"WATER", false)

		String waste = WebUI.getText(findTestObject('PerformanceScore/Score/span_Waste'))
		WebUI.verifyMatch(waste ,"WASTE", false)

		String transport = WebUI.getText(findTestObject('PerformanceScore/Score/span_Transportation'))
		WebUI.verifyMatch(transport ,"TRANSPORTATION", false)

		String humanExp = WebUI.getText(findTestObject('PerformanceScore/Score/span_Human Experience'))
		WebUI.verifyMatch(humanExp ,"HUMAN EXPERIENCE", false)
	}

	@Keyword
	public void totalPerformanceScoreUIWithoutScore() throws IOException, InterruptedException {
		/********* Verifying blank category score race-track without entering data for total performance score section ************* */

		/*WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		 WebUI.delay(1)
		 */
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.delay(5)

		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		WebUI.verifyMatch(totalperformaceScore ,"0", false)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/TotalPointBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/EnergyBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/WaterBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/WasteBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/TransportBalnkRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/HumExpBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		//WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/BasePointBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	public void totalPerformanceScoreUIWithoutScoreAg() throws IOException, InterruptedException {
		/********* Verifying blank category score race-track without entering data for total performance score section ************* */

		/*WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		 WebUI.delay(1)*/

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.delay(10)

		//String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		//WebUI.verifyMatch(totalperformaceScore ,"6", false)

		//WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/TotalPointBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		//WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/EnergyBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/WaterBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/WasteBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/TransportBalnkRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		//	WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/HumExpBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/BasePointBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void totalPerformanceScoreUIWithoutScoreCityComOtherNone() throws IOException, InterruptedException {
		/********* Verifying blank category score race-track without entering data for total performance score section ************* */

		/*WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		 WebUI.delay(1)*/

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/TotalPointBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/EnergyBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/WaterBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/WasteBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/TransportBalnkRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)

		WebUI.verifyElementPresent(findTestObject('PerformanceScore/TotalRacetrack/HumExpBlankRaceTrack') ,5, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void individualPerformanceScoreUIWithoutScore() throws IOException, InterruptedException {
		/********* Verifying blank category score race-track without entering data for individual Energy , Water , Waste , Transport , Human Exp , Base Point ************* */	

		//WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		//WebUI.delay(5)
		//WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/BasePointBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/EnergyBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/WaterBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/WasteBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/TransportBalnkRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/HumExpBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)
	}
	@Keyword
	public void individualPerformanceScoreUIWithoutScoreAg() throws IOException, InterruptedException {
		/********* Verifying blank category score race-track without entering data for individual Energy , Water , Waste , Transport , Human Exp , Base Point ************* */
		/*WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		 WebUI.delay(4)
		 */
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/BasePointBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/EnergyBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/WaterBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/WasteBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/TransportBalnkRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)
		/*
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		 WebUI.delay(5)
		 WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/HumExpBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)*/
	}
	@Keyword
	public void individualPerformanceScoreUIWithoutScoreLV4() throws IOException, InterruptedException {
		/********* Verifying blank category score race-track without entering data for individual Energy , Water , Waste , Transport , Human Exp , Base Point ************* */
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.delay(4)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Base Points'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/BasePointBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/EnergyBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/WaterBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/WasteBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/TransportBalnkRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('PerformanceScore/RaceTrack/HumExpBlankRaceTrack'),5, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void navigationTotalScoreToAnalytics() throws IOException, InterruptedException {

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))*/
		WebUI.delay(1)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean totalScore = WebUI.verifyTextPresent('Overall score', false)
		Assert.assertTrue(totalScore)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.delay(1)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/span_Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertTrue(totalScore)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/span_Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsEnergy = WebUI.verifyTextPresent('CARBON CONSUMPTION', false)
		Assert.assertTrue(analyticsEnergy)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/span_Water'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsWater = WebUI.verifyTextPresent('WATER CONSUMPTION', false)
		Assert.assertTrue(analyticsWater)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.delay(1)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/span_Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsWaste = WebUI.verifyTextPresent('WASTE GENERATION/DIVERSION', false)
		Assert.assertTrue(analyticsWaste)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.delay(1)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/span_Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsTransport = WebUI.verifyTextPresent('Transportation', false)
		Assert.assertTrue(analyticsTransport)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.delay(1)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/span_Human Experience'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsHumExp = WebUI.verifyTextPresent('Human Experience', false)
		Assert.assertTrue(analyticsHumExp)
	}
	@Keyword
	public void navigationIndividualRacetrackToAnalytics() throws IOException, InterruptedException {
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/a_ CreditsActions'))
		 WebUI.delay(1)
		 WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		 WebUI.delay(3)*/

		WebUI.scrollToElement(findTestObject('PerformanceScore/Score/a_ Energy'),2)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/RaceTrack/CURRENT ENERGY'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/RaceTrack/CURRENT ENERGY'), GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('PerformanceScore/RaceTrack/CURRENT ENERGY'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)


		Boolean analyticsEnergy = WebUI.verifyTextPresent('CARBON CONSUMPTION', false)
		Assert.assertTrue(analyticsEnergy)

		WebUI.scrollToElement(findTestObject('PerformanceScore/Score/a_ Score'),2)
		WebUI.delay(1)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/RaceTrack/CURRENT WATER'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/RaceTrack/CURRENT WATER'), GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('PerformanceScore/RaceTrack/CURRENT WATER'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		Boolean analyticsWater = WebUI.verifyTextPresent('WATER CONSUMPTION', false)
		Assert.assertTrue(analyticsWater)


		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/RaceTrack/CURRENT WASTE'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/RaceTrack/CURRENT WASTE'), GlobalVariable.avgAngularWait)


		WebUI.click(findTestObject('PerformanceScore/RaceTrack/CURRENT WASTE'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsWaste = WebUI.verifyTextPresent('WASTE GENERATION/DIVERSION', false)
		Assert.assertTrue(analyticsWaste)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/RaceTrack/CURRENT TRANSPORTATION'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/RaceTrack/CURRENT TRANSPORTATION'), GlobalVariable.avgAngularWait)

		WebUI.click(findTestObject('PerformanceScore/RaceTrack/CURRENT TRANSPORTATION'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsTransport = WebUI.verifyTextPresent('Transportation', false)
		Assert.assertTrue(analyticsTransport)

		WebUI.click(findTestObject('PerformanceScore/Score/a_ Score'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('PerformanceScore/Score/a_ Human Experience'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/RaceTrack/CURRENT HUMAN EXPERIENCE'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/RaceTrack/CURRENT HUMAN EXPERIENCE'), GlobalVariable.avgAngularWait)


		WebUI.click(findTestObject('PerformanceScore/RaceTrack/CURRENT HUMAN EXPERIENCE'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Boolean analyticsHumExp = WebUI.verifyTextPresent('Human Experience', false)
		Assert.assertTrue(analyticsHumExp)
	}


	@Keyword
	public void trialProjectScoreVerificaion(){

		WebUI.click(findTestObject('Object Repository/TrialScore/scoreTotal'))
		WebUI.delay(10)
		String performanceScoreText = WebUI.getText(findTestObject('Object Repository/TrialScore/scorePerformanceScoreText'))
		WebUI.verifyMatch(performanceScoreText, "Performance Score", false)
		WebUI.delay(15)
		WebUI.waitForElementPresent(findTestObject('Object Repository/TrialScore/plaqueEnergyScore'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/TrialScore/plaqueEnergyScore'), 20)
		String energyScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueEnergyScore'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/TrialScore/plaqueWaterScore'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/TrialScore/plaqueWaterScore'), 20)
		String waterScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueWaterScore'))
		String wasteScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueWasteScore'))
		String transportationScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueTransportationScore'))
		String humanExpScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueHumanExperience'))
		String totalScore= WebUI.getText(findTestObject('Object Repository/TrialScore/plaqueTotalScore'))

		if((Integer.parseInt(energyScore)==0))
			KeywordUtil.markFailed("Energy Score is zero(0)")
		if((Integer.parseInt(waterScore)==0))
			KeywordUtil.markFailed("Water Score is zero(0)")
		if((Integer.parseInt(wasteScore)==0))
			KeywordUtil.markFailed("Waste Score is zero(0)")
		if((Integer.parseInt(transportationScore)==0))
			KeywordUtil.markFailed("Transportation Score is zero(0)")
		if((Integer.parseInt(humanExpScore)==0))
			KeywordUtil.markFailed("Human Experience Score is zero(0)")
		if((Integer.parseInt(totalScore)==0))
			KeywordUtil.markFailed("Total Score is zero(0)")
		//WebUI.verifyMatch(totalScore, "47", false, FailureHandling.CONTINUE_ON_FAILURE)

	}



	@Keyword
	public void genratePerformanceScoreAdminToolTrial(String sheetName,int rowNum) throws IOException, InterruptedException {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScoreButton'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/PorjectId'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/RecomputeScore'))
		WebUI.delay(22)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/EnergyScore'), 30)
		String energyScore = WebUI.getText(findTestObject('PerformanceScore/Score/EnergyScore'))
		String waterScore = WebUI.getText(findTestObject('PerformanceScore/Score/WaterSocre'))
		String wasteScore = WebUI.getText(findTestObject('PerformanceScore/Score/WasteScore'))
		String transportScore = WebUI.getText(findTestObject('PerformanceScore/Score/TransportScore'))
		String humanExpScore = WebUI.getText(findTestObject('PerformanceScore/Score/HumanExperianceScore'))

		//saving the data into the excel sheet for verifying with leed online.

		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "energyScore", GlobalVariable.rowNumTwo, energyScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "waterScore", GlobalVariable.rowNumTwo, waterScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "wasteScore", GlobalVariable.rowNumTwo, wasteScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "transportation", GlobalVariable.rowNumTwo, transportScore)
		dataExcelTemplate.setCellData(GlobalVariable.LEEDData, "humanExperience", GlobalVariable.rowNumTwo, humanExpScore)

		double energyscore = Double.parseDouble(energyScore)
		double waterscore =  Double.parseDouble(waterScore)
		double wastescore =  Double.parseDouble(wasteScore)
		double transportscore = Double.parseDouble(transportScore)
		double humexpscore =    Double.parseDouble(humanExpScore)
		double totalPerformanceScore = energyscore + waterscore + wastescore + transportscore + humexpscore
		String totalperformanceScore = Math.round(totalPerformanceScore)
		//String totalperformanceScore = Double.toString(totalPerformanceScore)
		println totalperformanceScore

		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Search the project
		//reusableMethodsSearch.searchProgram(sheetName,rowNum)

		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Score'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.delay(15)
		//Verifying the Performance score
		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalperformanceScore, false)

	}

	@Keyword
	public void totalPerformanceScoreToolTipLEED() throws IOException, InterruptedException {
		WebUI.setViewPortSize(1024,768)
		WebUI.delay(5)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		WebUI.delay(10)
		WebUI.waitForElementClickable(findTestObject('Manage/CityCom/New/PerformanceToolTip'),30)
		WebUI.click(findTestObject('Manage/CityCom/New/PerformanceToolTip'))
		WebUI.delay(5)
		//WebUI.verifyElementPresent(findTestObject('Manage/CityCom/New/LEEDPerformance scoreThe total'), 22)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/CategoryScore'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/Performance scoreThe total'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/Base pointsAchieve'), FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.waitForElementClickable(findTestObject('Manage/CityCom/New/PerformanceToolTip'),30)
		WebUI.click(findTestObject('Manage/CityCom/New/PerformanceToolTip'))
		WebUI.delay(5)

		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/CategoryScore'),3)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/Performance scoreThe total'),3)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/Base pointsAchieve'),3)

		WebUI.setViewPortSize(1366,1280)
		WebUI.delay(5)

	}

	@Keyword
	public void totalPerformanceScoreToolTipOtherNone() throws IOException, InterruptedException {
		WebUI.setViewPortSize(1024,768)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Manage/CityCom/New/PerformanceToolTip'),30)
		WebUI.click(findTestObject('Manage/CityCom/New/PerformanceToolTip'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		//WebUI.verifyElementPresent(findTestObject('Manage/CityCom/New/LEEDPerformance scoreThe total'), 22)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/CategoryScoreOtherNone'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/Performance scoreThe total'), FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/Base pointsAchieve'),3)

		WebUI.waitForElementClickable(findTestObject('Manage/CityCom/New/PerformanceToolTip'),30)
		WebUI.click(findTestObject('Manage/CityCom/New/PerformanceToolTip'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/CategoryScore'),3)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/Performance scoreThe total'),3)
		WebUI.setViewPortSize(1366,1280)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	
	@Keyword
	public void totalPerformanceScoreToolTip() throws IOException, InterruptedException {
		WebUI.setViewPortSize(1024,768)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Total'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Manage/CityCom/New/PerformanceToolTip'),30)
		WebUI.click(findTestObject('Manage/CityCom/New/PerformanceToolTip'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		//WebUI.verifyElementPresent(findTestObject('Manage/CityCom/New/LEEDPerformance scoreThe total'), 22)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/CategoryScore'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementVisible(findTestObject('Manage/CityCom/New/Performance scoreThe total'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/Base pointsAchieve'),3)

		WebUI.waitForElementClickable(findTestObject('Manage/CityCom/New/PerformanceToolTip'),30)
		WebUI.click(findTestObject('Manage/CityCom/New/PerformanceToolTip'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/CategoryScore'),3)
		WebUI.verifyElementNotPresent(findTestObject('Manage/CityCom/New/Performance scoreThe total'),3)
		WebUI.setViewPortSize(1366,1280)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	
	
    @Keyword
	public void recomputeScoreImprovement(String sheetName,int rowNum) throws IOException, InterruptedException {
		
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)

		WebUI.click(findTestObject('PerformanceScore/ImprovementScoreTab'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('PerformanceScore/LEEDIDImprovementPage'),projectId)
		WebUI.delay(2)
		WebUI.click(findTestObject('PerformanceScore/ImprovementScoreRecomputeButton'))

		boolean keepGoing = WebUI.waitForAngularLoad(240, FailureHandling.CONTINUE_ON_FAILURE)

		if(keepGoing== false)

			for(int i=0;i<=1;i++){
				WebUI.click(findTestObject('PerformanceScore/ImprovementScoreTab'))
				WebUI.delay(3)
				WebUI.setText(findTestObject('PerformanceScore/LEEDIDImprovementPage'),projectId)
				WebUI.delay(2)
				WebUI.click(findTestObject('PerformanceScore/ImprovementScoreRecomputeButton'))
				WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			}
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/PerformanceScore/NoEnergyDataWarning'), GlobalVariable.minAngularWait)

		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)

	}


}