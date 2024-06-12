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

WebUI.navigateToUrl('https://mkuniversity.ac.in/new/')

WebUI.click(findTestObject('Object Repository/mku/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/font_Academics'))

WebUI.click(findTestObject('Object Repository/mku/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_School of Social Sciences'))

WebUI.click(findTestObject('Object Repository/mku/Page_MKU-School of Social Science/h1_News  Events'))

WebUI.click(findTestObject('Object Repository/mku/Page_MKU-School of Social Science/a_Read More'))

WebUI.click(findTestObject('Object Repository/mku/Page_MADURAI KAMARAJ UNIVERSITY - OFFICIAL SITE/a_Centre for Educational Research'))

WebUI.click(findTestObject('Object Repository/mku/Page_MKU- Centre for Educational Research/a_Read More'))

WebUI.click(findTestObject('Object Repository/mku/Page_MKU- Centre for Educational Research/strong_INTERNATIONAL JOURNAL OF EDUCATIONAL_c83b9e'))

WebUI.click(findTestObject('Object Repository/mku/Page_MKU- Centre for Educational Research/a_Alumni'))

WebUI.click(findTestObject('Object Repository/mku/Page_MKU- Centre for Educational Research/h3_Distinguished Alumni of the  Centre'))

WebUI.closeBrowser()

