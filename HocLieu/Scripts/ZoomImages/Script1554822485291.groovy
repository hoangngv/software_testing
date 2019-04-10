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
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.xml.internal.security.keys.KeyUtils

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

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

// initialize boolean var
Boolean presence=false;
// chon Lop 1
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/a_Lop1'))
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/a_BaiTapTiengVietTap1'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/div_Tuan1'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/img_num1'))
presence = WebUI.verifyElementClickable(findTestObject('Object Repository/KiemTraZoomAnh/img_num1'))
if (presence)
{
	KeywordUtil.markPassed("Image exists.")
}
else
{
	KeywordUtil.markFailed("Image does not exist.")
}
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/img_num2'))
presence = WebUI.verifyElementClickable(findTestObject('Object Repository/KiemTraZoomAnh/img_num2'))
if (presence)
{
	KeywordUtil.markPassed("Image exists.")
}
else
{
	KeywordUtil.markFailed("Image does not exist.")
}
WebUI.delay(1)

// set view 400x400
WebUI.setViewPortSize(400, 400)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/img_num1'))
presence = WebUI.verifyElementClickable(findTestObject('Object Repository/KiemTraZoomAnh/img_num1'))
if (presence)
{
	KeywordUtil.markPassed("Image exists.")
}
else
{
	KeywordUtil.markFailed("Image does not exist.")
}
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/img_num2'))
presence = WebUI.verifyElementClickable(findTestObject('Object Repository/KiemTraZoomAnh/img_num2'))
if (presence)
{
	KeywordUtil.markPassed("Image exists.")
}
else
{
	KeywordUtil.markFailed("Image does not exist.")
}
WebUI.delay(1)

// set view 1920x1080
WebUI.setViewPortSize(1920, 1080)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/img_num1'))
presence = WebUI.verifyElementClickable(findTestObject('Object Repository/KiemTraZoomAnh/img_num1'))
if (presence)
{
	KeywordUtil.markPassed("Image exists.")
}
else
{
	KeywordUtil.markFailed("Image does not exist.")
}
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/KiemTraZoomAnh/img_num2'))
presence = WebUI.verifyElementClickable(findTestObject('Object Repository/KiemTraZoomAnh/img_num2'))
if (presence)
{
	KeywordUtil.markPassed("Image exists.")
}
else
{
	KeywordUtil.markFailed("Image does not exist.")
}
//WebUI.delay(1)
//WebUI.sendKeys(findTestObject('Object Repository/KiemTraZoomAnh/div_all'), Keys.chord(Keys.CONTROL, '+'))


WebUI.delay(5)
WebUI.closeBrowser()

