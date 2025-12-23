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

/*1. open browser go to url https://www.makemytrip.com/
2. click on
findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF on Hotels, Flights  Holiday/span_India_commonModal__close')
3. click on 
findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF on Hotels, Flights  Holiday/span') */
// Open browser and navigate to the URL https://www.makemytrip.com/
WebUI.openBrowser('https://www.makemytrip.com/')

// Click on the close button of the India modal popup
WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF on Hotels, Flights  Holiday/span_India_commonModal__close'))

// Click on the span element on the page
WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF on Hotels, Flights  Holiday/span'))

WebUI.closeBrowser()