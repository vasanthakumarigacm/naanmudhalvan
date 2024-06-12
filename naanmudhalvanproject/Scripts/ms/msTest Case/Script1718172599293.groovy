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

WebUI.navigateToUrl('https://www.msuniv.ac.in/msuniv_distance_education_home.php')

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Administration'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Research'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Distance Education'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Home'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Examiners Seniority'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Examiners Seniority'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_About'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Our History'))

WebUI.click(findTestObject('Object Repository/ms/Page_Manonmaniam Sundaranar University/a_Examinations'))

WebUI.closeBrowser()

