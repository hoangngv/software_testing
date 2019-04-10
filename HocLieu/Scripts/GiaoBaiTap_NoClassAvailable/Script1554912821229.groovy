import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/a_Lop5'))
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/a_BaiTap1'))
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/span_BaiTap_ChinhTa'))
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/a_GiaoBaiTap'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/div_ChonLopHoc'))
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/span_ChonLopHoc-arrow-wrapper'))
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/input_ThoiGianLamBai'))
WebUI.setText(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/input_ThoiGianLamBai'), "20")
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/input_SoLanLamLai'))
WebUI.setText(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/input_SoLanLamLai'), "2")
WebUI.delay(1)

// tao
WebUI.click(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/input__Tao'))
// verify
Boolean check = WebUI.verifyElementVisible(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/div_TruongNayKhongDuocDeTrong'))
//Boolean assigned = WebUI.verifyElementVisible(findTestObject('Object Repository/GiaoBaiTap_KhongCoLopHocNao/div_GiaoThanhCong'))
if (check)
{
	WebUI.executeJavaScript('alert("Không thể giao bài tập")', null)
	KeywordUtil.markPassed("PASSED")
}
else
{
	WebUI.executeJavaScript('alert("Đã giao bài tập")', null)
	KeywordUtil.markFailed("FAILED")
}

WebUI.delay(5)
WebUI.closeBrowser()
