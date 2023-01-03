import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffCountryListPracSel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		0. StringArray  {"Bhutan","Aruba","Bharat","Angola"}
//		1. Open the browser
//		2.  Navigate to https://register.rediff.com/register/register.php?FormName=user_details
//		3. 
//		O/P format
//		Bhutan is in the list
//		Aruba is in the list
//		Bharat is not in the list
		
		String[] array= {"Bhutan","Aruba","Bharat","Angola"};
		ArrayList<String> aStrings = new ArrayList<String>();
		WebDriver driver = new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		//method -1 ;; ;; which comes in my mind first
		//best way to do it *****
		List<WebElement> countryElements = driver.findElements(By.xpath("//*[@id=\"country\"]"));
		for (WebElement webElement : countryElements) {
			aStrings.add(webElement.getText());
		}
		for (String str : array) {
			if (aStrings.toString().contains(str)) {
				System.out.println(str+" is in the list");
			}else {
				System.out.println(str+" is not in the list");
			}
		}
		
		//method - 2; by select class
//		Thread.sleep(3000);
//		WebElement countryWebElement = driver.findElement(By.xpath("//*[@id=\"country\"]"));
//		Select countrySelect = new Select(countryWebElement);
//		getAllSelectedOptions isme only jo already means ki by default selected hai vo show hoga
//		List<WebElement> allSelectedOptions = countrySelect.getAllSelectedOptions();
//		for (WebElement webElement : allSelectedOptions) {
//			System.out.println(webElement.getText());
//		}
		
//		System.out.println("for partition");
		
		//getOptions me all the list will get appears in form of string
//		List<WebElement> optionsList = countrySelect.getOptions();
////		for (WebElement webElement : optionsList) {
////			System.out.println(webElement.toString());
////		}
//		for (int i = 0; i < array.length; i++) {
//			if (optionsList.contains(array[i])) {
//				System.out.println(array[i]+" is in the list");
//			}else {
//				System.out.println(array[i]+" is not in the list");
//			}
//		}
		
	}
}
