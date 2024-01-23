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

WebUI.click(findTestObject('Elearning/Master Question/Page_Home  Elearning CMS/a_Master Question'))

WebUI.click(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/button_Tambah Question'))

WebUI.selectOptionByIndex(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Level'), 1)

WebUI.selectOptionByIndex(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Module'), '0')

WebUI.setText(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Chapter'), '0')

WebUI.setText(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Question_desc'), 'OK')

WebUI.setText(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Option A'), '')

WebUI.setText(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Option B'), '')

WebUI.setText(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/C'), '')

WebUI.setText(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Option D'), '')

WebUI.click(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/label_B'))

WebUI.click(findTestObject('Elearning/Master Question/Page_Master Quiz  Elearning CMS/Active Checklist'))

