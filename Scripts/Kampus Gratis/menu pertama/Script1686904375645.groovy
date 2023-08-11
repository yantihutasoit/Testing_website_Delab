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

WebUI.navigateToUrl('https://mknows-fe-kg.vercel.app/')

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Home/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_/input__email'), 'student1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/menu pertama/Page_/input__password'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/menu pertama/Page_/button_Masuk'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Dashboard/div_Dashboard_bg-neutral-100 w-9 h-9 flex i_06f240'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Dashboard/div_Lihat Semua'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Semua Fitur/div_AdministrasiFitur administrasi pada web_52b92b'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/button_Informasi Pribadi'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/div_Female'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/li_Male'))

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/input__birthplace'), 'tangsel')

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/input__address'), 'cirendeu')

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/input_NIM atau NPM (optional)_nim'), 
    '123456789')

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/input_Program Studi (optional)_major'), 
    'Teknik mesin')

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/span_Pilih pendidikan terakhir'))

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/span_Sarjana (S1)'))

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/input_Universitas Asal (optional)_university'), 
    'UI')

WebUI.setText(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/input_Semester (optional)_semester'), 
    '8')

WebUI.click(findTestObject('Object Repository/menu pertama/Page_Kampus Gratis - Administrasi/button_Simpan Informasi Pribadi'))

