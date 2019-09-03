package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.text.DecimalFormat
import java.text.SimpleDateFormat

import org.openqa.selenium.WebDriver

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
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

	public double calculateBaseLineReading(double area){

		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2, simpleDateformat3,simpleDateformat4;
		Calendar cal = Calendar.getInstance();
		int curMonth = cal.get(Calendar.MONTH)+1;
		int curYear  = cal.get(Calendar.YEAR)-1;
		int curDay  = cal.get(Calendar.DAY_OF_WEEK);
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
			tempYear+=2000;
			System.out.println("Temp Year "+tempYear);

			Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("MM");
			int tempDate= Integer.parseInt(simpleDateformat.format(date1));
			System.out.println("Temp Month "+tempDate);

			Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat2 = new SimpleDateFormat("dd");
			tempDay= Integer.parseInt(simpleDateformat2.format(date3));
			System.out.println("Temp Day "+tempDay);

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
					System.out.println("No of cur days "+(curDay-2));
					totalReadingFirst = oneDayReading*(curDay-2);
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
		totalReadingFirst+=(oneDayReadingLast*((endDayValue-curDay)+2));
		System.out.println("Day count "+((endDayValue-curDay)+2));
		System.out.println("Last month reading "+oneDayReadingLast*((endDayValue-curDay)+2));
		System.out.println("Total Reading "+totalReadingFirst);
		return totalReadingFirst/area;
	}



	public double calculatePerformanceReading(double area){

		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2, simpleDateformat3,simpleDateformat4;
		Calendar cal = Calendar.getInstance();
		int curMonth = cal.get(Calendar.MONTH)+1;
		int curYear  = cal.get(Calendar.YEAR);
		int curDay  = cal.get(Calendar.DAY_OF_WEEK);
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
			tempYear+=2000;
			System.out.println("Temp Year "+tempYear);

			Date date1=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat = new SimpleDateFormat("MM");
			int tempDate= Integer.parseInt(simpleDateformat.format(date1));
			System.out.println("Temp Month "+tempDate);

			Date date3=new SimpleDateFormat("MM/dd/yyyy").parse(date);
			simpleDateformat2 = new SimpleDateFormat("dd");
			tempDay= Integer.parseInt(simpleDateformat2.format(date3));
			System.out.println("Temp Day "+tempDay);

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
					System.out.println("No of cur days "+(curDay-2));
					totalReadingFirst = oneDayReading*(curDay-2);
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
		totalReadingFirst+=(oneDayReadingLast*((endDayValue-curDay)+2));
		System.out.println("Day count "+((endDayValue-curDay)+2));
		System.out.println("Last month reading "+oneDayReadingLast*((endDayValue-curDay)+2));
		System.out.println("Total Reading "+totalReadingFirst);

		return totalReadingFirst/area;
	}


	@Keyword
	public void validateEnergyImprovementData(){

		/*	findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodSEI')
		 findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodSourceEI')
		 findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodGrossArea')	
		 findTestObject('Object Repository/Improvement/Energy/BaselinePeriodECI')  
		 findTestObject('Object Repository/Improvement/Energy/PerformancePeriodSEI')     
		 findTestObject('Object Repository/Improvement/Energy/PerformancePeriodSourceEI')   
		 findTestObject('Object Repository/Improvement/Energy/PerformancePeroidECI')
		 findTestObject('Object Repository/Improvement/Energy/PerformancePeriodGrossArea')  
		 */
		WebUI.click(findTestObject('Object Repository/Improvement/ImprovementTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(5)
		String baseLineReadingSEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodSEI'))
		String performanceReadingSEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/PerformancePeriodSEI'))
		String baseLineReadingSoEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/BaseLinePeriodSourceEI'))
		String performanceReadingSoEI= WebUI.getText(findTestObject('Object Repository/Improvement/Energy/PerformancePeriodSourceEI'))
		DecimalFormat six = new DecimalFormat("0.000000");
		WebUI.verifyMatch(baseLineReadingSEI,six.format(calculateBaseLineReading(1234.0)),false)
		WebUI.verifyMatch(performanceReadingSEI, six.format(calculatePerformanceReading(1234.0)),false)
		WebUI.verifyMatch(baseLineReadingSoEI, six.format(calculateBaseLineReading(1234.0)*2.8), false)
		WebUI.verifyMatch(performanceReadingSoEI,six.format(calculatePerformanceReading(1234.0)*2.8), false)
		double baseReadingSEI = Double.valueOf(six.format(calculateBaseLineReading(1234.0)));
		double perfReadingSEI = Double.valueOf(six.format(calculatePerformanceReading(1234.0)));
		double baseReadingSoEI = Double.valueOf(six.format(calculateBaseLineReading(1234.0)*2.8));
		double perfReadingSoEI = Double.valueOf(six.format(calculatePerformanceReading(1234.0)*2.8));
		
		double diffSEI= (baseReadingSEI - perfReadingSEI);
		
	}
}
