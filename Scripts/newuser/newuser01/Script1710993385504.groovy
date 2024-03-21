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

WebUI.click(findTestObject('Object Repository/cosas/a_Sign Up'))

WebUI.setText(findTestObject('Object Repository/cosas/input_Name_name'), name)

WebUI.setText(findTestObject('Object Repository/cosas/input_Last Name_lastName'), lastname)

WebUI.setText(findTestObject('SingIn/input_Phone_phone'), phone)

WebUI.setText(findTestObject('SingIn/input_Email_email'), email)

WebUI.setText(findTestObject('SingIn/input_User Name_userName'), username)

WebUI.setEncryptedText(findTestObject('SingIn/input_Password_password'), password)

WebUI.setEncryptedText(findTestObject('SingIn/input_Confirm Password_confirmPassword'), password)

WebUI.selectOptionByValue(findTestObject('SingIn/select_Select OneUserRestaurant'), 'user', true)

WebUI.click(findTestObject('cosas/button_Create Acccount'))

WebUI.verifyElementPresent(findTestObject('cosas/div_Your user is created'), 1)

WebUI.closeBrowser()

