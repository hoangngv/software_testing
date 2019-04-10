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

// open browser
WebUI.openBrowser("https://hoclieu.sachmem.vn/folder/0")

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_ng nhp  Sch Mm/span_Google_fa fa-google'))

WebUI.setText(findTestObject('Object Repository/Objects for Test Case 5/Page_ng nhp - Ti khon Google/input_sachmemvn_identifier'), 
    'nvhoang191')

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.setEncryptedText(findTestObject('Object Repository/Objects for Test Case 5/Page_ng nhp - Ti khon Google/input_Qu nhiu ln th khng thnh cng_password'), 
    'Gqx7aomk65SqPum1tP1qq5ZXIA1l0Mcu')

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_ng nhp - Ti khon Google/span_Tip theo'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/a_Lp 5'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 5 Tp 1'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/span_Bi tp v Chnh t Luyn t v cu Tp lm vn'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/span_Giao bi tp'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/div_Chn lp hc_ng-input'))

WebUI.click(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/div_My class'))

WebUI.setText(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '30')

// nhập giá trị số thực vào mục Số lần làm lại
WebUI.setText(findTestObject('Object Repository/Objects for Test Case 5/Page_Hc liu - Sch Mm/input_S ln lm li_form-control ng-untouched ng-valid ng-dirty'), 
    '2.5')

WebUI.closeBrowser()

