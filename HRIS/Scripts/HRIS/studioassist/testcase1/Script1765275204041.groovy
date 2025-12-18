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

/**
 open browser and open url form Golbalvariable.URL
 enter username HRIS/Page_Login  TrilaSoft/input_Remember Me_email and enter username from Globalvariable.username
 enter password HRIS/Page_Login  TrilaSoft/input_Remember Me_password and enter password from Globalvariale.password password is in encrypted format
 click on submit button HRIS/Page_Login  TrilaSoft/button_Remember Me_btn btn-primary
  validate page title should be 'My Dashboard | TrilaSoft'
 
 **/
// Open browser and navigate to URL from GlobalVariable.URL
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.URL)

// Enter username in HRIS/Page_Login  TrilaSoft/input_Remember Me_email from GlobalVariable.username
WebUI.setText(findTestObject('HRIS/Page_Login  TrilaSoft/input_Remember Me_email'), GlobalVariable.username)

// Enter encrypted password in HRIS/Page_Login  TrilaSoft/input_Remember Me_password from GlobalVariable.password
WebUI.setEncryptedText(findTestObject('HRIS/Page_Login  TrilaSoft/input_Remember Me_password'), GlobalVariable.password)

// Click on submit button HRIS/Page_Login  TrilaSoft/button_Remember Me_btn btn-primary
WebUI.click(findTestObject('HRIS/Page_Login  TrilaSoft/button_Remember Me_btn btn-primary'))

// Validate page title should be 'My Dashboard | TrilaSoft'
WebUI.verifyMatch(WebUI.getWindowTitle(), 'My Dashboard | TrilaSoft', false)

WebUI.closeBrowser()