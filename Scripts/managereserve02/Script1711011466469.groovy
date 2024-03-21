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

WebUI.click(findTestObject('Object Repository/a_Add Reservation'))

WebUI.setText(findTestObject('Object Repository/input_Date_date'), '3250020240930am')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select OneMilano'), '65e7e96a252eb9de416d5e0f', true)

WebUI.selectOptionByValue(findTestObject('select_Select OneOrder 1 - Capacity 1Order 2 - Capacity 2Order 3 - Capacity 3Order 4 - Capacity 4'), 
    '65ef4ddb5d4dbe4ab7d923d3', true)

WebUI.click(findTestObject('Object Repository/button_Create Reservation'))

WebUI.verifyElementPresent(findTestObject('div_This hour is not available'), 1)

WebUI.closeBrowser()

