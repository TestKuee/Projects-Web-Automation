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

WebUI.click(findTestObject('Elearning/Add User/Page/a_User List'))

WebUI.click(findTestObject('Elearning/Add User/Page-2/Pg 1'))

WebUI.click(findTestObject('Elearning/Add User/Page-2/btn_Tambah'))

WebUI.click(findTestObject('Elearning/Add User/Page-2/Pg 2'))

WebUI.setText(findTestObject('Elearning/Add User/Page-2/Name'), 'Nely')

WebUI.setText(findTestObject('Elearning/Add User/Page-2/Email'), 'Nely@gmail.com')

WebUI.setText(findTestObject('Elearning/Add User/Page-2/Phone'), '087100920191')

WebUI.setText(findTestObject('Elearning/Add User/Page-2/InstanceCode'), '123')

WebUI.click(findTestObject('Elearning/Add User/Page-2/RBtn'))

WebUI.click(findTestObject('Elearning/Add User/Page-2/RValue'))

WebUI.setEncryptedText(findTestObject('Elearning/Add User/Page-2/Password'), 'YsqIKzHWQwYX7jcwa8U8RQ==')

WebUI.click(findTestObject('Elearning/Add User/Page-2/btnSave'))

WebUI.verifyElementPresent(findTestObject('Elearning/Add User/Page-2/MessageSuccess'), 0)

