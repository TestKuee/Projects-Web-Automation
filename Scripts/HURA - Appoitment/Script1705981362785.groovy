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

WebUI.callTestCase(findTestCase('HURA - Login'), [:], FailureHandling.STOP_ON_FAILURE)

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/List Facility'), 1)

    WebUI.click(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/Check List Apply Hospital'))

    if (n == 0) {
        WebUI.click(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/label_Medicare'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/label_Medicaid'))

        WebUI.delay(1)
    } else {
        WebUI.click(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/label_None'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), '22/02/2024')

    WebUI.setText(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Apoitment')

    WebUI.click(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/button_Book Appointment'))

    WebUI.click(findTestObject('HURA CLINIC/Page_CURA Healthcare Service/a_Go to Homepage'))
}

WebUI.closeBrowser()

