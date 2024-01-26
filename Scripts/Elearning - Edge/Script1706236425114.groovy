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

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/a_Master Question'))

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Pg1                                                                                                         Sh'))

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/btnadd'))

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Pg2                                                                                                                           Level'))

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/btnLevel'))

not_run: WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/iptISO'), 'ISO')

WebUI.sendKeys(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/iptISO'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/modulebtn'))

WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/mdlinput (1)'), 'ISO 27001')

WebUI.sendKeys(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/mdlinput (1)'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/ChepBtn'))

WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/Chepinput'), 
    'Materi 2')

WebUI.sendKeys(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/Chepinput'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/textarea_Option A_optA'), 
    'a')

WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/textarea_Option B_optB'), 
    'b')

WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/textarea_Option C_optC'), 
    'c')

WebUI.setText(findTestObject('Elearning/E-Master/Page_Master Quiz  Elearning CMS/Page_Master Quiz  Elearning CMS/textarea_Option D_optD'), 
    'd')

