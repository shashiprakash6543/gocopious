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

WebUI.setText(findTestObject('Object Repository/HRIS/Page_Login  TrilaSoft/input_Remember Me_email'), username)
WebUI.setEncryptedText(findTestObject('Object Repository/HRIS/Page_Login  TrilaSoft/input_Remember Me_password'), password)
WebUI.click(findTestObject('Object Repository/HRIS/Page_Login  TrilaSoft/button_Remember Me_btn btn-primary'))

String title = WebUI.getWindowTitle()
println(title)

assert title == "My Dashboard | TrilaSoft"

WebUI.closeBrowser()
/*
*  Automate login to the HRIS application and verify successful login by checking the page title.
*
*  1. Open the browser and navigate to the HRIS login URL.
*  2. Enter the username into the email input field on the login page.
*  3. Enter the encrypted password into the password input field.
*  4. Click the login button to submit the login form.
*  5. Retrieve the current browser window title.
*  6. Print the window title to the console.
*  7. Assert that the window title matches the expected dashboard title to confirm successful login.
*  8. Close the browser.
*
*/