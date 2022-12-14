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

//2021-8-2
WebUI.click(findTestObject('Time/2'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-4
WebUI.click(findTestObject('Time/4'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-5
WebUI.click(findTestObject('Time/5'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-6
WebUI.click(findTestObject('Time/6'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-9
WebUI.click(findTestObject('Time/9'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-10
WebUI.click(findTestObject('Time/10'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-12
WebUI.click(findTestObject('Time/12'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-19
WebUI.click(findTestObject('Time/19'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-20
WebUI.click(findTestObject('Time/20'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-21
WebUI.click(findTestObject('Time/21'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0800')

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-26
WebUI.click(findTestObject('Time/26'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-27
WebUI.click(findTestObject('Time/27'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-28
WebUI.click(findTestObject('Time/28'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1910')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

//2021-8-31
WebUI.click(findTestObject('Time/31'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '1900')

WebUI.selectOptionByLabel(findTestObject('choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('choose_work_location/List NV'))

WebUI.click(findTestObject('Choose_year_month_day/Next_month5-11'))

