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

String username = 'nvhoang191' // replace

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

WebUI.verifyElementClickable(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/Page_ng nhp  Sch Mm/Page_Hc liu - Sch Mm/a_assign'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/Page_ng nhp  Sch Mm/Page_Hc liu - Sch Mm/a_assign'))

// mo ta
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/input_MoTa'))
WebUI.setText(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/input_MoTa'), '@#$%^&')
WebUI.delay(2)
WebUI.scrollToElement(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/div_ChonLopHoc'), 2)
WebUI.click(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/span_ChonLopHoc-arrow-wrapper'))
WebUI.click(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/input_MoTa'))
String input = WebUI.getAttribute(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/input_MoTa'), "value")
//String input = WebUI.getText(findTestObject('Object Repository/MoTa/Page_Hc liu - Sch Mm/input_MoTa'))
String myString = '@#$%^&'
if (input.equals(myString))
{
	WebUI.executeJavaScript('alert("String accepted")', null)
}
else
{
	WebUI.executeJavaScript('alert("String is not accepted")', null)
}

WebUI.delay(5)
WebUI.closeBrowser()
