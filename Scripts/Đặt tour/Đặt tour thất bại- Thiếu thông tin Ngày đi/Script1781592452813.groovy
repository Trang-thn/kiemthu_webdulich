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

WebUI.callTestCase(findTestCase('Đăng nhập/Đăng nhập thành công vào trang khách hàng'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Đặt tour/btn_Dattour1'))

'Nhập số lượng khách\r\n'
WebUI.setText(findTestObject('Đặt tour/txt_soLuongKhach'), '2')

'Chọn ngày khởi hành'
WebUI.executeJavaScript('document.querySelector(\'input[type=date]\').value=\'\'', [])

WebUI.sendKeys(findTestObject('Đặt tour/txt_soLuongKhach'), Keys.chord(Keys.TAB))

WebUI.executeJavaScript('document.querySelector(\'#booking-form\').reportValidity()', [])

