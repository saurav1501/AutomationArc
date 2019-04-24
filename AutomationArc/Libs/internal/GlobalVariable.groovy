package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object StgUrl
     
    /**
     * <p></p>
     */
    public static Object StgUserName
     
    /**
     * <p></p>
     */
    public static Object StgPassword
     
    /**
     * <p></p>
     */
    public static Object DelayTime
     
    /**
     * <p>Profile default : Explicit Wait Timeout</p>
     */
    public static Object TimeOut
     
    /**
     * <p></p>
     */
    public static Object Env
     
    /**
     * <p></p>
     */
    public static Object QasUrl
     
    /**
     * <p></p>
     */
    public static Object QasUserName
     
    /**
     * <p></p>
     */
    public static Object QasPassword
     
    /**
     * <p></p>
     */
    public static Object DevUrl
     
    /**
     * <p></p>
     */
    public static Object DevUserName
     
    /**
     * <p></p>
     */
    public static Object DevPassword
     
    /**
     * <p></p>
     */
    public static Object downloadPath
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p>Profile DEV-US : Gold membership user</p>
     */
    public static Object userName
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p>Profile DEV-US : Explicit Wait Timeout
Profile QAS-CA : Explicit Wait Timeout
Profile QAS-CN : Explicit Wait Timeout
Profile QAS-IND : Explicit Wait Timeout
Profile QAS-US : Explicit Wait Timeout
Profile QAS-US-User2 : Explicit Wait Timeout
Profile STG-CA : Explicit Wait Timeout
Profile STG-CN : Explicit Wait Timeout
Profile STG-IND : Explicit Wait Timeout
Profile STG-US : Explicit Wait Timeout
Profile STG-US - Test : Explicit Wait Timeout</p>
     */
    public static Object timeOut
     
    /**
     * <p></p>
     */
    public static Object env
     
    /**
     * <p>Profile DEV-US : Adding US projects
Profile QAS-CA : Adding canada projects
Profile QAS-CN : Adding china projects
Profile QAS-IND : Adding India projects
Profile QAS-US : Adding US projects
Profile QAS-US-User2 : Adding US projects
Profile STG-CA : Adding canada projects
Profile STG-CN : Adding china projects
Profile STG-IND : Adding India projects
Profile STG-US : Adding US projects
Profile STG-US - Test : Adding US projects</p>
     */
    public static Object BuildingSheet
     
    /**
     * <p>Profile DEV-US : Adding new team member 
Profile QAS-CA : Adding new team member 
Profile QAS-CN : Adding new team member 
Profile QAS-IND : Adding new team member 
Profile QAS-US : Adding new team member 
Profile QAS-US-User2 : Adding new team member 
Profile STG-CA : Adding new team member 
Profile STG-CN : Adding new team member 
Profile STG-IND : Adding new team member 
Profile STG-US : Adding new team member 
Profile STG-US - Test : Adding new team member </p>
     */
    public static Object BuildingTeam
     
    /**
     * <p>Profile DEV-US : Adding Credit Card payment details 
Profile QAS-CA : Adding Credit Card payment details 
Profile QAS-CN : Adding Credit Card payment details 
Profile QAS-IND : Adding Credit Card payment details 
Profile QAS-US : Adding Credit Card payment details 
Profile QAS-US-User2 : Adding Credit Card payment details 
Profile STG-CA : Adding Credit Card payment details 
Profile STG-CN : Adding Credit Card payment details 
Profile STG-IND : Adding Credit Card payment details 
Profile STG-US : Adding Credit Card payment details 
Profile STG-US - Test : Adding Credit Card payment details </p>
     */
    public static Object CCPayment
     
    /**
     * <p></p>
     */
    public static Object rowNumTwo
     
    /**
     * <p></p>
     */
    public static Object rowNumThree
     
    /**
     * <p></p>
     */
    public static Object rowNumFour
     
    /**
     * <p></p>
     */
    public static Object rowNumFive
     
    /**
     * <p></p>
     */
    public static Object rowNumSix
     
    /**
     * <p>Profile QAS-IND : Adding new  india city projects 
Profile STG-IND : Adding new  india city projects </p>
     */
    public static Object CitySheet
     
    /**
     * <p>Profile QAS-CA : Adding new canada projects
Profile QAS-CN : Adding new china projects
Profile QAS-IND : Adding new Inida community projects 
Profile STG-CA : Adding new canada projects
Profile STG-CN : Adding new china projects
Profile STG-IND : Adding new Inida community projects </p>
     */
    public static Object CommunitySheet
     
    /**
     * <p></p>
     */
    public static Object CDataInput
     
    /**
     * <p></p>
     */
    public static Object PortfoliosSheet
     
    /**
     * <p></p>
     */
    public static Object rowNumSeven
     
    /**
     * <p></p>
     */
    public static Object rowNumEight
     
    /**
     * <p></p>
     */
    public static Object BDataInput
     
    /**
     * <p>Profile DEV-US : Team Member DEV
Profile QAS-US : Team Member QAS
Profile QAS-US-User2 : Team Member QAS
Profile STG-US : Team Member STG
Profile STG-US - Test : Team Member STG</p>
     */
    public static Object TeamMember
     
    /**
     * <p></p>
     */
    public static Object adminUrl
     
    /**
     * <p></p>
     */
    public static Object adminUserName
     
    /**
     * <p></p>
     */
    public static Object adminPassword
     
    /**
     * <p>Profile DEV-US : Certified project
Profile STG-US : Certified project
Profile STG-US - Test : Certified project</p>
     */
    public static Object rowNumTwentyOne
     
    /**
     * <p>Profile DEV-US : Certified Transit Abovegroun Project
Profile STG-US : Certified Transit Abovegroun Project
Profile STG-US - Test : Certified Transit Abovegroun Project</p>
     */
    public static Object rowNumTwentyTwo
     
    /**
     * <p></p>
     */
    public static Object notCertified
     
    /**
     * <p>Profile DEV-US : New Added Project
Profile STG-US : New Added Project
Profile STG-US - Test : New Added Project</p>
     */
    public static Object rowNumTwentyThree
     
    /**
     * <p>Profile DEV-US : old score version of Buiding
Profile QAS-US : old score version project of Building
Profile QAS-US-User2 : old score version project of Building
Profile STG-US : old score version of Buiding
Profile STG-US - Test : old score version of Buiding</p>
     */
    public static Object rowNumNine
     
    /**
     * <p></p>
     */
    public static Object teamMemName
     
    /**
     * <p></p>
     */
    public static Object ExcelTemplateData
     
    /**
     * <p></p>
     */
    public static Object TemplateEnergyData
     
    /**
     * <p></p>
     */
    public static Object TemplateWaterData
     
    /**
     * <p></p>
     */
    public static Object TeamMemberPassword
     
    /**
     * <p></p>
     */
    public static Object TemplateWasteData
     
    /**
     * <p>Profile DEV-US : old score version of Transit
Profile QAS-US : Old score version project of Transit
Profile QAS-US-User2 : Old score version project of Transit
Profile STG-US : old score version of Transit
Profile STG-US - Test : old score version of Transit</p>
     */
    public static Object rowNumTen
     
    /**
     * <p></p>
     */
    public static Object AllProjectUrl
     
    /**
     * <p>Profile QAS-US : Human Experience and Transportation
Profile QAS-US-User2 : Human Experience and Transportation</p>
     */
    public static Object TemplateHE
     
    /**
     * <p>Profile DEV-US : payment via credit card
Profile STG-US : payment via credit card
Profile STG-US - Test : payment via credit card</p>
     */
    public static Object cardPayment
     
    /**
     * <p></p>
     */
    public static Object checkPayment
     
    /**
     * <p></p>
     */
    public static Object appUrl
     
    /**
     * <p>Profile DEV-US : Pricing sheet 
Profile QAS-US : Pricing sheet for checking the pricing for different countries.
Profile STG-US : Pricing Sheet
Profile STG-US - Test : Pricing Sheet</p>
     */
    public static Object pricingSheet
     
    /**
     * <p></p>
     */
    public static Object rowNumEleven
     
    /**
     * <p></p>
     */
    public static Object creditCard
     
    /**
     * <p></p>
     */
    public static Object LEEDURL
     
    /**
     * <p>Profile QAS-US : Project team admin and arc administrator name
Profile STG-US : Project team admin and arc administrator name
Profile STG-US - Test : Project team admin and arc administrator name</p>
     */
    public static Object projectTeamAdminAndArcAdminName
     
    /**
     * <p>Profile QAS-US : Project team admin and arc administrator email
Profile STG-US : Project team admin and arc administrator email id
Profile STG-US - Test : Project team admin and arc administrator email id</p>
     */
    public static Object projectTeamAdminAndArcAdminEmail
     
    /**
     * <p></p>
     */
    public static Object UserId
     
    /**
     * <p></p>
     */
    public static Object TeamMember2
     
    /**
     * <p></p>
     */
    public static Object validationSheet
     
    /**
     * <p></p>
     */
    public static Object LEEDData
     
    /**
     * <p></p>
     */
    public static Object teamMemberName
     
    /**
     * <p>Profile QAS-US : Result sheet to store the result</p>
     */
    public static Object Result
     
    /**
     * <p></p>
     */
    public static Object TestCount
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['StgUrl' : 'http://www.stg.arconline.io/', 'StgUserName' : 'Saurav@groupten.com', 'StgPassword' : 'LEEDg10', 'DelayTime' : 3, 'TimeOut' : 40, 'Env' : 'qas', 'QasUrl' : 'http://www.qas.arconline.io', 'QasUserName' : 'usgbcarc@gmail.com', 'QasPassword' : 'initpass', 'DevUrl' : 'http://www.dev.arconline.io', 'DevUserName' : 'rmishra@usgbc.org', 'DevPassword' : 'initpass', 'downloadPath' : 'D:\\Katalon\\AutomationArc\\Automation\\Download\\'])
        allVariables.put('DEV-US', allVariables['default'] + ['url' : 'https://dev.app.arconline.io/login', 'userName' : 'sswaminathan@usgbc.org', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput', 'PortfoliosSheet' : 'Portfolio', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'dev-01@gmail.com', 'adminUrl' : 'https://dev.app.arconline.io/admin', 'adminUserName' : 'devgbciadmin@usgbc.org', 'adminPassword' : 'initpass', 'rowNumTwentyOne' : 21, 'rowNumTwentyTwo' : 22, 'notCertified' : 'notCertified', 'rowNumTwentyThree' : 23, 'rowNumNine' : 9, 'teamMemName' : 'Dev User', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://dev.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'cardPayment' : 'creditCard', 'checkPayment' : 'check', 'appUrl' : 'https://dev.app.arconline.io/login', 'pricingSheet' : 'Pricing', 'rowNumEleven' : 11, 'creditCard' : 'creditCard', 'LEEDURL' : 'https://leedonline-dev.usgbc.org/', 'projectTeamAdminAndArcAdminName' : 'Sureka Swaminathan', 'projectTeamAdminAndArcAdminEmail' : 'sswaminathan@usgbc.org', 'UserId' : '', 'TeamMember2' : 'dev-02@gmail.com'])
        allVariables.put('QAS-CA', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'CanadaBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CanadaCityProject', 'CommunitySheet' : 'CanadaCommunityProject', 'CDataInput' : 'CDataInput', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'PortfoliosSheet' : 'Portfolio', 'BDataInput' : 'BDataInput', 'adminUrl' : 'qas.app.arconline.io/admin', 'adminUserName' : 'qasgbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TemplateWasteData' : 'Waste', 'AllProjectUrl' : 'https://qas.app.arconline.io/app/projects/my-projects/?project-type=all'])
        allVariables.put('QAS-CN', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'ChinaBuildingProejct', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'ChinaCityProject', 'CommunitySheet' : 'ChinaCommunityProject', 'CDataInput' : 'CDataInput', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'PortfoliosSheet' : 'Portfolio', 'BDataInput' : 'BDataInput', 'adminUrl' : 'qas.app.arconline.io/admin', 'adminUserName' : 'qasgbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TemplateWasteData' : 'Waste', 'AllProjectUrl' : 'https://qas.app.arconline.io/app/projects/my-projects/?project-type=all'])
        allVariables.put('QAS-IND', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'BuildingIndiaProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CityIndiaProject', 'CommunitySheet' : 'CommunityIndiaProject', 'CDataInput' : 'CDataInput', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'adminUrl' : 'qas.app.arconline.io/admin', 'adminUserName' : 'qasgbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TemplateWasteData' : 'Waste', 'AllProjectUrl' : 'https://qas.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp'])
        allVariables.put('QAS-US', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'usgbcarc@gmail.com', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput', 'PortfoliosSheet' : 'PortfolioQAS', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'qas-01@gmail.com', 'adminUrl' : 'qas.app.arconline.io/admin', 'adminUserName' : 'qasgbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'teamMemName' : 'ARC USGBC', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://qas.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'appUrl' : 'https://qas.app.arconline.io/', 'rowNumEleven' : 11, 'creditCard' : 'creditCard', 'checkPayment' : 'check', 'pricingSheet' : 'Pricing', 'LEEDURL' : 'https://leedonline-qas.usgbc.org/', 'validationSheet' : 'Validation', 'LEEDData' : 'LEEDData', 'projectTeamAdminAndArcAdminName' : 'ARC USGBC', 'projectTeamAdminAndArcAdminEmail' : 'usgbcarc@gmail.com', 'UserId' : '0010639470', 'TeamMember2' : 'qas-02@gmail.com', 'teamMemberName' : 'qas1 mishra', 'Result' : 'Result'])
        allVariables.put('QAS-US-User2', allVariables['default'] + ['url' : 'http://www.qas.arconline.io/', 'userName' : 'testuser2@usgbc.org', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput', 'PortfoliosSheet' : 'Portfolio', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'qas-02@gmail.com', 'adminUrl' : 'qas.app.arconline.io/admin', 'adminUserName' : 'qasgbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'teamMemName' : 'ARC USGBC', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://qas.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'appUrl' : 'https://qas.app.arconline.io/'])
        allVariables.put('STG-CA', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'ARCDataTemplete/ArcTest.xlsx', 'BuildingSheet' : 'CanadaBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CanadaCityProject', 'CommunitySheet' : 'CanadaCommunityProject', 'CDataInput' : 'CDataInput', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'PortfoliosSheet' : 'Portfolio', 'BDataInput' : 'BDataInput', 'adminUrl' : 'stg.app.arconline.io/admin', 'adminUserName' : 'stggbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TemplateWasteData' : 'Waste', 'AllProjectUrl' : 'https://stg.app.arconline.io/app/projects/my-projects/?project-type=all'])
        allVariables.put('STG-CN', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'ARCDataTemplete/ArcTest.xlsx', 'BuildingSheet' : 'ChinaBuildingProejct', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'ChinaCityProject', 'CommunitySheet' : 'ChinaCommunityProject', 'CDataInput' : 'CDataInput', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'PortfoliosSheet' : 'Portfolio', 'BDataInput' : 'BDataInput', 'adminUrl' : 'stg.app.arconline.io/admin', 'adminUserName' : 'stggbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TemplateWasteData' : 'Waste', 'AllProjectUrl' : 'https://stg.app.arconline.io/app/projects/my-projects/?project-type=all'])
        allVariables.put('STG-IND', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'ARCDataTemplete/ArcTest.xlsx', 'BuildingSheet' : 'BuildingIndiaProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'CityIndiaProject', 'CommunitySheet' : 'CommunityIndiaProject', 'CDataInput' : 'CDataInput', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'PortfoliosSheet' : 'Portfolio', 'BDataInput' : 'BDataInput', 'adminUrl' : 'stg.app.arconline.io/admin', 'adminUserName' : 'stggbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumNine' : 9, 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TemplateWasteData' : 'Waste', 'AllProjectUrl' : 'https://stg.app.arconline.io/app/projects/my-projects/?project-type=all'])
        allVariables.put('STG-US', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'Saurav@groupten.com', 'password' : 'LEEDg10', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput', 'PortfoliosSheet' : 'PortfolioSTG', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'stg-01@gmail.com', 'adminUrl' : 'stg.app.arconline.io/admin', 'adminUserName' : 'stggbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumTwentyOne' : 21, 'rowNumTwentyTwo' : 22, 'notCertified' : 'notCertified', 'rowNumTwentyThree' : 23, 'rowNumNine' : 9, 'teamMemName' : 'Saurav K', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://stg.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'cardPayment' : 'creditCard', 'checkPayment' : 'check', 'appUrl' : 'https://stg.app.arconline.io', 'LEEDURL' : 'https://leedonline-stg.usgbc.org/', 'creditCard' : 'creditCard', 'pricingSheet' : 'Pricing', 'LEEDData' : 'LEEDData', 'projectTeamAdminAndArcAdminName' : 'Saurav K', 'projectTeamAdminAndArcAdminEmail' : 'saurav@groupten.com', 'UserId' : '0010544805', 'rowNumEleven' : 11, 'TeamMember2' : 'stg-02@gmail.com', 'teamMemberName' : 'stgr mishra', 'TestCount' : 0])
        allVariables.put('STG-US - Test', allVariables['default'] + ['url' : 'http://www.stg.arconline.io/', 'userName' : 'akumar@usgbc.org', 'password' : 'initpass', 'timeOut' : 40, 'env' : 'ARCDataTemplete/QasArcTest.xlsx', 'BuildingSheet' : 'USBuildingProject', 'BuildingTeam' : 'BTeam', 'CCPayment' : 'Payment', 'rowNumTwo' : 2, 'rowNumThree' : 3, 'rowNumFour' : 4, 'rowNumFive' : 5, 'rowNumSix' : 6, 'CitySheet' : 'USCityProject', 'CommunitySheet' : 'USCommunityProject', 'CDataInput' : 'CDataInput', 'PortfoliosSheet' : 'PortfolioSTG', 'rowNumSeven' : 7, 'rowNumEight' : 8, 'BDataInput' : 'BDataInput', 'TeamMember' : 'stg-01@gmail.com', 'adminUrl' : 'stg.app.arconline.io/admin', 'adminUserName' : 'stggbciadmin@gbci.com', 'adminPassword' : 'initpass', 'rowNumTwentyOne' : 21, 'rowNumTwentyTwo' : 22, 'notCertified' : 'notCertified', 'rowNumTwentyThree' : 23, 'rowNumNine' : 9, 'teamMemName' : 'Abhishek Kumar', 'ExcelTemplateData' : 'ExcelTemplateDataVerificationSheet.xlsx', 'TemplateEnergyData' : 'Energy', 'TemplateWaterData' : 'Water', 'TeamMemberPassword' : 'initpass', 'TemplateWasteData' : 'Waste', 'rowNumTen' : 10, 'AllProjectUrl' : 'https://stg.app.arconline.io/app/projects/my-projects/?project-type=all', 'TemplateHE' : 'HumanExp', 'cardPayment' : 'creditCard', 'checkPayment' : 'check', 'appUrl' : 'https://stg.app.arconline.io', 'LEEDURL' : 'https://leedonline-stg.usgbc.org/', 'creditCard' : 'creditCard', 'pricingSheet' : 'Pricing', 'LEEDData' : 'LEEDData', 'projectTeamAdminAndArcAdminName' : 'Abhishek Kumar', 'projectTeamAdminAndArcAdminEmail' : 'akumar@usgbc.org', 'UserId' : '0010545526', 'rowNumEleven' : 11, 'TeamMember2' : 'stg-02@gmail.com'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        StgUrl = selectedVariables["StgUrl"]
        StgUserName = selectedVariables["StgUserName"]
        StgPassword = selectedVariables["StgPassword"]
        DelayTime = selectedVariables["DelayTime"]
        TimeOut = selectedVariables["TimeOut"]
        Env = selectedVariables["Env"]
        QasUrl = selectedVariables["QasUrl"]
        QasUserName = selectedVariables["QasUserName"]
        QasPassword = selectedVariables["QasPassword"]
        DevUrl = selectedVariables["DevUrl"]
        DevUserName = selectedVariables["DevUserName"]
        DevPassword = selectedVariables["DevPassword"]
        downloadPath = selectedVariables["downloadPath"]
        url = selectedVariables["url"]
        userName = selectedVariables["userName"]
        password = selectedVariables["password"]
        timeOut = selectedVariables["timeOut"]
        env = selectedVariables["env"]
        BuildingSheet = selectedVariables["BuildingSheet"]
        BuildingTeam = selectedVariables["BuildingTeam"]
        CCPayment = selectedVariables["CCPayment"]
        rowNumTwo = selectedVariables["rowNumTwo"]
        rowNumThree = selectedVariables["rowNumThree"]
        rowNumFour = selectedVariables["rowNumFour"]
        rowNumFive = selectedVariables["rowNumFive"]
        rowNumSix = selectedVariables["rowNumSix"]
        CitySheet = selectedVariables["CitySheet"]
        CommunitySheet = selectedVariables["CommunitySheet"]
        CDataInput = selectedVariables["CDataInput"]
        PortfoliosSheet = selectedVariables["PortfoliosSheet"]
        rowNumSeven = selectedVariables["rowNumSeven"]
        rowNumEight = selectedVariables["rowNumEight"]
        BDataInput = selectedVariables["BDataInput"]
        TeamMember = selectedVariables["TeamMember"]
        adminUrl = selectedVariables["adminUrl"]
        adminUserName = selectedVariables["adminUserName"]
        adminPassword = selectedVariables["adminPassword"]
        rowNumTwentyOne = selectedVariables["rowNumTwentyOne"]
        rowNumTwentyTwo = selectedVariables["rowNumTwentyTwo"]
        notCertified = selectedVariables["notCertified"]
        rowNumTwentyThree = selectedVariables["rowNumTwentyThree"]
        rowNumNine = selectedVariables["rowNumNine"]
        teamMemName = selectedVariables["teamMemName"]
        ExcelTemplateData = selectedVariables["ExcelTemplateData"]
        TemplateEnergyData = selectedVariables["TemplateEnergyData"]
        TemplateWaterData = selectedVariables["TemplateWaterData"]
        TeamMemberPassword = selectedVariables["TeamMemberPassword"]
        TemplateWasteData = selectedVariables["TemplateWasteData"]
        rowNumTen = selectedVariables["rowNumTen"]
        AllProjectUrl = selectedVariables["AllProjectUrl"]
        TemplateHE = selectedVariables["TemplateHE"]
        cardPayment = selectedVariables["cardPayment"]
        checkPayment = selectedVariables["checkPayment"]
        appUrl = selectedVariables["appUrl"]
        pricingSheet = selectedVariables["pricingSheet"]
        rowNumEleven = selectedVariables["rowNumEleven"]
        creditCard = selectedVariables["creditCard"]
        LEEDURL = selectedVariables["LEEDURL"]
        projectTeamAdminAndArcAdminName = selectedVariables["projectTeamAdminAndArcAdminName"]
        projectTeamAdminAndArcAdminEmail = selectedVariables["projectTeamAdminAndArcAdminEmail"]
        UserId = selectedVariables["UserId"]
        TeamMember2 = selectedVariables["TeamMember2"]
        validationSheet = selectedVariables["validationSheet"]
        LEEDData = selectedVariables["LEEDData"]
        teamMemberName = selectedVariables["teamMemberName"]
        Result = selectedVariables["Result"]
        TestCount = selectedVariables["TestCount"]
        
    }
}
