import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import java.text.SimpleDateFormat as SimpleDateFormat

'Get Date Time'
SimpleDateFormat sDate = new SimpleDateFormat('dd-MM-yy HHmmss')
String date = sDate.format(new Date())
try{
	
	'Path Evidence'
	def path = RunConfiguration.getProjectDir() + "/Data Files/Evidence/"+ date +".png"
//	println path
	
	'Running Existing APP'
	Mobile.startExistingApplication("com.quipper.tenji")
	
	'Wait APP TENJI is opened'
	Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.TextView0 - Tenji'), 0)
	
	'Open Single video G12 Chemistry'
	Mobile.tap(findTestObject('Object Repository/android.widget.ImageView1'), 0)
	
	/**
	 * Check Object frame Video Content
	 * */
	'G12 Chemistry validation'
	def videoDisplay = Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.FrameLayoutVideoContent'), 0)
//	println videoDisplay
	'Checking Video Display'
	if (videoDisplay){
		'Mark success Open Video'
		KeywordUtil.markPassed("Video displayed")
		'Validate button play'
		def PlayVideo = Mobile.verifyElementExist(findTestObject('Object Repository/android.widget.ImageButton3'), 0)
			 if (PlayVideo){
				 'Click Video Playing'
				 Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton3'), 0)
				 'Mark success PLAY Video'
				 KeywordUtil.markPassed("Video PLAYED")
				 'Take screenshot picture(Test Evidence)'
				 Mobile.delay(5)
				 Mobile.takeScreenshot(path)
			 }else{
			 'Mark failed PLAY Video'
			 	KeywordUtil.markFailed("video can't PLAYED")
			 }
	}else{
		'Mark failed Open Video'
		KeywordUtil.markFailed("video can't open")
	}
	

	
//Mobile.closeApplication()
}catch (Exception ex) {
	//	println ex
	def pathfailed = RunConfiguration.getProjectDir() + "/Data Files/Failed/"+ date +".png"
	Mobile.takeScreenshot(pathfailed)
	KeywordUtil.markErrorAndStop(ex)
}


