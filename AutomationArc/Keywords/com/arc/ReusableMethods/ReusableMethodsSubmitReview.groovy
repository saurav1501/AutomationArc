	package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Robot
import java.awt.event.KeyEvent
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.zip.ZipEntry
import java.util.zip.ZipInputStream

import org.testng.Assert

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class ReusableMethodsSubmitReview extends BaseClass{
	public static String reviewAmount

	public static void performanceScoreDataInputCheckboxSelection(){
		//WebUI.waitForElementVisible(findTestObject('Object Repository/SubmitReview/EnergyCheckBox'), 20)
		WebUI.click(findTestObject('Object Repository/SubmitReview/EnergyCheckBox'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/WaterCheckBox'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/WasteCheckBox'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/TransportationCheckBox'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/HumanExperienceCheckBox'))
	}

	@Keyword
	public static void countNoOfDataInputFilesInSubmitReview(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(1)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPerformanceScoreVerificationTest')), "Performance Score Verification", false, FailureHandling.CONTINUE_ON_FAILURE)

		(1..5).each{

			if(it==1){
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetDataInputFileCountSubmitReview',[index: it])),'8', false, FailureHandling.CONTINUE_ON_FAILURE)
			}
			else if(it==4) {
				//Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetDataInputFileCountSubmitReview',[index: it])),'8')
			}
			else if(it==5) {
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetDataInputFileCountSubmitReview',[index: it])),'8', false, FailureHandling.CONTINUE_ON_FAILURE)
			}
			else
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetDataInputFileCountSubmitReview',[index: it])),'7', false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}


	@Keyword
	public void countNoOfFilesUploadedCityComm(){
		//WebUI.delay(5)
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(1)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextCity')), "Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(8)
		(1..12).each{

			if(it==1){
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetCreditFileCountCityComm',[index: it])),'7', false, FailureHandling.CONTINUE_ON_FAILURE)
			}
			else if(it==7){

			}

			else
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetCreditFileCountCityComm',[index: it])),'1', false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		//Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/BasePointFileCountCityComm')),'1')
	}

	@Keyword
	public void performanceScoreSelectionAndSummary(){
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)*/
		WebUI.delay(3)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(13)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPerformanceScoreVerificationTest')), "Performance Score Verification", false, FailureHandling.CONTINUE_ON_FAILURE)
		//reviewAmount = WebUI.getText(findTestObject('Object Repository/SubmitReview/ReviewAmount'))
		performanceScoreDataInputCheckboxSelection()
		WebUI.scrollToElement(findTestObject('SubmitReview/div_Upload'), 3)
		WebUI.click(findTestObject('SubmitReview/div_Upload'))
		WebUI.delay(6)
		ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		WebUI.delay(4)
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'), "Submit Performance Score Verification Test Message")
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSaveAddtionalTextArea'))
		WebUI.delay(5)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'),'value'),'Submit Performance Score Verification Test Message')
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyTotalCredits')),'5', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPerformanceScoreVerificationTextOnSummeryPage')), "Performance Score Verification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('SubmitReview/input_form-control ng-untouche'), 'abhishekkumar@groupten.com')
		WebUI.click(findTestObject('SubmitReview/span_Send'))
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
	}

	@Keyword
	public void performanceScoreSelectionAndSummeryWithoutPerformanceData(){
		/*WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		 WebUI.delay(1)*/
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPerformanceScoreVerificationTest')), "Performance Score Verification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.scrollToElement(findTestObject('SubmitReview/div_Upload'), 3)
		WebUI.click(findTestObject('SubmitReview/div_Upload'))
		WebUI.delay(6)
		ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		WebUI.delay(4)
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'), "Submit Performance Score Verification Test Message")
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSaveAddtionalTextArea'))
		WebUI.delay(2)
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'),'value'),'Submit Performance Score Verification Test Message')
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyTotalCredits')),'0', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPerformanceScoreVerificationTextOnSummeryPage')), "Performance Score Verification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('SubmitReview/input_form-control ng-untouche'), 'abhishekkumar@groupten.com')
		WebUI.click(findTestObject('SubmitReview/span_Send'))
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
	}

	//verify text 'Update operating hours and occupancy to generate score for all categories'
	@Keyword
	public void verifyOprHrsAndOccupancyUpdateMessageAtSubmitReviewPage(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(1)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyUpdateOprHrsAndOccupancyToGenerateScore')), "(Update operating hours and occupancy to generate score for all categories)", false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	//Transit PreRequisite and BasePoint Default status
	@Keyword
	public void preRequisiteAndBasePointDefaultStatus(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		//for preRequisite
		(1..10).each {
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatus',[('index') : it])),'Missing', false, FailureHandling.CONTINUE_ON_FAILURE)
		}

		//for BasePoint
		(11..33).each {
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatus',[('index') : it])),'Missing', false, FailureHandling.CONTINUE_ON_FAILURE)
		}

		println "Credits- PreRequisite and Base Points default status verified successfully"
	}

	//Transit PreRequisite and BasePoint Status during Submit review
	@Keyword
	public void preRequisiteAndBasePointDuringSubmitReviewStatus(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(15)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		//for preRequisite
		(1..10).each {
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatus',[('index') : it])),'Ready for Review', false, FailureHandling.CONTINUE_ON_FAILURE)
		}

		//for BasePoint
		(11..33).each {
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatus',[('index') : it])),'Ready for Review', false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		println "Credits- PreRequisite and Base Points default status verified successfully"
	}

	//City/Comm PreRequisite and BasePoint Default status
	@Keyword
	public void preRequisiteAndBasePointDefaultStatusCityComm(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		//for preRequisite
		(1..6).each {
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatus',[('index') : it])),'Missing', false, FailureHandling.CONTINUE_ON_FAILURE)
		}


		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatusBasePointCity')),'Missing', false, FailureHandling.CONTINUE_ON_FAILURE)


		println "Credits- PreRequisite and Base Points default status verified successfully"
	}



	//City/Comm PreRequisite and BasePoint during submit review status
	@Keyword
	public void preRequisiteAndBasePointStatusDuringSubmitReviewCityComm(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		//for preRequisite
		(1..6).each {
			WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatus',[('index') : it])),'Ready for Review', false, FailureHandling.CONTINUE_ON_FAILURE)
		}


		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CreditStatusBasePointCity')),'Ready for Review', false, FailureHandling.CONTINUE_ON_FAILURE)


		println "Credits- PreRequisite and Base Points default status verified successfully"
	}

	//Check only one certification is allowed(Transit Above Ground)
	@Keyword
	public void verifyOnlyOneCertificationAllowedTransitAboveGround(){

		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextCity')), "Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyProjectStillUnderReviewTextPresent')),'Project is still under review', false, FailureHandling.CONTINUE_ON_FAILURE)
		Assert.assertEquals(WebUI.verifyElementNotClickable(findTestObject('Object Repository/SubmitReview/CheckContinueButtonDisable')), true)

	}


	@Keyword
	public void verifyCertificationIsAllowedWithoutRequirementTUG(){

		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(7)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextCity')), "Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifySummaryTextOnSummaryPage')), "Summary", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPaymentTextPaymentPage')), "Payment", false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void countNoOfFilesUploadedTransit(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextCity')), "Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)

		(1..33).each{

			if(it==1){
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetCreditFileCountCityComm',[index: it])),'7', false, FailureHandling.CONTINUE_ON_FAILURE)
			}
			else
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetCreditFileCountCityComm',[index: it])),'1', false, FailureHandling.CONTINUE_ON_FAILURE)
		}
		(34..36).each{
			if(it==34)
			{
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetCreditFileCountCityComm',[index: it])),'8', false, FailureHandling.CONTINUE_ON_FAILURE)
			}
			else
				WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/DataInput/CreditFileupload/GetCreditFileCountCityComm',[index: it])),'7', false, FailureHandling.CONTINUE_ON_FAILURE)
		}
	}


	@Keyword
	public void certificationSelectionAndSummeryTransit(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextCity')), "Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(5)
		/*(1..28).each {
		 WebUI.check(findTestObject('SubmitReview/CheckBoxReview',[('index') : it]))
		 }
		 WebUI.scrollToElement(findTestObject('SubmitReview/div_Upload'), 3)
		 WebUI.click(findTestObject('SubmitReview/div_Upload'))
		 WebUI.delay(6)
		 ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		 WebUI.delay(4)
		 WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'), "Submit Certification Test Message")
		 WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSaveAddtionalTextArea'))
		 //WebUI.refresh()
		 Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'),'value'),'Submit Certification Test Message')
		 Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyTotalCredits')),'38')*/
		WebUI.waitForElementClickable(findTestObject('Object Repository/SubmitReview/button_Continue'), 40)
		WebUI.click(findTestObject('Object Repository/SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextSummaryCityProject')), "Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('SubmitReview/input_form-control ng-untouche'), 'abhishekkumar@groupten.com')
		WebUI.click(findTestObject('SubmitReview/span_Send'))
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
	}

	@Keyword
	public void certificationSelectionAndSummeryCityCom(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(1)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextCity')), "Certification",false, FailureHandling.CONTINUE_ON_FAILURE)
		reviewAmount = WebUI.getText(findTestObject('Object Repository/SubmitReview/ReviewAmount'))
		WebUI.delay(5)
		//countNoOfFilesUploadedCityComm()
		WebUI.check(findTestObject('Object Repository/SubmitReview/BaseScoreCheckBoxCity'))
		(1..6).each {
			WebUI.check(findTestObject('SubmitReview/CheckBoxReview',[('index') : it]))
		}
		WebUI.scrollToElement(findTestObject('SubmitReview/div_Upload'), 3)
		WebUI.click(findTestObject('SubmitReview/div_Upload'))
		WebUI.delay(6)
		ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		WebUI.delay(4)
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'), "Submit Certification Test Message")
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSaveAddtionalTextArea'))
		//WebUI.refresh()
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'),'value'),'Submit Certification Test Message')
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyTotalCredits')),'13',false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CertificationTextSummaryCityProject')), "Certification",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('SubmitReview/input_form-control ng-untouche'), 'abhishekkumar@groupten.com')
		WebUI.click(findTestObject('SubmitReview/span_Send'))
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
	}

	@Keyword
	public void  preCertificationSelectionAndSummeryCityCom(){
		//WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		//WebUI.delay(1)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/PreCertificationText')), "Pre-Certification",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.scrollToElement(findTestObject('Object Repository/SubmitReview/ClickOnCertificationType'),1)
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickOnCertificationType'))
		WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/SubmitReview/SelectPre-Certification'))
		WebUI.delay(5)
		(1..6).each {
			WebUI.check(findTestObject('SubmitReview/CheckBoxReview',[('index') : it]))
		}
		WebUI.scrollToElement(findTestObject('SubmitReview/div_Upload'),3)
		WebUI.click(findTestObject('SubmitReview/div_Upload'))
		WebUI.delay(6)
		ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		WebUI.delay(4)
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'), "Submit PreCertification Test Message")
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSaveAddtionalTextArea'))
		//WebUI.refresh()
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'),'value'),'Submit PreCertification Test Message')
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyTotalCredits')),'12',false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPreCertificationTextSummery')), "Pre-Certification",false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('SubmitReview/input_form-control ng-untouche'), 'abhishekkumar@groupten.com')
		WebUI.click(findTestObject('SubmitReview/span_Send'))
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
	}
	@Keyword
	public void checkSubmitReviewIsDisabledTransit(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(6)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review", false, FailureHandling.CONTINUE_ON_FAILURE)
		//check whether the information for registration payment is pending or not
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/CheckRegistrationPaymentPendingText')), "Registration payment is still under process", false, FailureHandling.CONTINUE_ON_FAILURE)
		//check if the continue button to submit review is disabled or not
		Assert.assertEquals(WebUI.verifyElementNotClickable(findTestObject('Object Repository/SubmitReview/CheckContinueButtonDisable')), true)
		println "Due to pending registration payment the error message is displaying "
	}

	@Keyword
	public void preCertificationSelectionAndSummeryTransit(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(6)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/SubmitReviewText')), "Submit for Review",false, FailureHandling.CONTINUE_ON_FAILURE )

		//WebUI.waitForElementClickable(findTestObject('Object Repository/SubmitReview/ClickOnCertificationType'), 3)
		//WebUI.scrollToElement(findTestObject('Object Repository/SubmitReview/ClickOnCertificationType'),3)
		WebUI.delay(20)
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickOnCertificationType'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/SubmitReview/SelectPre-Certification'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/PreCertificationText')), "Pre-Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		(1..28).each {
			WebUI.check(findTestObject('SubmitReview/CheckBoxReview',[('index') : it]))
		}
		WebUI.scrollToElement(findTestObject('SubmitReview/div_Upload'),3)
		WebUI.click(findTestObject('SubmitReview/div_Upload'))
		WebUI.delay(6)
		ReusableMethodsDataInput.uploadFile(UploadDocumentDataInput)
		WebUI.delay(4)
		WebUI.sendKeys(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'), "Submit Pre Certification Test Message")
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSaveAddtionalTextArea'))
		//WebUI.refresh()
		//WebUI.verifyMatch(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/SubmitReviewTextAreaAdditionalMessage'),'value'),'Submit Pre Certification Test Message', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyTotalCredits')),'38', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/SubmitReview/button_Continue'))
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/VerifyPreCertificationTextSummery')), "Pre-Certification", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/PreRequisiteEligibleTextVerification')), "Eligible", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.setText(findTestObject('SubmitReview/input_form-control ng-untouche'), 'abhishekkumar@groupten.com')
		WebUI.click(findTestObject('SubmitReview/span_Send'))
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
	}


	/*@Keyword
	 public void checkReviewPaymentPayNowStatus(){
	 String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/ReviewPaymentStatus'))
	 Assert.assertEquals(regStatus, "Completed")
	 }*/

	@Keyword
	public void submitPerformanceScoreAndVerifySuccessMessage(){
		WebUI.click(findTestObject('Object Repository/SubmitReview/SubmitPerformanceScore'))
		WebUI.delay(5)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/MessageSuccessfullySubmitted')), "Successfully Submitted", false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void submitCertificationAndVerifySuccessMessage(){
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/SubmitReview/SubmitCertification'),3)
		WebUI.waitForElementNotClickable(findTestObject('Object Repository/SubmitReview/SubmitCertification'),9)
		WebUI.click(findTestObject('Object Repository/SubmitReview/SubmitCertification'))
		WebUI.delay(8)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/MessageSuccessfullySubmitted')), "Successfully Submitted", false, FailureHandling.CONTINUE_ON_FAILURE)
	}
	@Keyword
	public void submitPreCertAndVerifySuccessMessage(){
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/SubmitReview/SubmitPreCertification'), 3)
		WebUI.waitForElementClickable(findTestObject('Object Repository/SubmitReview/SubmitPreCertification'),9)
		WebUI.click(findTestObject('Object Repository/SubmitReview/SubmitPreCertification'))
		WebUI.delay(8)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/SubmitReview/MessageSuccessfullySubmitted')), "Successfully Submitted", false, FailureHandling.CONTINUE_ON_FAILURE)
	}

	@Keyword
	public void onClickChangeCreditNavigateSelectionPage(){
		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		//WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.delay(10)
		performanceScoreDataInputCheckboxSelection()
		WebUI.click(findTestObject('Object Repository/SubmitReview/button_Continue'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/ChangeCreditLink'))
		WebUI.delay(4)
		String url=WebUI.getUrl()
		Assert.assertTrue(url.contains('submitforreview/selection'))
		println 'Change credit successfully redirected to the Selection page'
	}

	/*@Keyword
	 public void addCertification(String sheetName, int rowNum){
	 String prjId   =   data.getCellData(sheetName, "ProjectID", rowNum)
	 WebUI.click(findTestObject('Manage/adminToolNew/a_ Certification'))
	 WebUI.delay(3)
	 WebUI.setText(findTestObject('Manage/adminToolNew/leedId'),prjId )
	 WebUI.delay(2)
	 WebUI.setText(findTestObject('Object Repository/Manage/adminToolNew/certificationPoints'),"80" )
	 WebUI.delay(2)
	 WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/button_silver'))
	 WebUI.delay(2)
	 WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/button_Save'))
	 WebUI.delay(5)
	 Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/Manage/adminToolNew/MessageSuccessfullySubmitted')), "Project Certification added")
	 }*/

	@Keyword
	public void addCertificationFromAdminToolForCities(String sheetName, int rowNum){
		String prjId   =   data.getCellData(sheetName, "ProjectID", rowNum)
		WebUI.click(findTestObject('Manage/adminToolNew/a_ Certification'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('Manage/adminToolNew/leedId'),prjId )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemDownArrow'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Manage/adminToolNew/a_LEED v4 Cities'), 2)
		WebUI.click(findTestObject('Manage/adminToolNew/a_LEED v4 Cities'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminTool/SourceId'), prjId)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminToolNew/certificationPoints'),"80" )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/button_Save'))
		WebUI.delay(10)
		//WebUI.closeWindowIndex(2)
		//WebUI.delay(2)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/Manage/adminToolNew/MessageSuccessfullySubmitted')), "Project Certification added")
	}

	@Keyword
	public void addCertificationFromAdminToolForCommunity(String sheetName, int rowNum){
		String prjId   =   data.getCellData(sheetName, "ProjectID", rowNum)
		WebUI.click(findTestObject('Manage/adminToolNew/a_ Certification'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('Manage/adminToolNew/leedId'),prjId )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemDownArrow'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemCommunity'), 2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemCommunity'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminTool/SourceId'), prjId)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminToolNew/certificationPoints'),"80" )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/button_Save'))
		WebUI.delay(15)
		//WebUI.closeWindowIndex(2)
		//WebUI.delay(2)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
		//Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/Manage/adminToolNew/MessageSuccessfullySubmitted')), "Project Certification added")
	}

	@Keyword
	public void addCertificationFromAdminToolForBuildings(String sheetName, int rowNum){
		String prjId   =   data.getCellData(sheetName, "ProjectID", rowNum)
		WebUI.click(findTestObject('Manage/adminToolNew/a_ Certification'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('Manage/adminToolNew/leedId'),prjId )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemDownArrow'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemBuilding'), 2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemBuilding'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminTool/SourceId'), prjId)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminToolNew/certificationPoints'),"80" )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/button_Save'))
		WebUI.delay(10)
		//Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/Manage/adminToolNew/MessageSuccessfullySubmitted')), "Project Certification added")
		//WebUI.closeWindowIndex(2)
		//WebUI.delay(2)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)
	}


	@Keyword
	public void addCertificationFromAdminToolForTransit(String sheetName, int rowNum){
		String prjId   =   data.getCellData(sheetName, "ProjectID", rowNum)
		WebUI.click(findTestObject('Manage/adminToolNew/a_ Certification'))
		WebUI.delay(3)
		WebUI.setText(findTestObject('Manage/adminToolNew/leedId'),prjId )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemDownArrow'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemTransit'), 2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/ratingSystemTransit'))
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminTool/SourceId'), prjId)
		WebUI.delay(2)
		WebUI.setText(findTestObject('Object Repository/Manage/adminToolNew/certificationPoints'),"80" )
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/Manage/adminToolNew/button_Save'))
		WebUI.delay(10)
		println WebUI.getWindowIndex()
		//WebUI.closeWindowIndex(2)
		//WebUI.delay(2)
		WebUI.closeWindowIndex(1)
		WebUI.delay(2)
		WebUI.switchToWindowIndex(0)

	}

	@Keyword
	public void verifyReportingPeriodPreviousAndCurrent(){

		//WebUI.click(findTestObject('Object Repository/SubmitReview/clickOnSideBar'))
		WebUI.delay(5)
		WebUI.click(findTestObject('SubmitReview/a_ Review'))
		WebUI.refresh()
		WebUI.delay(10)
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy")
		Date date = new Date()
		println dateFormat.format(date)
		//check if able to select the current date and previous year as reporting year
		WebUI.waitForElementVisible(findTestObject('Object Repository/SubmitReview/ReviewDate'), 20)
		Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/ReviewDate'),'value'), dateFormat.format(date))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSelectDate'))
		WebUI.delay(4)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/SubmitReview/ClickCurrentMonth'), 20)
		//WebUI.scrollToElement(findTestObject('Object Repository/SubmitReview/ClickCurrentMonth'),10)
		//WebUI.click(findTestObject('Object Repository/SubmitReview/ClickCurrentMonth'))
		//WebUI.delay(3)
		//WebUI.waitForElementVisible(findTestObject('Object Repository/SubmitReview/ClickOnYear'), 20)
		//WebUI.click(findTestObject('Object Repository/SubmitReview/ClickOnYear'))
		//WebUI.delay(3)
		//WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSelectYear'))
		//WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/SubmitReview/ClickToSelectMonth'))
		//WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/SubmitReview/ClickOnDay'))
		WebUI.delay(8)
		/*WebUI.click(findTestObject('Object Repository/SubmitReview/ReportingDate'))
		 WebUI.delay(2)
		 WebUI.setText(findTestObject('Object Repository/SubmitReview/ReportingDate'),"02/02/2017" )*/
		Robot robot= new Robot()
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		robot.keyPress(KeyEvent.VK_ENTER)
		robot.keyRelease(KeyEvent.VK_ENTER)
		WebUI.delay(8)
		String reportingDate= WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/ReviewDate'),'value')
		//Assert.assertEquals(WebUI.getAttribute(findTestObject('Object Repository/SubmitReview/ReviewDate'),'value'), '02/02/2017')

		//verify if the current year score is visible for the current year
		Assert.assertTrue(WebUI.verifyElementVisible(findTestObject('Object Repository/SubmitReview/CurrentScore')))
		String currentScore= WebUI.getText(findTestObject('Object Repository/SubmitReview/CurrentScore'))
		println currentScore
		String reportingScore= WebUI.getText(findTestObject('Object Repository/SubmitReview/ReportingPeroidScore'))
		println reportingScore
		//click on the data input checkbox
		performanceScoreDataInputCheckboxSelection()
		WebUI.delay(4)
		WebUI.click(findTestObject('SubmitReview/button_Continue'))
		WebUI.delay(10)
		String reportingPeriod= WebUI.getText(findTestObject('Object Repository/SubmitReview/SummaryPageReportingPeriod'))
		//Assert.assertEquals('02/02/2016 - 02/02/2017', reportingPeriod)
		Assert.assertEquals(WebUI.getText(findTestObject('Object Repository/SubmitReview/SummaryPageScoreSubmitted')), reportingScore+"/100")
		WebUI.delay(7)
		//WebUI.mouseOver(findTestObject('Object Repository/SubmitReview/ScoreSidebar'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/ScoreSidebar'))
		WebUI.click(findTestObject('Object Repository/SubmitReview/ScoreTotalSideBar'))
		WebUI.delay(12)
		String scoreTotal = WebUI.getText(findTestObject('Object Repository/SubmitReview/TotalScore'))
		println scoreTotal
		Assert.assertEquals(scoreTotal, currentScore)
		println "The score includes base point in addition to data input"

	}

	//delete file
	public void deleteFile(String PDFURL)
	{
		File file = null
		boolean bool = false
		try {
			file = new File(PDFURL)
			bool = file.delete()
			println "File deleted: "+bool
		}
		catch (Exception e) {
			e.printStackTrace()
		}

	}

	//Check if the file is extracted
	public boolean isFileExtracted(String fileName, String UnzippedNewFolder ){

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



	private static void unzip(String zipFilePath, String destDir) {
		File dir = new File(destDir);
		// create output directory if it doesn't exist
		if(!dir.exists()) dir.mkdirs();
		FileInputStream fis;
		//buffer for read and write data to file
		byte[] buffer = new byte[1024];
		try {
			fis = new FileInputStream(zipFilePath);
			ZipInputStream zis = new ZipInputStream(fis);
			ZipEntry ze = zis.getNextEntry();
			while(ze != null){
				String fileName = ze.getName().replaceAll("[:*?\"<>|]", ".");
				File newFile = new File(destDir + File.separator + fileName);
				System.out.println("Unzipping to "+newFile.getAbsolutePath());
				//create directories for sub directories in zip
				new File(newFile.getParent()).mkdirs();
				FileOutputStream fos = new FileOutputStream(newFile);
				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				fos.close();
				//close this ZipEntry
				zis.closeEntry();
				ze = zis.getNextEntry();
			}
			//close last ZipEntry
			zis.closeEntry();
			zis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	//Verify the project Snapshot file names
	@Keyword
	public void verifySnapshotFileNameUploaded(String sheetName, int rowNum, String ratingSystem){


		String projectId = data.getCellData(sheetName, "ProjectID", rowNum)
		String fileName= projectId+".zip"
		String sourceZipFile= RunConfiguration.getProjectDir()+"/Download/"+fileName
		println sourceZipFile
		String sourceExtractedFile= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ ratingSystem+"/Performance Score Verification/energy/"
		println sourceExtractedFile
		String destinationUnZippedFolder= RunConfiguration.getProjectDir()+"/Download/"
		println destinationUnZippedFolder
		//deleteFile(sourceZipFile)
		//deleteFile(sourceExtractedFile)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'), 4)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'))
		WebUI.setText(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'), projectId)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewSearchButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'), 20, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'))
		WebUI.delay(6)
		unzip(sourceZipFile, destinationUnZippedFolder)
		WebUI.delay(5)

		if((isFileExtracted('Parking SJ.jpg', sourceExtractedFile)))
			KeywordUtil.markWarning("Parking Sj.jpg file is present  ")
		else
			KeywordUtil.markFailed("Parking Sj.jpg file Not present")

		if((isFileExtracted('USGBC.pdf', sourceExtractedFile)))
			KeywordUtil.markWarning("USGBC.pdf file is present  ")
		else
			KeywordUtil.markFailed("USGBC.pdf file Not present")

		if((isFileExtracted('txtFileUpload.txt', sourceExtractedFile)))
			KeywordUtil.markWarning("txtFileUpload.txt file is present ")
		else
			KeywordUtil.markFailed("txtFileUpload.txt file Not present")

		if((isFileExtracted('uploadPng.png', sourceExtractedFile)))
			KeywordUtil.markWarning("uploadPng.png file is present  ")
		else
			KeywordUtil.markFailed("uploadPng.png file Not present")

		if((isFileExtracted('uploadGif.gif', sourceExtractedFile)))
			KeywordUtil.markWarning("uploadGif.gif file is present  ")
		else
			KeywordUtil.markFailed("uploadGif.gif file Not present")

		if((isFileExtracted('uploasExcel.xlsx', sourceExtractedFile)))
			KeywordUtil.markWarning("uploasExcel.xlsx file is present  ")
		else
			KeywordUtil.markFailed("uploasExcel.xlsx file Not present")

		if((isFileExtracted('uploadDoc.docx', sourceExtractedFile)))
			KeywordUtil.markWarning("uploadDoc.docx file is present  ")
		else
			KeywordUtil.markFailed("uploadDoc.docx file Not present")
	}


	public void verifyFilePresent(String sourceExtractedFile){

		if((isFileExtracted('Parking SJ.jpg', sourceExtractedFile)))
			KeywordUtil.markWarning("Parking Sj.jpg file is present  ")
		else
			KeywordUtil.markFailed("Parking Sj.jpg file Not present")

		if((isFileExtracted('USGBC.pdf', sourceExtractedFile)))
			KeywordUtil.markWarning("USGBC.pdf file is present  ")
		else
			KeywordUtil.markFailed("USGBC.pdf file Not present")

		if((isFileExtracted('txtFileUpload.txt', sourceExtractedFile)))
			KeywordUtil.markWarning("txtFileUpload.txt file is present ")
		else
			KeywordUtil.markFailed("txtFileUpload.txt file Not present")

		if((isFileExtracted('uploadPng.png', sourceExtractedFile)))
			KeywordUtil.markWarning("uploadPng.png file is present  ")
		else
			KeywordUtil.markFailed("uploadPng.png file Not present")

		if((isFileExtracted('uploadGif.gif', sourceExtractedFile)))
			KeywordUtil.markWarning("uploadGif.gif file is present  ")
		else
			KeywordUtil.markFailed("uploadGif.gif file Not present")

		if((isFileExtracted('uploasExcel.xlsx', sourceExtractedFile)))
			KeywordUtil.markWarning("uploasExcel.xlsx file is present  ")
		else
			KeywordUtil.markFailed("uploasExcel.xlsx file Not present")

		if((isFileExtracted('uploadDoc.docx', sourceExtractedFile)))
			KeywordUtil.markWarning("uploadDoc.docx file is present  ")
		else
			KeywordUtil.markFailed("uploadDoc.docx file Not present")

	}


	//Verify the project Snapshot file names
	@Keyword
	public void verifySnapshotFileNameUploadedBuilding(String sheetName, int rowNum, String ratingSystem){


		String projectId = data.getCellData(sheetName, "ProjectID", rowNum)
		String fileName= projectId+".zip"
		String sourceZipFile= RunConfiguration.getProjectDir()+"/Download/"+fileName
		println sourceZipFile
		String sourceExtractedFileEnergy= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Performance Score Verification/energy/"
		println sourceExtractedFileEnergy
		String sourceExtractedFileWater= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Performance Score Verification/water/"
		String sourceExtractedFileWaste= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Performance Score Verification/waste/"

		String destinationUnZippedFolder= RunConfiguration.getProjectDir()+"/Download/"
		println destinationUnZippedFolder
		//deleteFile(sourceZipFile)
		//deleteFile(sourceExtractedFile)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'), 4)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'))
		WebUI.setText(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'), projectId)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewSearchButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'), 20, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'))
		WebUI.delay(10)
		unzip(sourceZipFile, destinationUnZippedFolder)
		WebUI.delay(5)
		/*println isFileExtracted('Test de téléchargement de fichier(French).txt')
		 println isFileExtracted('Upload do arquivo de teste(Portugues).txt')
		 println isFileExtracted('Testen Sie den Datei-Upload(Greman).txt')
		 println isFileExtracted('Carga de archivos de prueba(Spanish).txt')
		 println isFileExtracted('測試文件上傳(ChineseT).txt')
		 println isFileExtracted('测试文件上传(ChineseS).txt')
		 println isFileExtracted('테스트 파일 업로드(Korean).txt')
		 println isFileExtracted('Test Dosyası Yüklemesi(Turkish).txt')*/

		/*Assert.assertTrue(isFileExtracted('GBCI PAN Card.pdf'), "GBCI PAN Card File Didn't downloaded successfully")
		 Assert.assertTrue(isFileExtracted('GBCI-Noida-GST Registration Certificate.pdf'), "GBCI-Noida-GST Registration Certificate File Didn't downloaded successfully")
		 */
		if((isFileExtracted('Test de téléchargement de fichier(French).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Test de téléchargement de fichier(French).txt file is present  ")
		else
			KeywordUtil.markFailed("Test de téléchargement de fichier(French).txt file not present")

		if((isFileExtracted('Upload do arquivo de teste(Portugues).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Upload do arquivo de teste(Portugues).txt file present ")
		else
			KeywordUtil.markFailed("Upload do arquivo de teste(Portugues).txt file not present")

		if((isFileExtracted('Testen Sie den Datei-Upload(Greman).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Testen Sie den Datei-Upload(Greman).txt file present ")
		else
			KeywordUtil.markFailed("Testen Sie den Datei-Upload(Greman).txt file not present")

		if((isFileExtracted('Carga de archivos de prueba(Spanish).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Carga de archivos de prueba(Spanish).txt file present")
		else
			KeywordUtil.markFailed("Carga de archivos de prueba(Spanish).txt file Not present")

		if((isFileExtracted('測試文件上傳(ChineseT).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("測試文件上傳(ChineseT).txt file is present  ")
		else
			KeywordUtil.markFailed("測試文件上傳(ChineseT).txt file Not present")

		if((isFileExtracted('测试文件上传(ChineseS).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("测试文件上传(ChineseS).txt file is present  ")
		else
			KeywordUtil.markFailed("测试文件上传(ChineseS).txt file Not present")

		if((isFileExtracted('테스트 파일 업로드(Korean).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("테스트 파일 업로드(Korean).txt file is present  ")
		else
			KeywordUtil.markFailed("테스트 파일 업로드(Korean).txt file Not present")

		if((isFileExtracted('Test Dosyası Yüklemesi(Turkish).txt', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Test Dosyası Yüklemesi(Turkish).txt file is present  ")
		else
			KeywordUtil.markFailed("Test Dosyası Yüklemesi(Turkish).txt file Not present")
	}


	//Verify the project Snapshot file names
	@Keyword
	public void verifySnapshotFileNameUploadedBuildingTransit(String sheetName, int rowNum, String ratingSystem){


		String projectId = data.getCellData(sheetName, "ProjectID", rowNum)
		String fileName= projectId+".zip"
		String sourceZipFile= RunConfiguration.getProjectDir()+"/Download/"+fileName
		println sourceZipFile
		String sourceExtractedFileEnergy= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Pre-Certification/energy/"
		println sourceExtractedFileEnergy
		String sourceExtractedFileWater= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Pre-Certification/water/"
		String sourceExtractedFileWaste= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Pre-Certification/waste/"
		String destinationUnZippedFolder= RunConfiguration.getProjectDir()+"/Download/"
		String sourceExtractedFile= RunConfiguration.getProjectDir()+"/Download/"+projectId
		println destinationUnZippedFolder
		//deleteFile(sourceZipFile)
		//deleteFile(sourceExtractedFile)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'), 4)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'))
		WebUI.setText(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'), projectId)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewSearchButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'), 20, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'))
		WebUI.delay(100)
		unzip(sourceZipFile, destinationUnZippedFolder)
		WebUI.delay(5)

		if((isFileExtracted('Ramayana-01_01.pdf', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Ramayana-01_01.pdf file is present  ")
		else
			KeywordUtil.markFailed("Ramayana-01_01.pdf file not present")

		if((isFileExtracted('Ramayana-02_02.pdf', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Ramayana-02_02.pdf file present ")
		else
			KeywordUtil.markFailed("Ramayana-02_02.pdf file not present")

		if((isFileExtracted('Srimad_Bhagavatam_Canto_01_Hindi.pdf', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("Srimad_Bhagavatam_Canto_01_Hindi.pdf file present ")
		else
			KeywordUtil.markFailed("Srimad_Bhagavatam_Canto_01_Hindi.pdf file not present")

		if((isFileExtracted('A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf', sourceExtractedFileEnergy)))
			KeywordUtil.markWarning("A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf file present")
		else
			KeywordUtil.markFailed("A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf file Not present")

		deleteFile(sourceZipFile)
		deleteFile(sourceExtractedFile)
	}


	//Transit Above ground
	@Keyword
	public void verifySnapshotFileNameUploadedBuildingTransitAboveGround(String sheetName, int rowNum, String ratingSystem){


		String projectId = data.getCellData(sheetName, "ProjectID", rowNum)
		String fileName= projectId+".zip"
		String sourceZipFile= RunConfiguration.getProjectDir()+"/Download/"+fileName
		println sourceZipFile
		String sourceExtractedFileEnergy= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Certification/energy/"
		println sourceExtractedFileEnergy
		String sourceExtractedFileWater= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Certification/water/"
		String sourceExtractedFileWaste= RunConfiguration.getProjectDir()+"/Download/"+projectId+"/"+ratingSystem+"/Certification/waste/"
		String destinationUnZippedFolder= RunConfiguration.getProjectDir()+"/Download/"
		println destinationUnZippedFolder
		//deleteFile(sourceZipFile)
		//deleteFile(sourceExtractedFile)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'), 4)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewButton'))
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'))
		WebUI.setText(findTestObject('Object Repository/PerformanceScore/AdminToolsReviewSearchBar'), projectId)
		WebUI.click(findTestObject('Object Repository/PerformanceScore/AdminToolReviewSearchButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'), 20, FailureHandling.STOP_ON_FAILURE)
		/*WebUI.click(findTestObject('Object Repository/PerformanceScore/SnapshotLinkToDownload'))
		 WebUI.delay(300)
		 unzip(sourceZipFile, destinationUnZippedFolder)
		 WebUI.delay(5)
		 if((isFileExtracted('Ramayana-01_01.pdf', sourceExtractedFileEnergy)))
		 KeywordUtil.markWarning("Ramayana-01_01.pdf file is present  ")
		 else
		 KeywordUtil.markFailed("Ramayana-01_01.pdf file not present")
		 if((isFileExtracted('Ramayana-02_02.pdf', sourceExtractedFileEnergy)))
		 KeywordUtil.markWarning("Ramayana-02_02.pdf file present ")
		 else
		 KeywordUtil.markFailed("Ramayana-02_02.pdf file not present")
		 if((isFileExtracted('Srimad_Bhagavatam_Canto_01_Hindi.pdf', sourceExtractedFileEnergy)))
		 KeywordUtil.markWarning("Srimad_Bhagavatam_Canto_01_Hindi.pdf file present ")
		 else
		 KeywordUtil.markFailed("Srimad_Bhagavatam_Canto_01_Hindi.pdf file not present")
		 if((isFileExtracted('A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf', sourceExtractedFileEnergy)))
		 KeywordUtil.markWarning("A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf file present")
		 else
		 KeywordUtil.markFailed("A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf file Not present")*/
	}
}
