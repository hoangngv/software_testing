import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String username = 'phamdinhhung96' // replace

String password = '********' // replace ******** by your password

WebUI.openBrowser('https://hoclieu.sachmem.vn/folder/0')

// sign in
WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/a_DangNhap'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp  Sch Mm/a_Google'))

WebUI.setText(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'), 
    username)

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/span_Next1'))
WebUI.delay(3)
WebUI.setText(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/input_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/span_Next2'))

// giao bai tap
WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/a_Lop5'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/a_BaiTapCuoiTuanTiengVietTap1'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/span_BaiTapVeChinhTa'))

// validate
Boolean found = WebUI.verifyElementClickable(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/Page_ng nhp  Sch Mm/Page_Hc liu - Sch Mm/a_assign'), FailureHandling.CONTINUE_ON_FAILURE)
if (found == true) {
    WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/Page_ng nhp  Sch Mm/Page_Hc liu - Sch Mm/a_assign'))
    WebUI.executeJavaScript('alert(\'You are able to assign exercises\')', null)
} else {
    WebUI.executeJavaScript('alert(\'You are unable to assign exercises\')', null)
}

WebUI.delay(5)
WebUI.closeBrowser()

