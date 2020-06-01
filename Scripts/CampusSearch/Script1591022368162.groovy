import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat as SimpleDateFormat

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil



'Get Date Time'
SimpleDateFormat sDate = new SimpleDateFormat('dd-MM-yy HHmmss')
String date = sDate.format(new Date())
try{

	'Path Evidence'
	def path = RunConfiguration.getProjectDir() + "/Data Files/Evidence/"+ date +".png"
	
//	'Running Existing APP'
//	Mobile.startExistingApplication("com.quipper.tenji")
	'Wait APP TENJI is opened'
	Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView0 - Tenji'), 0)
	'Verify Menu Search Campus'
	def ElementExsiting = Mobile.verifyElementNotExist(findTestObject('Object Repository/CampusSearch/android.widget.ImageView0'), 10)
	
	'Check Element Button'
	if (ElementExsiting == true){
		'Back Button'
		Mobile.tap(findTestObject('Object Repository/CampusSearch/android.widget.ImageButtonBack'), 0)
	}
	'Click Button Menu'
	Mobile.tap(findTestObject('Object Repository/CampusSearch/android.widget.ImageView0'), 0)
	'Click Menu Campus Search'
	Mobile.tap(findTestObject('Object Repository/CampusSearch/android.widget.TextView0 - Campus Search'), 0)
	'Verify Quipper Campus Display'
	def QuipperCampus = Mobile.verifyElementExist(findTestObject('Object Repository/CampusSearch/android.view.ViewQuipperCampus'), 0)
	
	'Checking Quipper Campus Display'
	if (QuipperCampus){
		'Mark success Quipper Campus Displayed'
		KeywordUtil.markPassed("Quipper Campus Display")
		Mobile.tap(findTestObject('Object Repository/CampusSearch/android.widget.EditTextSerachBox'), 5)
		'Input ITB on Search BOX'
		Mobile.setText(findTestObject('Object Repository/CampusSearch/android.widget.EditTextSerachBox'),'ITB ', 10)
		'Enter ITB'
		Mobile.setText(findTestObject('Object Repository/CampusSearch/android.widget.EditTextSerachBox'),"\\n", 10)
		Mobile.delay(5)
		
		'Validate  ITB footer'
		def ITBCampusDisplay = Mobile.verifyElementVisible(findTestObject('Object Repository/CampusSearch/android.view.View93Footer'), 5)
//		println	ITBCampusDisplay

			'Check Banner Display'
			 if (ITBCampusDisplay == true){
				  'Mark success ITB Campus Displayed'
				 KeywordUtil.markPassed("ITB Campus Displayed")
				 'Take screenshot picture(Test Evidence)'
				 Mobile.delay(5)
				 Mobile.takeScreenshot(path)
			 }else{
			 'Mark failed ITB Campus Not Displayed'
			 	KeywordUtil.markFailed("ITB Campus Not Displayed")
			 }
	}else{
	
		'Mark failed Quipper Campus Not Displayed'
		KeywordUtil.markFailed("Quipper Campus Not Displayed")
	}
	

	
//Mobile.closeApplication()
}catch (Exception ex) {
	println ex
	def pathfailed = RunConfiguration.getProjectDir() + "/Data Files/Failed/"+ date +".png"
	Mobile.takeScreenshot(pathfailed)
	KeywordUtil.markErrorAndStop(ex)
	
}


