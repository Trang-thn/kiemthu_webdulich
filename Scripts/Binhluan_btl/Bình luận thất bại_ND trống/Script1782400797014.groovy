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

WebUI.openBrowser(null)

WebUI.navigateToUrl('http://localhost/webdulich/')

WebUI.click(findTestObject('Binhluan_btl/a_ng nhp'))

WebUI.setText(findTestObject('Binhluan_btl/input_username'), Username)

WebUI.setText(findTestObject('Binhluan_btl/input_password'), Password)

WebUI.click(findTestObject('Binhluan_btl/button_ng nhp'))

WebUI.click(findTestObject('Binhluan_btl/a_Chi tit'))

WebUI.setText(findTestObject('Binhluan_btl/textarea_Ni dung bnh lun'), Content)

WebUI.selectOptionByValue(findTestObject('Binhluan_btl/select_nh gi'), Sosao, false)

WebUI.click(findTestObject('Binhluan_btl/button_Gi bnh lun'))

WebUI.getAttribute(findTestObject('Binhluan_btl/txt_noidungcom'), ExpectedMessage)

