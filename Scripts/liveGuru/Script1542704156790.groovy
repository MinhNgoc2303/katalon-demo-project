import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://live.guru99.com/')

WebUI.click(findTestObject('Object Repository/Page_Home page/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Customer Login/span_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__firstname'), 'minhchau')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__lastname'), 'phan')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input__email'), 'chau7896@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input__password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input__confirmation'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/button_Register'))

WebUI.click(findTestObject('Object Repository/Page_My Account/span_Account'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Log Out'))

WebUI.closeBrowser()

