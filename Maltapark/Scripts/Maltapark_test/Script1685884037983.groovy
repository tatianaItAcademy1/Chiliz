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

//open browser
WebUI.openBrowser('https://maltapark.com/')

//Click Login btn
WebUI.click(findTestObject('Object Repository/Maltapark_manual/Page_Home  Maltapark/a_login'))

//provide login and password
WebUI.setText(findTestObject('Object Repository/Maltapark_manual/Page_Login  Maltapark/input_Login_Username'), 'tat_dwor')

WebUI.setText(findTestObject('Object Repository/Maltapark_manual/Page_Login  Maltapark/input_Login_Password'), 'U*aUCy9zEp*HtKD')

//unmark Remember me on this device button
WebUI.click(findTestObject('Object Repository/Maltapark_manual/Page_Login  Maltapark/label_Remember me on this device'))

//click Login button
WebUI.click(findTestObject('Object Repository/Maltapark_manual/Page_Login  Maltapark/div_Login'))

//input the text 'Computer' to Search field
WebUI.setText(findTestObject('Object Repository/Maltapark_manual/Page_Activate Your Account  Maltapark/input_Search By Username_search'), 
    'Computer')

//Click Search btn
WebUI.click(findTestObject('Object Repository/Maltapark_manual/Page_Activate Your Account  Maltapark/button_title only_btn btn-search'))

WebUI.click(findTestObject('Object Repository/Maltapark_manual/Page_Search Results  Maltapark/First_product_on_the_page'))

price = WebUI.getText(findTestObject('Object Repository/Maltapark_manual/Page_Conceptronic Firewire 4 to 4 pin cable 1.8M 6feet 6ft  Maltapark/Price_of_first_product'))

description = WebUI.getText(findTestObject('Object Repository/Maltapark_manual/Page_Conceptronic Firewire 4 to 4 pin cable 1.8M 6feet 6ft  Maltapark/Description_of_first_product'))

WebUI.closeBrowser()

System.out.println("Price of first item is " + price)

System.out.println("Description of first item is " + description)

