import java.util.concurrent.ThreadLocalRandom

import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable as GlobalVariable


/*def rowNumArray = [6,7, 8,9,10,11,12,13,14,15,16,17,18,19,20]
int rowNumSi = rowNumArray.size()
int rowSize = ThreadLocalRandom.current().nextInt(0, rowNumSi)
int rowNum = rowSize + 6
println rowNum*/

 ArrayList <Integer> rowNumArray = new ArrayList<>(Arrays.asList(6,7, 8,9,10,11,12,13,14,15,16,17,18,19,20));
 int rowNumSi = rowNumArray.size();
 int rowSize = ThreadLocalRandom.current().nextInt(0, rowNumSi);
 int rowNum = rowSize + 6;
 System.out.print(rowNum);

try {
	  
	   
	 //  CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsNavigation.navigateToCities'()
	   CustomKeywords.'com.arc.ReusableMethods.ReusableMethodsAddNewProject.addNewProjectCityScore'(GlobalVariable.CitySheet,GlobalVariable.rowNumFour=rowNum)
	
}   
        
        catch (Throwable t) {	
		System.out.println(t.getLocalizedMessage())
		Error e1 = new Error(t.getMessage())
		e1.setStackTrace(t.getStackTrace())
		e1.printStackTrace()
	}