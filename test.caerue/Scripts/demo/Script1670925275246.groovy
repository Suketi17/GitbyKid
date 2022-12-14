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

WebUI.openBrowser('')

WebUI.navigateToUrl('test.caeru.biz/itz')

WebUI.sendKeys(findTestObject('Login_page/ID_Input'), 'admin')

WebUI.sendKeys(findTestObject('Login_page/Pass_Input'), 'solomon')

WebUI.click(findTestObject('Login_page/Login_click'))

WebUI.callTestCase(findTestCase('choose_work_location'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Time/03'))

WebUI.click(findTestObject('choose_work_location/追加'))

WebUI.selectOptionByValue(findTestObject('choose_work_location/打刻日'), '2021-5-4', false)

WebUI.sendKeys(findTestObject('choose_work_location/打刻時刻'), '0900')

WebUI.sendKeys(findTestObject('choose_work_location/Input Kimuchi'), GlobalVariable.kimuchi_name)

WebUI.click(findTestObject('choose_work_location/Input Kimuchi - Copy'))

WebUI.click(findTestObject('choose_work_location/Save'))

