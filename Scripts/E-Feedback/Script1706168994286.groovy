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

WebUI.callTestCase(findTestCase('E-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Elearning/FB Bank/Page2/a_Feedback Bank'))

WebUI.click(findTestObject('Elearning/FB Bank/Page1/Page Tambah Feedback 1'))

WebUI.click(findTestObject('Elearning/FB Bank/Page1/button Tambah  Feedback'))

WebUI.click(findTestObject('Elearning/FB Bank/Page1/Level'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Elearning/FB Bank/Page1/search_value'), 'iso')

WebUI.delay(3)

WebUI.click(findTestObject('Elearning/FB Bank/Page1/select_value_2'))

WebUI.click(findTestObject('Elearning/FB Bank/Page1/Btn Module'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Elearning/FB Bank/Page1/Search Modul'), 'ISO 27001')

WebUI.click(findTestObject('Elearning/FB Bank/Page1/Value Module'))

WebUI.setText(findTestObject('Elearning/FB Bank/Page1/Title'), 'ok')

WebUI.click(findTestObject('Elearning/FB Bank/Page1/div_Active'))

WebUI.click(findTestObject('Elearning/FB Bank/Page1/button_Save'))

WebUI.verifyElementPresent(findTestObject('Elearning/FB Bank/Page1/Pop Up Data Save'), 
    0)

WebUI.refresh()

