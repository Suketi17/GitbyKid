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

WebUI.scrollToPosition(0, 0)

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/Choose_year_month_day/Choose_month2022_9'), '7月度', false)

//2022-10-5
WebUI.click(findTestObject('Folder_Gerenal/1-31/05'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '2300')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2022-9-13
WebUI.click(findTestObject('Folder_Gerenal/1-31/13'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0800')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '2000')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

WebUI.click(findTestObject('Folder_Gerenal/Choose_year_month_day/Next_month5-11'))

WebUI.delay(1)

WebUI.click(findTestObject('Folder_Gerenal/Choose_year_month_day/Next_month5-11'))

WebUI.delay(1)

//2022-12-14
WebUI.click(findTestObject('Folder_Gerenal/1-31/14'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.selectOptionByValue(findTestObject('Folder_Gerenal/choose_work_location/打刻日'), '2023-06-15', false)

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0500')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

