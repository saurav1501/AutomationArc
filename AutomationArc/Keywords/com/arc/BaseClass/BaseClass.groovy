package com.arc.BaseClass
import org.apache.poi.hssf.util.HSSFColor
import org.apache.poi.ss.usermodel.IndexedColors

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.TestObject
import internal.GlobalVariable

public class BaseClass {

	public static int testCount=0
	//Excel Font color
	public static short fontOrange = HSSFColor.ORANGE.index
	public static short fontWhite = HSSFColor.WHITE.index
	public static short Yellow = IndexedColors.YELLOW.getIndex()
	public static short Red = IndexedColors.RED.getIndex()
	public static short Green = IndexedColors.GREEN.getIndex()
	//Excel Report Configuration
	public static rowNumTAG=2
	public static rowNumTUG=2
	public static rowNumBO=2
	public static rowNumBN=2
	public static rowNumMP=2
	public static rowNumCL=2
	public static rowNumCO=2
	public static rowNumCN=2
	public static rowNumCOML=2
	public static rowNumCOMO=2
	public static rowNumCOMN=2
	public static rowNumPORT=2
	public static rowNumError=2
	public static rowNumINBN=2
	public static rowNumDASH=2
	public static boolean uniqueSpaceTypesFlag=false

	//public static String arcReportFile= RunConfiguration.getProjectDir()+"/ARCDataTemplete/ARCReport.xlsx"
	//public static XlsReader arcSheet = new XlsReader(arcReportFile)

	//Review submit leed online
	public static String leedReviewForm= RunConfiguration.getProjectDir()+"/ARCDataTemplete/v4.1 Precertification Worksheet.xlsx"
	public static XlsReader leedReview = new XlsReader(leedReviewForm)
	//GBCI Documentation folder
	String sourceZipFile= GlobalVariable.downloadDir+"GBCI-India.zip"
	String sourceExtractedFile= GlobalVariable.downloadDir+"GBCI-India/"
	String destinationUnZippedFolder= GlobalVariable.downloadDir
	public static final int BUFFER_SIZE = 9096
	//Data Template and files

	//public static String downloadPath = RunConfiguration.getProjectDir()+"\\Download\\"
	public static String filePath= RunConfiguration.getProjectDir()+"/"+ GlobalVariable.env
	public static String excelTemplateData= RunConfiguration.getProjectDir()+"/ARCDataTemplete/"+ GlobalVariable.ExcelTemplateData
	public static XlsReader data = new XlsReader(filePath)
	public static XlsReader dataExcelTemplate = new XlsReader(excelTemplateData)
	public static String screenShot = RunConfiguration.getProjectDir()+"/ScreenShot/screenshot_"
	public static TestObject myTestObject = new TestObject("customObject")
	//public static Date date = new Date(System.currentTimeMillis())
	public static Date dateNew = new Date()
	public static String gresbUpload = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Gresb.xlsx"

	/*public static String parkImageUpload = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Parking SJ.jpg"
	 public static String downloadPath = GlobalVariable.downloadDir
	 public static String pdfFile = RunConfiguration.getProjectDir()+"/ARCDataTemplete/USGBC.pdf"
	 public String UnzippedNewFolder= GlobalVariable.downloadDir+"GBCI-India/"
	 public static String Addendum = GlobalVariable.downloadDir+"Agreement.pdf"
	 public static String ServiceAgreement = GlobalVariable.downloadDir+"Agreement.pdf"
	 public static String UploadArcDataTempleteTransit = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template_transit_above.xlsm"
	 public static String UploadArcDataTempleteLEEDV4 = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template_building_v4.xlsm"
	 public static String UploadArcDataTempleteTransitanalytics = RunConfiguration.getProjectDir()+"/ARCDataTemplete/AnalyticArc_Data_Template_transit_above.xlsm"
	 public static String UploadArcDataTempleteTransitBelow = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template_transit_below.xlsm"
	 public static String UploadArcDataTemplete = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template.xlsm"
	 public static String analyticsUploadArcDataTemplete = RunConfiguration.getProjectDir()+"/ARCDataTemplete/AnalyticArc_Data_Template.xlsm"
	 public static String UploadDocumentDataInput = RunConfiguration.getProjectDir()+"/ARCDataTemplete/USGBC.pdf"
	 public static String UploadTextFile=RunConfiguration.getProjectDir()+"/ARCDataTemplete/txtFileUpload.txt"
	 public static String UploadJpeg=RunConfiguration.getProjectDir()+"/ARCDataTemplete/Parking SJ.jpg"
	 public static String UploadPng=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploadPng.png"
	 public static String UploadGif=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploadGif.gif"
	 public static String UploadXls=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploasExcel.xlsx"
	 public static String UploadDocs=RunConfiguration.getProjectDir()+"/ARCDataTemplete/uploadDoc.docx"
	 public static String UploadManageCalculatorExcel = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template_building.xlsm"
	 public static String DownloadManageCalculatorExcel = GlobalVariable.downloadDir+"Arc_Data_Template_building.xlsm"
	 public static String DataResourcesPdf = GlobalVariable.downloadDir+"DataResources.pdf"
	 public static String DataReviewChecklistPdf = GlobalVariable.downloadDir+"Data Review Checklist.pdf"*/
	public static String UploadArcDataTempleteSchools = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Arc_Data_Template_building_School_v4.1.xlsm"
	//International Languages for  snapshot validation
	public static String UploadArcDataTempleteSpanish = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Carga de archivos de prueba(Spanish).txt"
	public static String UploadArcDataTempleteFrench = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Test de téléchargement de fichier(French).txt"
	public static String UploadArcDataTempleteTurkish = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Test Dosyası Yüklemesi(Turkish).txt"
	public static String UploadArcDataTempleteGerman = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Testen Sie den Datei-Upload(Greman).txt"
	public static String UploadArcDataTempletePortugues = RunConfiguration.getProjectDir()+"/ARCDataTemplete/Upload do arquivo de teste(Portugues).txt"
	public static String UploadArcDataTempleteKorean = RunConfiguration.getProjectDir()+"/ARCDataTemplete/테스트 파일 업로드(Korean).txt"
	public static String UploadArcDataTempleteChineseSimple = RunConfiguration.getProjectDir()+"/ARCDataTemplete/测试文件上传(ChineseS).txt"
	public static String UploadArcDataTempleteChineseTrade = RunConfiguration.getProjectDir()+"/ARCDataTemplete/測試文件上傳(ChineseT).txt"

	//Large files for snapshot
	public static String FileSize205="/var/lib/jenkins/workspace/ARC_Kat/Ramayana-01_01.pdf"
	public static String FileSize173="/var/lib/jenkins/workspace/ARC_Kat/Ramayana-02_02.pdf"
	public static String FileSize446="/var/lib/jenkins/workspace/ARC_Kat/Srimad_Bhagavatam_Canto_01_Hindi.pdf"
	public static String FileSize62="/var/lib/jenkins/workspace/ARC_Kat/A College Text-Book of Physics_ 2nd Ed_ Arthur L Kimball_ 1917.pdf"


	//Large files for snapshot
	/*public static String FileSize205=System.getProperty("user.dir")+"\\Download\\solved problems in modern physics.pdf"
	 public static String FileSize173=System.getProperty("user.dir")+"\\Download\\solved problems in modern physics.pdf"
	 public static String FileSize446=System.getProperty("user.dir")+"\\Download\\solved problems in modern physics.pdf"
	 public static String FileSize62=System.getProperty("user.dir")+"\\Download\\solved problems in modern physics.pdf"
	 */
	//local files

	public static String parkImageUpload = System.getProperty("user.dir")+"\\ARCDataTemplete\\Parking SJ.jpg"
	public static String downloadPath = RunConfiguration.getProjectDir()+"\\Download\\"
	public static String pdfFile = System.getProperty("user.dir")+"\\ARCDataTemplete\\USGBC.pdf"
	public String UnzippedNewFolder= System.getProperty("user.dir")+"\\Download\\GBCI-India\\"
	public static String Addendum = System.getProperty("user.dir")+"\\Download\\Agreement.pdf"
	public static String ServiceAgreement = System.getProperty("user.dir")+"\\Download\\Agreement.pdf"
	public static String UploadArcDataTempleteTransit = System.getProperty("user.dir")+"\\ARCDataTemplete\\Arc_Data_Template_transit_above.xlsm"
	public static String UploadArcDataTempleteLEEDV4 = System.getProperty("user.dir")+"\\ARCDataTemplete\\Arc_Data_Template_building_v4.xlsm"
	public static String UploadArcDataTempleteTransitanalytics = System.getProperty("user.dir")+"\\ARCDataTemplete\\AnalyticArc_Data_Template_transit_above.xlsm"
	public static String UploadArcDataTempleteTransitBelow = System.getProperty("user.dir")+"\\ARCDataTemplete\\Arc_Data_Template_transit_below.xlsm"
	public static String UploadArcDataTemplete = System.getProperty("user.dir")+"\\ARCDataTemplete\\Arc_Data_Template.xlsm"
	public static String analyticsUploadArcDataTemplete = System.getProperty("user.dir")+"\\ARCDataTemplete\\AnalyticArc_Data_Template.xlsm"
	public static String UploadDocumentDataInput = System.getProperty("user.dir")+"\\ARCDataTemplete\\USGBC.pdf"
	public static String UploadTextFile=System.getProperty("user.dir")+"\\ARCDataTemplete\\txtFileUpload.txt"
	public static String UploadJpeg=System.getProperty("user.dir")+"\\ARCDataTemplete\\Parking SJ.jpg"
	public static String UploadPng=System.getProperty("user.dir")+"\\ARCDataTemplete\\uploadPng.png"
	public static String UploadGif=System.getProperty("user.dir")+"\\ARCDataTemplete\\uploadGif.gif"
	public static String UploadXls=System.getProperty("user.dir")+"\\ARCDataTemplete\\uploasExcel.xlsx"
	public static String UploadDocs=System.getProperty("user.dir")+"\\ARCDataTemplete\\uploadDoc.docx"
	public static String UploadManageCalculatorExcel = System.getProperty("user.dir")+"\\ARCDataTemplete\\Arc_Data_Template_building.xlsm"
	public static String DownloadManageCalculatorExcel = System.getProperty("user.dir")+"\\Download\\Arc_Data_Template_building.xlsm"
	public static String DataResourcesPdf = System.getProperty("user.dir")+"\\Download\\DataResources.pdf"
	public static String DataReviewChecklistPdf = System.getProperty("user.dir")+"\\Download\\Data Review Checklist.pdf"


}
