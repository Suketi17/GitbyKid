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

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/employee_working_month'), '6月度', false)

//2021-6-1
WebUI.click(findTestObject('Folder_Gerenal/1-31/01'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-2
WebUI.click(findTestObject('Folder_Gerenal/1-31/02'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-3
WebUI.click(findTestObject('Folder_Gerenal/1-31/03'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-4
WebUI.click(findTestObject('Folder_Gerenal/1-31/04'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-5
WebUI.click(findTestObject('Folder_Gerenal/1-31/05'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')



WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-8
WebUI.click(findTestObject('Folder_Gerenal/1-31/08'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-10
WebUI.click(findTestObject('Folder_Gerenal/1-31/10'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-14
WebUI.click(findTestObject('Folder_Gerenal/1-31/14'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-15
WebUI.click(findTestObject('Folder_Gerenal/1-31/15'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-16
WebUI.click(findTestObject('Folder_Gerenal/1-31/16'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1800')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-22
WebUI.click(findTestObject('Folder_Gerenal/1-31/22'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0850')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-23
WebUI.click(findTestObject('Folder_Gerenal/1-31/23'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0850')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1810')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-24
WebUI.click(findTestObject('Folder_Gerenal/1-31/24'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '1810')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.selectOptionByLabel(findTestObject('Folder_Gerenal/choose_work_location/退勤'), '退勤', false)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/List NV'))

//2021-6-26
WebUI.click(findTestObject('Folder_Gerenal/1-31/26'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/追加'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/打刻時刻'), '0900')

WebUI.clearText(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'))

WebUI.sendKeys(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Input Kimuchi - Select'))

WebUI.click(findTestObject('Folder_Gerenal/choose_work_location/Save'))
