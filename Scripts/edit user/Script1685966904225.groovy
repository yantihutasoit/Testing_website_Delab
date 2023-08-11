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

WebUI.navigateToUrl('http://delab.website/public/login')

WebUI.setText(findTestObject('Object Repository/edit user/Page_DeLab  Login/input_SIGN IN_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/edit user/Page_DeLab  Login/input_SIGN IN_password'), 'RAIVpflpDOg=')

WebUI.click(findTestObject('Object Repository/edit user/Page_DeLab  Login/button_Login'))

WebUI.click(findTestObject('Object Repository/edit user/Page_DeLab/a_User'))

WebUI.click(findTestObject('Object Repository/edit user/Page_DeLab/a_mahasiswa_icon las las la-edit f-3 edit'))

WebUI.setText(findTestObject('Object Repository/edit user/Page_DeLab/input_Edit User_email'), 'andre123@gmail.com')

WebUI.click(findTestObject('Object Repository/edit user/Page_DeLab/button_Save changes'))

WebUI.click(findTestObject('Object Repository/edit user/Page_DeLab/button_OK'))

