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

Mobile.startExistingApplication('com.solodroid.solomerce', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('checkout/btn_keranjang'), 0)

Mobile.tap(findTestObject('checkout/btn_checkout_'), 0)

Mobile.tap(findTestObject('checkout/set_name'), 0)

Mobile.setText(findTestObject('checkout/set_name'), 'winda', 0)

Mobile.verifyElementText(findTestObject('checkout/verify_element_name'), 'winda', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('checkout/set_email'), 0)

Mobile.setText(findTestObject('checkout/set_email'), 'winda@gmail.com', 0)

Mobile.verifyElementText(findTestObject('checkout/verify_element_email'), 'winda@gmail.com', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('checkout/set_phone_number'), 0)

Mobile.setText(findTestObject('checkout/set_phone_number'), '8594585785', 0)

Mobile.verifyElementText(findTestObject('checkout/verify_element_phone'), '8594585785', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('checkout/set_address'), 0)

Mobile.setText(findTestObject('checkout/set_address'), 'jalan mawar', 0)

Mobile.verifyElementText(findTestObject('checkout/verify_element_address'), 'jalan mawar', FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('checkout/set_shipping'), 0)

Mobile.tap(findTestObject('checkout/shipping_dropdown'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('checkout/btn_process_checkout'), 0)

Mobile.tap(findTestObject('checkout/btn_yes_checkout'), 0)

Mobile.tap(findTestObject('checkout/btn_ok_success_checkout'), 0)

Mobile.tap(findTestObject('checkout/btn_back'), 0)

Mobile.tap(findTestObject('checkout/btn_back'), 0)

Mobile.closeApplication()

