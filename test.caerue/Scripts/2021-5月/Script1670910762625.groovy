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

//2021-5-1
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

//2021-5-5
WebUI.click(findTestObject('Time/05'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Copy'))

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-6
WebUI.click(findTestObject('Time/06'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Copy'))

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-7
WebUI.click(findTestObject('Time/06'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Copy'))

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-13
WebUI.click(findTestObject('Time/03'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0913')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1757')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-18
WebUI.click(findTestObject('Time/17'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0830')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-19
WebUI.click(findTestObject('Time/19'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-20
WebUI.click(findTestObject('Time/20'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.delay(GlobalVariable.Delay_second)

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-21
WebUI.click(findTestObject('Time/21'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-22
WebUI.click(findTestObject('Time/21'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1200')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-24
WebUI.click(findTestObject('Time/24'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-25
WebUI.click(findTestObject('Time/25'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-28
WebUI.click(findTestObject('Time/28'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0830')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1815')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-5-31
WebUI.click(findTestObject('Time/31'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1830')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

WebUI.click(findTestObject('choose_work_location/Next_month'))

