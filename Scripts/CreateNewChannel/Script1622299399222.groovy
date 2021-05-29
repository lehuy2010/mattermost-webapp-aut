import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Town Square - Test Mattermost/i_CtrlK_icon-plus'))

WebUI.click(findTestObject('Page_Town Square - Test Mattermost/span_Create New Channel'))

for (int n = 1; n < 3; n++) {
	switch 👎 {
		case 1:
			WebUI.click(findTestObject('Page_Town Square - Test Mattermost/label_Public - Anyone can join this channel'))

			WebUI.setText(findTestObject('Page_Town Square - Test Mattermost/input_Name_newChannelName'), 'PUBLIC CHANNEL')

			WebUI.setText(findTestObject('Page_Town Square - Test Mattermost/textarea_(optional)_newChannelHeader'), 'Header public')

			WebUI.setText(findTestObject('Page_Town Square - Test Mattermost/textarea_(optional)_newChannelPurpose'), 'purpose public')
			WebUI.click(findTestObject('Page_Town Square - Test Mattermost/button_Create Channel'))
			
			break
		case 2:
			WebUI.click(findTestObject('Page_Town Square - Test Mattermost/label_Private - Only invited members can join this channel'))

			WebUI.setText(findTestObject('Page_Town Square - Test Mattermost/input_Name_newChannelName'), 'PRIVATE CHANNEL')

			WebUI.setText(findTestObject('Page_Town Square - Test Mattermost/textarea_(optional)_newChannelHeader'), 'Header private')

			WebUI.setText(findTestObject('Page_Town Square - Test Mattermost/textarea_(optional)_newChannelPurpose'), 'purpose private')
			WebUI.click(findTestObject('Page_Town Square - Test Mattermost/button_Create Channel'))
			
			break
	}
}