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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8065/login')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _dcc84b'), 'lehuy2010')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place, _a3edc6'), 
    'Fp6aaTLpEhBjh92TM4bq0w==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - test-data-1 Mattermost/i_CtrlK_icon-plus'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - test-data-1 Mattermost/span_Create New Channel'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - test-data-1 Mattermost/input_Name_newChannelName'), channelName)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - test-data-1 Mattermost/textarea_for testing purpose_1'), 
    purpose)

WebUI.setText(findTestObject('Object Repository/Page_Town Square - test-data-1 Mattermost/textarea_header test_channel'), 
    header)

WebUI.click(findTestObject('Object Repository/Page_Town Square - test-data-1 Mattermost/span_Create Channel'))

WebUI.closeBrowser()

