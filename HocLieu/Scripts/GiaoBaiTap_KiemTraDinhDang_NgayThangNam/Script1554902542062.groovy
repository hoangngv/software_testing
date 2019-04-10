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

String username = 'nvhoang191' // replace by your username

String password = '********' // replace ******** by your password

WebUI.openBrowser('https://hoclieu.sachmem.vn/folder/0')

// sign in
WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_Hc liu - Sch Mm/a_DangNhap'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp  Sch Mm/a_Google'))

WebUI.setText(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'),
	username)

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/span_Next1'))
WebUI.delay(2)
WebUI.setText(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/input_password'),
	password)

WebUI.click(findTestObject('Object Repository/Objects for Test Case 11/Page_ng nhp - Ti khon Google/span_Next2'))

// validate Giao Bai Tap

WebUI.click(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/a_Lp 5'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 5 Tp 1'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/span_Bi tp v Chnh t Luyn t v cu Tp lm vn'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/span_Giao bi tp'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '30')
WebUI.delay(1)
WebUI.setText(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/input_S ln lm li_form-control ng-untouched ng-valid ng-dirty'), 
    '5')
WebUI.delay(1)

// nhập ngày bắt đầu
WebUI.setText(findTestObject('Object Repository/KiemTraNgayThangNam/input_ngayBatDau'), '32/13/2100')
WebUI.delay(2)

// nhập ngày kết thúc
WebUI.setText(findTestObject('Object Repository/Objects for Test Case 8/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control ng-untouched ng-pristine ng-valid'), 
    '31/04/2018')
WebUI.delay(2)

String startingDate = WebUI.getAttribute(findTestObject('Object Repository/KiemTraNgayThangNam/input_ngayBatDau'), "value")
String invalid = "Invalid date"

if (startingDate.equals(invalid))
{
	WebUI.executeJavaScript('alert("Định dạng ngày tháng năm không đúng")', null)
}
else
{
	WebUI.executeJavaScript('alert("Định dạng ngày tháng năm chính xác")', null)
}

WebUI.delay(5)
WebUI.closeBrowser()





