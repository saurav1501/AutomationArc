package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.DataFlavor
import java.awt.datatransfer.StringSelection
import java.awt.datatransfer.Transferable
import java.awt.event.KeyEvent
import java.math.RoundingMode
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


public class ReusableMethodsDataInput  extends BaseClass{

	WebDriver driver  = DriverFactory.getWebDriver()
	public static Robot robot = new Robot()
	public ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	ResuableMethodsPerformanceScore  performanceScore = new ResuableMethodsPerformanceScore()
	ReusableMethodsNavigation navigation = new ReusableMethodsNavigation()
	ResuableMethodsSetting setting = new ResuableMethodsSetting()

	@Keyword
	public void uploadArcDataTemplate(){

		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTemplete )
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(7)
	}

	@Keyword
	public void uploadArcDataTemplateUSTons(){

		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTempleteUSTons )
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(7)
	}


	@Keyword
	public void uploadArcDataTemplateImprovement(){

		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTempleteImprovement)
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(7)
	}


	@Keyword
	public void uploadArcDataTemplatetrial(){

		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(2)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'),GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'),5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTemplete )
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	//Verify the default units displayed on the Graphs y-axis

	

	@Keyword
	public void uploadArcDataTemplateBuildingAnalytics(){
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),8)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputTemplateFileUploadPopupTitle')),"Upload Spreadsheet",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.analyticsUploadArcDataTemplete )
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.refresh()
		WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
	}


	@Keyword
	public void uploadArcDataTemplateBuildingAnalytics18(){
		navigation.navigateIntoDataInput()
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),8)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputTemplateFileUploadPopupTitle')),"Upload Spreadsheet",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.analyticsUploadArcDataTemplete18)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(20)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		navigationTeam()
		WebUI.delay(5)
		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		navigation.navigateIntoDataInput()

	}

	public void navigationTeam()
	{
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
	}
	@Keyword
	public void uploadArcDataTemplateTransit(){

		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), GlobalVariable.minAngularWait)
		//Trial flow is dependent on it, if we uncomment it the trial flow will fail
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/span_Upload.XLS'), 20)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTempleteTransit)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void uploadArcDataTemplateLEEDV4(){
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'), UploadArcDataTempleteLEEDV4)
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(3)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.delay(18)
	}

	@Keyword
	public void uploadArcDataTemplateTransitAboveAnalytics(){
		//WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		if((WebUI.getAttribute(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions1'), "class", FailureHandling.OPTIONAL).equals("collapse"))){
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/a_ CreditsActions'))
		}
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		//WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTempleteTransitanalytics)
		WebUI.click(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		uploadFile(UploadArcDataTempleteTransitanalytics)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(17)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

	}

	@Keyword
	public void uploadArcDataTemplateTransitBelow(){
		//WebUI.delay(11)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/span_Upload.XLS'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'),3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/UploadArcDataTemplete'),BaseClass.UploadArcDataTempleteTransitBelow)
		//WebUI.click(findTestObject('Object Repository/DataInput/ClickOnUploadToSelectFile'))
		//WebUI.delay(4)
		//uploadFile(UploadArcDataTempleteTransitBelow)
		WebUI.delay(4)
		WebUI.click(findTestObject('DataInput/ClickToUploadFileButton'))
		WebUI.delay(5)
		//clickCancel()
		String successmessage= WebUI.getText(findTestObject('Object Repository/DataInput/ExcelUploadSuccessMessage'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when your data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(5)
	}



	//should be place after waste generation data input
	@Keyword
	public void verifyErrorWasteDivertedGreaterThanWasteGeneration(){

		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGeneratedReadingOne'), '800')
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDivertedReadingOne'), '1000')
		WebUI.delay(4)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickToSaveWasteReading'))
		WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/VerifyWasteErrorMessage'))
		println "Waste Diverted greater than Waste Genereted"
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDivertedReadingOne'), '600')
		WebUI.delay(4)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickToSaveWasteReading'))

	}

	//verify the excel upload data for energy meter
	@Keyword
	public void verifyEnergyReadingUploadedViaExcel(String sheetName, int rowNum){
		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/ClickOnEnergyMeterCreatedViaExcel'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Energy Meter via upload", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		int j=2
		int k=1
		(1..12).each{
			String date1 = dataExcelTemplate.getCellData(sheetName, "Start", j)
			String date2 = dataExcelTemplate.getCellData(sheetName, "End", j)
			String reading = dataExcelTemplate.getCellData(sheetName, "Reading1", j)

			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/StartDateOne',[index: it]),'value'), date1)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/EndDateOne',[index: it]),'value'),date2)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/ReadingOne',[index: k]),'value'),reading)
			j++
			k+=2
		}
	}

	@Keyword
	public void verifyWaterReadingUploadedViaExcel(String sheetName, int rowNum){
		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/ClickOnWaterMeterCreatedViaExcel'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), 4)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water meter via upload", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)

		int j=2
		int k=1
		(1..12).each{
			String date1 = dataExcelTemplate.getCellData(sheetName, "Start", j)
			String date2 = dataExcelTemplate.getCellData(sheetName, "End", j)
			String reading = dataExcelTemplate.getCellData(sheetName, "Reading1", j)

			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/StartDateOne',[index: it]),'value'), date1)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/EndDateOne',[index: it]),'value'),date2)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/ReadingOne',[index: k]),'value'),reading)
			j++
			k+=2
		}
		//verify document tab is available under data input section
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DocumentTab'), 4)
		WebUI.click(findTestObject('Object Repository/DataInput/DocumentTab'))
		WebUI.delay(3)
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/UploadButtonInDocumentTab')))

	}


	public String currentTime() throws IOException, InterruptedException {
		Calendar cal = Calendar.getInstance()
		Date date=cal.getTime()
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a")
		String formattedDate=dateFormat.format(date)
	}

	public static String verifyBillingDate() throws IOException, InterruptedException {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, YYYY")
		LocalDateTime now = LocalDateTime.now()
		return dtf.format(now)
		System.out.println(dtf.format(now))
	}

	@Keyword
	public void verifyWasteReadingUploadedViaExcel(String sheetName, int rowNum){
		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), 4)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Waste Data", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(6)
		String date1
		String date2
		String reading1
		String reading2
		int j=2
		(1..11).each{
			if((rowNum==5)){
				date1 = dataExcelTemplate.getCellData(sheetName, "Start", j)
				date2 = dataExcelTemplate.getCellData(sheetName, "End", j)
				reading1 = dataExcelTemplate.getCellData(sheetName, "Reading3", j)
				reading2 = dataExcelTemplate.getCellData(sheetName, "Reading4", j)
			}
			else{
				date1 = dataExcelTemplate.getCellData(sheetName, "Start", j)
				date2 = dataExcelTemplate.getCellData(sheetName, "End", j)
				reading1 = dataExcelTemplate.getCellData(sheetName, "Reading1", j)
				reading2 = dataExcelTemplate.getCellData(sheetName, "Reading2", j)

			}


			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/StartDateOne',[index: it]),'value'), date1)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/EndDateOne',[index: it]),'value'),date2)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/WGReadingOne',[index: it]),'value'),reading1)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/DataInputExcelUploadDataVerification/WDReadingOne',[index: it]),'value'),reading2)
			j++
		}
		//verify document tab is available under data input section
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DocumentTab'), 4)
		WebUI.click(findTestObject('Object Repository/DataInput/DocumentTab'))
		WebUI.delay(3)
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/UploadButtonInDocumentTab')))

	}

	@Keyword
	public void verifyWasteGraphpopulatedAfterExcelUpload(String sheetName){
		/*WebUI.delay(15)*/
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(10)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(6)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Waste Data", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Graphs/WasteMeterUnitDisplayedOnGraph')), "lbs", false)

		SimpleDateFormat simpleDateformat,simpleDateformat1
		Calendar cal = Calendar.getInstance()
		int curMonth = cal.get(Calendar.MONTH)+1
		int curYear  = cal.get(Calendar.YEAR)
		println "Cur Year "+ curYear
		int j=0
		for(int row=26; row>=2;row--){
			String date= dataExcelTemplate.getCellData(sheetName, "Start",row )

			Date date1=new SimpleDateFormat("MMM dd, yyyy").parse(date)
			simpleDateformat = new SimpleDateFormat("MM")
			int tempDate= Integer.parseInt(simpleDateformat.format(date1))
			println "Temp month "+tempDate
			Date date2=new SimpleDateFormat("MMM dd, yyyy").parse(date)
			simpleDateformat1 = new SimpleDateFormat("yyyy")
			int tempYear= Integer.parseInt(simpleDateformat1.format(date2))
			println "Temp Year "+tempYear
			if((curMonth==tempDate && tempYear==curYear)){
				//println "Row Num"+row
				j=row
				break
			}
		}

		j+=12
		println j
		(1..7).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading2", j)
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/WasteDivertedGraph',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}

	}

	public void getGraphReading(String sheetName){
		int j=14
		(1..13).each{

			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading1", j)
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/WasteGeneratedGraph',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}
	}

	public void getGraphReading(String sheetName, String colName){
		SimpleDateFormat simpleDateformat,simpleDateformat1,simpleDateformat2
		Calendar cal = Calendar.getInstance()
		int curMonth = cal.get(Calendar.MONTH)+1
		int curYear  = cal.get(Calendar.YEAR)
		int curDay   =cal.get(Calendar.DAY_OF_MONTH)
		println "Cur Year "+ curYear
		int j=0
		for(int row=26; row>=2;row--){
			String date= dataExcelTemplate.getCellData(sheetName, "Start",row )

			Date date1=new SimpleDateFormat("MMM dd, yyyy").parse(date)
			simpleDateformat = new SimpleDateFormat("MM")
			int tempDate= Integer.parseInt(simpleDateformat.format(date1))
			println "Temp Month "+tempDate

			Date date2=new SimpleDateFormat("MMM dd, yyyy").parse(date)
			simpleDateformat1 = new SimpleDateFormat("yyyy")
			int tempYear= Integer.parseInt(simpleDateformat1.format(date2))
			println "Temp Year "+tempYear

			Date date3=new SimpleDateFormat("MMM dd, yyyy").parse(date)
			simpleDateformat2 = new SimpleDateFormat("dd")
			int tempDay= Integer.parseInt(simpleDateformat2.format(date3))
			println "Temp Day "+tempYear
			if((curMonth==tempDate && tempYear==curYear)){
				j=row
				break
			}
		}

		j+=12
		println j
		(1..7).each{

			String reading1 = dataExcelTemplate.getCellData(sheetName, colName, j)
			println "Reading "
			println reading1
			println j
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/WasteGeneratedGraph',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
			println j
		}
	}

	@Keyword
	public void verifyEnergyGraphpopulatedAfterExcelUpload(String sheetName){
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EnergyMeterViaFileUpload'), 60)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EnergyMeterViaFileUpload'), 60)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EnergyMeterViaFileUpload'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Energy Meter via upload", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Graphs/EnergyMeterUnitDisplayedOnGraph')),"kBtu" , false)
		getGraphReading(sheetName, "Reading1")
	}


	@Keyword
	public void verifyWaterGraphpopulatedAfterExcelUpload(String sheetName){
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/WaterMeterViaFileUpload'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water meter via upload", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Graphs/WaterMeterUnitDisplayedOnGraph')), "gal", false)
		getGraphReading(sheetName, "Reading1")

	}

	@Keyword
	public void verifyHumanCo2BuildingGraphpopulatedAfterExcelUpload(String sheetName, int rowNum){
		//WebUI.refresh()
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickOccupantSatisfaction'))
		WebUI.delay(10)
		String people = dataExcelTemplate.getCellData(sheetName,"SurveyTransportation", rowNum)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Occupant Satisfaction Survey", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'))
		WebUI.delay(6)
		WebUI.focus(findTestObject('Object Repository/DataInput/Survey/MonthlySurveyGraph'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportResponseToolTip')).contains(people))
		WebUI.delay(2)
		WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SatisfactionGraphHE'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/OccupantSurveyTooltip')).contains("5"))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'))
		WebUI.delay(6)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Carbon Dioxide", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"Reading2")
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_VOC Meter'))
		WebUI.delay(6)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Total Volatile Organic Compounds", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"Reading1")

	}


	@Keyword
	public void verifyHumanCo2BuildingTransitGraphpopulatedAfterExcelUpload(String sheetName, int rowNum){
		WebUI.refresh()
		WebUI.delay(12)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickOccupantSatisfaction'))
		WebUI.delay(6)
		String people = dataExcelTemplate.getCellData(sheetName,"SurveyTransportation", rowNum)
		WebUI.delay(6)
		WebUI.focus(findTestObject('Object Repository/DataInput/Survey/MonthlySurveyGraph'))
		WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SatisfactionGraphHE'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/OccupantSurveyTooltip')).contains("5"))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/HumanExperienceTransit/PM2.5'))
		WebUI.delay(6)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Air Quality Index", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"HETransit")
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/HumanExperienceTransit/PM10'))
		WebUI.delay(6)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Air Quality Index", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"HETransit")
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/HumanExperienceTransit/Ozone'))
		WebUI.delay(6)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Air Quality Index", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"HETransit")
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/HumanExperienceTransit/Air Quality Index'))
		WebUI.delay(6)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Air Quality Index", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"HETransit")
	}



	@Keyword
	public void verifyTransportationGraphpopulatedAfterExcelUpload(String sheetName, int rowNum){
		/*//WebUI.refresh()
		 WebUI.delay(15)
		 WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		 WebUI.delay(4)*/
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/div_Transportation Survey'))
		//WebUI.waitForAngularLoad(10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Transportation Survey", FailureHandling.STOP_ON_FAILURE)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'))
		String people = dataExcelTemplate.getCellData(sheetName,"SurveyTransportation", rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.focus(findTestObject('Object Repository/DataInput/Survey/MonthlySurveyGraph'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportResponseToolTip')).contains("4"))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		int j=2
		(1..3).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName,"Transportation", j)
			//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: it]), 4)
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: it]), FailureHandling.CONTINUE_ON_FAILURE)
			String reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip'))
			WebUI.verifyMatch(reading, reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip')).contains(reading1))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			j++

		}

		int k=6
		for(int index = 5; index <=7; ){
			String reading1 = dataExcelTemplate.getCellData(sheetName,"Transportation", k)
			//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: it]), 4)
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: index]), FailureHandling.CONTINUE_ON_FAILURE)
			String reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip'))
			WebUI.verifyMatch(reading, reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip')).contains(reading1))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			k++
			index ++
		}

	}

	//Transportation Graph verification score version 3
	@Keyword
	public void verifyTransportationGraphpopulatedAfterExcelUploadNewScore(String sheetName, int rowNum){
		WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/div_Transportation Survey'))
		//WebUI.waitForAngularLoad(10)
		WebUI.delay(4)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Transportation Survey", FailureHandling.STOP_ON_FAILURE)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'))
		String people = dataExcelTemplate.getCellData(sheetName,"SurveyTransportation", rowNum)
		WebUI.delay(2)
		WebUI.focus(findTestObject('Object Repository/DataInput/Survey/MonthlySurveyGraph'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportResponseToolTip')).contains("4"))
		WebUI.delay(2)
		int j=2
		(1..3).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName,"TransportationV3", j)
			//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: it]), 4)
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: it]), FailureHandling.CONTINUE_ON_FAILURE)
			String reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip'),FailureHandling.CONTINUE_ON_FAILURE)
			println reading
			WebUI.verifyMatch(reading, reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip')).contains(reading1))
			WebUI.delay(2)
			j++
		}

		int k=6
		for(int index = 5; index <7; ){
			String reading1 = dataExcelTemplate.getCellData(sheetName,"TransportationV3", k)
			//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: it]), 4)
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationGraph',[index: index]), FailureHandling.CONTINUE_ON_FAILURE)
			String reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip'),FailureHandling.CONTINUE_ON_FAILURE)
			println reading
			WebUI.verifyMatch(reading, reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportationSurveyToolTip')).contains(reading1))
			WebUI.delay(2)
			k++
			index ++
		}

	}

	//New Score version Human experience Graph Validation
	@Keyword
	public void verifyHumanCo2BuildingGraphpopulatedAfterExcelUploadNewScore(String sheetName, int rowNum){
		//WebUI.refresh()
		WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickOccupantSatisfaction'))
		WebUI.delay(10)
		String people = dataExcelTemplate.getCellData(sheetName,"SurveyTransportation", rowNum)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Occupant Satisfaction Survey", FailureHandling.STOP_ON_FAILURE)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'))
		WebUI.delay(6)
		WebUI.focus(findTestObject('Object Repository/DataInput/Survey/MonthlySurveyGraph'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TransportResponseToolTip')).contains(people))
		WebUI.delay(2)
		WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/SatisfactionGraphHE'))
		Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/OccupantSurveyTooltip')).contains("100%"))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'))
		WebUI.delay(6)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Carbon Dioxide", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"Reading2")
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_VOC Meter'))
		WebUI.delay(6)
		//WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Total Volatile Organic Compounds", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		getGraphReading(sheetName,"Reading1")

	}


	@Keyword
	public void verifyDocumentTabFileUploadFunctionality(String sheetName, int rowNum){

		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Waste Data", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(4)
		uploadFile(UploadDocumentDataInput)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadDocumentDataInput)
		//verify document tab is available under data input section
		WebUI.click(findTestObject('Object Repository/DataInput/DocumentTab'))
		WebUI.delay(3)
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/UploadButtonInDocumentTab')))
		WebUI.click(findTestObject('Object Repository/DataInput/UploadButtonInDocumentTab'))
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/Document/ButtonUploadViaDropbox')))
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/Document/ButtonUploadViaGoogleDrive')))
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/Document/ButtonUploadViaOneDrive')))
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/DataInput/ClickOnCompterFileToSelectFile')))
		WebUI.click(findTestObject('Object Repository/DataInput/ClickOnCompterFileToSelectFile'))
		WebUI.delay(4)
		uploadFile(UploadGif)
		//WebUI.sendKeys(findTestObject('Object Repository/DataInput/SendFileToUpload'), UploadGif)
		WebUI.delay(4)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/DocumentNameOne')), 'uploadGif.gif')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/DocumentNameTwo')), 'USGBC.pdf')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/MeterOrCreditOne')), 'Waste')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/MeterOrCreditTwo')), 'Waste Data')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/ReadingOne')), 'N/A')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/ReadingTwo')), 'May 02, 2017 - Jun 02, 2017')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/UploadedByOne')), GlobalVariable.teamMemName)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/UploadedByTwo')), GlobalVariable.teamMemName)
		String date1 = WebUI.getText(findTestObject('Object Repository/DataInput/Document/UploadedOnOne'))
		String modDate1 = date1.substring(0, date1.indexOf("at"))
		Assert.assertEquals(modDate1.trim(), verifyBillingDate())
		String date2 = WebUI.getText(findTestObject('Object Repository/DataInput/Document/UploadedOnTwo'))
		String modDate2 = date2.substring(0, date2.indexOf("at"))
		Assert.assertEquals(modDate2.trim(), verifyBillingDate())
	}


	//should be placed just after after waste generation
	@Keyword
	public void verifyFilterDataInput(){
		WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), 4)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Waste Data", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CheckFilter/ClickFilter'))
		WebUI.click(findTestObject('Object Repository/DataInput/CheckFilter/FilterStartDate'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2019'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2019'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_1'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_1'))
		WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/DataInput/CheckFilter/ClickFilter'))
		WebUI.click(findTestObject('Object Repository/DataInput/CheckFilter/FilterEndDate'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2019'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2019'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_1'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_1'))
		//WebUI.click(findTestObject('Object Repository/DataInput/CheckFilter/ClickFilter'))
		WebUI.click(findTestObject('Object Repository/DataInput/CheckFilter/FilterUpdate'))
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGeneratedReadingOne'),'value'),'0.87')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDivertedReadingOne'),'value'),'0.43')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterStartDate'), 'value'),"May 01, 2019")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'), 'value'), "May 31, 2019")
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGeneratedReadingTwo'), 5, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void editMeterReading(String sheetName, int rowNum){
		String reading4  = data.getCellData(sheetName, "Reading4", rowNum)

		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/EnergyFileUploadTestMeter'))
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Test Energy Meter New", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(8)
		//edit reading one
		//WebUI.clearText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterStartDate'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterStartDate'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_3'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_3'))
		WebUI.delay(3)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickToSaveEditedMeterReading'),3)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickToSaveEditedMeterReading'))
		//WebUI.clearText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_11'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_11'))
		WebUI.delay(3)
		//WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterReadingtextBox'))
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterReadingtextBox'), reading4)
		WebUI.delay(3)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'))
		WebUI.refresh()
		WebUI.delay(15)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),reading4)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterStartDate'), 'value'),"May 03, 2018")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterEndDatePicker'), 'value'), "Jun 11, 2018")


	}


	@Keyword
	public void uploadCreditFormTest(){

		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/span_Upload .XLS'),10)
		WebUI.doubleClick(findTestObject('DataInput/CityCom/span_Upload .XLS'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/UploadArcDataTemplete'),10)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/UploadArcDataTemplete'),BaseClass.UploadArcDataTemplete )
		WebUI.click(findTestObject('DataInput/CityCom/ClickToUploadFileButton'))
		WebUI.delay(5)
		clickCancel()
		String successmessage= WebUI.getText(findTestObject('DataInput/p_Excel submitted successfully'))
		WebUI.delay(5)
		WebUI.verifyMatch(successmessage,'Excel submitted successfully. We will send you an email when you data is processed.' , true)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/button_CLOSE'))
		WebUI.refresh()
		WebUI.delay(5)
	}

	@Keyword
	public void fileUploadDataInput(){
		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/EnergyFileUploadTestMeter'))
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Test Energy Meter'))
		WebUI.delay(4)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Test Energy Meter", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		////pdf file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocumentDataInput)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadDocumentDataInput)
		//text file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadTextFile)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadTextFile)
		//jpg file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadJpeg)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadJpeg)
		//Png file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadPng)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadPng)
		//gif file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadGif)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadGif)
		//xls file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadXls)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadXls)
		//doc file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocs)
		WebUI.delay(8)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadDocs)
		//duplicate doc file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocs)
		WebUI.delay(8)
	}



	@Keyword
	public void largeFileUploadDataInputForSnapshot(){
		//WebUI.delay(10)
		//WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/EnergyFileUploadTestMeter'))
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Test Energy Meter'))
		WebUI.delay(4)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Test Energy Meter", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		////62 MB file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(FileSize62)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/uploadFileProgress'), 10)
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/DataInput/uploadFileProgress'), 240)
		WebUI.delay(4)
		//173 MB file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(FileSize173)
		WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/uploadFileProgress'), 10)
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/DataInput/uploadFileProgress'), 240)
		WebUI.delay(4)
		//205 file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(FileSize205)
		WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/uploadFileProgress'), 10)
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/DataInput/uploadFileProgress'), 240)
		WebUI.delay(4)
		//446 MB file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(FileSize446)
		WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/uploadFileProgress'), 10)
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/DataInput/uploadFileProgress'), 240)
		WebUI.delay(4)
		robot.keyPress(KeyEvent.VK_CANCEL)
		robot.keyRelease(KeyEvent.VK_CANCEL)
	}


	@Keyword
	public void fileUploadDataInputWithDifferentLanguages(){
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Test Energy Meter'))
		WebUI.delay(4)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Test Energy Meter", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		////pdf file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteSpanish)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadDocumentDataInput)
		//text file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteFrench)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadTextFile)
		//jpg file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteTurkish)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadJpeg)
		//Png file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteGerman)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadPng)
		//gif file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempletePortugues)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadGif)
		//xls file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteKorean)
		WebUI.delay(4)
		//WebUI.sendKeys(findTestObject('DataInput/DataInputFileUpload/sendFileToUpload'),UploadXls)
		//doc file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteChineseSimple)
		WebUI.delay(6)
		//duplicate doc file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		//WebUI.scrollToElement(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),3)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadArcDataTempleteChineseTrade)
		WebUI.delay(4)
	}



	@Keyword
	public void creditFileUploadTransit(){
		/*WebUI.delay(7)
		 WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(2)*/
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickOnPreRequisite'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/PreRequisiteTransitFirstCredit'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int i= 0;i<10;i++){

			if(i==0){
				//pdf upload
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadDocumentDataInput)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 1]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//textfile
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadTextFile)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 2]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//jpg upload
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadJpeg)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 3]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//upload png
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadPng)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 4]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//upload gif
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadGif)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 5]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//upload xls
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadXls)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 6]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				//upload docs
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadDocs)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 7]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/NextButtonCredit'))

			}
			else{
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
				//WebUI.delay(2)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				uploadFile(UploadDocumentDataInput)
				//WebUI.delay(4)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 1]), 6)
				//WebUI.delay(3)
				WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/NextButtonCredit'))
			}
		}

		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/BasePointSideBar'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/BasePointTransitFirstCredit'))
		for(int i=0; i<23;i++){
			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickButtonToUpload'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			//WebUI.delay(2)
			uploadFile(UploadDocumentDataInput)
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButton',[index: 1]), 6)
			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/NextButtonCredit'))
		}

	}


	@Keyword
	public void creditFileUploadCityComm(){

		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/AllActions'))

		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickOnFirstCreditCityComm'))
		for(int i=0; i<12; i++){
			WebUI.delay(5)
			if((i==0)){
				//pdf upload
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadDocumentDataInput)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 1]), 6)
				WebUI.delay(3)
				//text file
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadTextFile)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 2]), 6)
				WebUI.delay(3)
				//jpeg
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadJpeg)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 3]), 6)
				WebUI.delay(3)
				//png
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadPng)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 4]), 6)
				WebUI.delay(3)
				//gif
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadGif)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 5]), 6)
				WebUI.delay(3)
				//xls
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadXls)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 6]), 6)
				WebUI.delay(3)
				//docs
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadDocs)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 7]), 6)
				WebUI.delay(3)
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/NextButtonCredit'))
				WebUI.delay(5)
				WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreditFileupload/ProjectBoundayTextSpan'), 20, FailureHandling.STOP_ON_FAILURE)

			}
			else{
				WebUI.delay(5)
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
				WebUI.delay(2)
				uploadFile(UploadDocumentDataInput)
				WebUI.delay(4)
				WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreditFileupload/DeleteButtonCityComm',[index: 1]), 6)
				WebUI.delay(6)
				WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/NextButtonCredit'))
			}
		}
	}

	@Keyword
	public void fileUploadDataInputHumanExperience(){
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'))
		WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),'Carbon Dioxide', FailureHandling.STOP_ON_FAILURE)
		////pdf file
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadDocumentDataInput)
		WebUI.delay(8)
		//text file
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadTextFile)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		//jpg file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadJpeg)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		//Png file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadPng)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		//gif file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadGif)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		//xls file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadXls)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		//doc file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocs)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocs)
		WebUI.delay(8)
		if((WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),4)))
		{
			WebUI.delay(20)
		}
	}



	//Data Input File Upload City/Community

	@Keyword
	public void fileUploadCityCommEnergyMeter(){

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//pdf upload
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadDocumentDataInput)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//text file
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadTextFile)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//jpeg
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadJpeg)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//png
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadPng)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//gif
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadGif)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//xls
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadXls)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//docs
		WebUI.click(findTestObject('Object Repository/DataInput/CreditFileupload/ClickToUploadCityComm'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		uploadFile(UploadDocs)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(5)

	}

	public static void setClipboardData(String string) {
		//StringSelection is a class that can be used for copy and paste operations.
		StringSelection stringSelection = new StringSelection(string)
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null)
	}

	public static void uploadFile(String fileLocation) {
		try {
			//Setting clipboard with file location
			setClipboardData(fileLocation)
			//native key strokes for CTRL, V and ENTER keys
			Robot robot = new Robot()
			robot.keyPress(KeyEvent.VK_CONTROL)
			robot.keyPress(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_V)
			robot.keyRelease(KeyEvent.VK_CONTROL)
			WebUI.delay(3)
			robot.keyPress(KeyEvent.VK_ENTER)
			robot.keyRelease(KeyEvent.VK_ENTER)
			WebUI.delay(1)
			/*
			 robot.keyPress(KeyEvent.VK_ENTER)
			 robot.keyRelease(KeyEvent.VK_ENTER)*/
		} catch (Exception exp) {
			exp.printStackTrace()
		}
	}




	@Keyword
	public void fileUploadDataInputWater(){

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeter'))
		WebUI.delay(5)
		//pdf file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocumentDataInput)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//text file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadTextFile)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//jpg file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadJpeg)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//Png file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadPng)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//gif file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadGif)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//xls file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadXls)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//doc file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadDocs)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSeven'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSeven'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)

	}


	@Keyword
	public void fileUploadDataInputWaste(){
		//WebUI.delay(18)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), 3)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//pdf file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		//WebUI.delay(2)
		uploadFile(UploadDocumentDataInput)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"USGBC.pdf",false)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		//WebUI.delay(2)
		uploadFile(UploadTextFile)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"txtFileUpload.txt",false)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))

		WebUI.delay(3)
		//jpg file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		//WebUI.delay(2)
		uploadFile(UploadJpeg)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"Parking SJ.jpg",false)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))

		WebUI.delay(3)

		//Png file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadPng)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"uploadPng.png",false)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))

		WebUI.delay(3)
		//gif file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		//WebUI.delay(2)
		uploadFile(UploadGif)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"uploadGif.gif",false)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//xls file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		//WebUI.delay(2)
		uploadFile(UploadXls)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"uploasExcel.xlsx",false)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		//doc file
		WebUI.waitForElementClickable(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		//WebUI.delay(2)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		//WebUI.delay(2)
		uploadFile(UploadDocs)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/NoOfFiles'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'), GlobalVariable.minAngularWait)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne')),"uploadDoc.docx",false)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSeven'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSeven'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/closeModel'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}


	@Keyword
	public void fileUploadDataInputWasteViaCloud(){
		//WebUI.delay(18)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), 3)

		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(5)
		//upload files via google drive
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD_delete'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/div_Google Drive'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/input_identifier'), "testarcupload@gmail.com")
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/content_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/input_password'), "initpass")
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/span_Next'))
		WebUI.switchToWindowIndex(0)
		WebUI.delay(5)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/GoogleDrive.pdf'))
		//WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/ClickOnSelectGoogleDriveFile'))
		WebUI.delay(5)
		//upload files via one drive
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD_delete'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/div_OneDrive'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveUserId'),"testarcupload@gmail.com")
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveNextButton'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDrivePassword'), "initpass123")
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveNextButton'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveClickDocuments'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveSelectFile'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveClickOpenButton'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(10)
		/*//upload via google drive
		 WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD_delete'))
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/div_Google Drive'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(1)
		 WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/input_identifier'), "testarcupload@gmail.com")
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/content_Next'))
		 WebUI.delay(3)
		 WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/input_password'), "initpass")
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/span_Next'))
		 WebUI.switchToWindowIndex(0)
		 WebUI.delay(5)
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/GoogleDrive.pdf'))
		 //WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/ClickOnSelectGoogleDriveFile'))
		 WebUI.delay(5)
		 //upload files via one drive
		 WebUI.doubleClick(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD_delete'))
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/div_OneDrive'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(1)
		 WebUI.delay(5)
		 WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveUserId'),"testarcupload@gmail.com")
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveNextButton'))
		 WebUI.delay(3)
		 WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDrivePassword'), "initpass123")
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveNextButton'))
		 WebUI.delay(5)
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveClickDocuments'))
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveSelectFile'))
		 WebUI.delay(2)
		 WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/OneDriveClickOpenButton'))
		 WebUI.delay(5)
		 WebUI.switchToWindowIndex(0)
		 WebUI.delay(10)*/
		//Dropbox file upload file
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD_delete'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/div_Dropbox'))
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/input_login_email'),"testarcupload@gmail.com")
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/input_login_password'), "initpass")
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/ButtonSignInContinue'))
		WebUI.delay(3)
		WebUI.check(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/CheckDropboxDocumentToUpload'))
		WebUI.delay(1)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadFilesViaCloud/ClickOnChooseButton'))
		WebUI.switchToWindowIndex(0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/ClickOnNoOfFilesTen'))
		WebUI.delay(5)
		String fileName1= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentOne'))
		String fileName2= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTwo'))
		String fileName3= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentThree'))
		String fileName4= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFour'))
		String fileName5= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentFive'))
		String fileName6= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSix'))
		String fileName7= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentSeven'))
		String fileName8= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentEight'))
		String fileName9= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentNine'))
		String fileName10= WebUI.getText(findTestObject('Object Repository/DataInput/DataInputFileUpload/UploadDocumentTen'))
		Assert.assertEquals(fileName1,"USGBC.pdf")
		Assert.assertEquals(fileName2,"txtFileUpload.txt")
		Assert.assertEquals(fileName3,"Parking SJ.jpg")
		Assert.assertEquals(fileName4,"uploadPng.png")
		Assert.assertEquals(fileName5,"uploadGif.gif")
		Assert.assertEquals(fileName6,"uploasExcel.xlsx")
		Assert.assertEquals(fileName7,"uploadDoc.docx")
		Assert.assertEquals(fileName8,"GoogleDrive.pdf")
		Assert.assertEquals(fileName9,"OneDrive.pdf")
		Assert.assertEquals(fileName10,"DropBox.pdf")
	}





	public boolean isFileDownloaded(String fileName){

		boolean flag = false
		File dir = new File(downloadPath)
		File[] dir_contents = dir.listFiles()
		println('Total Files Available in the folder are : ' + dir_contents.length)
		for (int i = 0; i < dir_contents.length; i++) {
			println('File Name at '+ i +' is : ' + dir_contents[i].getName())
			if (dir_contents[i].getName().equals(fileName)) {
				return flag = true
			}
		}
		return flag
	}


	public boolean isFileExtracted(String fileName){

		boolean flag = false
		File dir = new File(UnzippedNewFolder)
		File[] dir_contents = dir.listFiles()
		println('Total Files Available in the folder are : ' + dir_contents.length)
		for (int i = 0; i < dir_contents.length; i++) {
			println('File Name at '+ i +' is : ' + dir_contents[i].getName())
			if (dir_contents[i].getName().equals(fileName)) {
				return flag = true
			}
		}
		return flag
	}

	@Keyword
	public static void clickCancel(){
		WebUI.delay(2)

		robot.keyPress(KeyEvent.VK_C)
		robot.keyRelease(KeyEvent.VK_C)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
	}

	//Add New Meter having fields(meter type, unit type, Fuel source)

	@Keyword
	public void newMeterBuidingFieldVerification(){
		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'))
		WebUI.delay(3)
		//WebUI.scrollToElement(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.verifyElementPresent(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),3)
		WebUI.verifyElementPresent(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'), 3)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/UnitDropdown'), 3)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/FuelSourceDropdown'), 3)
		println "Add New Meter Fields are visible"
	}

	//Add new meter default fuel type
	@Keyword
	public void addNewMeterBuildingDefaultfuelType(){

		//WebUI.delay(3)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'), 3)
		WebUI.scrollToElement(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'))
		WebUI.delay(3)
		//WebUI.scrollToElement(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		//default fuel type electricity
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		Assert.assertEquals("Purchased from Grid", WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/FuelSourceDropdown')))
		WebUI.delay(2)
		//default fuel type water
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_WATER'))
		Assert.assertEquals("Municipality supplied potable water", WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/FuelSourceDropdown')))
		WebUI.delay(2)
		//default fuel type other fuel
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Other Fuels'))
		Assert.assertEquals("Natural Gas", WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/FuelSourceDropdown')))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CancelButtonCreateMeter'))
	}


	//check the performance credits City / Community

	@Keyword
	public void performanceCreditVisibilityCityComm(){
		def String[] performCredits = ['Energy', 'Water', 'Waste', 'Transportation', 'Human Experience', 'Additional Data']
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)*/
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(2)
		WebDriver driver= DriverFactory.getWebDriver()
		By performanceCredit = By.xpath('//table[@class="table table-striped table-hover"]/tbody/tr')
		List<WebElement> credits= driver.findElements(performanceCredit)
		credits.size()
		println credits.size()
		int i=0
		for (credit in credits) {
			if(i==6)
				break
			println credit.getText()
			Assert.assertTrue(credit.getText().equalsIgnoreCase(performCredits[i]))

			i++
		}

	}


	//performance credit building
	@Keyword
	public void performanceCreditBuilding(){
		//WebUI.delay(18)
		def String[] performCredits = ['Waste', 'Transportation', 'Human Experience']
		Assert.assertEquals('Waste',  WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingWasteCredit')))
		Assert.assertEquals('Transportation', WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingTransportationCredit')))
		Assert.assertEquals('Human Experience', WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/BuildingHumanExperienceCredit')))

	}

	//(78) Delete meter reading building energy and water meter

	@Keyword
	public void deleteEnergyAndWaterMeterReadingBuilding(){
		WebUI.delay(3)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(15)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'))
		WebUI.delay(5)
		for (int c in 1..3){
			WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeletereadingOne'))
			println "Reading "+ c +" Deleted"
			WebUI.delay(4)
		}
		Assert.assertTrue(WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'), 3))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeterNew'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeterNew'))
		WebUI.delay(5)
		for (int c in 1..3){
			WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeletereadingOne'))
			println "Reading "+ c +" Deleted"
			WebUI.delay(4)
		}
		Assert.assertTrue(WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'), 3))
	}


	//Delete city-community energy and water meter readings
	@Keyword
	public void deleteEnergyAndWaterMeterReadingCityComm(){
		//delete energy reading
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)*/
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeleteCityCommReading'), 2)
		for (int c in 1..5){
			WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeleteCityCommReading'))
			println "Reading "+ c +" Deleted"
			WebUI.delay(10)
		}
		Assert.assertTrue(WebUI.verifyElementNotPresent(findTestObject('DataInput/CityCom/TextboxValue1'),3))

		//delete water reading
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CityCom/span_Water'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeleteCityCommReading'), 2)
		for (int c in 1..5){
			WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeleteCityCommReading'))
			println "Reading "+ c +" Deleted"
			WebUI.delay(10)
		}
		Assert.assertTrue(WebUI.verifyElementNotPresent(findTestObject('DataInput/CityCom/TextboxValue1'),3))
	}



	@Keyword
	public void verifyTheCommentAndActivity() {
		//WebUI.delay(15)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeter'), 3)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeter'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MeterDetails'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/Activity/CommentBox'),"This is test comment")
		WebUI.click(findTestObject('Object Repository/DataInput/Activity/PostButton'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Activity/ClickOnReply'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Activity/ClickOnReply'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/Activity/ReplyTextBox'), "This is test reply")
		WebUI.click(findTestObject('Object Repository/DataInput/Activity/ReplyButton'))
		WebUI.delay(5)
		//verify the Comments
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Activity/GetTheCommentPosted'),GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Activity/GetTheCommentPosted')),'This is test comment')
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Activity/GetUserCommented')),GlobalVariable.teamMemName)
		Assert.assertTrue(WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Activity/GetTheCommentTimeStamp'),5))
		//verify the reply
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Activity/GetUserReplied')),GlobalVariable.teamMemName)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Activity/GetReply')),'This is test reply')
		Assert.assertTrue(WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Activity/GetTheReplyTimeStamp'),5))
		printf "Comment and reply verified successfully "
	}


	@Keyword
	public void editEnergyMeterBuilding(){
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.scrollToElement(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'), 3)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeter'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MeterDetails'))
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterName'), "Test Energy Meter New")
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MeterDetails'))
		WebUI.delay(10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditUnit'),20)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditUnit'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/Select_mWh'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Document/ScorePopup'), 20)
		WebUI.delay(15)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditFuelSource'),20)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditFuelSource'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/Select_GeneratedOnsiteSolar'))
		WebUI.delay(6)
		WebUI.refresh()
		WebUI.delay(15)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MeterDetails'))
		WebUI.delay(5)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterName'),'value'),"Test Energy Meter New")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditUnit')), "MWh")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditFuelSource')), "Generated onsite - solar")
		WebUI.click(findTestObject('Object Repository/DataInput/Document/DataTabDataInput'))
		WebUI.delay(5)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/Document/ReadingUnitDisplayDataInput')), 'READING (MWh)')
	}



	@Keyword
	public void editWaterMeterBuilding(){
		//WebUI.delay(15)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeter'), 3)
		WebUI.delay(4)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeter'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MeterDetails'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterName'), "Test Water Meter New")
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MeterDetails'))
		WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditUnit'), 20)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditUnit'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/Water_kGal'))
		WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditFuelSource'), 20)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditFuelSource'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MunicipalitySuppliedReclaimWater'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/MunicipalitySuppliedReclaimWater'))
		WebUI.delay(5)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditMeterName'),'value'),"Test Water Meter New")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditUnit')), "kGal")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/EditFuelSource')), "Municipality supplied reclaimed water")
	}


	@Keyword
	public void createEnergyMeterInternational(String sheetName, String sheetName1, int rowNum){

		String reading1  = data.getCellData(sheetName, "Reading1", rowNum)
		String reading2  = data.getCellData(sheetName, "Reading2", rowNum)
		String reading3  = data.getCellData(sheetName, "Reading3", rowNum)
		String meterName=  data.getCellData(sheetName, "MeterName", rowNum)


		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.delay(5)
		ReusableMethodsLogin.waitForIframeLoad(60)
		ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.scrollToElement(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 5)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), meterName)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/NoReadingTextValidation'), 3, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		(1..2).each{
			WebUI.focus(findTestObject('Object Repository/DataInput/CreateMeterBuilding/WasteGeneratedGraph',[index: it]))
			WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph'),2)
		}
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataTabDataInput'))
		WebUI.delay(2)
		//reading one

		//WebUI.delay(8)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), meterName, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 5)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading1)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//reading two

		WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading2)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading 3

		WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Nov'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Nov'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading3)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)

		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)
		WebUI.refresh()
		WebUI.delay(15)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickOnInternationalMeter'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ClickOnInternationalMeter'))
		WebUI.delay(4)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),reading3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingTwo'),'value'),reading2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingThree'),'value'),reading1)

	}


	@Keyword
	public void createEnergyMeterWithDifferentUnits(){

		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		ReusableMethodsLogin.waitForIframeLoad(60)
		ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),"Energy Meter(MWh)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectMWh'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectOnGenerateOnSiteSolar'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),"Energy Meter(MWh)", FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)

		//MBtu
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),"Energy Meter(MBtu)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectMBtu'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectOnGenerateOnSiteSolar'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),"Energy Meter(MBtu)", FailureHandling.STOP_ON_FAILURE)

		//KBtu
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),"Energy Meter(KBtu)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectKBtu'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectOnGenerateOnSiteSolar'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),"Energy Meter(KBtu)", FailureHandling.STOP_ON_FAILURE)

		//Gj

		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),"Energy Meter(Gj)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectGj'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectOnGenerateOnSiteSolar'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),"Energy Meter(Gj)", FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	public void countEnergyMeter(){

		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestEnergyMeterNew')), "Test Energy Meter New")
		Assert.assertEquals(WebUI.getText(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Energy Meter(MWh)')), "Energy Meter(MWh)")
		Assert.assertEquals(WebUI.getText(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Energy Meter(MBtu)')), "Energy Meter(MBtu)")
		Assert.assertEquals(WebUI.getText(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Energy Meter(KBtu)')), "Energy Meter(KBtu)")
		Assert.assertEquals(WebUI.getText(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Energy Meter(Gj)')), "Energy Meter(Gj)")
		println "Total no of Energy Meters are : 5 verified successfully"
	}

	@Keyword
	public void countWaterMeter(){

		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeterNew')), "Test Water Meter New")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Water Meter(kGal)')), "Water Meter(kGal)")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Water Meter(MGal)')), "Water Meter(MGal)")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Water Meter(cf)')), "Water Meter(cf)")
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Water Meter(ccf)')), "Water Meter(ccf)")
		println "Total no of Water Meters are : 5 verified successfully"

	}

	@Keyword
	public void createEnergyMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "Reading1", rowNum)
		String reading2  = data.getCellData(sheetName, "Reading2", rowNum)
		String reading3  = data.getCellData(sheetName, "Reading3", rowNum)
		String meterName=  data.getCellData(sheetName, "MeterName", rowNum)


		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		//WebUI.delay(12)
		ReusableMethodsLogin.waitForIframeLoad(60)
		//WebUI.delay(10)
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/DataInput/LoaderIframeDatainput'), 60)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), meterName)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//reading one

		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), 20)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),meterName, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 5)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading1)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading two
		//WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading2)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonTwo'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading 3
		//WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading3)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonThree'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		//WebUI.delay(15)
		//WebUI.delay(5)
		//ReusableMethodsLogin.waitForloaderToDisappear(60)
		//ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/div_Test Energy Meter'))
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),reading3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingTwo'),'value'),reading2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingThree'),'value'),reading1)
	}



	@Keyword
	public void createWaterMeterWithDifferentUnits(){

		//kGal
		//WebUI.delay(18)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		///ReusableMethodsLogin.waitForPageLoad(60)
		//ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),30)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), "Water Meter(kGal)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_WATER'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectkGal'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectMuncipalitySuppliedReclaimedWater'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water Meter(kGal)", FailureHandling.STOP_ON_FAILURE)

		//MGal
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),30)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), "Water Meter(MGal)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_WATER'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectMGal'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectMuncipalitySuppliedReclaimedWater'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water Meter(MGal)", FailureHandling.STOP_ON_FAILURE)

		//cf
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),30)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), "Water Meter(cf)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_WATER'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/Selectcf'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectReclaimedOnsite'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water Meter(cf)", FailureHandling.STOP_ON_FAILURE)

		//ccf
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(60, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),30)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), "Water Meter(ccf)")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_WATER'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/Selectccf'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectReclaimedOnsite'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water Meter(ccf)", FailureHandling.STOP_ON_FAILURE)



	}



	@Keyword
	public void createWaterMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "Reading1", rowNum)
		String reading2  = data.getCellData(sheetName, "Reading2", rowNum)
		String reading3  = data.getCellData(sheetName, "Reading3", rowNum)
		String meterName=  data.getCellData(sheetName, "MeterName", rowNum)


		//WebUI.delay(18)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))

		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'),60)
		WebUI.waitForElementVisible(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'),60)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'),60)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'), meterName)
		println meterName
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_WATER'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		//reading one
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),meterName, FailureHandling.STOP_ON_FAILURE)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading1)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading two

		//WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading2)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonTwo'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading 3

		//WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading3)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonThree'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		//ReusableMethodsLogin.waitForloaderToDisappear(60)
		//ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeter'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/TestWaterMeter'))
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),reading3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingTwo'),'value'),reading2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingThree'),'value'),reading1)
	}



	@Keyword
	public void createWasteMeter(){

		WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		//WebUI.delay(6)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), 60)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGenerated'), '1000')
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDiverted'), '800')
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/source') ,'office')
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'), 3)
		//WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))

		/// Reading two

		//WebUI.delay(10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGenerated'), '500')
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDiverted'), '200')
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/source') ,'office')
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonTwo'), 20)
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)

		//reading 3

		//WebUI.delay(10)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGenerated'), '600')
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDiverted'), '300')
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/source') ,'office')
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonThree'), 20)
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//WebUI.delay(15)

		WebUI.refresh()
		ReusableMethodsLogin.waitForloaderToDisappear(60)
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		//verifying the data inputted is persisting or not
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGeneratedReadingOne'),'value'),'600')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGeneratedReadingTwo'),'value'),'500')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteGeneratedReadingThree'),'value'),'1000')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDivertedReadingOne'),'value'),'300')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDivertedReadingTwo'),'value'),'200')
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/wasteDivertedReadingThree'),'value'),'800')

	}



	@Keyword
	public void humanExperienceMeter(String sheetName, int rowNum ){

		String reading1  = data.getCellData(sheetName, "Reading1", rowNum)
		String reading2  = data.getCellData(sheetName, "Reading2", rowNum)
		String reading3  = data.getCellData(sheetName, "Reading3", rowNum)
		String reading4  = data.getCellData(sheetName, "Reading4", rowNum)
		String reading5  = data.getCellData(sheetName, "Reading5", rowNum)
		String reading6  = data.getCellData(sheetName, "Reading6", rowNum)

		//WebUI.delay(5)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))

		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 60)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 60)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 60)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),'Carbon Dioxide', FailureHandling.STOP_ON_FAILURE)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading1)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading two

		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading2)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonTwo'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading 3

		//WebUI.delay(5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		//WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading3)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonThree'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		ReusableMethodsLogin.waitForloaderToDisappear(60)
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 60)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 60)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'), 2)
		//WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_CO2 Meter'))
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),reading3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingTwo'),'value'),reading2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingThree'),'value'),reading1)


		//Add the VOC Reading

		WebUI.delay(5)

		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_VOC Meter'), 2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_VOC Meter'))
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),'Total Volatile Organic Compounds', FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading4)
		WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading two

		//WebUI.delay(5)

		//WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading5)
		WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonTwo'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		//reading 3

		//WebUI.delay(5)
		//WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2017'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), reading6)
		WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Update'))
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonThree'), 20)
		//WebUI.waitForElementNotVisible(findTestObject('Object Repository/DataInput/saveButtonDataInput'), 20)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/SuccessGreenTick'),20)
		WebUI.delay(5)
		WebUI.refresh()
		ReusableMethodsLogin.waitForloaderToDisappear(60)
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_VOC Meter'), 2)
		WebUI.delay(10)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/click_VOC Meter'))
		WebUI.delay(5)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),reading6)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingTwo'),'value'),reading5)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingThree'),'value'),reading4)
	}



	@Keyword
	public void verifyAndDownloadExportData(){

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.scrollToElement(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'), 3)
		WebUI.waitForElementPresent(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.waitForElementVisible(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'),20)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Create Report'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportStartDate'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportStartDate'), 'Jan 01, 2017')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportEndDate'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportEndDate'), 'Jan 01, 2018')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DOWNLOAD_DataInputReport'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/cancelButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/cancelButton'))
		WebUI.delay(8)
		//'Verifying the file is download in the User defined Path'
		Assert.assertTrue(isFileDownloaded('Export Data.xlsx'), 'Failed to download Expected document')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}


	//Transit ridership
	@Keyword
	public void humanExperienceMeterTransitRidership(String sheetName, int rowNum ){

		String Ridership1  = data.getCellData(sheetName, "Ridership1", rowNum)
		String Ridership2  = data.getCellData(sheetName, "Ridership2", rowNum)
		String Ridership3  = data.getCellData(sheetName, "Ridership3", rowNum)


		navigation.navigateIntoDataInput()
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/HumanExperienceTransit/Ridership'), 2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/HumanExperienceTransit/Ridership'))
		WebUI.delay(4)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),2)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),'Ridership', FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jan'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Feb'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(1)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), Ridership1)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Mar'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Apr'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(1)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), Ridership2)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(8)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_May'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter end_da'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/month_Jun'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/day_2'))
		WebUI.delay(1)
		WebUI.setText(findTestObject('DataInput/CreateMeterBuilding/input_fw600 reading ng-pristin'), Ridership3)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(5)
		WebUI.refresh()
		ReusableMethodsLogin.waitForloaderToDisappear(60)
		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/HumanExperienceTransit/Ridership'), 2)
		WebUI.doubleClick(findTestObject('Object Repository/DataInput/HumanExperienceTransit/Ridership'))
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingOne'),'value'),Ridership3)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingTwo'),'value'),Ridership2)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ReadingThree'),'value'),Ridership1)

	}


	//City Trial Data Input

	@Keyword
	public void createEnergyMeterReadingTrial(String sheetName, int rowNum) throws IOException, InterruptedException{

		String reading1  = data.getCellData(sheetName, "EReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "EReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "EReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "EReading5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//New data Input
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue3'), reading3)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue4'), reading4)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue5'), reading5)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int count = 1; count<=5; count++){
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		(1..5).each{
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		}

	}


	@Keyword
	public void createWaterMeterReadingTrial(String sheetName, int rowNum ) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "WaterReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "WaterReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "WaterReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "WaterReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "WaterReading5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('DataInput/CityCom/span_Water'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 3)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Next Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue3'), reading3)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue4'), reading4)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue5'), reading5)
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int count = 1; count<=5; count++){
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			//WebUI.delay(6)
		}
	}



	//City DataInput
	@Keyword
	public void createEnergyMeterReadingPrevious(String sheetName,int rowNum1) throws IOException, InterruptedException{
		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String carbonfootprint  = data.getCellData(sheetName, "ECarbonfootprint", rowNum)
		String zero="0";
		if(carbonfootprint.equals(zero))
		{
			KeywordUtil.markPassed("Energy Meter is not  project required")
		}
		else
		{
			WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
			//WebUI.delay(10)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
			//WebUI.delay(8)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), carbonfootprint)
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
			//WebUI.delay(7)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: 2]), 60)

			//WebUI.delay(4)
			//	Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"), carbonfootprint,"Not Valid")
		}
	}


	@Keyword
	public void verifyEnergyScore(String sheetName,int rowNum1) throws IOException, InterruptedException{
		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String energyScoreIn100 = data.getCellData(sheetName, "EnergyScore", rowNum)

		ReusableMethodsNavigation.clickScoreLabel()
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Energy'))
		WebUI.delay(13)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/Score100/Energy'), 40)
		String UIenergyScoreIn100 = WebUI.getText(findTestObject('DataInput/CityCom/Score100/Energy'))
		WebUI.verifyMatch(UIenergyScoreIn100, energyScoreIn100, false)

	}

	@Keyword
	public void verifyWaterScore(String sheetName,int rowNum1) throws IOException, InterruptedException{
		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String waterScoreIn100 = data.getCellData(sheetName, "WaterScore", rowNum)

		ReusableMethodsNavigation.clickScoreLabel()
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Water'))
		WebUI.delay(13)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/Score100/Water'), 40)
		String UIwaterScoreIn100 = WebUI.getText(findTestObject('DataInput/CityCom/Score100/Water'))
		WebUI.verifyMatch(UIwaterScoreIn100, waterScoreIn100, false)

	}
	@Keyword
	public void verifyWasteScore(String sheetName,int rowNum1) throws IOException, InterruptedException{
		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String wasteIn100 = data.getCellData(sheetName, "WasteScore", rowNum)

		ReusableMethodsNavigation.clickScoreLabel()
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Waste'))
		WebUI.delay(13)

		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/Score100/Waste'), 40)
		String UIwasteScoreIn100 = WebUI.getText(findTestObject('DataInput/CityCom/Score100/Waste'))
		WebUI.verifyMatch(UIwasteScoreIn100, wasteIn100, false)

	}
	@Keyword
	public void verifyTransportScore(String sheetName,int rowNum1) throws IOException, InterruptedException{
		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String transScoreIn100 = data.getCellData(sheetName, "TRScore", rowNum)

		ReusableMethodsNavigation.clickScoreLabel()
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Transportation'))
		WebUI.delay(20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/Score100/Transport'),40)
		String UITransportScoreIn100 = WebUI.getText(findTestObject('DataInput/CityCom/Score100/Transport'))
		WebUI.verifyMatch(UITransportScoreIn100, transScoreIn100, false)

	}


	@Keyword
	public void createEnergyMeterReading(String sheetName, int rowNum) throws IOException, InterruptedException{

		String reading1  = data.getCellData(sheetName, "EReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "EReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "EReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "EReading5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Energy'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.delay(10)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.delay(8)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		//WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue3'), reading3)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue4'), reading4)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue5'), reading5)
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		for(int count = 1; count<=5; count++){
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			//WebUI.delay(6)
		}
		(1..5).each{
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		}
		WebUI.refresh()
		//WebUI.delay(16)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue1'),"value"), reading1,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"),reading2,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue3'),"value"),reading3,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue4'),"value"),reading4,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue5'),"value"),reading5,"Not Valid")
	}

	@Keyword
	public void createWaterMeterReading(String sheetName, int rowNum ) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "WaterReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "WaterReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "WaterReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "WaterReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "WaterReading5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('DataInput/CityCom/span_Water'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 3)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Next Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue3'), reading3)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue4'), reading4)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue5'), reading5)
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		for(int count = 1; count<=5; count++){
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}

		/*(1..5).each{
		 WebUI.waitForElementNotClickable(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		 }*/


		WebUI.refresh()
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue1'),"value"),reading1,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"),reading2,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue3'),"value"),reading3,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue4'),"value"),reading4,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue5'),"value"),reading5,"Not Valid")
	}


	@Keyword
	public void createWaterMeterReadingPrevious(String sheetName, int rowNum1) throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String srowNum = data.getCellData(sheetName,"rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String WaterUseGal  = data.getCellData(sheetName, "WaterUse", rowNum)
		String zero="0";
		if(WaterUseGal.equals(zero))
		{
			KeywordUtil.markPassed("Water Meter is not required")
		}
		else
		{

			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.doubleClick(findTestObject('DataInput/CityCom/span_Water'))
			//WebUI.delay(10)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 3)
			WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
			//WebUI.delay(8)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'), 2)
			WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

			WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), WaterUseGal)
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/Score100/span_Per Year'), 10)
			WebUI.click(findTestObject('DataInput/CityCom/Score100/span_Per Year'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/Score100/a_Per Day'), 10)
			WebUI.click(findTestObject('DataInput/CityCom/Score100/a_Per Day'))

			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementNotClickable(findTestObject('DataInput/CityCom/TextboxValue2'), 60)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			//WebUI.delay(10)
			Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"),WaterUseGal,"Not Valid")
		}


	}


	@Keyword
	public void verifyHumExpScore(String sheetName,int rowNum1) throws IOException, InterruptedException{

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String AQIHumScore = data.getCellData(sheetName, "AQIHumScore", rowNum)
		int aQIHumScore = Integer.parseInt(AQIHumScore)

		String HCrimeScore = data.getCellData(sheetName, "HCrimeScore", rowNum)
		int hCrimeScore = Integer.parseInt(HCrimeScore)


		String HumEudScore = data.getCellData(sheetName, "HumEudScore", rowNum)
		int humEudScore = Integer.parseInt(HumEudScore)

		String HEQScore = data.getCellData(sheetName, "HEQScore", rowNum)
		int hEQScore = Integer.parseInt(HEQScore)

		String HProsScore = data.getCellData(sheetName, "HProsScore", rowNum)
		int hProsScore = Integer.parseInt(HProsScore)

		double avgAQICrime = (aQIHumScore + hCrimeScore)/2

		double totalavg = (avgAQICrime + humEudScore + hEQScore + hProsScore)/4

		BigDecimal totalAvg = new BigDecimal(totalavg)
		totalAvg = totalAvg.setScale(0,RoundingMode.HALF_UP)
		String TotalScore = totalAvg.toString()

		ReusableMethodsNavigation.clickScoreLabel()
		WebUI.click(findTestObject('PerformanceScore/Score/a_ Human Experience'))
		WebUI.delay(13)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/Score100/HumanExp'),40)
		String UIHumanExp = WebUI.getText(findTestObject('DataInput/CityCom/Score100/HumanExp'))
		WebUI.verifyMatch(UIHumanExp,TotalScore, false)

	}


	@Keyword
	public void createWasteGenerationMeterReading(String sheetName,int rowNum) throws IOException, InterruptedException {

		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "wastegeneration1", rowNum)
		String reading2  = data.getCellData(sheetName, "wastegeneration2", rowNum)
		String reading3  = data.getCellData(sheetName, "wastegeneration3", rowNum)
		String reading4  = data.getCellData(sheetName, "wastegeneration4", rowNum)
		String reading5  = data.getCellData(sheetName, "wastegeneration5", rowNum)

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/GwAddYear'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/GwAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/button_Next Year'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/button_Next Year'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/button_Next Year'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/CWTextboxValue1'),2)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue1'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue2'), reading2)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue3'), reading3)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue4'), reading4)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue5'), reading5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int count = 1; count<=5; count++){
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			//WebUI.delay(6)
		}
		(1..5).each{
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		}
		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.delay(10)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/CWTextboxValue1'),"value"), reading1,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/CWTextboxValue2'),"value"), reading2,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/CWTextboxValue3'),"value"), reading3,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/CWTextboxValue4'),"value"),reading4,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/CWTextboxValue5'),"value"), reading5,"Not Valid")

		//waste diversion

		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/span_Waste'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/span_Waste'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Waste'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DwAddYear'),2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/DwAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/DwAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/DwAddYear'), 4)
		WebUI.click(findTestObject('DataInput/CityCom/DwAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DNextButton'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DNextButton'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue1'), "80")
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue2'), "70")
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue3'), "60")
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue4'), "50")
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int count = 6; count<=9; count++){
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			//WebUI.delay(6)
		}
		(6..9).each{
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		}
		WebUI.refresh()
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/dWTextboxValue1'),"value"),"80","Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/dWTextboxValue2'),"value"),"70","Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/dWTextboxValue3'),"value"),"60","Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/dWTextboxValue4'),"value"),"50","Not Valid")
	}

	@Keyword
	public void createWaste(String sheetName,int rowNum1) throws IOException, InterruptedException {

		/*************************Reading data from excel sheet ************************************/

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)

		String wasteGenerationintensity  = data.getCellData(sheetName, "WasteGenerationintensity", rowNum)
		String zero="0";
		if(wasteGenerationintensity.equals(zero))
		{
			KeywordUtil.markPassed("Waste Generation Meter is not required")
		}
		else
		{
			WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/span_Waste'))
			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/GwAddYear'))
			//WebUI.delay(8)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.scrollToElement(findTestObject('DataInput/CityCom/CWTextboxValue1'),2)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue2'), wasteGenerationintensity)
			//WebUI.delay(1)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: 2]), 60)

			String wastediversion  = data.getCellData(sheetName, "Landfilldiversion", rowNum)

			WebUI.scrollToElement(findTestObject('DataInput/CityCom/DwAddYear'),2)
			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/DwAddYear'),30)
			WebUI.click(findTestObject('DataInput/CityCom/DwAddYear'))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
			WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue2'), wastediversion)
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton4'))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: 4]), 60)
			/*	WebUI.delay(10)
			 Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/dWTextboxValue2'),"value"),wastediversion,"Not Valid")
			 */
		}

	}

	@Keyword
	public void createWasteGenerationMeterReadingTrial(String sheetName,int rowNum) throws IOException, InterruptedException {

		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "wastegeneration1", rowNum)
		String reading2  = data.getCellData(sheetName, "wastegeneration2", rowNum)
		String reading3  = data.getCellData(sheetName, "wastegeneration3", rowNum)
		String reading4  = data.getCellData(sheetName, "wastegeneration4", rowNum)
		String reading5  = data.getCellData(sheetName, "wastegeneration5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Waste'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/GwAddYear'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/GwAddYear'))
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/CWTextboxValue1'),2)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue1'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue2'), reading2)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue3'), reading3)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue4'), reading4)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/CWTextboxValue5'), reading5)
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int count = 1; count<=5; count++){
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		(1..5).each{
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		}

		//waste diversion
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Waste'))
		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.scrollToElement(findTestObject('DataInput/CityCom/ScrollToTextWasteDiversion'), 3)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DwAddYear'),2)
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/DwAddYear'), 4)
		WebUI.click(findTestObject('DataInput/CityCom/DwAddYear'))
		//WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DPreviousYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DPreviousYear'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/DNextButton'),2)
		WebUI.click(findTestObject('DataInput/CityCom/DNextButton'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue1'), "80")
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue2'), "70")
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue3'), "60")
		WebUI.sendKeys(findTestObject('DataInput/CityCom/dWTextboxValue4'), "50")
		//WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		for(int count = 6; count<=9; count++){
			//WebUI.delay(4)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
		(6..9).each{
			WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CityCom/DeleteButton',[index: it]), 60)
		}

	}


	@Keyword
	public void createTransportReading(String sheetName, int rowNum) throws IOException, InterruptedException{
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "TReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "TReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "TReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "TReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "TReading5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Transportation'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 4)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/button_Add Year'),GlobalVariable.minAngularWait )
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/button_Add Year'),GlobalVariable.minAngularWait )
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/button_Next Year'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/button_Next Year'), GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Next Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue3'), reading3)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue4'), reading4)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue5'), reading5)
		for(int count = 1; count<=5; count++){
			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			//WebUI.delay(6)
		}
		//WebUI.delay(6)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.refresh()
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue1'),"value"),reading1,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"),reading2,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue3'),"value"),reading3,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue4'),"value"),reading4,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue5'),"value"),reading5,"Not Valid")
	}


	@Keyword
	public void createTransportPrev(String sheetName, int rowNum1) throws IOException, InterruptedException{
		/*************************Reading data from excel sheet ************************************/

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)
		String VMTPercapita  = data.getCellData(sheetName, "VMTPercapita", rowNum)
		String zero="0";
		if(VMTPercapita.equals(zero))
		{
			KeywordUtil.markPassed("Transportation Meter is not required")
		}
		else
		{
			WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/span_Transportation'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 4)
			WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
			WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue2'), VMTPercapita)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		}

	}
	@Keyword
	public void createTransportReadingTrial(String sheetName, int rowNum) throws IOException, InterruptedException{
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "TReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "TReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "TReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "TReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "TReading5", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 */
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/span_Transportation'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Transportation'))
		//WebUI.delay(10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Add Year'), 4)
		WebUI.click(findTestObject('DataInput/CityCom/button_Add Year'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/button_Add Year'), GlobalVariable.minAngularWait)
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/button_Next Year'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Next Year'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Next Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/button_Previous Year'),2)
		WebUI.click(findTestObject('DataInput/CityCom/button_Previous Year'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue3'), reading3)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue4'), reading4)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/TextboxValue5'), reading5)
		for(int count = 1; count<=5; count++){
			//WebUI.delay(3)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			//WebUI.delay(6)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}

	}


	@Keyword
	public void createHumanExpMeterReading(String sheetName, int rowNum)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait) 
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Human Experience'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/EducationAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/EducationAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EducationAddYear'),GlobalVariable.minAngularWait )
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddYear'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EducationAddYear'),GlobalVariable.minAngularWait )
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EducationAddPrevYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/BachelorAddYear'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddYear'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/BachelorAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/BachelorAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/BachelorAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddPrevYear'),5)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue3'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue4'), reading2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EquAddYear'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddYear'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EquAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/EquAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/EquAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddPrevYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue5'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue6'), reading2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/GiniAddYear'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/GiniAddYear'))
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/GiniAddYear'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/GiniAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue7'), reading3)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue8'), reading4)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/ProsperityAddYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/ProsperityAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue9'), reading5)

		for(int count = 1; count<=9; count++){
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue1'),"value"), reading1,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"),reading2,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue3'),"value"),reading1,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue4'),"value"),reading2,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue5'),"value"),reading1,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue6'),"value"),reading2,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue7'),"value"),reading3,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue8'),"value"),reading4,"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue9'),"value"),reading5,"Not Valid")
	}



	@Keyword
	public void createHumanExpMeterAQI(String sheetName, int rowNum1)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)
		String MedianAQI  = data.getCellData(sheetName, "MedianAQI", rowNum)
		String AQIDaysUnhealthy  = data.getCellData(sheetName, "AQIDaysUnhealthy", rowNum)

		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/Health_Add Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/Health_Add Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/Exp/Health_Previous Year'),2)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/Health_Previous Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/Health_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Exp/AQIDays_Add Year'),10)
		WebUI.waitForElementPresent(findTestObject('DataInput/Exp/AQIDays_Add Year'), 30)
		WebUI.waitForElementVisible(findTestObject('DataInput/Exp/AQIDays_Add Year'), 30)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/AQIDays_Add Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/AQIDays_Add Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Exp/AQIDays_Previous Year'),5)
		WebUI.waitForElementPresent(findTestObject('DataInput/Exp/AQIDays_Previous Year'), 30)
		WebUI.waitForElementVisible(findTestObject('DataInput/Exp/AQIDays_Previous Year'), 30)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/AQIDays_Previous Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/AQIDays_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		String zero="0";
		if(MedianAQI.equals(zero))
		{
			KeywordUtil.markPassed("Human Experience Median AQI Meter is not required")
		}
		else
		{
			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue14'), MedianAQI)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue16'), AQIDaysUnhealthy)

			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton14'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton14'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton16'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton16'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		}
	}

	@Keyword
	public void createHumanExpMeterHighSchool(String sheetName, int rowNum1)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		/***************HighSchool and Bachelors ******************************************/
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Human Experience'))
		//WebUI.delay(5)
		WebUI.waitForPageLoad(10)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EducationAddYear'), 60)

		WebUI.click(findTestObject('DataInput/CityCom/EducationAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EducationAddPrevYear'),2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EducationAddPrevYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/BachelorAddYear'),60)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/BachelorAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/BachelorAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddPrevYear'),5)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/BachelorAddPrevYear'),60)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String srowNum = data.getCellData(sheetName,"rowNum",2)
		int rowNum = Integer.parseInt(srowNum)
		String HighSchool  = data.getCellData(sheetName, "HighSchool", rowNum)
		String Bachelors  = data.getCellData(sheetName, "Bachelors", rowNum)


		String zero="0";
		if(HighSchool.equals(zero))
		{
			KeywordUtil.markPassed("Human Experience HighSchool Bachelors Meter is not required")
		}
		else
		{
			WebUI.setText(findTestObject('DataInput/CityCom/HTextboxValue2'), HighSchool)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue4'), Bachelors)

			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton2'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton2'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton4'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton4'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		}
	}

	@Keyword
	public void createHumanExpMeterGini(String sheetName, int rowNum1)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)
		String Gini  = data.getCellData(sheetName, "Gini", rowNum)
		String Housingaffordability  = data.getCellData(sheetName, "Housingaffordability", rowNum)

		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EquAddYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/EquAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/EquAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddPrevYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EquAddPrevYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/CityCom/GiniAddYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/GiniAddYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/GiniAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/GiniAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		String zero="0";
		if(Gini.equals(zero))
		{
			KeywordUtil.markPassed("Human Experience Ginis Meter is not required")
		}
		else
		{
			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue6'), Housingaffordability)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue8'), Gini)

			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton6'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton6'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton8'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton8'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		}
	}

	@Keyword
	public void createHumanExpMeterHProsUnemployment(String sheetName, int rowNum1)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)
		String hprosUnemployment  = data.getCellData(sheetName, "HProsUnemployment", rowNum)
		String MedianHouseholdIncome  = data.getCellData(sheetName, "MedianHouseholdIncome", rowNum)



		WebUI.scrollToElement(findTestObject('DataInput/CityCom/ProsperityAddYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/ProsperityAddYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/ProsperityAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/CityCom/ProsperityAddPrevYear'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/ProsperityAddPrevYear'), 60)
		WebUI.click(findTestObject('DataInput/CityCom/ProsperityAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Exp/Unemployment_Add Year'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/Unemployment_Add Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/Unemployment_Add Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Exp/Unemployment_Previous Year'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/Unemployment_Previous Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/Unemployment_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		String zero="0";
		if(MedianHouseholdIncome.equals(zero))
		{
			KeywordUtil.markPassed("Human Experience pros Unemployment and MedianHouse Income Meter is not required")
		}
		else
		{

			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue10'), MedianHouseholdIncome)
			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue12'), hprosUnemployment)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton10'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton10'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton12'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton12'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		}
	}

	@Keyword
	public void createHumanExpMeterCrime(String sheetName, int rowNum1)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/

		String srowNum = data.getCellData(sheetName, "rowNum", 2)
		int rowNum = Integer.parseInt(srowNum)
		String violentCrime  = data.getCellData(sheetName, "ViolentCrime", rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/Exp/Crime_Add Year'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/Crime_Add Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/Crime_Add Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Exp/Crime_Previous Year'), 2)
		WebUI.waitForElementClickable(findTestObject('DataInput/Exp/Crime_Previous Year'), 60)
		WebUI.click(findTestObject('DataInput/Exp/Crime_Previous Year'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		String zero="0";
		if(violentCrime.equals(zero))
		{
			KeywordUtil.markPassed("Human Experience pros Unemployment and MedianHouse Income Meter is not required")
		}
		else
		{


			WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue18'), violentCrime)
			WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/SaveButton18'),60)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton18'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)

		}
	}





	@Keyword
	public void createHumanExpMeterReadingTrial(String sheetName, int rowNum)throws IOException, InterruptedException {
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)*/
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Human Experience'))
		//WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/CityCom/EducationAddYear'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddYear'))
		//WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EducationAddPrevYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), reading1)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), reading2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/BachelorAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/BachelorAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddPrevYear'),5)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue3'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue4'), reading2)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/EquAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/EquAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddPrevYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue5'), reading1)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue6'), reading2)
		WebUI.click(findTestObject('DataInput/CityCom/GiniAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 20)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/GiniAddPrevYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/GiniAddPrevYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue7'), reading3)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue8'), reading4)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/ProsperityAddYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/ProsperityAddYear'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue9'), reading5)

		for(int count = 1; count<=9; count++){
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		}
	}




	@Keyword
	public void humanExpMeterReading()throws IOException, InterruptedException {
		/*************************Refresh Issue: Entered Data is displays up to 16 position after the refresh.************************************/
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CityCom/span_Human Experience'))
		WebUI.delay(5)
		//WebUI.waitForPageLoad(10)
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddYear'))
		WebUI.delay(8)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EducationAddPrevYear'),2)
		WebUI.click(findTestObject('DataInput/CityCom/EducationAddPrevYear'))
		WebUI.delay(5)
		//WebUI.waitForPageLoad(10)
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue1'), '7')
		WebUI.setText(findTestObject('DataInput/CityCom/TextboxValue2'), '14')
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddYear'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/BachelorAddPrevYear'),5)
		WebUI.click(findTestObject('DataInput/CityCom/BachelorAddPrevYear'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue3'), '21')
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue4'), '28')
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddYear'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('DataInput/CityCom/EquAddPrevYear'), 2)
		WebUI.click(findTestObject('DataInput/CityCom/EquAddPrevYear'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue5'), '70')
		WebUI.sendKeys(findTestObject('DataInput/CityCom/HTextboxValue6'), '77')
		for(int count = 1; count<=6; count++){
			WebUI.delay(4)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.delay(6)
		}

		WebUI.delay(6)
		WebUI.refresh()
		WebUI.delay(10)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue1'),"value"), '7',"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/TextboxValue2'),"value"),'14',"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue3'),"value"),'21',"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue4'),"value"),'28',"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue5'),"value"),'70',"Not Valid")
		Assert.assertEquals(WebUI.getAttribute(findTestObject('DataInput/CityCom/HTextboxValue6'),"value"),'77',"Not Valid")
	}



	@Keyword
	public void createADMeterReading(String sheetName, int rowNum) throws IOException, InterruptedException {
		WebUI.delay(1)
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "ADeatailsValueReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "ADeatailsValueReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "ADeatailsValueReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "ADeatailsValueReading4", rowNum)
		String ureading1  = data.getCellData(sheetName, "ADeatailsUnitReading1", rowNum)
		String ureading2  = data.getCellData(sheetName, "ADeatailsUnitReading2", rowNum)
		String ureading3  = data.getCellData(sheetName, "ADeatailsUnitReading3", rowNum)
		String ureading4  = data.getCellData(sheetName, "ADeatailsUnitReading4", rowNum)

		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(9)*/
		WebUI.click(findTestObject('DataInput/CityCom/a_ Data Input'))
		//WebUI.delay(9)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('DataInput/CityCom/span_Additional Data'))
		//WebUI.delay(9)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		for(int count =1 ;count<=4;count++ ) {
			WebUI.click(findTestObject('BasePoint/CityCom/ClickDropdown'))
			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.scrollToElement(findTestObject('BasePoint/CityCom/Option'+count),10)
			//WebUI.delay(2)
			WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
			WebUI.click(findTestObject('BasePoint/CityCom/Option'+count))
			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('BasePoint/CityCom/AddButton'))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			//WebUI.delay(5)
		}
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Avalue1'), reading1)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Aunit1'), ureading1)
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Avalue2'), reading2)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Aunit2'), ureading2)
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Avalue3'), reading3)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Aunit3'), ureading3)
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Avalue4'), reading4)
		WebUI.sendKeys(findTestObject('BasePoint/CityCom/Aunit4'), ureading4)
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		for(int count=1;count<=4;count++) {
			//WebUI.delay(5)
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/CityCom/SaveButton'+count))
			WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
			//WebUI.delay(6)
		}
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.delay(15)
		WebUI.refresh()
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		//WebUI.delay(15)

		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Avalue1'),"value"), reading4,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Avalue2'),"value"),reading3,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Avalue3'),"value"),reading2,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Avalue4'),"value"),reading1,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Aunit1'),"value"),ureading4,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Aunit2'),"value"),ureading3,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Aunit3'),"value"),ureading2,"Not Valid")
		//WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('BasePoint/CityCom/Aunit4'),"value"),ureading1,"Not Valid")
	}

	@Keyword
	public void surveySubmit(String sheetName) throws IOException, InterruptedException, Exception{


		navigation.navigateIntoDataInput()
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		String MainWindowHandle = driver.getWindowHandle()
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(1)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/English'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
		Transferable contents = clipboard.getContents(null)
		String url = (String) contents.getTransferData(DataFlavor.stringFlavor)
		data.setCellData(sheetName, "Url", GlobalVariable.rowNumTwo, url)
		WebUI.delay(2)
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		//To switch to the new tab

		for( int rowNum=2;rowNum<=5;rowNum++)
		{

			String walk1 = data.getCellData(sheetName, "Walk", rowNum)
			String walk2 = data.getCellData(sheetName, "Bus", rowNum)
			String walk3 = data.getCellData(sheetName, "Tram", rowNum)
			String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
			String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
			String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
			String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
			String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
			String name = data.getCellData(sheetName, "Name", rowNum)

			WebUI.switchToWindowIndex(1)
			WebUI.navigateToUrl(url)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.delay(5)

			WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			int it=1;
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
			it++

			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
			it++

			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
			it++
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.delay(3)
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('Object Repository/DataInput/Survey/ExtremelySatisfySpanText'))
			WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
			WebUI.delay(2)

			WebUI.selectOptionByLabel(findTestObject('Object Repository/DataInput/Survey/OccupantTypeSurvey'), "Regular Occupant", false)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			//WebUI.selectOptionByLabel(findTestObject('DataInput/Survey/OccupantType'),'Regular Occupant', false)

			WebUI.click(findTestObject('DataInput/Survey/Submit1'))
			WebUI.waitForElementClickable(findTestObject('DataInput/Survey/Submit'), GlobalVariable.avgAngularWait)

			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.verifyMatch(WebUI.getText(findTestObject('DataInput/Survey/Thank')), "Options that enhance your satisfaction", false)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			println "Survey Submited Successufully"



		}
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
	}


	@Keyword
	public void surveySubmit200(String sheetName) throws IOException, InterruptedException, Exception{


		navigation.navigateIntoDataInput()
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		String MainWindowHandle = driver.getWindowHandle()
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(1)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/English'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
		Transferable contents = clipboard.getContents(null)
		String url = (String) contents.getTransferData(DataFlavor.stringFlavor)
		data.setCellData(sheetName, "Url", GlobalVariable.rowNumTwo, url)
		WebUI.delay(2)
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		//To switch to the new tab

		for( int rowNum=2;rowNum<=200;rowNum++)
		{

			String walk1 = data.getCellData(sheetName, "Walk", 3)
			String walk2 = data.getCellData(sheetName, "Bus", 3)
			String walk3 = data.getCellData(sheetName, "Tram", 3)
			String walk4 = data.getCellData(sheetName, "Heavyrail", 3)
			String walk5 = data.getCellData(sheetName, "Motorcycle", 3)
			String walk6 = data.getCellData(sheetName, "Carsolo", 3)
			String walk7 = data.getCellData(sheetName, "Carpool", 3)
			String walk8 = data.getCellData(sheetName, "Caralternative", 3)
			String name = data.getCellData(sheetName, "Name", 3)

			WebUI.switchToWindowIndex(1)
			WebUI.navigateToUrl(url)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.delay(5)

			WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			int it=1;
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
			it++

			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
			it++

			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
			it++
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.delay(3)
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('Object Repository/DataInput/Survey/ExtremelySatisfySpanText'))
			WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
			WebUI.delay(2)

			WebUI.selectOptionByLabel(findTestObject('Object Repository/DataInput/Survey/OccupantTypeSurvey'), "Regular Occupant", false)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('DataInput/Survey/Submit'), GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/Survey/Submit1'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.verifyMatch(WebUI.getText(findTestObject('DataInput/Survey/Thank')), "Options that enhance your satisfaction", false)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			println "Survey Submited Successufully"



		}
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
	}



	@Keyword
	public void devsurveySubmit(String sheetName) throws IOException, InterruptedException, Exception{
		WebUI.delay(5)
		//WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(12)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.delay(5)
		String MainWindowHandle = driver.getWindowHandle()
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.delay(5)
		for( int rowNum=2;rowNum<=5;rowNum++)
		{
			if(rowNum==2)
			{
				String walk1 = data.getCellData(sheetName, "Walk", rowNum)
				String walk2 = data.getCellData(sheetName, "Bus", rowNum)
				String walk3 = data.getCellData(sheetName, "Tram", rowNum)
				String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
				String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
				String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
				String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
				String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
				String name = data.getCellData(sheetName, "Name", rowNum)

				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_T)
				WebUI.delay(7)
				//To switch to the new tab
				WebUI.switchToWindowIndex(1)
				WebUI.delay(2)
				r.keyPress(KeyEvent.VK_CONTROL)
				r.keyPress(KeyEvent.VK_V)
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_V)
				WebUI.delay(2)
				r.keyPress(KeyEvent.VK_ENTER)
				r.keyRelease(KeyEvent.VK_ENTER)
				WebUI.delay(17)

				WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
				int it=1;
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
				it++

				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
				it++
				WebUI.delay(1)
				WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
				WebUI.delay(4)
				WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),4)

				WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('Object Repository/DataInput/Survey/ExtremelySatisfySpanText'))
				WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
				WebUI.delay(2)
				WebUI.click(findTestObject('DataInput/Survey/Submit1'))
				WebUI.delay(3)
				WebUI.verifyMatch(WebUI.getText(findTestObject('DataInput/Survey/Thank')), "Options that enhance your satisfaction", false)
				WebUI.delay(3)

				println "Survey Submited Successufully"
			}
			else
			{

				String walk1 = data.getCellData(sheetName, "Walk", rowNum)
				String walk2 = data.getCellData(sheetName, "Bus", rowNum)
				String walk3 = data.getCellData(sheetName, "Tram", rowNum)
				String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
				String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
				String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
				String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
				String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
				String name = data.getCellData(sheetName, "Name", rowNum)
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_T)
				WebUI.delay(4)
				WebUI.switchToWindowIndex(2)
				WebUI.delay(3)
				r.keyPress(KeyEvent.VK_CONTROL)
				r.keyPress(KeyEvent.VK_V)
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_V)

				WebUI.delay(2)
				r.keyPress(KeyEvent.VK_ENTER)
				r.keyRelease(KeyEvent.VK_ENTER)
				WebUI.delay(10)
				WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
				int it=1;
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
				WebUI.delay(1)
				it++

				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
				it++
				WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
				it++

				WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
				WebUI.delay(4)

				WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),4)

				WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('Object Repository/DataInput/Survey/ExtremelySatisfySpanText'))
				WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
				WebUI.delay(1)

				WebUI.click(findTestObject('DataInput/Survey/Submit'))
				WebUI.delay(3)
				WebUI.verifyMatch(WebUI.getText(findTestObject('DataInput/Survey/Thank')), "Options that enhance your satisfaction", false)
				WebUI.delay(3)
				println "Survey Submited Successufully"
				WebUI.closeWindowIndex(2)
			}
			WebUI.switchToWindowIndex(0)
		}
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(2)
	}

	@Keyword
	public void surveySubmitVisitor(String sheetName) throws IOException, InterruptedException, Exception{

		navigation.navigateIntoDataInput()

		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		String MainWindowHandle = driver.getWindowHandle()
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(1)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/English'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
		Transferable contents = clipboard.getContents(null)
		String url = (String) contents.getTransferData(DataFlavor.stringFlavor)
		data.setCellData(sheetName, "Url", GlobalVariable.rowNumTwo, url)

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		//To switch to the new tab

		for( int rowNum=2;rowNum<=3;rowNum++)
		{

			String walk1 = data.getCellData(sheetName, "Walk", rowNum)
			String walk2 = data.getCellData(sheetName, "Bus", rowNum)
			String walk3 = data.getCellData(sheetName, "Tram", rowNum)
			String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
			String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
			String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
			String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
			String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
			String name = data.getCellData(sheetName, "Name", rowNum)

			WebUI.switchToWindowIndex(1)
			WebUI.navigateToUrl(url)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.delay(5)

			WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
			WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
			WebUI.delay(2)
			WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			int it=1;
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
			it++

			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
			it++

			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
			it++
			WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
			it++
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.delay(3)
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('Object Repository/DataInput/Survey/ExtremelySatisfySpanText'))
			WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
			WebUI.delay(2)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.selectOptionByLabel(findTestObject('DataInput/Survey/OccupantType'),'Visitor', false)
			WebUI.waitForElementClickable(findTestObject('DataInput/Survey/Submit'), GlobalVariable.avgAngularWait)
			WebUI.click(findTestObject('DataInput/Survey/Submit1'))
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
			WebUI.verifyMatch(WebUI.getText(findTestObject('DataInput/Survey/Thank')), "Options that enhance your satisfaction", false)
			WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

			println "Survey Submited Successufully"
		}
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void surveySubmitDiffLangV3(String sheetName,int rowNum) throws IOException, InterruptedException, Exception{

		String url = data.getCellData(sheetName,"Url", 2)
		String walk1 = data.getCellData(sheetName, "Walk", 2)
		String walk2 = data.getCellData(sheetName, "Bus", 2)
		String walk3 = data.getCellData(sheetName, "Tram", 2)
		String walk4 = data.getCellData(sheetName, "Heavyrail", 2)
		String walk5 = data.getCellData(sheetName, "Motorcycle", 2)
		String walk6 = data.getCellData(sheetName, "Carsolo", 2)
		String walk7 = data.getCellData(sheetName, "Carpool", 2)
		String walk8 = data.getCellData(sheetName, "Caralternative", 2)
		String name = data.getCellData(sheetName, "Name", 2)

		String surveylang = data.getCellData(sheetName,"surveylang", rowNum)
		String surveyType = data.getCellData(sheetName,"surveyType", rowNum)

		WebUI.switchToWindowIndex(1)
		WebUI.navigateToUrl(url)
		WebUI.delay(2)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.waitForElementVisible(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.scrollToElement(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.waitForElementClickable(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.selectOptionByLabel(findTestObject('dataInputNewUI/Survey/AllLang'),surveylang, false)

		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		int it=1;
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
		it++

		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
		it++

		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
		it++
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),5)

		if(surveylang=='French'||surveylang=='Portuguese'||surveylang=='Chinese'){
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('dataInputNewUI/Survey/ExtremelySatisfySpanText'))

		}
		else{
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('dataInputNewUI/Survey/ExtremelyUnsatisfied'))

		}

		WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
		markAllCheckbox()

		WebUI.selectOptionByLabel(findTestObject('Object Repository/DataInput/Survey/OccupantTypeSurvey'), surveyType, false)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('dataInputNewUI/Survey/Submit1'))
		WebUI.waitForElementPresent(findTestObject('dataInputNewUI/Survey/Welcome'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('dataInputNewUI/Survey/Welcome'), GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.switchToWindowIndex(0)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
	}

	@Keyword
	public void surveySubmitDiffLangLV3(String sheetName,int rowNum) throws IOException, InterruptedException, Exception{

		String url = data.getCellData(sheetName,"V2Url", 2)
		String walk1 = data.getCellData(sheetName, "Walk", 2)
		String walk2 = data.getCellData(sheetName, "Bus", 2)
		String walk3 = data.getCellData(sheetName, "Tram", 2)
		String walk4 = data.getCellData(sheetName, "Heavyrail", 2)
		String walk5 = data.getCellData(sheetName, "Motorcycle", 2)
		String walk6 = data.getCellData(sheetName, "Carsolo", 2)
		String walk7 = data.getCellData(sheetName, "Carpool", 2)
		String walk8 = data.getCellData(sheetName, "Caralternative", 2)
		String name = data.getCellData(sheetName, "Name", 2)

		String surveylang = data.getCellData(sheetName,"surveylang", rowNum)
		String surveyType = data.getCellData(sheetName,"surveyType", rowNum)

		WebUI.switchToWindowIndex(1)
		WebUI.navigateToUrl(url)
		WebUI.delay(2)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.waitForElementVisible(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.scrollToElement(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.waitForElementClickable(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.selectOptionByLabel(findTestObject('dataInputNewUI/Survey/AllLang'),surveylang, false)

		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		int it=1;
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
		it++

		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
		it++

		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
		it++
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),10)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),5)

		WebUI.scrollToElement(findTestObject('dataInputNewUI/Survey/ExtremelySatisfySpanText'),5)
		WebUI.scrollToElement(findTestObject('dataInputNewUI/Survey/ExtremelyUnsatisfied'),5)

		if(surveylang=='French'||surveylang=='Portuguese'||surveylang=='Chinese'){
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('dataInputNewUI/Survey/ExtremelySatisfySpanText'))

		}
		else{
			WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('dataInputNewUI/Survey/ExtremelyUnsatisfied'))

		}
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Survey/survey_tenant_name'),5)
		WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
		markAllCheckbox()

		WebUI.selectOptionByLabel(findTestObject('Object Repository/DataInput/Survey/OccupantTypeSurvey'), surveyType, false)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('dataInputNewUI/Survey/Submit1'))
		WebUI.waitForElementPresent(findTestObject('dataInputNewUI/Survey/Welcome'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('dataInputNewUI/Survey/Welcome'), GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.switchToWindowIndex(0)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
	}


	@Keyword
	public void surveySubmitDiffLangV2(String sheetName,int rowNum) throws IOException, InterruptedException, Exception{


		String url = data.getCellData(sheetName,"V2Url", 2)
		String walk1 = data.getCellData(sheetName, "Walk", 2)
		String walk2 = data.getCellData(sheetName, "Bus", 2)
		String walk3 = data.getCellData(sheetName, "Tram", 2)
		String walk4 = data.getCellData(sheetName, "Heavyrail", 2)
		String walk5 = data.getCellData(sheetName, "Motorcycle", 2)
		String walk6 = data.getCellData(sheetName, "Carsolo", 2)
		String walk7 = data.getCellData(sheetName, "Carpool", 2)
		String walk8 = data.getCellData(sheetName, "Caralternative", 2)
		String name = data.getCellData(sheetName, "Name", 2)

		String surveylang = data.getCellData(sheetName,"surveylang", rowNum)

		WebUI.switchToWindowIndex(1)
		WebUI.navigateToUrl(url)
		WebUI.delay(2)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Survey/WalkR1'),20)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/WalkR1'),20)

		boolean surveyAccept = WebUI.verifyElementVisible(findTestObject('DataInput/Survey/ACCEPTANDCLOSE'),FailureHandling.OPTIONAL)
		println surveyAccept
		if((surveyAccept==true)){
			WebUI.click(findTestObject('DataInput/Survey/ACCEPTANDCLOSE'))
		}

		WebUI.selectOptionByLabel(findTestObject('dataInputNewUI/SurveyV2/SurveyDropdownLang'),surveylang, false)

		WebUI.scrollToElement(findTestObject('DataInput/Survey/WalkR1'), 10)
		WebUI.setText(findTestObject('DataInput/Survey/WalkR1'), walk1)
		WebUI.setText(findTestObject('DataInput/Survey/BusR1'), walk2)
		WebUI.setText(findTestObject('DataInput/Survey/TramR1'), walk3)
		WebUI.setText(findTestObject('DataInput/Survey/HeavyRailR1'), walk4)
		WebUI.setText(findTestObject('DataInput/Survey/MotorcycleR1'), walk5)
		WebUI.setText(findTestObject('DataInput/Survey/carSoloR1'), walk6)
		WebUI.setText(findTestObject('DataInput/Survey/car23R1'), walk7)
		WebUI.setText(findTestObject('DataInput/Survey/cars4R1'), walk8)

		WebUI.scrollToElement(findTestObject('dataInputNewUI/SurveyV2/Sider'),3)

		if(surveylang=='French'||surveylang=='Portuguese'||surveylang=='Chinese'){
			WebUI.dragAndDropToObject(findTestObject('dataInputNewUI/SurveyV2/Sider'), findTestObject('dataInputNewUI/SurveyV2/ExtremelySatisfySpanText'))

		}

		else{
			WebUI.dragAndDropToObject(findTestObject('dataInputNewUI/SurveyV2/Sider'), findTestObject('dataInputNewUI/SurveyV2/ExtremelyUnsatisfied'))
			markAllCheckboxV2()
		}
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.scrollToElement(findTestObject('dataInputNewUI/SurveyV2/Submit1'),3)
		WebUI.click(findTestObject('dataInputNewUI/SurveyV2/Submit1'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'),20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'),20)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'))
		WebUI.waitForPageLoad(GlobalVariable.timeOut)

		WebUI.waitForElementPresent(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'), 30)
		WebUI.waitForElementVisible(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/clickOnLogin'), 10)
		println "Survey Submited Successufully"

		WebUI.switchToWindowIndex(0)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)


	}

	public void markAllCheckboxV2(){

		WebUI.scrollToElement(findTestObject('dataInputNewUI/SurveyV2/checkbox_glare'),10)

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/checkbox_glare'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/checkbox_privacy'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Cold_checkbox_dark'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Dirty_checkbox_smelly'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Extremely Satisfied_chec'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Hot_checkbox_cold'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Loud_checkbox_hot'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Smelly_checkbox_stuffy'))

		WebUI.check(findTestObject('dataInputNewUI/SurveyV2/Stuffy_checkbox_loud'))


	}
	@Keyword
	public void openNewTab() throws IOException, InterruptedException, Exception{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.delay(3)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void surveyLanguageCopySurveyLink(){

		navigation.navigateIntoDataInput()
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/CopySurveyLink'),10)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		verifySurveyLang()
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))

	}

	@Keyword
	public void surveyLanguageCopySurveyLinkLEED(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey1'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey1'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(1)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/English'), GlobalVariable.minAngularWait)
		verifySurveyLang()


	}
	public void verifySurveyLang(){

		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Language/span_English'),5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Language/span_English'),4)
		String english =WebUI.getText(findTestObject('Object Repository/DataInput/Language/span_English'))
		String french =WebUI.getText(findTestObject('Object Repository/DataInput/Language/span_French'))
		String port =WebUI.getText(findTestObject('Object Repository/DataInput/Language/span_Portuguese'))
		String german =WebUI.getText(findTestObject('Object Repository/DataInput/Language/span_German'))
		String spanish =WebUI.getText(findTestObject('Object Repository/DataInput/Language/span_Spanish'))
		String chinese =WebUI.getText(findTestObject('Object Repository/DataInput/Language/span_Chinese'))
		String swidesh =WebUI.getText(findTestObject('DataInput/Language/span_Swidish'))

		WebUI.verifyMatch(english,'English', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(french,'French', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(port, 'Portuguese', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(german, 'German', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(spanish, 'Spanish', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(chinese, 'Chinese', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(swidesh, 'Swedish', false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	public void everifySurveyLang(){

		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Language1/span_English'),5)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Language1/span_English'),4)

		String english =WebUI.getText(findTestObject('Object Repository/DataInput/Language1/span_English'))
		String french =WebUI.getText(findTestObject('Object Repository/DataInput/Language1/span_French'))
		String port =WebUI.getText(findTestObject('Object Repository/DataInput/Language1/span_Portuguese'))
		String german =WebUI.getText(findTestObject('Object Repository/DataInput/Language1/span_German'))
		String spanish =WebUI.getText(findTestObject('Object Repository/DataInput/Language1/span_Spanish'))
		String chinese =WebUI.getText(findTestObject('Object Repository/DataInput/Language1/span_Chinese'))
		String swidesh =WebUI.getText(findTestObject('DataInput/Language1/span_Swidish'))

		WebUI.verifyMatch(english,'English', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(french,'French', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(port, 'Portuguese', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(german, 'German', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(spanish, 'Spanish', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(chinese, 'Chinese', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(swidesh, 'Swedish', false, FailureHandling.CONTINUE_ON_FAILURE)

	}


	public void markAllCheckbox(){
		/****************Code to marked all Check Box**************************************************/
		WebUI.scrollToElement(findTestObject('dataInputNewUI/Survey/checkbox'), 5)
		int length1 = driver.findElements(By.xpath("//*[@class='checkbox']")).size();
		int length = length1 - 1
		println length
		WebElement ele = null;
		for (int i = 1; i < length; i++) {
			ele = driver.findElement(By.xpath("(//*[@class='checkbox']/input)"+[i]));
			if (!ele.isSelected())
				ele.click();
			WebUI.waitForAngularLoad(5,FailureHandling.OPTIONAL)

		}



	}


	@Keyword
	public void surveySubmitDifferentLang(String sheetName, int rowNum1) throws IOException, InterruptedException, Exception{
		int rowNum=2;
		Robot r = new Robot()
		String walk1 = data.getCellData(sheetName, "Walk", rowNum)
		String walk2 = data.getCellData(sheetName, "Bus", rowNum)
		String walk3 = data.getCellData(sheetName, "Tram", rowNum)
		String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
		String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
		String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
		String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
		String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
		//	String name = data.getCellData(sheetName, "Name", rowNum)
		String languageRespecitive = data.getCellData(sheetName, "Thanku", rowNum1)
		WebUI.delay(1)
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_T)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)

		WebUI.delay(4)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(1)
		r.keyPress(KeyEvent.VK_CONTROL)
		r.keyPress(KeyEvent.VK_V)
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_V)
		WebUI.delay(4)
		r.keyPress(KeyEvent.VK_ENTER)
		r.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(5)

		WebUI.scrollToElement(findTestObject('DataInput/Survey/WalkR1'),10)
		WebUI.setText(findTestObject('DataInput/Survey/WalkR1'), walk1)
		WebUI.setText(findTestObject('DataInput/Survey/BusR1'), walk2)
		WebUI.setText(findTestObject('DataInput/Survey/TramR1'), walk3)
		WebUI.setText(findTestObject('DataInput/Survey/HeavyRailR1'), walk4)
		WebUI.setText(findTestObject('DataInput/Survey/MotorcycleR1'), walk5)
		WebUI.setText(findTestObject('DataInput/Survey/carSoloR1'), walk6)
		WebUI.setText(findTestObject('DataInput/Survey/car23R1'), walk7)
		WebUI.setText(findTestObject('DataInput/Survey/cars4R1'), walk8)
		WebUI.click(findTestObject('DataInput/Survey/ACCEPTANDCLOSE'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		/*	WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'),name)
		 WebUI.delay(2)
		 */	WebUI.click(findTestObject('DataInput/Survey/Submit'))
		WebUI.delay(3)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/Thank'), 20)
		String ulanguageRespecitive = WebUI.getText(findTestObject('DataInput/Survey/ThankuLanguage'))
		WebUI.verifyMatch(languageRespecitive, languageRespecitive, false, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'))
		WebUI.delay(3)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		println "Survey Submited Successufully"
		WebUI.verifyTextPresent("Your World is Alive!", false, FailureHandling.STOP_ON_FAILURE)
		WebUI.verifyTextPresent(sheetName, false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}




	@Keyword
	public void surveyLanguageEmail(){
		navigation.navigateIntoDataInput()
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/CopySurveyLink'),10)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.waitForElementPresent(findTestObject('DataInput/Language/button_Email Survey'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/Language/button_Email Survey'), 20)
		WebUI.mouseOver(findTestObject('DataInput/Language/button_Email Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		everifySurveyLang()
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
	}

	@Keyword
	public void surveyLanguageEmailLEED(){
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey1'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey1'))
		WebUI.delay(2)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/CopySurveyLink'),10)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(2)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Language/button_Email Survey'), 20)
		WebUI.waitForElementVisible(findTestObject('DataInput/Language/button_Email Survey'), 20)
		WebUI.mouseOver(findTestObject('DataInput/Language/button_Email Survey'))
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		everifySurveyLang()
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey1'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey1'))
	}


	@Keyword
	public void surveySubmitTr(String sheetName) throws IOException, InterruptedException, Exception{
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/div_Transportation Survey'), 40)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/CopySurveyLink'), 20)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'), 20)
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/Survey/ClickOnSurveyDropDown'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.delay(1)
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/English'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
		Transferable contents = clipboard.getContents(null)
		String url = (String) contents.getTransferData(DataFlavor.stringFlavor)
		data.setCellData(sheetName, "V2Url", GlobalVariable.rowNumTwo,url)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		Robot r = new Robot()
		for( int rowNum=2;rowNum<=5;rowNum++)
		{

			if(rowNum==2)
			{
				String walk1 = data.getCellData(sheetName, "Walk", rowNum)
				String walk2 = data.getCellData(sheetName, "Bus", rowNum)
				String walk3 = data.getCellData(sheetName, "Tram", rowNum)
				String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
				String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
				String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
				String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
				String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
				String name = data.getCellData(sheetName, "Name", rowNum)

				r.keyPress(KeyEvent.VK_CONTROL);
				r.keyPress(KeyEvent.VK_T);
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_T)
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

				r.keyPress(KeyEvent.VK_CONTROL)
				r.keyPress(KeyEvent.VK_V)
				r.keyRelease(KeyEvent.VK_CONTROL)
				r.keyRelease(KeyEvent.VK_V)
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				r.keyPress(KeyEvent.VK_ENTER)
				r.keyRelease(KeyEvent.VK_ENTER)
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.switchToWindowIndex(1)
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

				WebUI.scrollToElement(findTestObject('DataInput/Survey/WalkR1'), 10)
				WebUI.setText(findTestObject('DataInput/Survey/WalkR1'), walk1)
				WebUI.setText(findTestObject('DataInput/Survey/BusR1'), walk2)
				WebUI.setText(findTestObject('DataInput/Survey/TramR1'), walk3)
				WebUI.setText(findTestObject('DataInput/Survey/HeavyRailR1'), walk4)
				WebUI.setText(findTestObject('DataInput/Survey/MotorcycleR1'), walk5)
				WebUI.setText(findTestObject('DataInput/Survey/carSoloR1'), walk6)
				WebUI.setText(findTestObject('DataInput/Survey/car23R1'), walk7)
				WebUI.setText(findTestObject('DataInput/Survey/cars4R1'), walk8)

				boolean surveyAccept = WebUI.verifyElementVisible(findTestObject('DataInput/Survey/ACCEPTANDCLOSE'),FailureHandling.OPTIONAL)
				println surveyAccept
				if((surveyAccept)){
					WebUI.click(findTestObject('DataInput/Survey/ACCEPTANDCLOSE'))
				}
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.click(findTestObject('DataInput/Survey/Submit'))
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'), 20)
				WebUI.click(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'))
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.timeOut)
				println "Survey Submited Successufully"
				//WebUI.verifyElementVisible(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/YourWorldIsAliveText'), FailureHandling.CONTINUE_ON_FAILURE)
				/*WebUI.closeWindowIndex(1)
				 WebUI.switchToWindowIndex(0)*/
			}
			else
			{

				String walk1 = data.getCellData(sheetName, "Walk", rowNum)
				String walk2 = data.getCellData(sheetName, "Bus", rowNum)
				String walk3 = data.getCellData(sheetName, "Tram", rowNum)
				String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
				String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
				String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
				String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
				String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
				String name = data.getCellData(sheetName, "Name", rowNum)

				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.navigateToUrl(url)
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)

				WebUI.scrollToElement(findTestObject('DataInput/Survey/WalkR1'), 10)
				WebUI.setText(findTestObject('DataInput/Survey/WalkR1'), walk1)
				WebUI.setText(findTestObject('DataInput/Survey/BusR1'), walk2)
				WebUI.setText(findTestObject('DataInput/Survey/TramR1'), walk3)
				WebUI.setText(findTestObject('DataInput/Survey/HeavyRailR1'),walk4)
				WebUI.setText(findTestObject('DataInput/Survey/MotorcycleR1'), walk5)
				WebUI.setText(findTestObject('DataInput/Survey/carSoloR1'), walk6)
				WebUI.setText(findTestObject('DataInput/Survey/car23R1'), walk7)
				WebUI.setText(findTestObject('DataInput/Survey/cars4R1'), walk8)
				//WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
				WebUI.click(findTestObject('DataInput/Survey/Submit'))
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'), 20)
				WebUI.click(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'))
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				WebUI.waitForPageLoad(GlobalVariable.timeOut)
				WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
				println "Survey Submited Successufully"

			}

		}
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)

	}
	@Keyword
	public void surveySubmitOneTime(String sheetName ,int rowNum) throws IOException, InterruptedException, Exception{
		WebUI.delay(8)
		//WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(12)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.delay(5)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/CopySurveyLink'), 20)
		WebUI.click(findTestObject('DataInput/Survey/CopySurveyLink'))
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Survey/English'))
		WebUI.delay(2)
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard()
		Transferable contents = clipboard.getContents(null)
		String url = (String) contents.getTransferData(DataFlavor.stringFlavor)
		data.setCellData(sheetName, "Url", GlobalVariable.rowNumTwo, url)
		WebUI.delay(6)
		Robot r = new Robot()
		String walk1 = data.getCellData(sheetName, "Walk", rowNum)
		String walk2 = data.getCellData(sheetName, "Bus", rowNum)
		String walk3 = data.getCellData(sheetName, "Tram", rowNum)
		String walk4 = data.getCellData(sheetName, "Heavyrail", rowNum)
		String walk5 = data.getCellData(sheetName, "Motorcycle", rowNum)
		String walk6 = data.getCellData(sheetName, "Carsolo", rowNum)
		String walk7 = data.getCellData(sheetName, "Carpool", rowNum)
		String walk8 = data.getCellData(sheetName, "Caralternative", rowNum)
		String name = data.getCellData(sheetName, "Name", rowNum)
		WebUI.delay(2)
		((JavascriptExecutor)driver).executeScript('window.open("");')
		WebUI.delay(4)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(2)
		WebUI.navigateToUrl(url)

		WebUI.scrollToElement(findTestObject('DataInput/Survey/WalkR1'), 10)
		WebUI.setText(findTestObject('DataInput/Survey/WalkR1'), walk1)
		WebUI.setText(findTestObject('DataInput/Survey/BusR1'), walk2)
		WebUI.setText(findTestObject('DataInput/Survey/TramR1'), walk3)
		WebUI.setText(findTestObject('DataInput/Survey/HeavyRailR1'), walk4)
		WebUI.setText(findTestObject('DataInput/Survey/MotorcycleR1'), walk5)
		WebUI.setText(findTestObject('DataInput/Survey/carSoloR1'), walk6)
		WebUI.setText(findTestObject('DataInput/Survey/car23R1'), walk7)
		WebUI.setText(findTestObject('DataInput/Survey/cars4R1'), walk8)
		WebUI.click(findTestObject('DataInput/Survey/ACCEPTANDCLOSE'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		//WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/Survey/Submit'))
		WebUI.delay(3)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'), 20)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/ReloadSurvey'))
		WebUI.delay(3)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		println "Survey Submited Successufully"
		//WebUI.verifyElementVisible(findTestObject('Object Repository/LoginArc/Page_Arc Skoru  Sustainability perf/YourWorldIsAliveText'), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)

	}




	@Keyword
	public void percentageSurveyResponseRateCalculationTransit() throws IOException, InterruptedException, Exception{

		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Project'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('Manage/Project/WeightedOccupancy'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Manage/Project/WeightedOccupancy'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Manage/Project/WeightedOccupancy'), 10)
		String projectoccupancy = WebUI.getAttribute(findTestObject('Manage/Project/WeightedOccupancy'),'value')
		double projectOccupancy= Double.parseDouble(projectoccupancy)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.delay(5)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'), GlobalVariable.maxAngularWait)
		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)

		/******Verify that survey response rate% is calculated on the basis of the following formula [ Response %ge = (No. of responses/Occupancy)*100 ] . Always count the no of responses by counting the no of rows of transport survey results.*****/
		String surveyResponsePercentage = WebUI.getText(findTestObject('DataInput/Survey/SurveyResponsePercentage'))
		String surveyResponsepercentage1 = surveyResponsePercentage.replace("%","")
		String surveyResponsepercentage = surveyResponsepercentage1.replaceAll("\\s","")
		double surveyresponsepercentage= Double.parseDouble(surveyResponsepercentage)
		println surveyResponsepercentage

		double calculatedresponsePecentage = (4/projectOccupancy)*100

		BigDecimal responsePecentage = new BigDecimal(calculatedresponsePecentage)
		responsePecentage = responsePecentage.setScale(2,RoundingMode.HALF_UP)
		String responsePecentageTr = Double.toString(responsePecentage)
		println responsePecentageTr

		WebUI.verifyMatch(responsePecentageTr, surveyResponsepercentage, false)
		/******Verify that survey response rate% is calculated on the basis of the following formula [ Response %ge = (No. of responses/Occupancy)*100 ] . Always count the no of responses by counting the no of rows of HUMAN EXPERIENCE survey results.*****/
		WebUI.click(findTestObject('DataInput/Survey/OccupantSatisfactionSurv'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.maxAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.maxAngularWait)

		String humsurveyResponsePercentage = WebUI.getText(findTestObject('DataInput/Survey/SurveyResponsePercentage'))
		String humsurveyResponsepercentage1 = surveyResponsePercentage.replace("%" ,"")
		String humsurveyResponsepercentage = humsurveyResponsepercentage1.replaceAll("\\s","")

		print humsurveyResponsepercentage
		double humsurveyresponsepercentage= Double.parseDouble(humsurveyResponsepercentage)

		double humcalculatedresponsePecentage = (4/projectOccupancy)*100
		BigDecimal responsePecentagehum = new BigDecimal(calculatedresponsePecentage)
		responsePecentagehum = responsePecentagehum.setScale(2, RoundingMode.HALF_UP)
		String responsePecentagehu = Double.toString(responsePecentage)

		Assert.assertEquals(responsePecentagehu,humsurveyResponsepercentage)
		/***************Verify that survey response rate percentage is same in Transport and HE tabs.***********************************/
		WebUI.verifyMatch(humsurveyResponsePercentage, surveyResponsePercentage, false)

	}

	@Keyword
	public void percentageSurveyResponseRateCalculationBuiding() throws IOException, InterruptedException, Exception{

		navigation.navigateIntoDataInput()
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Building Settings'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		String projectoccupancy = WebUI.getText(findTestObject('DataInput/Settings18/AreaTotalValue'))
		double projectOccupancy= Double.parseDouble(projectoccupancy)

		WebUI.click(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.waitForElementPresent(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)

		/******Verify that survey response rate% is calculated on the basis of the following formula [ Response %ge = (No. of responses/Occupancy)*100 ] . Always count the no of responses by counting the no of rows of transport survey results.*****/
		String surveyResponsePercentage = WebUI.getText(findTestObject('DataInput/Survey/SurveyResponsePercentage'))
		String surveyResponsepercentage1 = surveyResponsePercentage.replace("%","")
		String surveyResponsepercentage = surveyResponsepercentage1.replaceAll("\\s","")
		double surveyresponsepercentage= Double.parseDouble(surveyResponsepercentage)
		println surveyResponsepercentage

		double calculatedresponsePecentage = (4/projectOccupancy)*100

		BigDecimal responsePecentage = new BigDecimal(calculatedresponsePecentage)
		responsePecentage = responsePecentage.setScale(2,RoundingMode.HALF_UP)
		String responsePecentageTr = Double.toString(responsePecentage)
		println responsePecentageTr

		WebUI.verifyMatch(responsePecentageTr, surveyResponsepercentage, false)
		/******Verify that survey response rate% is calculated on the basis of the following formula [ Response %ge = (No. of responses/Occupancy)*100 ] . Always count the no of responses by counting the no of rows of HUMAN EXPERIENCE survey results.*****/
		WebUI.click(findTestObject('DataInput/Survey/OccupantSatisfactionSurv'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)

		WebUI.waitForElementPresent(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)


		String humsurveyResponsePercentage = WebUI.getText(findTestObject('DataInput/Survey/SurveyResponsePercentage'))
		String humsurveyResponsepercentage1 = surveyResponsePercentage.replace("%" ,"")
		String humsurveyResponsepercentage = humsurveyResponsepercentage1.replaceAll("\\s","")

		print humsurveyResponsepercentage
		double humsurveyresponsepercentage= Double.parseDouble(humsurveyResponsepercentage)

		double humcalculatedresponsePecentage = (4/projectOccupancy)*100
		BigDecimal responsePecentagehum = new BigDecimal(calculatedresponsePecentage)
		responsePecentagehum = responsePecentagehum.setScale(2, RoundingMode.HALF_UP)
		String responsePecentagehu = Double.toString(responsePecentage)

		Assert.assertEquals(responsePecentagehu,humsurveyResponsepercentage)
		/***************Verify that survey response rate percentage is same in Transport and HE tabs.***********************************/
		WebUI.verifyMatch(humsurveyResponsePercentage, surveyResponsePercentage, false)

	}

	@Keyword
	public void percentageSurveyResponseRateCalculationBuidingV3(String sheetName,int rowNum) throws IOException, InterruptedException, Exception{

		String occupant = data.getCellData(sheetName,'BOccupancy', rowNum)
		double doccupant = Double.parseDouble(occupant)

		navigation.navigateIntoDataInput()


		//setting.occupantGen()

		String projectoccupancy = data.getCellData(sheetName,'GrossAreasqft', rowNum)

		double projectOccupancy= Double.parseDouble(projectoccupancy)

		WebUI.waitForElementClickable(findTestObject('DataInput/Survey/div_Transportation Survey'),10)
		WebUI.doubleClick(findTestObject('DataInput/Survey/div_Transportation Survey'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)

		WebUI.waitForElementPresent(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)


		/******Verify that survey response rate% is calculated on the basis of the following formula [ Response %ge = (No. of responses/Occupancy)*100 ] . Always count the no of responses by counting the no of rows of transport survey results.*****/
		String surveyResponsePercentage = WebUI.getText(findTestObject('DataInput/Survey/SurveyResponsePercentage'))
		String surveyResponsepercentage1 = surveyResponsePercentage.replace("%","")
		String surveyResponsepercentage = surveyResponsepercentage1.replaceAll("\\s","")
		double surveyresponsepercentage= Double.parseDouble(surveyResponsepercentage)
		println surveyResponsepercentage

		BigDecimal UIresponsePecentage = new BigDecimal(surveyresponsepercentage)
		UIresponsePecentage = UIresponsePecentage.setScale(0,RoundingMode.HALF_UP)
		String UIResponsePecentage = Double.toString(UIresponsePecentage)



		double calculatedresponsePecentage = (doccupant/projectOccupancy)*100

		BigDecimal responsePecentage = new BigDecimal(calculatedresponsePecentage)
		responsePecentage = responsePecentage.setScale(0,RoundingMode.HALF_UP)
		String responsePecentageTr = Double.toString(responsePecentage)
		println responsePecentageTr

		WebUI.verifyMatch(UIResponsePecentage, responsePecentageTr, false)

		/******Verify that survey response rate% is calculated on the basis of the following formula [ Response %ge = (No. of responses/Occupancy)*100 ] . Always count the no of responses by counting the no of rows of HUMAN EXPERIENCE survey results.*****/
		WebUI.click(findTestObject('DataInput/Survey/OccupantSatisfactionSurv'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.delay(2)

		WebUI.waitForElementPresent(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementVisible(findTestObject('DataInput/Survey/SurveyResponsePercentage'), GlobalVariable.avgAngularWait)


		String humsurveyResponsePercentage = WebUI.getText(findTestObject('DataInput/Survey/SurveyResponsePercentage'))
		String humsurveyResponsepercentage1 = surveyResponsePercentage.replace("%" ,"")
		String humsurveyResponsepercentage = humsurveyResponsepercentage1.replaceAll("\\s","")

		print humsurveyResponsepercentage
		double humsurveyresponsepercentage= Double.parseDouble(humsurveyResponsepercentage)

		BigDecimal UIhumsurveyresponsepercentage = new BigDecimal(humsurveyresponsepercentage)
		UIhumsurveyresponsepercentage = UIhumsurveyresponsepercentage.setScale(0,RoundingMode.HALF_UP)
		String UIHumsurveyresponsepercentage = Double.toString(UIhumsurveyresponsepercentage)

		double humcalculatedresponsePecentage = (doccupant/projectOccupancy)*100
		BigDecimal responsePecentagehum = new BigDecimal(calculatedresponsePecentage)
		responsePecentagehum = responsePecentagehum.setScale(0, RoundingMode.HALF_UP)
		String responsePecentagehu = Double.toString(responsePecentage)

		//Assert.assertEquals(responsePecentagehu,humsurveyResponsepercentage)
		/***************Verify that survey response rate percentage is same in Transport and HE tabs.***********************************/
		WebUI.verifyMatch(UIHumsurveyresponsepercentage, responsePecentagehu, false)

	}


	@Keyword
	public void dataInputNavigationTest() throws IOException, InterruptedException, Exception{

		//WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('DataInput/Nav/No Energy meter present'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Nav/button_Next'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('DataInput/Nav/No Water meter present'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Nav/button_Next'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('DataInput/Nav/No readings present for Was'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Nav/button_Next'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('DataInput/Nav/Transportation Survey'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Nav/button_Next'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('DataInput/Nav/Hum Exp Satisfaction'), 5, FailureHandling.CONTINUE_ON_FAILURE)

		WebUI.click(findTestObject('DataInput/Nav/button_Next'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyElementPresent(findTestObject('DataInput/Nav/No Energy meter present'), 5, FailureHandling.CONTINUE_ON_FAILURE)


	}

	@Keyword
	public void allActionNavigationTest() throws IOException, InterruptedException, Exception{

	}
	//Add New Meter" in Energy Tab, should be present, to create a new meter
	@Keyword
	public void checkEnergyAndWaterMeterCreateTabDataInput(){
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/EnergyTabDataInput'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/AddNewMeterButton'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/WaterMeterTab'), 5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/DataInputFileUpload/AddNewWaterMeterButton'), 5)
	}


	@Keyword
	public void waterScoreShouldNotrecomputemun(String sheetName){
		WebUI.scrollToElement(findTestObject('DataInput/Survey/a_ Data Input'),5)
		//WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/MeterWater/AnalyticsWater meter'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/MeterWater/AnalyticsWater meter'), GlobalVariable.minAngularWait)

		String uIwaterScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		data.setCellData(sheetName,"waterScore",5,uIwaterScore)

		WebUI.click(findTestObject('Object Repository/DataInput/MeterWater/AnalyticsWater meter'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/MeterWater/Details'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/DataInput/MeterWater/button_Municipality supplied'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/DataInput/MeterWater/a_Municipality supplied reclai'))
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/WaterScore'),40)

		//CustomKeywords.'com.arc.ReusableMethods.ResuableMethodsPerformanceScore.analyticsgenratePerformanceScoreAdminToolOtherNone1'(GlobalVariable.BuildingSheet, GlobalVariable.rowNumSix)

		performanceScore.analyticsgenratePerformanceScoreAdminToolOtherNone1(GlobalVariable.BuildingSheet, GlobalVariable.rowNumSix)

		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)



		String waterScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		WebUI.verifyMatch(waterScore,'0', false)

	}

	@Keyword
	public void waterScoreShouldNotrecomputemunReclaimedonsite(){
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)


		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)


		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/MeterWater/button_Municipality supplied'),4)
		WebUI.click(findTestObject('Object Repository/DataInput/MeterWater/button_Municipality supplied'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Add_Project_Details/Star/a_Reclaimed onsite'))
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/WaterScore'),40)

		performanceScore.analyticsgenratePerformanceScoreAdminToolOtherNone1(GlobalVariable.BuildingSheet, GlobalVariable.rowNumSix)

		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		String rwaterScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))

		WebUI.verifyMatch(rwaterScore,'0', false, FailureHandling.CONTINUE_ON_FAILURE)
	}
	@Keyword
	public void waterScoreShouldrecomput(String sheetName){
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/MeterWater/button_Municipality supplied'),4)
		WebUI.click(findTestObject('Object Repository/DataInput/MeterWater/button_Municipality supplied'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Add_Project_Details/Star/a_Municipality supplied potabl'))
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/WaterScore'),40)

		performanceScore.analyticsgenratePerformanceScoreAdminToolOtherNone1(GlobalVariable.BuildingSheet, GlobalVariable.rowNumSix)

		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.delay(2)

		/********************Changing to the default score of water ***********************************************/
		WebUI.scrollToElement(findTestObject('PerformanceScore/DataInput/WaterScore'),5)
		String awaterScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/WaterScore'))
		String pwaterScore = data.getCellData(sheetName,"waterScore", 5)
		WebUI.verifyMatch(awaterScore, pwaterScore, false)


	}
	@Keyword
	public void CitydefaultNotification(){
		String noOfDefalutNoti =WebUI.getText(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.verifyMatch(noOfDefalutNoti,'5', false)



	}

	@Keyword
	public void NotificationNavigationTest(){
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'),5)
		WebUI.click(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Notification/Energy'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Notification/span_Energy'), 2)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'),5)
		WebUI.click(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Notification/Water'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Notification/span_Water'), 2)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'),5)
		WebUI.click(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Notification/Waste'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Notification/span_Waste'), 2)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'),5)
		WebUI.click(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Notification/Transport'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Notification/span_Transportation'), 2)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'),5)
		WebUI.click(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.delay(1)
		WebUI.click(findTestObject('DataInput/Notification/Hum'))
		WebUI.delay(5)
		WebUI.verifyElementPresent(findTestObject('Object Repository/DataInput/Notification/span_Human Experience'), 2)


	}

	@Keyword
	public void NotificatioBellTest(){

		WebUI.verifyElementNotVisible(findTestObject('Object Repository/DataInput/Notification/BellNotification'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'),5)
		WebUI.click(findTestObject('Object Repository/DataInput/Notification/DefaultNotifcaiton'))
		WebUI.delay(1)
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/DataInput/Notification/You have 1 notification'),FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void precertificationCreditAssionTest(){
		WebUI.delay(3)
		WebUI.click(findTestObject('Page_Arc dashboard/a_ Precertification'))
		WebUI.delay(3)
		WebUI.click(findTestObject('PreRequisite/CityCom/span_Commit to sharing data'))
		WebUI.delay(3)

		WebUI.click(findTestObject('BasePoint/BasePointCreditCom/TeamIconClick'))
		WebUI.delay(2)
		WebUI.click(findTestObject('BasePoint/BasePointCreditCom/TeamMemberSelection'))
		WebUI.delay(10)

		String teamMemUI = WebUI.getText(findTestObject("BasePoint/BasePointCreditCom/VerifyAddedTeamSuccessully"))
		WebUI.verifyMatch(GlobalVariable.teamMemName,teamMemUI, false)

		WebUI.click(findTestObject('Page_Arc dashboard/a_ Precertification'))
		WebUI.delay(3)

		String pteamMemUI = WebUI.getText(findTestObject('Object Repository/DataInput/CityC/VerifyTeam'))
		WebUI.verifyMatch(GlobalVariable.teamMemName,pteamMemUI, false)

	}
	
	@Keyword
	public void HumanExpMeterReadingValidationUI()throws IOException, InterruptedException {
		
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GHGEmissions'))
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/HighSchoolPercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '5000')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))
		
		/************************** Verify the error message gone after valid value *************************/
		WebUI.clearText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '20')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))
	}


	@Keyword
	public void PopulationHumanExpMeterReadingValidationUI()throws IOException, InterruptedException {

		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/BachelorDegreePercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '5000')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))
		
		/************************** Verify the error message gone after valid value *************************/
		WebUI.clearText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '20')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))


	}
	@Keyword
	public void EQUITABILITYHumanExpMeterReadingValidationUI()throws IOException, InterruptedException {

		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/GiniCoefficient'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '5000')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))
		
		/************************** Verify the error message gone after valid value *************************/
		WebUI.clearText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '1')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))

	}
	
	@Keyword
	public void GinicoefficientHumanExpMeterReadingValidationUI()throws IOException, InterruptedException {

		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/RentIncomePercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '5000')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))
		
		/************************** Verify the error message gone after valid value *************************/
		WebUI.clearText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.setText(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '20')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.verifyElementNotVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/PopulationReadingErrorMessage'))


	}


	//City Data Input Text validation
	@Keyword
	public void validateCityCommEnergyDataInputText(){

		//Verify the title text
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextOne')),"GHG Emissions", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextTwo')), "Enter tons of CO2 equivalent per year per capita", false)

		//Verify the reading title
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyYearLabel')), "YEAR", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTonsYearCapita')),"TONS/YEAR/CAPITA",false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyActionsLabel')),"ACTIONS", false)
	}



	@Keyword
	public void validateCityCommWaterDataInputText(){

		//Verify the title Text
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextOne')),"Water consumption", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextTwo')), "Enter domestic water consumption per capita", false)

		//Verify the reading title
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterYearLabel')), "YEAR", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterValueLabel')),"VALUE",false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterUnitLabel')),"UNIT", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterDurationLabel')),"DURATION", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterActionsLabel')),"ACTIONS", false)
	}

	@Keyword
	public void validateCityCommWasteGenerationDataInputText(){

		//Verify the solid waste generation title Text
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextOne')),"Municipal solid waste generation intensity", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextTwo')), "Enter muncipal solid waste generated per year per capita", false)
		

		//Verify the solid waste generation reading title
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterYearLabel')), "YEAR", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterValueLabel')),"TONS/YEAR/CAPITA",false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterUnitLabel')),"ACTIONS", false)

	}
	
	@Keyword
	public void validateCityCommWasteDiversionDataInputText(){
		
		//verify the solid waste diversion reading title
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextOne')),"Municipal solid waste diversion rate from landfill", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextOne')), "Enter municipal solid waste diversion rate", false)
									                                                                                           
		//Verify the soild waste diversion reading title
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWasteDivYearLabel')), "YEAR", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWasteDivPercentLabel')),"PERCENT",false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWasteDivActionsLabel')),"ACTIONS", false)
		
		
	}
	


	@Keyword
	public void validateCityCommTransportationDataInputText(){

		//Verify the solid waste generation title Text
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextOne')),"Vehicle miles traveled on individual vehicles daily (VMT)", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputEnergyTextTwo')), "Enter total vehicle miles traveled per day per capita", false)

		//Verify the transportation reading title
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterYearLabel')), "YEAR", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterValueLabel')),"MILES/DAY/CAPITA",false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/DataInputWaterUnitLabel')),"ACTIONS", false)

	}


	@Keyword
	public void validateCityCommHumanExperienceDataInputText(){

		//Verify the human experience
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/EducationTitle')), "Education", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/PopulationWithHighSchoolDegree')), "Population with (at least) High School degree", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/PopulationWithBachelorDegree')), "Population with (at least) Bachelor's degree", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/EquitabilityTitle')), "Equitability", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/Median gross rentLabel')), "Median gross rent as % of household income", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/Gini coefficientLabel')), "Gini coefficient (for income distribution)", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ProsperityTitle')), "Prosperity", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/MedianHouseHoldLabel')), "Median household income", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/UnEmploymentRate')), "Unemployment rate", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/HealthAndSafetyTitle')), "Health & Safety", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/MedianAirQualityIndexLabel')), "Median air quality index (AQI)", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/AirQulaityDaysUnhealthyLabel')), "Air quality days unhealthy for sensitive groups", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ViolentCrimeLabel')), "Violent Crime per year per capita", false)

		//Verify the title

		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/HighSchoolYearLabel')), "Year", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/HighSchoolPercentLabel')), "Percent", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/HighSchoolActionsLabel')), "Actions", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/BachelorDegreeYearLabel')), "Year", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/BachelorDegreePercentLabel')), "Percent", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/BachelorDegreeActionsLabel')), "Actions", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/MedianGrossYearLabel')), "Year", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/MedianGrossPercentLabel')), "Percent", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/MedianGrossActionsLabel')), "Actions", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/GiniCoefficientYearLabel')), "Year", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/GiniCoefficientValueLabel')), "Value (between 0 And 1)", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/GiniCoefficientActionsLabel')), "Actions", false)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/MedianHouseholdYearLabel')), "Year", false)
		//WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/TextValidation/HumanExperience/ReadingLabel/MedianHouseholdUSDollarPerYearLabel')), "US Dollars/Year", false)
		WebUI.verifyElementPresent(findTestObject('Manage/CityCom/USDollar'), 3, FailureHandling.CONTINUE_ON_FAILURE)
	}



	@Keyword
	public void fileUploadDataInputWasteTest(){
		WebUI.delay(18)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'), 3)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/WasteMeter'))
		WebUI.delay(5)
		//pdf file
		//WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'), UploadDocumentDataInput)
		//WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		//uploadFile(UploadDocumentDataInput)
		WebUI.delay(2)
		//text file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadTextFile)
		//WebUI.delay(4)
		//jpg file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadJpeg)
		//WebUI.delay(4)
		//Png file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		uploadFile(UploadPng)
		//WebUI.delay(4)
		//gif file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadGif)
		WebUI.delay(4)
		//xls file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadXls)
		//WebUI.delay(4)
		//doc file
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/DataInputFileUpload/uploadProgressSpan'),20)
		WebUI.click(findTestObject('DataInput/DataInputFileUpload/buttonUPLOAD'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/DataInputFileUpload/clickComputerFile'))
		WebUI.delay(2)
		uploadFile(UploadDocs)
		WebUI.delay(4)

	}


	//Verify data upload template present and can be download in resources section
	@Keyword
	public void verifyTheDataUploadTemplateInResourcesTab(){
		WebUI.delay(5)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.delay(10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Resources/div_Guides'), 4)
		WebUI.click(findTestObject('Object Repository/DataInput/Resources/div_Guides'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Resources/div_Guides (1)'),10)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Resources/div_Guides (1)')),"Guides", false)
		WebUI.delay(8)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Resources/a_ENERGY STAR Template'), 5)
		WebUI.click(findTestObject('Object Repository/DataInput/Resources/a_ENERGY STAR Template'))
		WebUI.delay(7)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(5)
		Assert.assertTrue(isFileDownloaded('Arc_Data_Template_building_v4.1.xlsm'), 'Failed to download Expected document')
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Resources/a_ENERGY STAR Integration Guide')), "ENERGY STAR Integration Guide", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Resources/a_Data Guide for Buildings')), "Data Guide for Buildings", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Resources/a_Data Review Checklist')), "Data Review Checklist", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/Resources/a_ENERGY STAR Template')), "Arc Data Template", false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void deleteIncompleteMeterReading(){
		WebUI.delay(12)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.delay(2)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_Add New Meter'))
		WebUI.delay(3)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_Next'))
		WebUI.delay(3)
		WebUI.sendKeys(findTestObject('DataInput/CreateMeterBuilding/input_addMeterModal-body-Eleme'),"Energy Meter for Incomplete Readings")
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/a_ELECTRICITY'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnSelectUnit'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectKBtu'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/ClickOnFuelSource'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/CreateEnergyAndWaterMeterWithDifferentCombinations/SelectOnGenerateOnSiteSolar'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_ADD'))
		WebUI.waitForElementNotVisible(findTestObject('DataInput/CreateMeterBuilding/button_ADD'), 20)
		WebUI.delay(5)
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'),"Energy Meter for Incomplete Readings", FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 5)
		//WebUI.scrollToElement(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'),2)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DeletereadingOne'))
		WebUI.delay(4)
		WebUI.verifyElementNotPresent(findTestObject('Object Repository/DataInput/CreateMeterBuilding/input_date-picker-meter start_'), 3)

	}

	@Keyword
	public void createEmissionFactor1(String sheetName, int rowNum){

		String emissionFactor  = data.getCellData(sheetName, "EmissionFactor", rowNum)
		WebUI.delay(5)

		WebUI.scrollToElement(findTestObject('DataInput/Survey/a_ Data Input'),5)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))

		ReusableMethodsLogin.waitForPageLoad(60)
		ReusableMethodsLogin.waitForIframeLoad(60)
		WebUI.delay(8)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		data.setCellData(GlobalVariable.BDataInput,"TotalScore", GlobalVariable.rowNumTwo,totalPerformaceScore)

		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		WebUI.delay(4)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/span_Emission Factor'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/17/span_Emission Factor'), 3)
		WebUI.click(findTestObject('Analytics/17/span_Emission Factor'))
		WebUI.delay(5)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Custom Emission Facto'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/17/Custom Emission Facto'), 3)
		WebUI.click(findTestObject('Analytics/17/Custom Emission Facto'))
		WebUI.delay(5)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Manually Enter Emission'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/17/Manually Enter Emission'), 3)
		WebUI.click(findTestObject('Analytics/17/Manually Enter Emission'))
		WebUI.delay(5)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 10)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)

		WebUI.waitForElementClickable(findTestObject('Analytics/Cal/StartDate'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/Cal/StartDate'), 2)
		WebUI.click(findTestObject('Analytics/Cal/StartDate'))
		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))

		WebUI.scrollToElement(findTestObject('Analytics/17/span_Aug'), 2)
		WebUI.mouseOver(findTestObject('Analytics/17/span_Aug'))
		WebUI.click(findTestObject('Analytics/17/span_Aug'))
		WebUI.delay(2)

		WebUI.scrollToElement(findTestObject('Analytics/17/1Aug2018'), 2)
		WebUI.mouseOver(findTestObject('Analytics/17/1Aug2018'))
		WebUI.click(findTestObject('Analytics/17/1Aug2018'))
		WebUI.delay(4)
		WebUI.setText(findTestObject('Analytics/17/Reading1'),emissionFactor)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.delay(4)

		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)

	}


	@Keyword
	public void createEmissionFactor(String sheetName, int rowNum){

		String emissionFactor  = data.getCellData(sheetName, "EmissionFactor", rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		data.setCellData(GlobalVariable.BDataInput,"TotalScore", GlobalVariable.rowNumTwo,totalPerformaceScore)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Manually Enter Emission'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/17/Manually Enter Emission'), 3)
		WebUI.click(findTestObject('Analytics/17/Manually Enter Emission'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 10)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.waitForElementClickable(findTestObject('Analytics/Cal/StartDate'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/Cal/StartDate'), 2)
		WebUI.click(findTestObject('Analytics/Cal/StartDate'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker'))
		WebUI.mouseOver(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/clickDatePicker2'))
		WebUI.mouseOver(findTestObject('DataInput/CreateMeterBuilding/year_2018'))
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/year_2018'))

		WebUI.scrollToElement(findTestObject('Analytics/17/span_Aug'), 2)
		WebUI.mouseOver(findTestObject('Analytics/17/span_Aug'))
		WebUI.click(findTestObject('Analytics/17/span_Aug'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.scrollToElement(findTestObject('Analytics/17/1Aug2018'), 2)
		WebUI.mouseOver(findTestObject('Analytics/17/1Aug2018'))
		WebUI.click(findTestObject('Analytics/17/1Aug2018'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.setText(findTestObject('Analytics/17/Reading1'),emissionFactor)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)



	}

	@Keyword
	public void updateEmissionFactor(String sheetName, int rowNum){

		String emissionFactor  = data.getCellData(sheetName, "EmissionFactor", rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('DataInput/Survey/a_ Data Input'),5)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		//Verifying the Performance score

		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		data.setCellData(GlobalVariable.BDataInput,"TotalScore", GlobalVariable.rowNumTwo,totalPerformaceScore)

		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/Setting'), 10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/Setting'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/Setting'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'), 10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Manually Enter Emission'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/17/Manually Enter Emission'), 3)
		WebUI.click(findTestObject('Analytics/17/Manually Enter Emission'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.clearText(findTestObject('Analytics/17/Reading1'))
		WebUI.setText(findTestObject('Analytics/17/Reading1'),emissionFactor)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/CreateMeterBuilding/deleteButtonOne'), 20)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/button_Add Row'), 20)



	}

	@Keyword
	public void navigateToEmession(String sheetName, int rowNum){

		navigation.navigateIntoDataInput()
		WebUI.waitForElementVisible(findTestObject('Analytics/17/Building Settings'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Analytics/17/Building Settings'), 60)
		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		WebUI.delay(1)
		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Setting/Setting'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Setting/Setting'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/Setting'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/Setting'), 2)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/Setting'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'))
		WebUI.delay(1)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Manually Enter Emission'), GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('Analytics/17/Manually Enter Emission'), 3)
		WebUI.click(findTestObject('Analytics/17/Manually Enter Emission'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

	}

	@Keyword
	public void updateUnitgramkwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_grams'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_grams'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 30)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kWh'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (gramskWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (gramskWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)


	}

	@Keyword
	public void updateUnitgrammwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)


		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_grams'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_grams'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_MWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_MWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_MWh'))
		WebUI.delay(3)

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (gramsMWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (gramsMWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}
	@Keyword
	public void updateUnitLBSkbtu(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_lbs'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_lbs'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_lbs'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kBtu'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (lbskBtu)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (lbskBtu)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitLBSkwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_lbs'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_lbs'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_lbs'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kWh'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (lbskWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (lbskWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitLBSmwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_lbs'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_lbs'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_lbs'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_MWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_MWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_MWh'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (lbsMWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (lbsMWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}


	@Keyword
	public void updateUnitgramkbtu(String sheetName, int rowNum){

		WebUI.scrollToElement(findTestObject('DataInput/Survey/a_ Data Input'),5)
		WebUI.click(findTestObject('DataInput/Survey/a_ Data Input'))


		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)


		WebUI.waitForElementClickable(findTestObject('Analytics/17/Building Settings'), 10)
		WebUI.doubleClick(findTestObject('Analytics/17/Building Settings'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/Setting'), 10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/Setting'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/Setting'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'), 10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'), 3)
		WebUI.click(findTestObject('Object Repository/DataInput/Setting/a_Emission Factor'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('Analytics/17/Manually Enter Emission'), 10)
		WebUI.scrollToElement(findTestObject('Analytics/17/Manually Enter Emission'), 3)
		WebUI.click(findTestObject('Analytics/17/Manually Enter Emission'))
		WebUI.delay(8)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_grams'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_grams'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(3)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kBtu'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (gramskBtu)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (gramskBtu)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitKGkbtu(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kg'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kg'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kg'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (kgkBtu)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (kgkBtu)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitKGkwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kg'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kg'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kg'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kWh'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (kgkWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (kgkWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitKGmwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kg'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kg'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kg'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_MWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_MWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_MWh'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (kgMWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (kgMWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitTIkbtu(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kBt'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kBt'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitTIkwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kWh'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kWh'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kWh'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitTImwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_Tonnes (imperial)'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_MWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_MWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_MWh'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)MWh'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)MWh'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitTMkbtu(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kBt'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kBt'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitTMkwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_kWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_kWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_kWh'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kWh'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (imperial)kWh'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void updateUnitTMmwh(String sheetName, int rowNum){

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_grams'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_grams'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_grams'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'),3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_Tonnes (metric)'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/button_kBtu'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/button_kBtu'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/button_kBtu'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementClickable(findTestObject('DataInput/Occupancy/a_MWh'), 10)
		WebUI.scrollToElement(findTestObject('DataInput/Occupancy/a_MWh'), 3)
		WebUI.click(findTestObject('DataInput/Occupancy/a_MWh'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (metric)MWh)'),10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementVisible(findTestObject('DataInput/Occupancy/Page_Arc dashboard/th_VALUE (Tonnes (metric)MWh)'), 10, FailureHandling.CONTINUE_ON_FAILURE)

	}



	@Keyword
	public void scoreShouldMoreVerify(String sheetName, int rowNum){

		String totalScore  = data.getCellData(sheetName, "TotalScore", rowNum)
		int utotalScore = Integer.parseInt(totalScore)

		String actotalScore  = data.getCellData(sheetName, "ATotalScore", rowNum)


		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Setting/Setting'), 60)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),10)
		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		int utotalPerformaceScore = Integer.parseInt(totalPerformaceScore)

		if(utotalPerformaceScore>utotalScore)
			KeywordUtil.markPassed("!!! Total Score is increased for this Project after changing the emission factor !!!")
		else
			KeywordUtil.markFailedAndStop("!!! Total Score is Not increased for this  Project after changing the emission factor !!!")

	}

	@Keyword
	public void scoreShouldLessVerify(String sheetName, int rowNum){

		String totalScore  = data.getCellData(sheetName, "TotalScore", rowNum)
		int utotalScore = Integer.parseInt(totalScore)
		navigation.navigateIntoDataInput()
		/********* Verifying the Generated score for total score under data Input section ********/
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Setting/Setting'), 60)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),40)

		if(WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore')).equalsIgnoreCase('')){
			WebUI.delay(15)
		}

		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		int utotalPerformaceScore = Integer.parseInt(totalPerformaceScore)

		if(utotalPerformaceScore<utotalScore)
			KeywordUtil.markPassed("!!! Total Score is decrease for this Project after changing the emission factor !!!")
		else
			KeywordUtil.markFailedAndStop("!!! Total Score is Not Decrease for this Project after changing the emission factor !!!")

	}


	@Keyword
	public void scoreShouldNotChangeVerify(String sheetName, int rowNum){

		String totalScore  = data.getCellData(sheetName, "TotalScore", rowNum)
		String actotalScore  = data.getCellData(sheetName, "ATotalScore", rowNum)


		/********* Verifying the Generated score for total score & Energy & Water & Waste & Transport & Human Experience under data Input section ********/
		WebUI.click(findTestObject('PerformanceScore/DataInput/a_ Data Input'))

		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)


		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/DataInput/TotalScore'), GlobalVariable.minAngularWait)

		WebUI.waitForElementPresent(findTestObject('PerformanceScore/DataInput/TotalScore'),10)
		//Verifying the Performance score
		String totalPerformaceScore = WebUI.getText(findTestObject('PerformanceScore/DataInput/TotalScore'))
		print totalPerformaceScore
		WebUI.verifyMatch(totalPerformaceScore ,totalScore, false)
		WebUI.verifyMatch(totalPerformaceScore , actotalScore, false)

		WebUI.click(findTestObject('Object Repository/PerformanceScore/Score/a_ Total'))
		WebUI.delay(18)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('PerformanceScore/Score/TotalPerformanceScore'),10)
		WebUI.waitForElementVisible(findTestObject('PerformanceScore/Score/TotalPerformanceScore'), GlobalVariable.minAngularWait, FailureHandling.CONTINUE_ON_FAILURE)

		//Verifying the Performance score
		String totalperformaceScore = WebUI.getText(findTestObject('PerformanceScore/Score/TotalPerformanceScore'))
		print totalperformaceScore
		WebUI.verifyMatch(totalperformaceScore , totalScore, false)
		WebUI.verifyMatch(totalperformaceScore , actotalScore, false)

	}


	@Keyword
	public void verifyTheCommentCityCommunityDoesnotIncludeMeterName(){

		//WebUI.delay(4)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		if((WebUI.getText(findTestObject('Object Repository/DataInput/ActivityCommentCityComm')).contains("Saurav K has added new data for Ghg Emissions for the period"))){
			KeywordUtil.markPassed("Meter name is not included in the activity comment")
		}
		else{
			KeywordUtil.markFailed("Meter name is included in the acivity comment ")
		}
	}


	@Keyword
	public void verifyErrorMessageForIncompleteSurvey(){
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL)
		r.keyRelease(KeyEvent.VK_T)
		WebUI.delay(5)
		WebUI.switchToWindowIndex(1)
		WebUI.navigateToUrl(GlobalVariable.surveyLinkDashboard)
		WebUI.delay(2)
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.waitForElementPresent(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.waitForElementVisible(findTestObject('dataInputNewUI/Survey/AllLang'), 10)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('dataInputNewUI/Survey/Submit1'))
		//findTestObject('Object Repository/ErrorLocators/Survey/SubmitSurveyErrorMessage')
		WebUI.waitForElementPresent(findTestObject('Object Repository/ErrorLocators/Survey/SubmitSurveyErrorMessage'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/ErrorLocators/Survey/SubmitSurveyErrorMessage')), "Please answer all the questions", false)
	}

	@Keyword
	public void verifyErrorMessageDisappearAfterDetails(String sheetName, int rowNum){

		String url = data.getCellData(sheetName,"V2Url", 2)
		String walk1 = data.getCellData(sheetName, "Walk", 2)
		String walk2 = data.getCellData(sheetName, "Bus", 2)
		String walk3 = data.getCellData(sheetName, "Tram", 2)
		String walk4 = data.getCellData(sheetName, "Heavyrail", 2)
		String walk5 = data.getCellData(sheetName, "Motorcycle", 2)
		String walk6 = data.getCellData(sheetName, "Carsolo", 2)
		String walk7 = data.getCellData(sheetName, "Carpool", 2)
		String walk8 = data.getCellData(sheetName, "Caralternative", 2)
		String name = data.getCellData(sheetName, "Name", 2)

		String surveylang = data.getCellData(sheetName,"surveylang", rowNum)
		String surveyType = data.getCellData(sheetName,"surveyType", rowNum)

		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'), GlobalVariable.avgAngularWait)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/ClickOnSelectTravelMethod'))
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)

		int it=1;
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk1)
		it++

		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
		it++

		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), '0')
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk2)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk3)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk4)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk5)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk6)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk7)
		it++
		WebUI.setText(findTestObject('Object Repository/DataInput/Survey/InputMileage',[index: it]), walk8)
		it++
		WebUI.waitForPageLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/Survey/SaveButtonToRecordSurveyData'))
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),10)
		WebUI.waitForElementVisible(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),10)
		WebUI.scrollToElement(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),5)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'),5)
		WebUI.dragAndDropToObject(findTestObject('Object Repository/DataInput/Survey/SatisfactionSlider'), findTestObject('dataInputNewUI/Survey/ExtremelySatisfySpanText'))
		WebUI.delay(1)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.scrollToElement(findTestObject('DataInput/Survey/survey_tenant_name'),5)
		WebUI.setText(findTestObject('DataInput/Survey/survey_tenant_name'), name)
		markAllCheckbox()
		WebUI.selectOptionByLabel(findTestObject('Object Repository/DataInput/Survey/OccupantTypeSurvey'), "Visitor", false)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/ErrorLocators/Survey/SubmitSurveyErrorMessage'),5,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('dataInputNewUI/Survey/Submit1'))
		WebUI.waitForElementPresent(findTestObject('dataInputNewUI/Survey/Welcome'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('dataInputNewUI/Survey/Welcome'), GlobalVariable.minAngularWait)
		WebUI.switchToWindowIndex(0)
	}

//*************************************** CITY / COMMUNITY NEW DATA INPUT UI ***********************************************//

	// City/Community new data input UI
	@Keyword
	public void createCityCommEnergyGHGMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "EReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "EReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "EReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "EReading5", rowNum)

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GHGEmissions'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/NextYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), reading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonThree'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), reading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFour'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), reading5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFive'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GHGEmissions'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading2, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'),'value'), reading4, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'),'value'), reading5, false)


	}

	@Keyword
	public void createCityCommWaterConsumptionMeter(String sheetName, int rowNum){
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "WaterReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "WaterReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "WaterReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "WaterReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "WaterReading5", rowNum)

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/Waterconsumption'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/NextYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), reading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonThree'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), reading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFour'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), reading5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFive'), GlobalVariable.minAngularWait)

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/Waterconsumption'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading2, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'),'value'), reading4, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'),'value'), reading5, false)


	}

	@Keyword
	public void createCityCommWasteGenerationMeter(String sheetName, int rowNum){

		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "wastegeneration1", rowNum)
		String reading2  = data.getCellData(sheetName, "wastegeneration2", rowNum)
		String reading3  = data.getCellData(sheetName, "wastegeneration3", rowNum)
		String reading4  = data.getCellData(sheetName, "wastegeneration4", rowNum)
		String reading5  = data.getCellData(sheetName, "wastegeneration5", rowNum)

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteGeneration'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/NextYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), reading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonThree'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), reading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFour'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), reading5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFive'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteGeneration'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading2, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'),'value'), reading4, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'),'value'), reading5, false)

	}

	@Keyword
	public void createCityCommWasteDiversionMeter(){

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteDiversion'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteDiversion'),GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteDiversion'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), "80")
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/NextYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), "70")
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), "60")
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonThree'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), "50")
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFour'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), "40")
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFive'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteDiversion'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), "70", false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), "80", false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'),'value'), "60", false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'),'value'), "50", false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'),'value'), "40", false)

	}

	@Keyword
	public void createCityCommunityTransportationMeter(String sheetName, int rowNum){
		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "TReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "TReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "TReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "TReading4", rowNum)
		String reading5  = data.getCellData(sheetName, "TReading5", rowNum)

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityTransportation'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/NextYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), reading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonThree'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), reading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFour'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'), reading5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonFive'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityTransportation'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading2, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'),'value'), reading4, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFive'),'value'), reading5, false)
	}

	//Human Experience Meters

	//High School Percent
	@Keyword
	public void createCityCommCityCommunityHighSchoolPercentMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/HighSchoolPercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/HighSchoolPercent'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}

	//Bachelor Degree Percentage
	@Keyword
	public void createCityCommunityBachelorDegreePercentMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/BachelorDegreePercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/BachelorDegreePercent'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}

	//Rent Income Percentage
	@Keyword
	public void createCityCommunityRentIncomePercentMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/RentIncomePercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/RentIncomePercent'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}

	//Ginni Coefficient
	@Keyword
	public void createCityCommunityGinniCoefficientMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GiniCoefficient'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GiniCoefficient'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading4, false)

	}

	//Median Income
	@Keyword
	public void createCityCommunityMedianIncomeMeter(String sheetName, int rowNum){

		String reading1  = data.getCellData(sheetName, "EPReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "EPReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "HGiniReading1", rowNum)
		String reading4  = data.getCellData(sheetName, "HGiniReading2", rowNum)
		String reading5  = data.getCellData(sheetName, "Hincome1", rowNum)
		String reading6  = data.getCellData(sheetName, "Hincome2", rowNum)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/MedianIncome'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/MedianIncome'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading4, false)

	}


	//City Air Quality Index
	@Keyword
	public void createCityCommunityAirQualityIndexMeter(){

		String reading1  = "250"
		String reading2  = "300"

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityAirQualityIndex'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityAirQualityIndex'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}


	//UnEmployment Percentage
	@Keyword
	public void createCityCommunityUnEmployementPercentageMeter(){

		String reading1  = "20"
		String reading2  = "25"

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/UnemployementPercent'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/UnemployementPercent'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}


	//Unhealthy Days
	@Keyword
	public void createCityCommunityUnhealthyDaysMeter(){

		String reading1  = "180"
		String reading2  = "100"

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/UnhealtyDays'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/UnhealtyDays'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}


	//Violent Crime
	@Keyword
	public void createCityCommunityViolentCrimeMeter(){

		String reading1  = "10"
		String reading2  = "7"

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ViolentCrime'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PreviousYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ViolentCrime'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'),'value'), reading2, false)

	}


	//Additional Data
	@Keyword
	public void createCityCommunityAdditionalDataMeter(String sheetName, int rowNum){

		/*************************Reading data from excel sheet ************************************/
		String reading1  = data.getCellData(sheetName, "ADeatailsValueReading1", rowNum)
		String reading2  = data.getCellData(sheetName, "ADeatailsValueReading2", rowNum)
		String reading3  = data.getCellData(sheetName, "ADeatailsValueReading3", rowNum)
		String reading4  = data.getCellData(sheetName, "ADeatailsValueReading4", rowNum)
		String ureading1  = data.getCellData(sheetName, "ADeatailsUnitReading1", rowNum)
		String ureading2  = data.getCellData(sheetName, "ADeatailsUnitReading2", rowNum)
		String ureading3  = data.getCellData(sheetName, "ADeatailsUnitReading3", rowNum)
		String ureading4  = data.getCellData(sheetName, "ADeatailsUnitReading4", rowNum)

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/Data'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/Data'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'), GlobalVariable.minAngularWait)

		//Total Electricty Use
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/TotalElectricityUse'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/TotalElectricityUse'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), reading1)
		WebUI.sendKeys(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataOne'), ureading1)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)
		//Landfill diversion rate
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/LandfillDiversionRate'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/LandfillDiversionRate'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingTwo'), reading2)
		WebUI.sendKeys(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataTwo'), ureading2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)
		//Percentage Of population With Potable Water
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfpopulationWithPotableWater'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfpopulationWithPotableWater'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingThree'), reading3)
		WebUI.sendKeys(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataThree'), ureading3)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)
		//PercentageOfGovtWorkers
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfGovtWorkers'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfGovtWorkers'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddYearButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingFour'), reading4)
		WebUI.sendKeys(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataFour'), ureading4)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonOne'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/EditButtonOne'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/Data'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'), GlobalVariable.minAngularWait)

		//Verify the readings for the following options
		/*WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/TotalElectricityUse'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/TotalElectricityUse'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading1, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataOne'),'value'), ureading1, false)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/LandfillDiversionRate'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/LandfillDiversionRate'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading2, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataOne'),'value'), ureading2, false)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfpopulationWithPotableWater'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfpopulationWithPotableWater'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading3, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataOne'),'value'), ureading3, false)

		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AdditionalDataDropdownButton'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfGovtWorkers'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/PercentageOfGovtWorkers'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), reading4, false)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('CityCommDataInput/MeterNames/UnitAdditonalDataOne'),'value'), ureading4, false)*/
	}

	//File Upload City / Community Data Input
	@Keyword
	public void fileuploadEnergyMeterDataInputCityComm(){

		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GHGEmissions'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/DocumentsTab'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/DocumentsTab'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'), GlobalVariable.minAngularWait)

		//pdf file
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadDocumentDataInput)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait )
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.delay(3)

		//text file
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadTextFile)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'), GlobalVariable.minAngularWait)
		WebUI.delay(3)

		//jpg file
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadJpeg)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'), GlobalVariable.minAngularWait)
		WebUI.delay(3)

		//Png file
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadPng)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'), GlobalVariable.minAngularWait)
		WebUI.delay(3)

		//gif file
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadGif)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFive'), GlobalVariable.minAngularWait)
		WebUI.delay(3)

		//xls file
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadXls)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileSix'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileSix'), GlobalVariable.minAngularWait)
		WebUI.delay(3)

		//doc file
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'),GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/UploadButtonCityComm'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/ClickOnComputerFileDropdown'))
		uploadFile(UploadDocs)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileTwo'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileThree'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFour'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFive'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileFive'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileSix'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileSix'), GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileSeven'),GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/FileUploadCityComm/FileSeven'), GlobalVariable.minAngularWait)
		WebUI.delay(3)
	}







	//Verify the setting tab Area and Population data and Verify adding and deleting the data
	@Keyword
	public void buildingSettingDataInputCityComm(String sheetName, int rowNum){

		String prjPopulation= data.getCellData(sheetName, "Population", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)

		//Verify delete the default population and input the new population values

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),prjPopulation , false)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/DeleteButtonOne'))
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/StartDate'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'), 10)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), prjPopulation)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/SettingDropdown'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),prjPopulation , false)

		//Verify delete the default area and input the new area values
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SettingDropdown'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/IPUnit'), GlobalVariable.minAngularWait)
		if(GlobalVariable.environment=='dev'){
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),'48' , false)
		}
		else{
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),prjArea , false)
		}
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/DeleteButtonOne'))
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/StartDate'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'), 10)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		if(GlobalVariable.environment=='dev'){
			WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '48')
		}
		else{
			WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), prjArea)
		}
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SettingDropdown'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/IPUnit'), GlobalVariable.minAngularWait)
		if(GlobalVariable.environment=='dev'){
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),48 , false)
		}
		else{
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),prjArea , false)
		}
	}


	// Create Report City/Community Data input
	@Keyword
	public void downloadAndVerifyExportDataCityComm(){

		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		//WebUI.click(findTestObject('Object Repository/DataInput/a_ Data Input'))
		navigation.navigateIntoDataInput()
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.scrollToElement(findTestObject('Object Repository/dataInputNewUI/dataInputTextVerification'), 3)
		WebUI.waitForElementPresent(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.waitForElementVisible(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'), 60)
		WebUI.waitForElementClickable(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'),20)
		WebUI.click(findTestObject('DataInput/CreateMeterBuilding/button_tippy_init dropdown-tog'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/a_Create Report'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportStartDate'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportStartDate'), '2017')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportEndDate'))
		WebUI.sendKeys(findTestObject('Object Repository/DataInput/CreateMeterBuilding/reportEndDate'), '2018')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)

		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DOWNLOAD_DataInputReport'))
		WebUI.delay(2)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/DataInput/CreateMeterBuilding/cancelButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/CloseCreateReportModal'))
		WebUI.delay(8)
		//'Verifying the file is download in the User defined Path'
		Assert.assertTrue(isFileDownloaded('Export Data.xlsx'), 'Failed to download Expected document')
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	}


	//Verify the city Data Input graph
	@Keyword
	public void verifyEnergyGraph(String sheetName){
		
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/GHGEmissions'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "GHG Emissions", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/CityCommDataInput/MeterNames/EnergyUnitGraph')), "tons", false)
        int j=6
		(1..5).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading1", j)
			WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]), GlobalVariable.minAngularWait)
			WebUI.focus(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}
	}
	
	
	@Keyword
	public void verifyWaterGraph(String sheetName){
		
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/Waterconsumption'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Water consumption", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/CityCommDataInput/MeterNames/WaterUnitGraph')), "gal", false)
		int j=6
		(1..5).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading2", j)
			WebUI.focus(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}
	}
	
	@Keyword
	public void verifyWasteGenGraph(String sheetName){
		
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteGeneration'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Municipal solid waste generation intensity", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/CityCommDataInput/MeterNames/WasteGenUnitGraph')), "tons", false)
		int j=6
		(1..5).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading3", j)
			WebUI.focus(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}
	}
	
	@Keyword
	public void verifyWasteDivGraph(String sheetName){
		
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityWasteDiversion'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Municipal solid waste diversion rate from landfill", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/CityCommDataInput/MeterNames/WasteDivUnit')), "percent", false)
		int j=6
		(1..5).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading4", j)
			WebUI.focus(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}
	}
	
	@Keyword
	public void verifyTransportGraph(String sheetName){
		
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommunityTransportation'))
		WebUI.verifyElementText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/div_ Meter Name'), "Vehicle miles traveled on individual vehicles daily (VMT)", FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/DataInput/CreateMeterBuilding/DetailsTab'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/CityCommDataInput/MeterNames/TransportGraphUnit')), "miles", false)
		int j=6
		(1..5).each{
			String reading1 = dataExcelTemplate.getCellData(sheetName, "Reading5", j)
			WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]), GlobalVariable.minAngularWait)
			WebUI.focus(findTestObject('Object Repository/CityCommDataInput/MeterNames/CityCommGraphDI',[index: it]))
			String[] reading=WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).split(" ")
			WebUI.verifyMatch(reading[0], reading1, false, FailureHandling.CONTINUE_ON_FAILURE)
			//Assert.assertTrue(WebUI.getText(findTestObject('Object Repository/DataInput/CreateMeterBuilding/ToolTipGraph')).contains(reading1))
			WebUI.delay(2)
			j--
		}
	}
	
	@Keyword
	public void editAreaAndPopulationCityComm(String sheetName, int rowNum){
		
		String prjPopulation= data.getCellData(sheetName, "Population", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		
		//Verify delete the default population and input the new population values
		
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		navigation.navigateIntoDataInput()
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),prjPopulation , false)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/DeleteButtonOne'))
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/StartDate'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'), 10)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '1000')
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/SettingDropdown'), GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),'1000' , false)
		
		//Verify delete the default area and input the new area values
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
	    WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SettingDropdown'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/IPUnit'), GlobalVariable.minAngularWait)
		if(GlobalVariable.environment=='dev'){
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),'48' , false)
		}
		else{
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'),prjArea , false)
		}
		WebUI.doubleClick(findTestObject('Object Repository/CityCommDataInput/MeterNames/DeleteButtonOne'))
		WebUI.waitForElementNotPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/AddRowButton'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/StartDate'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'), 10)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickYear2017'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		if(GlobalVariable.environment=='dev'){
			WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '1000')
		}
		else{
			WebUI.sendKeys(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'), '1000')
		}
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SaveButtonSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.refresh()
		WebUI.waitForPageLoad(GlobalVariable.minAngularWait)
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.waitForElementVisible(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectSettingTab'))
		WebUI.waitForAngularLoad(GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/SettingDropdown'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'), GlobalVariable.minAngularWait)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ProjectArea'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/CityCommDataInput/MeterNames/IPUnit'), GlobalVariable.minAngularWait)
		if(GlobalVariable.environment=='dev'){
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), '1000' , false)
		}
		else{
			WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/CityCommDataInput/MeterNames/ReadingOne'),'value'), '1000' , false)
		}
		
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickOnUnitTypeDropdown'))
		WebUI.scrollToElement(findTestObject('Object Repository/CityCommDataInput/MeterNames/SIUnits'), 5)
		WebUI.click(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickOnUnitTypeDropdown'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/CityCommDataInput/MeterNames/ClickOnUnitTypeDropdown'), GlobalVariable.minAngularWait)
		
	}
		
}

