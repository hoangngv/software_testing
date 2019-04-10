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

// vào Lớp học của tôi
WebUI.click(findTestObject('Object Repository/XoaBaiTap/XoaBT/a_LopHocCuaToi'))

WebUI.click(findTestObject('Object Repository/XoaBaiTap/XoaBT/a_MyClass'))

WebUI.click(findTestObject('Object Repository/XoaBaiTap/XoaBT/a_dropdown_edit'))

WebUI.click(findTestObject('Object Repository/XoaBaiTap/XoaBT/a_XoaBT'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/XoaBaiTap/XoaBT/div_Huy_XacNhan'))
WebUI.click(findTestObject('Object Repository/XoaBaiTap/XoaBT/button_XacNhanXoa'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/XoaBaiTap/XoaBT/div_KhongTheXoa')))
{
	WebUI.executeJavaScript('alert("Thao tác xóa không thể thực hiện")', null)
}
else
{
	WebUI.executeJavaScript('alert("Thao tác xóa đã được thực hiện")', null)
}

WebUI.delay(5)
WebUI.closeBrowser()

