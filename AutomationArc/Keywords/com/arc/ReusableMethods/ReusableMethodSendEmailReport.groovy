package com.arc.ReusableMethods

import java.text.SimpleDateFormat

import com.arc.BaseClass.BaseClass
import com.arc.BaseClass.SendEmail
import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class ReusableMethodSendEmailReport extends BaseClass {


	@Keyword
	public static void sendEmailReport(){
		int totalTest = data.getCellIntData(GlobalVariable.Result, "Total", GlobalVariable.rowNumTwo)
		int totalPass = data.getCellIntData(GlobalVariable.Result, "Passed", GlobalVariable.rowNumTwo)
		int totalFail =  data.getCellIntData(GlobalVariable.Result, "Failed", GlobalVariable.rowNumTwo)
		//def duration = data.getCellIntData(GlobalVariable.Result, "Duration", GlobalVariable.rowNumTwo)
		//def execution
		//Date d1 = format.parse(duration)
		/*use(groovy.time.TimeCategory) {
		 println duration
		 //print "Days: ${duration.days}, Hours: ${duration.hours}"
		 execution= "Hours: ${duration.hours }, Minutes: ${duration.minutes}, Seconds: ${duration.seconds}"
		 }*/
		SendEmail.sendStatusReport(totalTest, totalPass, totalFail)
	}
}
