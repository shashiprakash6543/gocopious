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

WebUI.openBrowser('https://qahris.trilasoft.com/')

WebUI.setText(findTestObject('Object Repository/HRIS/Page_Login  TrilaSoft/input_Remember Me_email'), GlobalVariable.username)
WebUI.setEncryptedText(findTestObject('Object Repository/HRIS/Page_Login  TrilaSoft/input_Remember Me_password'), GlobalVariable.password)
WebUI.click(findTestObject('Object Repository/HRIS/Page_Login  TrilaSoft/button_Remember Me_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/HRIS/dashboard_menu/Page_My Dashboard  TrilaSoft/a'))

String title = WebUI.getText(findTestObject('Object Repository/HRIS/Page_My Dashboard  TrilaSoft/h3'))
println(title)

assert title == "Monika Nigam (TS/0128)"
WebUI.closeBrowser()