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

WebUI.callTestCase(findTestCase('Elearning - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Elearning/Add User/Page_Home  Elearning CMS/a_User List'))

WebUI.click(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Pg 1'))

WebUI.click(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/button_Tambah'))

WebUI.click(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Pg 2'))

WebUI.setText(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Name'), 'Nely')

WebUI.setText(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Email'), 'Nely@gmail.com')

WebUI.setText(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Phone'), '087100920191')

WebUI.setText(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/InstanceCode'), '123')

WebUI.click(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Role Btn'))

WebUI.click(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Role Value Test'))

WebUI.setEncryptedText(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Password'), 'YsqIKzHWQwYX7jcwa8U8RQ==')

WebUI.click(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/button_Save'))

WebUI.verifyElementPresent(findTestObject('Elearning/Add User/Page_User List  Elearning CMS/Message Success'), 0)

