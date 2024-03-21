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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/input_Name_name'), 'jose')

WebUI.setText(findTestObject('Object Repository/input_Last Name_lastName'), 'perez')

WebUI.setText(findTestObject('Object Repository/input_Phone_phone'), '12345')

WebUI.setText(findTestObject('Object Repository/input_Email_email'), 'j@p.c')

WebUI.setText(findTestObject('Object Repository/input_User Name_username'), 'jperez')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/input_Confirm Password_confirmPassword'), 'tzH6RvlfSTg=')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_Select OneUserRestaurant'), 'user', true)

WebUI.click(findTestObject('Object Repository/button_Create Acccount'))

WebUI.verifyElementPresent(findTestObject('div_This name already exists'), 1)

