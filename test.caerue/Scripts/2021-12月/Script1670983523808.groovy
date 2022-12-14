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

//2021-12-1
WebUI.click(findTestObject('Time/01'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-3
WebUI.click(findTestObject('Time/03'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-5
WebUI.click(findTestObject('Time/05'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-8
WebUI.click(findTestObject('Time/08'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-10
WebUI.click(findTestObject('Time/10'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-12
WebUI.click(findTestObject('Time/12'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-13
WebUI.click(findTestObject('Time/13'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-15
WebUI.click(findTestObject('Time/15'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-12-18
WebUI.click(findTestObject('Time/18'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

WebUI.selectOptionByLabel(findTestObject('Choose_year_month_day/Choose_year21-22'), '2022年', false)

WebUI.selectOptionByLabel(findTestObject('Choose_year_month_day/Choose_month12-9'), '09月', false)

WebUI.click(findTestObject('Choose_year_month_day/Choose_day93'))

