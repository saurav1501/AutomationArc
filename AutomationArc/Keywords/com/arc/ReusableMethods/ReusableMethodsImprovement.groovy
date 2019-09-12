package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.text.DecimalFormat
import java.text.SimpleDateFormat

import org.openqa.selenium.WebDriver

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ReusableMethodsImprovement extends BaseClass{

	WebDriver driver  = DriverFactory.getWebDriver()
	public static Robot robot = new Robot()
	public ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	ResuableMethodsPerformanceScore  performanceScore = new ResuableMethodsPerformanceScore()
	ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	ResuableMethodsSetting setting = new ResuableMethodsSetting()
	DecimalFormat df = new DecimalFormat("0.###");
	public double calculateBaseLineReading(double area){

		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2, simpleDateformat3,simpleDateformat4;
		Calendar cal = Calendar.getInstance();
		int curMonth = cal.get(Calendar.MONTH)+1;
		int curYear  = cal.get(Calendar.YEAR)-1;
		int curDay  = cal.get(Calendar.DAY_OF_MONTH);
		double totalReadingFirst = 0;
		int tempDay=0;
		System.out.println("Cur Year "+ curYear);
		System.out.println("Cur Month "+ curMonth);
		System.out.println("Cur Day "+ curDay);

		int j=0;
		for(int row=27; row>=2;row--){
			String date= dataExcelTemplate.getCellData("Improvement", "Start",row );

			Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat1 = new SimpleDateFormat("YYYY");
			int tempYear= Integer.parseInt(simpleDateformat1.format(date2));

			//System.out.println("Temp Year "+tempYear);

			Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("MM");
			int tempDate= Integer.parseInt(simpleDateformat.format(date1));
			//System.out.println("Temp Month "+tempDate);

			Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat2 = new SimpleDateFormat("dd");
			tempDay= Integer.parseInt(simpleDateformat2.format(date3));
			//System.out.println("Temp Day "+tempDay);
			if((curMonth==tempDate && tempYear==curYear)){
				if(curDay==1) {
					j=row+1;
				}
				else {
					j=row+1;
					String endDate= dataExcelTemplate.getCellData("Improvement", "End",row );
					Date endD1=new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
					simpleDateformat3 = new SimpleDateFormat("dd");
					int endDay= Integer.parseInt(simpleDateformat2.format(endD1));
					double reading1=Double.valueOf(dataExcelTemplate.getCellData("Improvement", "Reading1",row ));
					double oneDayReading=reading1/endDay;
					System.out.println("Current One day reading "+oneDayReading);
					System.out.println("No of cur days "+(curDay-1));
					totalReadingFirst = oneDayReading*(curDay-1);
					System.out.println(totalReadingFirst);
				}
				System.out.println("j value"+ j);
				break;
			}
		}

		for(int i=j;i<=j+10;i++)
			totalReadingFirst+=Double.valueOf(dataExcelTemplate.getCellData("Improvement", "Reading1",i ));
		System.out.println("Middle Reading "+totalReadingFirst);
		System.out.println("j value "+j);
		j+=11;
		System.out.println("Incremented J value "+j);
		System.out.println(totalReadingFirst);
		double reading2=Double.valueOf(dataExcelTemplate.getCellData("Improvement", "Reading1",j ));
		String date= dataExcelTemplate.getCellData("Improvement", "Start",j );
		Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
		simpleDateformat3 = new SimpleDateFormat("dd");
		int startDay= Integer.parseInt(simpleDateformat3.format(date3));
		System.out.println("Start Day "+startDay);

		String date4= dataExcelTemplate.getCellData("Improvement", "End",j );
		Date endDay=new SimpleDateFormat("MM/dd/yyyy").parse(date4);
		simpleDateformat4 = new SimpleDateFormat("dd");
		int endDayValue= Integer.parseInt(simpleDateformat4.format(endDay));
		System.out.println("End Day "+endDayValue);
		double oneDayReadingLast= reading2/ endDayValue;
		System.out.println(oneDayReadingLast);
		totalReadingFirst+=(oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Day count "+((endDayValue-curDay)+1));
		System.out.println("Last month reading "+oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Total Reading "+totalReadingFirst);
		return totalReadingFirst/area;
	}



	public double calculatePerformanceReading(double area){

		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2, simpleDateformat3,simpleDateformat4;
		Calendar cal = Calendar.getInstance();
		int curMonth = cal.get(Calendar.MONTH)+1;
		int curYear  = cal.get(Calendar.YEAR);
		int curDay  = cal.get(Calendar.DAY_OF_MONTH);
		double totalReadingFirst = 0;
		int tempDay=0;
		System.out.println("Cur Year "+ curYear);
		System.out.println("Cur Month "+ curMonth);
		int j=0;
		for(int row=27; row>=2;row--){
			String date= dataExcelTemplate.getCellData("Improvement", "Start",row );

			Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat1 = new SimpleDateFormat("YYYY");
			int tempYear= Integer.parseInt(simpleDateformat1.format(date2));

			//System.out.println("Temp Year "+tempYear);

			Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("MM");
			int tempDate= Integer.parseInt(simpleDateformat.format(date1));
			//System.out.println("Temp Month "+tempDate);

			Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat2 = new SimpleDateFormat("dd");
			tempDay= Integer.parseInt(simpleDateformat2.format(date3));
			//System.out.println("Temp Day "+tempDay);

			if((curMonth==tempDate && tempYear==curYear)){
				if(curDay==1) {
					j=row+1;
				}
				else {
					j=row+1;
					String endDate= dataExcelTemplate.getCellData("Improvement", "End",row );
					Date endD1=new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
					simpleDateformat3 = new SimpleDateFormat("dd");
					int endDay= Integer.parseInt(simpleDateformat2.format(endD1));
					double reading1=Double.valueOf(dataExcelTemplate.getCellData("Improvement", "Reading1",row ));
					double oneDayReading=reading1/endDay;
					System.out.println("Current One day reading "+oneDayReading);
					System.out.println("No of cur days "+(curDay-1));
					totalReadingFirst = oneDayReading*(curDay-1);
					System.out.println(totalReadingFirst);
				}
				System.out.println("j value"+ j);
				break;
			}
		}

		for(int i=j;i<=j+10;i++)
			totalReadingFirst+=Double.valueOf(dataExcelTemplate.getCellData("Improvement", "Reading1",i ));
		System.out.println("Middle Reading "+totalReadingFirst);
		System.out.println("j value "+j);
		j+=11;

		System.out.println(totalReadingFirst);
		double reading2=Double.valueOf(dataExcelTemplate.getCellData("Improvement", "Reading1",j ));
		String date= dataExcelTemplate.getCellData("Improvement", "Start",j );
		Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
		simpleDateformat3 = new SimpleDateFormat("dd");
		int startDay= Integer.parseInt(simpleDateformat3.format(date3));
		System.out.println("Start Day "+startDay);

		String date4= dataExcelTemplate.getCellData("Improvement", "End",j );
		Date endDay=new SimpleDateFormat("MM/dd/yyyy").parse(date4);
		simpleDateformat4 = new SimpleDateFormat("dd");
		int endDayValue= Integer.parseInt(simpleDateformat4.format(endDay));
		System.out.println("End Day "+endDayValue);
		double oneDayReadingLast= reading2/ endDayValue;
		System.out.println(oneDayReadingLast);
		totalReadingFirst+=(oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Day count "+((endDayValue-curDay)+1));
		System.out.println("Last month reading "+oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Total Reading "+totalReadingFirst);

		return totalReadingFirst/area;
	}

	public double calculateBaseLineReading(String reading){

		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2, simpleDateformat3,simpleDateformat4;
		Calendar cal = Calendar.getInstance();
		int curMonth = cal.get(Calendar.MONTH)+1;
		int curYear  = cal.get(Calendar.YEAR)-1;
		int curDay  = cal.get(Calendar.DAY_OF_MONTH);
		double totalReadingFirst = 0;
		int tempDay=0;
		System.out.println("Cur Year "+ curYear);
		System.out.println("Cur Month "+ curMonth);
		int j=0;
		for(int row=27; row>=2;row--){
			String date= dataExcelTemplate.getCellData("Improvement", "Start",row );

			Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat1 = new SimpleDateFormat("YYYY");
			int tempYear= Integer.parseInt(simpleDateformat1.format(date2));

			//System.out.println("Temp Year "+tempYear);

			Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("MM");
			int tempDate= Integer.parseInt(simpleDateformat.format(date1));
			//System.out.println("Temp Month "+tempDate);

			Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat2 = new SimpleDateFormat("dd");
			tempDay= Integer.parseInt(simpleDateformat2.format(date3));
			//System.out.println("Temp Day "+tempDay);

			if((curMonth==tempDate && tempYear==curYear)){
				if(curDay==1) {
					j=row+1;
					print "j value"+ j
				}
				else {
					j=row+1;
					String endDate= dataExcelTemplate.getCellData("Improvement", "End",row );
					Date endD1=new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
					simpleDateformat3 = new SimpleDateFormat("dd");
					int endDay= Integer.parseInt(simpleDateformat2.format(endD1));
					double reading1=Double.valueOf(dataExcelTemplate.getCellData("Improvement", reading ,row ));
					double oneDayReading=reading1/endDay;
					System.out.println("Current One day reading "+oneDayReading);
					System.out.println("No of cur days "+(curDay-1));
					totalReadingFirst = oneDayReading*(curDay-1);
					System.out.println(totalReadingFirst);
				}
				System.out.println("j value"+ j);
				break;
			}
		}

		for(int i=j;i<=j+10;i++)
			totalReadingFirst+=Double.valueOf(dataExcelTemplate.getCellData("Improvement", reading ,i ));
		System.out.println("Middle Reading "+totalReadingFirst);
		System.out.println("j value "+j);
		j+=11;
		System.out.println("Incremented J value "+j);
		System.out.println(totalReadingFirst);
		double reading2=Double.valueOf(dataExcelTemplate.getCellData("Improvement", reading ,j ));
		String date= dataExcelTemplate.getCellData("Improvement", "Start",j );
		Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
		simpleDateformat3 = new SimpleDateFormat("dd");
		int startDay= Integer.parseInt(simpleDateformat3.format(date3));
		System.out.println("Start Day "+startDay);

		String date4= dataExcelTemplate.getCellData("Improvement", "End",j );
		Date endDay=new SimpleDateFormat("MM/dd/yyyy").parse(date4);
		simpleDateformat4 = new SimpleDateFormat("dd");
		int endDayValue= Integer.parseInt(simpleDateformat4.format(endDay));
		System.out.println("End Day "+endDayValue);
		double oneDayReadingLast= reading2/ endDayValue;
		System.out.println(oneDayReadingLast);
		totalReadingFirst+=(oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Day count "+((endDayValue-curDay)+1));
		System.out.println("Last month reading "+oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Total Reading "+totalReadingFirst);
		return totalReadingFirst;
	}

	public double calculatePerformanceReading(String reading){

		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2, simpleDateformat3,simpleDateformat4;
		Calendar cal = Calendar.getInstance();
		int curMonth = cal.get(Calendar.MONTH)+1;
		int curYear  = cal.get(Calendar.YEAR);
		int curDay  = cal.get(Calendar.DAY_OF_MONTH);
		double totalReadingFirst = 0;
		int tempDay=0;
		System.out.println("Cur Year "+ curYear);
		System.out.println("Cur Month "+ curMonth);
		int j=0;
		for(int row=27; row>=2;row--){
			String date= dataExcelTemplate.getCellData("Improvement", "Start",row );

			Date date2=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat1 = new SimpleDateFormat("YYYY");
			int tempYear= Integer.parseInt(simpleDateformat1.format(date2));

			//System.out.println("Temp Year "+tempYear);

			Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("MM");
			int tempDate= Integer.parseInt(simpleDateformat.format(date1));
			//System.out.println("Temp Month "+tempDate);

			Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat2 = new SimpleDateFormat("dd");
			tempDay= Integer.parseInt(simpleDateformat2.format(date3));
			//System.out.println("Temp Day "+tempDay);

			if((curMonth==tempDate && tempYear==curYear)){
				if(curDay==1) {
					j=row+1;
				}
				else {
					j=row+1;
					String endDate= dataExcelTemplate.getCellData("Improvement", "End",row );
					Date endD1=new SimpleDateFormat("MM/dd/yyyy").parse(endDate);
					simpleDateformat3 = new SimpleDateFormat("dd");
					int endDay= Integer.parseInt(simpleDateformat2.format(endD1));
					double reading1=Double.valueOf(dataExcelTemplate.getCellData("Improvement", reading, row ));
					double oneDayReading=reading1/endDay;
					System.out.println("Current One day reading "+oneDayReading);
					System.out.println("No of cur days "+(curDay-1));
					totalReadingFirst = oneDayReading*(curDay-1);
					System.out.println(totalReadingFirst);
				}
				System.out.println("j value"+ j);
				break;
			}
		}

		for(int i=j;i<=j+10;i++)
			totalReadingFirst+=Double.valueOf(dataExcelTemplate.getCellData("Improvement", reading ,i ));
		System.out.println("Middle Reading "+totalReadingFirst);
		System.out.println("j value "+j);
		j+=11;

		System.out.println(totalReadingFirst);
		double reading2=Double.valueOf(dataExcelTemplate.getCellData("Improvement", reading,j ));
		String date= dataExcelTemplate.getCellData("Improvement", "Start",j );
		Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
		simpleDateformat3 = new SimpleDateFormat("dd");
		int startDay= Integer.parseInt(simpleDateformat3.format(date3));
		System.out.println("Start Day "+startDay);

		String date4= dataExcelTemplate.getCellData("Improvement", "End",j );
		Date endDay=new SimpleDateFormat("MM/dd/yyyy").parse(date4);
		simpleDateformat4 = new SimpleDateFormat("dd");
		int endDayValue= Integer.parseInt(simpleDateformat4.format(endDay));
		System.out.println("End Day "+endDayValue);
		double oneDayReadingLast= reading2/ endDayValue;
		System.out.println(oneDayReadingLast);
		totalReadingFirst+=(oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Day count "+((endDayValue-curDay)+1));
		System.out.println("Last month reading "+oneDayReadingLast*((endDayValue-curDay)+1));
		System.out.println("Total Reading "+totalReadingFirst);

		return totalReadingFirst;
	}



	public double score(double percentSoEI){
		double scoreSoEI;
		if (percentSoEI <= 1)
			scoreSoEI = 0;
		else if (percentSoEI > 1 && percentSoEI <= 5)
			scoreSoEI = ((percentSoEI - 1)*10);
		else if (percentSoEI > 5 && percentSoEI <= 35)
			scoreSoEI = (((percentSoEI - 5)*2) + 40);
		else if (percentSoEI > 35)
			scoreSoEI =  100;

		return scoreSoEI;
	}


	@Keyword
	public void validateEnergyImprovementData(){

		double scoreSEI,scoreSoEI;
		double percentSEI, percentSoEI, percentArea;

		WebUI.click(findTestObject('Object Repository/Improvement/ImprovementTab'))
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/Improvement/ImprovementPageLoader'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.delay(10)
		String baseLineReadingSEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodSEI'))
		String performanceReadingSEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/PerformancePeriodSEI'))
		String baseLineReadingSoEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodSourceEI'))
		String performanceReadingSoEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/PerformancePeriodSourceEI'))
		String baseLineCost = WebUI.getText(findTestObject('Object Repository/Improvement/Energy/BaselinePeriodECI'))
		String performanceCost = WebUI.getText(findTestObject('Object Repository/Improvement/Energy/PerformancePeroidECI'))
		String energyCostPercentage = WebUI.getText(findTestObject('Object Repository/Improvement/Energy/EnergyCostIntensity'))
		String baseReadingArea = WebUI.getText(findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodGrossArea'))
		String perfomanceReadingArea = WebUI.getText(findTestObject('Object Repository/Improvement/Energy/PerformancePeriodGrossArea'))

		WebUI.verifyMatch(baseReadingArea, '1,234', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(perfomanceReadingArea, '1,234', false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(baseLineCost, "NA", false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceCost, "NA", false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(energyCostPercentage, "NA", false , FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(baseLineReadingSEI, String.valueOf(calculateBaseLineReading(1234.0).round(6)),false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingSEI,String.valueOf(calculatePerformanceReading(1234.0).round(6)),false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(baseLineReadingSoEI, String.valueOf((calculateBaseLineReading(1234.0)*2.8).round(6)), false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingSoEI, String.valueOf((calculatePerformanceReading(1234.0)*2.8).round(6)), false , FailureHandling.CONTINUE_ON_FAILURE)
		double baseReadingSEI = calculateBaseLineReading(1234.0).round(6);
		double perfReadingSEI = calculatePerformanceReading(1234.0).round(6);
		double baseReadingSoEI = (calculateBaseLineReading(1234.0)*2.8).round(6);
		double perfReadingSoEI = (calculatePerformanceReading(1234.0)*2.8).round(6);

		//Difference of Site Energy Intensity
		double diffSEI= (baseReadingSEI - perfReadingSEI);
		// difference of Source energy intensity
		double diffSoEI= (baseReadingSoEI - perfReadingSoEI);

		//Calculate the Score for SEI

		if(diffSEI==0){
			scoreSEI=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/SiteEnergyIntensity')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else if(diffSEI<0){
			scoreSEI=0;
			percentSEI= ((diffSEI*100)*-1)/baseReadingSEI;
			percentSEI= percentSEI.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/SiteEnergyIntensity')), df.format(percentSEI)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentSEI= (diffSEI*100)/baseReadingSEI;
			percentSEI= percentSEI.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/SiteEnergyIntensity')),df.format(percentSEI)+"%", false, , FailureHandling.CONTINUE_ON_FAILURE)
			scoreSEI= score(percentSEI);
			scoreSEI= ((scoreSEI*33.33)/100).round(1);
			println "Score SEI 33.33 " + scoreSEI;
		}

		//Calculate the score for SoEI

		if(diffSoEI==0){
			scoreSoEI=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/SourceEnergyIntensity')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffSoEI<0){
			scoreSoEI=0;
			percentSoEI= ((diffSoEI*100)*-1)/baseReadingSoEI;
			percentSoEI= percentSoEI.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/SourceEnergyIntensity')), df.format(percentSoEI)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentSoEI= (diffSoEI*100)/baseReadingSoEI;
			percentSoEI= percentSoEI.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/SourceEnergyIntensity')), df.format(percentSoEI)+"%", false , FailureHandling.CONTINUE_ON_FAILURE)
			scoreSoEI= score(percentSoEI);
			scoreSoEI= ((scoreSoEI*33.33)/100).round(1);
			println "Score SoEI 33.33 " + scoreSoEI;
		}

		// Total Score for Energy
		double totalScoreEnergy= Math.round(scoreSEI + scoreSoEI)
		println "Total Energy Score "+totalScoreEnergy;
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/EnergyImprovementScorePercentage')), String.valueOf(Math.round(totalScoreEnergy)), false , FailureHandling.CONTINUE_ON_FAILURE)

		//Area percentage change for Energy

		double diffArea= (Double.parseDouble(baseReadingArea.replaceAll(",","")).round(6) - Double.parseDouble(perfomanceReadingArea.replaceAll(",","")).round(6));
		if (diffArea==0){

			percentArea=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/EnergyGrossArea')), "0%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffArea<0){

			percentArea= ((diffArea*-100)/baseReadingArea.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/EnergyGrossArea')), df.format(percentArea)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			percentArea= ((diffArea*100)/baseReadingArea.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Energy/EnergyGrossArea')), df.format(percentArea)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}

	@Keyword
	public void validateWaterImprovementData(){

		double scoreWater;
		double percentWater, percentArea;

		String baseLineReadingWater= WebUI.getText(findTestObject('Object Repository/Improvement/Water/BaseLinePeriodWater'))
		String performanceReadingWater= WebUI.getText(findTestObject('Object Repository/Improvement/Water/PerformancePeriodWater'))
		String baseReadingArea = WebUI.getText(findTestObject('Object Repository/Improvement/Water/BaseLinePeriodWaterArea'))
		String perfomanceReadingArea = WebUI.getText(findTestObject('Object Repository/Improvement/Water/PerformancePeriodWaterArea'))

		WebUI.verifyMatch(baseReadingArea, '1,234', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(perfomanceReadingArea, '1,234', false , FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(baseLineReadingWater, String.valueOf(calculateBaseLineReading(1234.0).round(6)),false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingWater,String.valueOf(calculatePerformanceReading(1234.0).round(6)),false , FailureHandling.CONTINUE_ON_FAILURE)

		double baseReadingWater = calculateBaseLineReading(1234.0).round(6);
		double perfReadingWater = calculatePerformanceReading(1234.0).round(6);

		//Difference of Water
		double diffWater= (baseReadingWater - perfReadingWater);


		//Calculate the Score for SEI

		if(diffWater==0){
			scoreWater=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterImprovementPercentageChange')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else if(diffWater<0){
			scoreWater=0;
			percentWater= ((diffWater*100)*-1)/baseReadingWater;
			percentWater= percentWater.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterImprovementPercentageChange')), df.format(percentWater)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentWater= (diffWater*100)/baseReadingWater;
			percentWater= percentWater.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterImprovementPercentageChange')),df.format(percentWater)+"%", false, , FailureHandling.CONTINUE_ON_FAILURE)
			scoreWater= score(percentWater).round(1);
			println "Score Water " + scoreWater;
		}


		// Total Score for Energy
		double totalScoreEnergy= Math.round(scoreWater)
		println "Total Energy Score "+totalScoreEnergy;
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterImprovementScorePercentage')), String.valueOf(Math.round(totalScoreEnergy)), false , FailureHandling.CONTINUE_ON_FAILURE)

		//Area percentage change for Energy

		double diffArea= (Double.parseDouble(baseReadingArea.replaceAll(",","")).round(6) - Double.parseDouble(perfomanceReadingArea.replaceAll(",","")).round(6));
		if (diffArea==0){

			percentArea=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterGrossAreaPercentageChange')), "0%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffArea<0){

			percentArea= ((diffArea*-100)/baseReadingArea.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterGrossAreaPercentageChange')), df.format(percentArea)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			percentArea= ((diffArea*100)/baseReadingArea.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Water/WaterGrossAreaPercentageChange')), df.format(percentArea)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}


	@Keyword
	public void validateWasteImprovementData(){

		double scoreWG,scoreWD;
		double percentWG, percentWD, percentOcc;

		String baseLineReadingWG= WebUI.getText(findTestObject('Object Repository/Improvement/Waste/BaseLineWasteGenerated'))
		String performanceReadingWG= WebUI.getText(findTestObject('Object Repository/Improvement/Waste/PerformancePeriodWasteGenerated'))
		String baseLineReadingWD= WebUI.getText(findTestObject('Object Repository/Improvement/Waste/BaseLineWasteDiverted'))
		String performanceReadingWD= WebUI.getText(findTestObject('Object Repository/Improvement/Waste/PerformancePeriodWasteDiverted'))
		String baseReadingOcc = WebUI.getText(findTestObject('Object Repository/Improvement/Waste/BaseLinePeriodOccupants'))
		String perfomanceReadingOcc = WebUI.getText(findTestObject('Object Repository/Improvement/Waste/PerformancePeriodOccupants'))

		WebUI.verifyMatch(baseReadingOcc, '47', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(perfomanceReadingOcc, '47', false , FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.verifyMatch(baseLineReadingWG, String.valueOf(((calculateBaseLineReading("Reading1")/47)/365).round(6)),false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingWG,String.valueOf(((calculatePerformanceReading("Reading1")/47)/365).round(6)),false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(baseLineReadingWD, String.valueOf(((calculateBaseLineReading("Reading2")/47)/365).round(6)), false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingWD, String.valueOf(((calculatePerformanceReading("Reading2")/47)/365).round(6)), false , FailureHandling.CONTINUE_ON_FAILURE)
		double baseReadingWG = ((calculateBaseLineReading("Reading1")/47)/365).round(6);
		double perfReadingWG = ((calculatePerformanceReading("Reading1")/47)/365).round(6);
		double baseReadingWD = ((calculateBaseLineReading("Reading2")/47)/365).round(6);
		double perfReadingWD = ((calculatePerformanceReading("Reading2")/47)/365).round(6);

		//Difference of Waste Generated
		double diffWG= (baseReadingWG - perfReadingWG);
		// difference of Waste Diverted
		double diffWD= (perfReadingWD - baseReadingWD);

		//Calculate the Score for Waste generated

		if(diffWG==0){
			scoreWG=0;
			println "Score WG 50 " + scoreWG;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteGeneratedPercentageChange')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else if(diffWG<0){
			scoreWG=0;
			println "Score WG 50 " + scoreWG;
			percentWG= ((diffWG*100)*-1)/baseReadingWG;
			percentWG= percentWG.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteGeneratedPercentageChange')), df.format(percentWG)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentWG= (diffWG*100)/baseReadingWG;
			percentWG= percentWG.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteGeneratedPercentageChange')), df.format(percentWG)+"%", false, , FailureHandling.CONTINUE_ON_FAILURE)
			scoreWG= score(percentWG);
			scoreWG= ((scoreWG*50)/100).round(1);
			println "Score WG 50 " + scoreWG;
		}

		//Calculate the score for Waste Diverted

		if(diffWD==0){
			scoreWD=0;
			println "Score WD 50 " + scoreWD;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteDivertedPercentageChange')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffWD<0){
			scoreWD=0;
			println "Score WD 50 " + scoreWD;
			percentWD= ((diffWD*100)*-1)/baseReadingWD;
			percentWD= percentWD.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteDivertedPercentageChange')), df.format(percentWD)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentWD= (diffWD*100)/baseReadingWD;
			percentWD= percentWD.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteDivertedPercentageChange')), df.format(percentWD)+"%", false , FailureHandling.CONTINUE_ON_FAILURE)
			scoreWD= score(percentWD);
			scoreWD= ((scoreWD*50)/100).round(1);
			println "Score WD 50 " + scoreWD;
		}

		// Total Score for Energy
		double totalScoreWaste= Math.round(scoreWG + scoreWD)
		println "Total Waste Score "+totalScoreWaste;
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteImprovementScorePercentage')), String.valueOf(Math.round(totalScoreWaste)), false , FailureHandling.CONTINUE_ON_FAILURE)

		//Area percentage change for Waste

		double diffOcc= (Double.parseDouble(baseReadingOcc).round(6) - Double.parseDouble(perfomanceReadingOcc).round(6));
		if (diffOcc==0){

			percentOcc=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteOccupantsPercentage')), "0%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffOcc<0){

			percentOcc= ((diffOcc*-100)/baseReadingOcc.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteOccupantsPercentage')), df.format(percentOcc)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			percentOcc= ((diffOcc*100)/baseReadingOcc.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Waste/WasteOccupantsPercentage')), df.format(percentOcc)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}

	}



	//Transportation Improvement
	@Keyword
	public void validateTransportationImprovementData(){

		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Improvement/ImprovementTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(10)

		double scoreTransport;
		double percentCo2e, percentOcc;

		//Carbon emission
		float car= 0.93;
		float car23= 0.39;
		float cars4= 0.44;
		float walk=  0.0;
		float motorcycle= 0.26;
		float bus= 0.68;
		float light_rail= 0.44;
		float heavy_rail= 0.33;

		//Carbon emission for the performance period 2018-2019
		float survey1_perf= (7 * car) + (4 * car23) + (6 * cars4) + (5 * light_rail);
		float survey2_perf= (8 * motorcycle) + (9 * bus) + (5 * heavy_rail) + (7 * car);
		float carbonEmissionPerform = (((survey1_perf + survey2_perf)/2)*0.0004536).round(6);

		//Carbon emission for the performance period 2017-2018
		float survey3_perf= (8 * car) + (4 * car23) + (9 * cars4) + (7 * light_rail);
		float survey4_perf= (3 * motorcycle) + (4 * bus) + (5 * heavy_rail) + (9 * car);
		float survey5_perf= (4 * walk) + (0 * car23) + (0 * cars4) + (0 * light_rail);
		float survey6_perf= (4 * walk) + (0 * car23) + (0 * cars4) + (0 * light_rail);
		float survey7_perf= (9 * car) + (0 * car23) + (0 * cars4) + (0 * light_rail);

		//we have to find mean for the survey's submitted, it will give co2e emission
		survey3_perf = 16.74
		survey4_perf = 13.52
		survey5_perf = 0.0
		survey6_perf = 0.0
		survey7_perf = 8.37

		float carbonEmissionBaseLine = (survey7_perf * 0.0004536).round(6);

		//Verify the Baseline and performance carbon emission
		String baseLineReadingCo2= WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/BaselinePeriodCo2e'))
		String performanceReadingCo2= WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PerformancePeriodCo2e'))
		String baseReadingOcc = WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/BaselinePeriodOcc'))
		String perfomanceReadingOcc = WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PerformancePeriodOcc'))

		WebUI.verifyMatch(baseLineReadingCo2, String.valueOf(carbonEmissionBaseLine) , false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingCo2, String.valueOf(carbonEmissionPerform) , false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(baseReadingOcc, '47', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(perfomanceReadingOcc, '47', false , FailureHandling.CONTINUE_ON_FAILURE)

		float diffCE = (carbonEmissionBaseLine - carbonEmissionPerform)

		if(diffCE==0){
			scoreTransport=0;
			println "Score Transport " + scoreTransport;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PercentageChangeCo2e')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else if(diffCE<0){
			scoreTransport=0;
			println "Score Transport " + scoreTransport;
			percentCo2e= (diffCE*-100)/carbonEmissionBaseLine;
			percentCo2e= percentCo2e.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PercentageChangeCo2e')), String.valueOf(percentCo2e)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentCo2e= (diffCE*100)/carbonEmissionBaseLine;
			percentCo2e= percentCo2e.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PercentageChangeCo2e')),String.valueOf(percentCo2e)+"%", false, , FailureHandling.CONTINUE_ON_FAILURE)
			scoreTransport= score(percentCo2e).round(1);
			println "Score Transport " + scoreTransport;
		}

		//Area percentage change for Transportation

		double diffOcc= (Double.parseDouble(baseReadingOcc).round(6) - Double.parseDouble(perfomanceReadingOcc).round(6));
		if (diffOcc==0){

			percentOcc=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PercentageChangeOcc')), "0%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffOcc<0){

			percentOcc= ((diffOcc*-100)/baseReadingOcc.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PercentageChangeOcc')), String.valueOf(percentOcc)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			percentOcc= ((diffOcc*100)/baseReadingOcc.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/PercentageChangeOcc')), String.valueOf(percentOcc)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}


		// Total Score for Energy
		println "Total Transport Score "+scoreTransport;
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/TransportationTotalScore')), String.valueOf(Math.round(scoreTransport)), false , FailureHandling.CONTINUE_ON_FAILURE)

	}


	//Human Experience Improvement data
	@Keyword
	public void validateHumanExperienceImprovementData(){

		double scoreHumanExp;
		double percentOS, percentOcc;

		//Total survey submitted 7
		//Performance Period 2 Survey with occ satisfaction 2,2
		double occSatisfactionPerform=(2+2)/2
		//BaseLine period 5 Survey with occ Satisfaction 2,2,1,1,1
		double occSatisfactionbaseline= (2+2+1+1+1)/5

		//Verify the Baseline and performance carbon emission
		String baseLineReadingOccSatis= WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/BaseLineOccSatis'))
		String performanceReadingOccSatis= WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PerformaceOccSatis'))
		String baseReadingOcc = WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/BaseLinePeriodOcc'))
		String perfomanceReadingOcc = WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PerformancePeriodOcc'))

		WebUI.verifyMatch(baseLineReadingOccSatis, String.valueOf(Math.round(occSatisfactionbaseline)) , false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(performanceReadingOccSatis, String.valueOf(Math.round(occSatisfactionPerform)) , false , FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(baseReadingOcc, '47', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(perfomanceReadingOcc, '47', false , FailureHandling.CONTINUE_ON_FAILURE)

		float diffOS = (baseLineReadingOccSatis - performanceReadingOccSatis)

		if(diffOS==0){
			scoreHumanExp=0;
			println "Score Transport " + scoreHumanExp;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PercentageChangeOccSatis')), "0%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else if(diffOS<0){
			scoreHumanExp=0;
			println "Score Transport " + scoreHumanExp;
			percentOS= (diffOS*-100)/baseLineReadingOccSatis;
			percentOS= percentOS.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PercentageChangeOccSatis')), String.valueOf(percentOS)+"%", false , FailureHandling.CONTINUE_ON_FAILURE )
		}
		else{
			percentOS= (diffOS*100)/baseLineReadingOccSatis;
			percentOS= percentOS.round(1);
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PercentageChangeOccSatis')),String.valueOf(percentOS)+"%", false, , FailureHandling.CONTINUE_ON_FAILURE)
			scoreHumanExp= score(percentOS).round(1);
			println "Score Transport " + scoreHumanExp;
		}

		//Area percentage change for Transportation

		double diffOcc= (Double.parseDouble(baseReadingOcc).round(6) - Double.parseDouble(perfomanceReadingOcc).round(6));
		if (diffOcc==0){

			percentOcc=0;
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PercentageChangeOcc')), "0%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else if(diffOcc<0){

			percentOcc= ((diffOcc*-100)/baseReadingOcc.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PercentageChangeOcc')), String.valueOf(percentOcc)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			percentOcc= ((diffOcc*100)/baseReadingOcc.round(6)).round(1)
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/HumanExperience/PercentageChangeOcc')), String.valueOf(percentOcc)+"%", false, FailureHandling.CONTINUE_ON_FAILURE)
		}


		// Total Score for Energy
		println "Total Transport Score "+scoreHumanExp;
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/Improvement/Transportation/TransportationTotalScore')), String.valueOf(Math.round(scoreHumanExp)), false , FailureHandling.CONTINUE_ON_FAILURE)





	}




}
