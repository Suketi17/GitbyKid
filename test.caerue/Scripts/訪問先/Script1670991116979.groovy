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

WebUI.mouseOver(findTestObject('choose_work_location/勤怠管理'))

WebUI.click(findTestObject('choose_work_location/訪問先別勤務情報'))

WebUI.click(findTestObject('choose_work_location/ID_訪問先＿変更必要'))

WebUI.selectOptionByLabel(findTestObject('choose_work_location/employee_working_year'), '2021年', false)

WebUI.selectOptionByLabel(findTestObject('choose_work_location/employee_working_month'), '5月度', false)

//2021-5-8
WebUI.click(findTestObject('HMSK/HMSK_2021-5-8'))

WebUI.click(findTestObject('HMSK/勤務追加'))

WebUI.sendKeys(findTestObject('HMSK/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('HMSK/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('HMSK/必要人数'), '1')

WebUI.click(findTestObject('HMSK/HMSK_Save1'))

WebUI.click(findTestObject('HMSK/NV追加'))

WebUI.sendKeys(findTestObject('HMSK/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.click(findTestObject('HMSK/HMSK_Save2'))

WebUI.click(findTestObject('HMSK/Next_day'))

WebUI.delay(2)

WebUI.click(findTestObject('HMSK/Next_day'))

WebUI.delay(2)

//2021-5-10
WebUI.click(findTestObject('HMSK/HMSK_2021-5-10'))

WebUI.click(findTestObject('HMSK/勤務追加'))

WebUI.sendKeys(findTestObject('HMSK/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('HMSK/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('HMSK/必要人数'), '1')

WebUI.click(findTestObject('HMSK/HMSK_Save1'))

WebUI.click(findTestObject('HMSK/NV追加'))

WebUI.sendKeys(findTestObject('HMSK/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.click(findTestObject('HMSK/HMSK_Save2'))

WebUI.click(findTestObject('HMSK/Next_day'))

WebUI.delay(2)

//2021-5-11
WebUI.click(findTestObject('HMSK/HMSK_2021-5-11'))

WebUI.click(findTestObject('HMSK/勤務追加'))

WebUI.sendKeys(findTestObject('HMSK/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('HMSK/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('HMSK/必要人数'), '1')

WebUI.click(findTestObject('HMSK/HMSK_Save1'))

WebUI.click(findTestObject('HMSK/NV追加'))

WebUI.sendKeys(findTestObject('HMSK/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.click(findTestObject('HMSK/HMSK_Save2'))

WebUI.click(findTestObject('HMSK/DoiLich/Chon_lich'))

WebUI.selectOptionByLabel(findTestObject('HMSK/DoiLich/DoiNam2022'), '2022年', false)

WebUI.selectOptionByLabel(findTestObject('HMSK/DoiLich/Doithang1'), '1月', false)

//2022-1-2
WebUI.click(findTestObject('HMSK/DoiLich/Day2'))

WebUI.click(findTestObject('HMSK/勤務追加'))

WebUI.sendKeys(findTestObject('HMSK/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('HMSK/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('HMSK/必要人数'), '1')

WebUI.click(findTestObject('HMSK/HMSK_Save1'))

WebUI.click(findTestObject('HMSK/NV追加'))

WebUI.sendKeys(findTestObject('HMSK/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.click(findTestObject('HMSK/HMSK_Save2'))

WebUI.click(findTestObject('HMSK/Next_day'))

WebUI.delay(2)

WebUI.click(findTestObject('HMSK/Next_day'))

WebUI.delay(2)


//2022-1-4
WebUI.click(findTestObject('HMSK/DoiLich/Day4'))

WebUI.click(findTestObject('HMSK/勤務追加'))

WebUI.sendKeys(findTestObject('HMSK/出勤BOX'), '0600')

WebUI.sendKeys(findTestObject('HMSK/退勤BOX'), '0800')

WebUI.sendKeys(findTestObject('HMSK/必要人数'), '1')

WebUI.click(findTestObject('HMSK/HMSK_Save1'))

WebUI.click(findTestObject('HMSK/NV追加'))

WebUI.sendKeys(findTestObject('HMSK/従業員ID＿BOX'), GlobalVariable.ID_employe)

WebUI.click(findTestObject('HMSK/HMSK_Save2'))