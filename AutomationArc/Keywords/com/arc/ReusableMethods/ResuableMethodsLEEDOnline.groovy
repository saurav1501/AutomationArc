package com.arc.ReusableMethods

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat

import com.arc.BaseClass.BaseClass
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class ResuableMethodsLEEDOnline extends BaseClass {
	ReusableMethodsDataInput reusableMethodsDataInput = new ReusableMethodsDataInput()
	ReusableMethodsNavigation reusableMethodsNavigation = new ReusableMethodsNavigation()
	ReusableMethodsSearch reusableMethodsSearch = new 	ReusableMethodsSearch()

	SimpleDateFormat formatarDate = new SimpleDateFormat(' HH:mm:ss')



	@Keyword
	public void buildingLEEDPage() {
		/**********Verify if project type selected is  'Building LEED', a pop up to redirect to LEED ONLINE appears. Verify if redirect button works as expected.*******************/
		WebUI.delay(4)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'),"LEED" ,false)
		WebUI.delay(4)
		WebUI.click(findTestObject("Page_Arc dashboard/DashboardPage/GotoLEEDOnline"))
		WebUI.switchToWindowIndex(1)
		WebUI.delay(10)
		String projectRegistration = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/AllProject/Project Registration'))
		WebUI.delay(1)
		WebUI.verifyMatch(projectRegistration,'Project Registration',false)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
	}

	@Keyword
	public void cityLEEDPage() {
		/**********Verify if project type selected is  'City LEED', a pop up to redirect to LEED ONLINE appears. Verify if redirect button works as expected.*******************/
		WebUI.delay(4)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'),"LEED for Cities" ,false)
		WebUI.delay(4)
		WebUI.click(findTestObject("Page_Arc dashboard/DashboardPage/GotoLEEDOnline"))
		WebUI.switchToWindowIndex(1)
		WebUI.delay(10)
		String projectRegistration = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/AllProject/Project Registration'))
		WebUI.delay(1)
		WebUI.verifyMatch(projectRegistration,'City Registration',false)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.click(findTestObject('DashboardNavigationNewUI/payment/Cancel'))
		WebUI.delay(5)
	}
	@Keyword
	public void communityLEEDPage() {
		/**********Verify if project type selected is  'Building LEED', a pop up to redirect to LEED ONLINE appears. Verify if redirect button works as expected.*******************/
		WebUI.delay(4)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/AddProjectNewUI/ratingSystem'),"LEED for Communities" ,false)
		WebUI.delay(4)
		WebUI.click(findTestObject("Page_Arc dashboard/DashboardPage/GotoLEEDOnline"))
		WebUI.switchToWindowIndex(1)
		WebUI.delay(10)
		String projectRegistration = WebUI.getText(findTestObject('Page_Arc dashboard/DashboardPage/AllProject/Project Registration'))
		WebUI.delay(1)
		WebUI.verifyMatch(projectRegistration,'Community Registration',false)
		WebUI.closeWindowIndex(1)
		WebUI.switchToWindowIndex(0)
		WebUI.click(findTestObject('DashboardNavigationNewUI/payment/Cancel'))
		WebUI.delay(5)
	}


	@Keyword
	public void buildingAddNewProject(String sheetName , int rowNum) {
		/**************Reading data form excel sheet*************************/
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String spaceType    = data.getCellData(sheetName, "SpaceType", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)
		Date date = new Date(System.currentTimeMillis())
		String proName
		if(sheetName.equalsIgnoreCase("USBuildingProject")){
			proName="USBuilding"
		}
		else if(sheetName.equalsIgnoreCase("ChinaBuildingProject")){
			proName="CHBuilding"
		}
		else if(sheetName.equalsIgnoreCase("BuildingIndiaProject")){
			proName="INDBuilding"
		}
		else{
			proName="CNBuilding"
		}

		String ProjectName = proName +'LEED v4.1' +formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)
		WebUI.click(findTestObject('LEEDOnline/Login/a_Create new Project'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('LEEDOnline/ProjReg/input_Name_name'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/RatingSystem'), prjRating,false)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/anticipatedType'),spaceType,false)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/Area'),prjArea )
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/Owner'),ownerOrg)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/Owner'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/OrgOrgHabitat'))
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/OwnerRepresentative'),'Arc')
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/OwnerType'), ownerType,false)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/OwnerCountry'), ownerCountry,false)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/OEmail'),ownerMail)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/input_Address 1_address1'), prjAddress)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/input_City_city'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/select_PCountry'), prjCountry, false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/select_State'),prjState, false)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/input_Postal code_postalcode'), prjZip)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/OutsideSave'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/GeoIcon'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/a_Save  Close'))
		WebUI.delay(4)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/Continue'))
		WebUI.delay(5)
	}


	//Add New Project City / Community LEED Online
	@Keyword
	public void addNewProjectCityORCom(String sheetName , int rowNum, String registerAs) {
		/**************Reading data form excel sheet*************************/
		String prjName      = data.getCellData(sheetName,"ProjectName", rowNum)
		String prjType 		= data.getCellData(sheetName, "ProjectType", rowNum)
		String prjRating 	= data.getCellData(sheetName, "RatingSystem", rowNum)
		String ownerOrg 	= data.getCellData(sheetName, "OwnerOrganization", rowNum)
		String ownerType 	= data.getCellData(sheetName, "OwnerType", rowNum)
		String ownerCountry = data.getCellData(sheetName, "OwnerCountry", rowNum)
		String ownerMail 	= data.getCellData(sheetName, "OwnerEmail", rowNum)
		String prjArea 		= data.getCellData(sheetName, "Area", rowNum)
		String prjPopulation= data.getCellData(sheetName, "Population", rowNum)
		String prjAddress 	= data.getCellData(sheetName, "Address", rowNum)
		String prjCity 		= data.getCellData(sheetName, "City", rowNum)
		String prjCountry 	= data.getCellData(sheetName, "Country", rowNum)
		String prjState 	= data.getCellData(sheetName, "State", rowNum)
		String prjZip 		= data.getCellData(sheetName, "Zip", rowNum)
		String population   = data.getCellData(sheetName, "Population", rowNum)
		String address1     = data.getCellData(sheetName, "Address1", rowNum)
		String address2     = data.getCellData(sheetName, "Address2", rowNum)
		String ownerCity    = data.getCellData(sheetName, "OwnerCity", rowNum)
		String ownerState    = data.getCellData(sheetName, "OwnerState", rowNum)
		String ownerPostalCode    = data.getCellData(sheetName, "OwnerPostalCode", rowNum)
		String ownerPhone     = data.getCellData(sheetName, "OwnerContactNo", rowNum)
		Date date = new Date(System.currentTimeMillis())
		String proName
		if(sheetName.equalsIgnoreCase("USCityProject")){
			proName="USCity"
		}
		else if(sheetName.equalsIgnoreCase("ChinaCityProject")){
			proName="CHCity"
		}
		else if (sheetName.equalsIgnoreCase("CanadaCityProject")) {
			proName="CNCity"
		}
		else if(sheetName.equalsIgnoreCase("CityIndiaProject")){
			proName="INDCity"
		}
		else if(sheetName.equalsIgnoreCase("USCommunityProject")){
			proName="USComm"
		}
		else if(sheetName.equalsIgnoreCase("ChinaCommunityProject")){
			proName="CHComm"
		}
		else if(sheetName.equalsIgnoreCase("CommunityIndiaProject")){
			proName="INDComm"
		}
		else{
			proName="CNComm"
		}

		String ProjectName = proName +'LEED v4.1' +formatarDate.format(date)
		data.setCellData(sheetName,"ProjectName", rowNum, ProjectName)
		WebUI.click(findTestObject('LEEDOnline/Login/a_Create new Project'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/LEEDOnline/ProjReg/SelectProjectRegisterAs'), registerAs, false)
		WebUI.sendKeys(findTestObject('LEEDOnline/ProjReg/input_Name_name'), ProjectName)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/RatingSystem'), prjRating,false)
		if(GlobalVariable.environment=='dev'){
			WebUI.check(findTestObject('Object Repository/Add_Project_Details/UnitTypeLeedOnline'))
			WebUI.setText(findTestObject('LEEDOnline/ProjReg/Area'),'48' )
		}
		else{
			WebUI.setText(findTestObject('LEEDOnline/ProjReg/Area'),prjArea )
		}


		WebUI.setText(findTestObject('LEEDOnline/ProjReg/Population'), population)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('LEEDOnline/ProjReg/Owner'), 2)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/Owner'),ownerOrg)
		//WebUI.delay(2)
		//WebUI.click(findTestObject('LEEDOnline/ProjReg/Owner'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/OrgOrgHabitat'))
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/OwnerRepresentative'),'Arc')
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/OwnerType'), ownerType,false)
		//Owner Information
		WebUI.setText(findTestObject('Object Repository/LEEDOnline/ProjReg/ownerAddress'), address1)
		WebUI.setText(findTestObject('Object Repository/LEEDOnline/ProjReg/ownerAddress2'), address2)
		WebUI.setText(findTestObject('Object Repository/LEEDOnline/ProjReg/ownerCity'), ownerCity)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/LEEDOnline/ProjReg/OwnerCountry'), ownerCountry, false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/LEEDOnline/ProjReg/cityOwnerState'), ownerState, false)
		WebUI.setText(findTestObject('Object Repository/LEEDOnline/ProjReg/cityOwnerPostalCode'), ownerPostalCode)
		WebUI.setText(findTestObject('Object Repository/LEEDOnline/ProjReg/cityOwnerEmail'), ownerMail)
		WebUI.setText(findTestObject('Object Repository/LEEDOnline/ProjReg/cityOwnerPhone'), ownerPhone)
		//Project Address
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/input_Address 1_address1'), prjAddress)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/input_City_city'), prjCity)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/select_PCountry'), prjCountry, false)
		WebUI.delay(2)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/ProjReg/select_State'),prjState, false)
		WebUI.setText(findTestObject('LEEDOnline/ProjReg/input_Postal code_postalcode'), prjZip)
		//h3[(text() = 'Project' or . = 'Project') or (text()="Cities") or (text()='Communities') or (text()='Campus')]WebUI.click(findTestObject('LEEDOnline/ProjReg/OutsideSave'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/GeoIcon'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/a_Save  Close'))
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/Continue'))
		WebUI.delay(5)
	}


	@Keyword
	public void acceptAgreement(String sheetName ,int rowNum) {
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('LEEDOnline/Payment/Latspan_29. EXECUTION'),10)
		WebUI.delay(9)
		WebUI.scrollToElement(findTestObject('LEEDOnline/ProjReg/button_I AGREE'),2)
		WebUI.doubleClick(findTestObject('LEEDOnline/ProjReg/button_I AGREE'))
		WebUI.delay(4)
		WebUI.click(findTestObject('LEEDOnline/ProjReg/h4_Card type'))
		String Project_ID = WebUI.getText(findTestObject('LEEDOnline/Payment/ProjID'))
		System.out.println(Project_ID)
		data.setCellData(sheetName,"ProjectID", rowNum,Project_ID)
		data.setCellData(sheetName,"RegDate", rowNum, ReusableMethodsManage.verifyBillingDate())
		WebUI.delay(4)
	}
	@Keyword
	public void paymentByCC(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		String cardName   = data.getCellData(sheetName, "CardName", rowNum)
		String cardNum    = data.getCellData(sheetName, "CardNumber", rowNum)
		String cardDate   = data.getCellData(sheetName, "Date ", rowNum)
		String cardCvv    = data.getCellData(sheetName, "CVV", rowNum)
		String partyName  = data.getCellData(sheetName, "PartyName", rowNum)
		String partyEmail = data.getCellData(sheetName, "PartyEmail", rowNum)
		String address    = data.getCellData(sheetName, "Address", rowNum)
		String city       = data.getCellData(sheetName, "City", rowNum)
		String country    = data.getCellData(sheetName, "Country", rowNum)
		String state      = data.getCellData(sheetName, "State", rowNum)
		String zip        = data.getCellData(sheetName, "Zip", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('LEEDOnline/Payment/Visa'))
		WebUI.delay(5)

		WebUI.setText(findTestObject('LEEDOnline/Payment/input_Name on card_card-name'),cardName)
		WebUI.setText(findTestObject('LEEDOnline/Payment/input_Card number_card-number'), cardNum)
		WebUI.setText(findTestObject('LEEDOnline/Payment/input_CVV_card-cvv'),cardCvv)

		//WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_CC_expiry'),cardDate)

		WebUI.clearText(findTestObject('LEEDOnline/Payment/input_Bill-to-party name_billN'))
		WebUI.setText(findTestObject('LEEDOnline/Payment/input_Bill-to-party name_billN'),partyName)

		WebUI.clearText(findTestObject('LEEDOnline/Payment/input_Bill-to-party email_bill'))
		WebUI.setText(findTestObject('LEEDOnline/Payment/input_Bill-to-party email_bill'), partyEmail)

		WebUI.clearText(findTestObject('LEEDOnline/Payment/input_Address 1_address1'))
		WebUI.setText(findTestObject('LEEDOnline/Payment/input_Address 1_address1'),address)

		WebUI.clearText(findTestObject('Object Repository/PaymenntLocator/input_city'))
		WebUI.setText(findTestObject('Object Repository/PaymenntLocator/input_city'),city)

		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/Payment/country'), country,false)
		WebUI.selectOptionByLabel(findTestObject('LEEDOnline/Payment/State'),state ,true)

		WebUI.clearText(findTestObject('LEEDOnline/Payment/Postal code_postalcode'))
		WebUI.setText(findTestObject('LEEDOnline/Payment/Postal code_postalcode'),zip)
		WebUI.delay(2)

		WebUI.click(findTestObject('LEEDOnline/Payment/a_Submit Payment'))
		WebUI.delay(4)
		WebUI.click(findTestObject('LEEDOnline/Credits/ClosePopUp'))
		WebUI.delay(2)

		WebUI.click(findTestObject('LEEDOnline/Payment/a_Submit Payment'))
		WebUI.delay(40)

		WebUI.click(findTestObject('LEEDOnline/Receipt/strong_Thank you'))
		WebUI.delay(2)
	}
	@Keyword
	public void recept(String sheetName , int rowNum){
		/********************Fetching the data via Excel Sheet ******************************/
		String Project_ID = WebUI.getText(findTestObject('LEEDOnline/Receipt/UIPrjId'))
		System.out.println(Project_ID)
		String projectID  = data.getCellData(sheetName,"ProjectID", rowNum)
		WebUI.verifyMatch(Project_ID, projectID, false)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Receipt/th_Amount'),10)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Receipt/th_ID'),10)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Receipt/strong_Thank you'),10)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Receipt/th_Order'),10)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Receipt/th_Title'),10)
		WebUI.click(findTestObject('LEEDOnline/Receipt/a_Done'))
		WebUI.delay(5)
	}

	@Keyword
	public void searchProgram(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/Search/SearchBar'))
		WebUI.setText(findTestObject('LEEDOnline/Search/SearchBar'), projectId)
		WebUI.click(findTestObject('LEEDOnline/Search/SearchBar'))
		WebUI.delay(3)
		String SearchID = WebUI.getText(findTestObject('LEEDOnline/Search/ProjectID'))
		println SearchID
		WebUI.verifyMatch(SearchID,projectId, false)
		WebUI.delay(2)
		WebUI.click(findTestObject('LEEDOnline/Search/searchResult'))
		WebUI.delay(5)
	}

	@Keyword
	public void searchProgramL(String sheetName , int rowNum) {
		String projectId = data.getCellData(sheetName,"ProjectID",rowNum)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.setText(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'), projectId)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/input_searchBar1'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String nuberOfProjects = WebUI.getText(findTestObject('Page_Arc dashboard/no_Project (1 project)'))
		println nuberOfProjects
		WebUI.verifyMatch(nuberOfProjects,'Project (1 project)', false)
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}

	@Keyword
	public void loginIntoLEEDOnlineWithGlobalVariable() {
		String url = GlobalVariable.LEEDURL
		String userName= GlobalVariable.userName
		String password= GlobalVariable.password
		WebUI.openBrowser('')
		//WebUI.switchToWindowIndex(1)
		WebUI.waitForPageLoad(GlobalVariable.timeOut)
		WebUI.navigateToUrl(url)
		ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.setViewPortSize(1366,1280)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Login/AcceptAndAgreeButton'))
		WebUI.setText(findTestObject('LEEDOnline/Login/Log In_username'), userName)
		WebUI.setText(findTestObject('LEEDOnline/Login/Log In_password'), password)
		WebUI.delay(4)
		WebUI.check(findTestObject('LEEDOnline/Login/Terms of Use_agree'))
		WebUI.delay(4)
		WebUI.click(findTestObject('LEEDOnline/Login/submit btn'))
		ReusableMethodsLogin.waitForPageLoad(60)
		WebUI.delay(2)
		/*	String createNewProj = WebUI.getText(findTestObject('LEEDOnline/Login/a_Create new Project'))
		 WebUI.verifyMatch(createNewProj, 'CREATE NEW PROJECT', false, FailureHandling.CONTINUE_ON_FAILURE)
		 */	WebUI.delay(2)
	}

	@Keyword
	public void verifySynccdataInLEED() {

		WebUI.click(findTestObject('Manage/CityCom/LEED/a_Details'))
		WebUI.delay(3)

		String projectname = 	 WebUI.getText(findTestObject('Manage/CityCom/LEED/projectname'))
		String population = 	 WebUI.getText(findTestObject('Manage/CityCom/LEED/population'))
		String Area = 	 WebUI.getText(findTestObject('Manage/CityCom/LEED/Area'))
		String Isprivate = 	 WebUI.getText(findTestObject('Manage/CityCom/LEED/private'))

		WebUI.verifyMatch(projectname, 'Changed Data LEEDV4 CityCom project',false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(population, '1000',false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(Area, '1000 sq km' , false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(Isprivate, 'Yes', false, FailureHandling.CONTINUE_ON_FAILURE)

	}

	@Keyword
	public void verifyAddedTeamMemDetailsInArc() {
		WebUI.click(findTestObject('Manage/CityCom/LEED/a_Team'))
		WebUI.delay(3)
		String teamMemberDetails = 	 WebUI.getText(findTestObject('Manage/CityCom/LEED/TeamUserid1'))
		WebUI.verifyMatch(teamMemberDetails,GlobalVariable.TeamMember, false)


	}

	@Keyword
	public void verifyAddNewTeamMemLEED() {

		WebUI.setText(findTestObject('Manage/CityCom/LEED/TeamSearch'),GlobalVariable.TeamMember2 )
		WebUI.click(findTestObject('Manage/CityCom/LEED/teamAddButton'))
		WebUI.delay(10)

		String teamMemberDetails = 	WebUI.getText(findTestObject('Manage/CityCom/LEED/TeamUserid2'))
		WebUI.verifyMatch(teamMemberDetails,GlobalVariable.TeamMember2, false)


	}

	@Keyword
	public void creditTabShouldNaviageToArc() {
		WebUI.click(findTestObject('Manage/CityCom/LEED/a_Credits'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Manage/CityCom/LEED/a_Arc'))
		WebUI.delay(15)
		WebUI.waitForPageLoad(30)
		WebUI.switchToWindowIndex(1)
		//String allAction = WebUI.getText(findTestObject('Manage/CityCom/LEED/All Actions'))
		//WebUI.verifyMatch(allAction,'All Actions', false)

		WebUI.closeWindowIndex(0)
		WebUI.delay(2)

	}

	@Keyword
	public void teamAdministrator() {
		WebUI.click(findTestObject('Manage/CityCom/Change/EditStg2'))
		WebUI.delay(3)
		WebUI.selectOptionByLabel(findTestObject('Manage/CityCom/Change/select_Select an authorization'),'Project Administrator', false)
		WebUI.delay(4)
		WebUI.click(findTestObject('Manage/CityCom/Change/input_No_btn btn-primary'))
		WebUI.delay(3)

	}



	@Keyword
	public void verifyAddedTeamFromToArc() {
		WebUI.click(findTestObject('Manage/ProjectDetailVerification/a_ Manage'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Manage/TeamModule/a_ Team'),2)
		WebUI.click(findTestObject('Manage/TeamModule/a_ Team'))
		WebUI.delay(5)
		String teamMemberDetails = 	WebUI.getText(findTestObject('Manage/CityCom/LEED/ArcUserID2'))
		WebUI.verifyMatch(teamMemberDetails,GlobalVariable.TeamMember2, false)




	}

	@Keyword
	public void acceptAggrement() throws IOException, InterruptedException {

		WebUI.scrollToElement(findTestObject('Portfolio/GRESB/SignAcceptButton'),5)
		WebUI.click(findTestObject('Portfolio/GRESB/SignAcceptButton'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
		String status = WebUI.getText(findTestObject('LEEDOnline/ProjectMenu/ProjectStatus'))
		WebUI.verifyMatch(status,'Registered', false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/Page_Arc dashboard/search_Result'))
		WebUI.waitForAngularLoad(GlobalVariable.avgAngularWait)
	}
	@Keyword
	public void verifyAgreementLOProjectsAgreementType(){
		WebUI.click(findTestObject('Page_Arc dashboard/a_Projects'))
		WebUI.delay(4)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Manage'))
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'),5)
		WebUI.delay(2)
		WebUI.click(findTestObject('Manage/VerifyAgreementFile/a_ Agreements'))
		WebUI.delay(6)
		String type = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/agreementTypeLO'))
		WebUI.verifyMatch(type,"Addendum" ,false)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Manage/Arc'), 12)
		println "Agreement File downloaded and verified successfully"
	}

	//Addenum to validate the city comm projects
	@Keyword
	public void verifyAgreementLOProjectsAgreementTypeCityComm(){
		
		String type = WebUI.getText(findTestObject('Manage/VerifyAgreementFile/agreementTypeLO'))
		WebUI.verifyMatch(type,"Addendum" ,false)
		WebUI.verifyElementPresent(findTestObject('LEEDOnline/Manage/Arc'), 12)
		println "Agreement File downloaded and verified successfully"
	}


	@Keyword
	public void billingDetails(String sheetName, int rowNum){
		WebUI.delay(2)
		String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))

		//Registration Payment details verification

		WebUI.delay(5)
		if(GlobalVariable.environment=='dev'){
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
			WebUI.verifyMatch(regDate,registrationDate, false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regOrderType,'REGISTRATION',false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regStatus,'Completed',false,FailureHandling.CONTINUE_ON_FAILURE)
		}
		else{
			String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
			data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
			String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
			String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
			String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
			String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
			WebUI.verifyMatch(regDate,registrationDate, false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regAmount, regdAmt,false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regOrderType,'REGISTRATION',false,FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyMatch(regStatus,'Completed',false,FailureHandling.CONTINUE_ON_FAILURE)
		}


	}

	@Keyword
	public void billingDetailsDev(String sheetName, int rowNum){
		WebUI.delay(2)
		String regdAmt = data.getCellData(sheetName, "RegAmount", rowNum)
		String registrationDate = data.getCellData(sheetName, "RegDate", rowNum)

		WebUI.scrollToElement(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'),2)
		WebUI.click(findTestObject('Object Repository/Manage/BillingSection/a_ Billing'))

		//Registration Payment details verification

		WebUI.delay(5)
		String regOrderId= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationOrderId'))
		data.setCellData(sheetName, "OrderId", rowNum,regOrderId)
		String regDate= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/registrationPaymentDate'))
		String regOrderType= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/span_REGISTRATION'))
		//String regAmount= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationAmount'))
		String regStatus= WebUI.getText(findTestObject('Object Repository/Manage/BillingSection/RegistrationPaymentStatus'))
		WebUI.verifyMatch(regDate,registrationDate, false,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyMatch(regAmount, regdAmt,false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(regOrderType,'REGISTRATION',false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(regStatus,'Completed',false,FailureHandling.CONTINUE_ON_FAILURE)

	}


	//Data input validation for the data populated via ARC
	@Keyword
	public void navigateToCreditsSection(){
		WebUI.click(findTestObject('Object Repository/LEEDOnline/ProjectMenu/credits'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Credits/submitReviewButton'), 20)
		WebUI.delay(1)
	}

	//Energy Data
	@Keyword
	public void verifyTheEnergyDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)

		//Verify the energy reading
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/Credits/energyPerformance'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/energyPerformance'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/energyPerformanceDataTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/LEEDOnline/Credits/widgetLoader'), 10,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "AnalyticsEnergy Meter via upload",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)

	}

	//Water data
	@Keyword
	public void verifyTheWaterDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)


		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/WaterMeter/clickWaterMeter'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the water reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "AnalyticsWater meter via upload",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)

	}


	//Waste Data
	@Keyword
	public void verifyTheWasteDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		String reading2  = dataExcelTemplate.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/WasteMeter/clickWasteMeter'), 3)
		WebUI.doubleClick(findTestObject('Object Repository/LEEDOnline/WasteMeter/clickWasteMeter'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Waste Data",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WGReadingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2,FailureHandling.CONTINUE_ON_FAILURE)
	}

	//Co2 Data
	@Keyword
	public void verifyTheCO2DataPopulatedViaARCInDataInputSection(String sheetName, int rowNum1, rowNum2){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate1", rowNum1)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate1", rowNum1)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading2", rowNum1)
		String startDate1  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum2)
		String endDate1  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum2)
		String reading2  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum2)

		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Carbon Dioxide'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Carbon Dioxide'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Carbon Dioxide",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate2'),'value'),startDate1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate2'),'value'),endDate1,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingTwo'),'value'),reading2,FailureHandling.CONTINUE_ON_FAILURE)



		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//TVOC
	@Keyword
	public void verifyTheTVOCDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Total Volatile Organic Com'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Total Volatile Organic Com'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Total Volatile Organic Compounds",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//PM2.5
	@Keyword
	public void verifyThePM25DataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_PM2.5'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_PM2.5'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Atmospheric Particulate Matter (PM2.5)",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	//Ozone
	@Keyword
	public void verifyTheOzoneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Ozone'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Ozone'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Ozone",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	//Carbon Monoxide
	@Keyword
	public void verifyTheCarbonMonoxideDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Carbon Monoxide'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Carbon Monoxide'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Carbon Monoxide",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Toluene
	@Keyword
	public void verifyTheTolueneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Toluene'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Toluene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Toluene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//Acetaldehyde
	@Keyword
	public void verifyTheAcetaldehydeDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Acetaldehyde'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Acetaldehyde'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Acetaldehyde",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Benzene
	@Keyword
	public void verifyTheBenzeneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Benzene'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Benzene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Benzene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//Styrene
	@Keyword
	public void verifyTheStyreneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Styrene'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Styrene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Styrene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}

	//Naphthalene
	@Keyword
	public void verifyTheNaphthaleneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Naphthalene'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Naphthalene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Naphthalene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Dichlorobenzene
	@Keyword
	public void verifyTheDichlorobenzeneDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Dichlorobenzene'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Dichlorobenzene'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Dichlorobenzene",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}



	//Xylenes-total
	@Keyword
	public void verifyTheXylenesTotalDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Xylenes-total'),3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Xylenes-total'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Xylenes-total",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	//Formaldehyde

	@Keyword
	public void verifyFormaldehydeTotalDataPopulatedViaARCInDataInputSection(String sheetName, int rowNum){

		String startDate  = dataExcelTemplate.getCellData(sheetName, "StartDate", rowNum)
		String endDate  = dataExcelTemplate.getCellData(sheetName, "EndDate", rowNum)
		String reading1  = dataExcelTemplate.getCellData(sheetName, "Reading1", rowNum)
		//String reading2  = data.getCellData(sheetName, "Reading2", rowNum)

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Formaldehyde'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/DataInput/Page_LEED Online/div_Formaldehyde'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)

		//Verify the waste reading
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Formaldehyde",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/StartDate1'),'value'),startDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/EndDate1'),'value'),endDate,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/EnergyMeter/readingOne'),'value'),reading1,FailureHandling.CONTINUE_ON_FAILURE)
		//WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/LEEDOnline/WasteMeter/WDReadingOne'),'value'),reading2)
	}


	@Keyword
	public void surveyResponseRatePopulatedViaARCInDataInputSection(){

		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/HumanExperience/clickTransportation'), 3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/HumanExperience/clickTransportation'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		//Verify the survery response rate
		WebUI.verifyElementText(findTestObject('Object Repository/LEEDOnline/EnergyMeter/MeterName'), "Transportation Survey",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/surveyResponseRate')),"44.44 %",FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/closeMeterTab'),FailureHandling.CONTINUE_ON_FAILURE)
	}



	@Keyword
	public void verifyScoreDisplayingDataInput(String sheetName, int rowNum){
		String energyScore = dataExcelTemplate.getCellData(sheetName, "energyScore", rowNum)
		String waterScore = dataExcelTemplate.getCellData(sheetName, "waterScore", rowNum)
		String wasteScore = dataExcelTemplate.getCellData(sheetName, "wasteScore", rowNum)
		String transportationScore = dataExcelTemplate.getCellData(sheetName, "transportation", rowNum)
		String humanExpScore = dataExcelTemplate.getCellData(sheetName, "humanExperience", rowNum)

		int Score= Integer.parseInt(energyScore)+  Integer.parseInt(waterScore)+ Integer.parseInt(wasteScore)+ Integer.parseInt(transportationScore)+ Integer.parseInt(humanExpScore)
		String totalScore= Integer.toString(Score)
		print totalScore
		/*WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/energyPerformance'),FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/energyPerformanceDataTab'),FailureHandling.CONTINUE_ON_FAILURE)
		 WebUI.waitForElementNotVisible(findTestObject('Object Repository/LEEDOnline/Credits/widgetLoader'), 20,FailureHandling.CONTINUE_ON_FAILURE)
		 *///verify the individual scores
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/meterTab'),FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.delay(2)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/energyScore'), 3)
		WebUI.verifyMatch(energyScore, WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/energyScore')), false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(waterScore, WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/waterScore')), false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(wasteScore, WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/wasteScore')), false)
		WebUI.verifyMatch(transportationScore, WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/transportationScore')), false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyMatch(humanExpScore, WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/humanExpScore')), false,FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/totalScore'), 3)
		WebUI.verifyMatch(totalScore, WebUI.getText(findTestObject('Object Repository/LEEDOnline/ScoreDataInput/totalScore')), false, FailureHandling.CONTINUE_ON_FAILURE)

	}


	//Mark the leed online credits for review
	public static void markCreditForReview(){
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/markProjectInformation'), 60)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markProjectInformation'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusProjectInformation'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markEnergyEfficiencyBestMngtPractice'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusEnergyEfficiencyBestManagement'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markFundamentalReinfringementMgnt'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusFundamentalReInfringement'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markPurchasingPolicy'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusPurchasingPolicy'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markFacilityMaintenanceAndRenovation'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusFacilityMaintenance'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markMinimumIndoorAirQuality'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusMinimumIndoorAirQuality'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markEnviornmentalTobacoSmokeControl'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusEnviornmentalSmokeControl'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/markGreenCleaningPolicy'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/creditStatusGreenCleaningPolicy'), 20)
	}



	//Upload the review excel form to proceed
	public void uploadTheReviewExcelForm(String sheetName, int rowNum){
		String projectId =  data.getCellData(sheetName, "ProjectID", rowNum)
		leedReview.setCellData("v4.1 O+M Precertification",5, 10, projectId)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/ProjectMenu/precert'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/uploadButtonReviewForm'), 20)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/uploadButtonReviewForm'))
		WebUI.delay(3)
		ReusableMethodsDataInput.uploadFile(leedReviewForm)
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/fileListReview'), 20)

	}

	@Keyword
	public void submitReviewLeedOnline(String sheetName, int rowNum){
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/navigation/projectNameTopNavigation'),3)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/navigation/projectNameTopNavigation'))
		uploadTheReviewExcelForm(sheetName, rowNum)
		WebUI.delay(2)
		//WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/clickOnCredits'))
		WebUI.click(findTestObject('Object Repository/LEEDOnline/ProjectMenu/credits'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Credits/submitReviewButton'),20)
		markCreditForReview()
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Credits/submitReviewButton'))
		WebUI.waitForElementVisible( findTestObject('Object Repository/LEEDOnline/Review/submitButtonToSubmitCredits'),20)
		WebUI.scrollToElement(findTestObject('Object Repository/LEEDOnline/Review/submitButtonToSubmitCredits'), 3)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Review/submitButtonToSubmitCredits'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Review/paymentPageRedirectTextAssertion'), 20)

	}


	//PRECERTIFICATION PRELIMINARY REVIEW status
	@Keyword
	public void checkPreCertPreliminaryReviewStatus(){
		WebUI.click(findTestObject('Object Repository/LEEDOnline/Receipt/clickOnDoneButton'))
		WebUI.click(findTestObject('Object Repository/LEEDOnline/ProjectMenu/timeline'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/LEEDOnline/Timeline/PrecertificationPreliminaryReviewText'), 20)
		WebUI.verifyMatch(WebUI.getText(findTestObject('Object Repository/LEEDOnline/Timeline/PreCertPreLiminaryReviewStatus')),"Under review", false)
	}


}