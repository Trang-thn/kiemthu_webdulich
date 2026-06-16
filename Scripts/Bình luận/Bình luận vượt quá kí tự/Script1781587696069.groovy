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

WebUI.click(findTestObject('Bình luận/btn_chitiet'))

WebUI.setText(findTestObject('Bình luận/txt_noidungcom'), 'Paul từng làm việc tại nhà hàng Au Petit Salut (Singapore) trước khi mở nhà hàng cao cấp 20 chỗ ngồi Rhubarb vào năm 2014. Nhà hàng đã giành được một sao Michelin vào năm 2016 - năm cẩm nang Michelin Singapore ra mắt trên toàn cầu. Năm 2025, nhà hàng của Paul bị tước sao sau khi ông chuyển đổi nhà hàng thành một điểm đến bình dân hơn với 32 chỗ ngồi, phục vụ bữa trưa 3 món thịnh soạn với giá 48 USD/người. Encore từng được tờ Straistimes bình chọn là Nhà hàng mới tốt nhất năm 2025.')

WebUI.selectOptionByValue(findTestObject('Bình luận/ddl_danhgia'), '5', false)

WebUI.click(findTestObject('Bình luận/btn_binhluan'))

WebUI.verifyElementVisible(findTestObject('Bình luận/tit_binhluandagui'))

