import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class threeAmazonExrcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
//		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
		driver.findElement(By.xpath("//*[@href=\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\"]")).click();
		//Task -1 printing strating from
		List<WebElement> PriceElements = driver.findElements(By.xpath("//span[contains(text(),'Starting')]"));
		for (WebElement webElement : PriceElements) {
			System.out.println(webElement.getText());
		}
		//task - 2 print price only
		ArrayList<Integer> priceListInterger = new ArrayList<Integer>();
		ArrayList<String> priceListString = new ArrayList<String>();
		for (WebElement webElement : PriceElements) {
//			System.out.println(webElement.getText().split("\u20B9").toString());
//			priceList.add(Integer.valueOf(webElement.getText().toString().substring(10)));//not working because of comma , so replace it
			String webElement2 = webElement.getText().toString().replace(",", "");
			priceListInterger.add(Integer.valueOf(webElement2.substring(10))); //now working
			priceListString.add(webElement.getText().toString().substring(10)); //working 
//			String newStr = webElement.getText().toString().substring(9);
//			System.out.println(newStr);
		}
		//String[] str ={"User Asha","User Gajendra","User Mohit"};
//        for (String strName : str) {
//            String newStr = strName.substring(5);
//            System.out.println(newStr);
//            
//        }
//		public static void main(String[] args) {
//	        // TODO Auto-generated method stub
//	        String strAMt = "6999";
//	        int iAmt =    convertToNumber(strAMt);
//	        System.out.println(iAmt);
//	    }
//	    private static int convertToNumber(String strAMt) {
//	        // TODO Auto-generated method stub
//	        strAMt = strAMt.replace(",", "");
//	        int iAmt = Integer.valueOf(strAMt);
//	        return iAmt;
//	    }

		System.out.println(priceListInterger);
		System.out.println(priceListString);
		//task -3 sorting price range
		Collections.sort(priceListInterger);
		System.out.println(priceListInterger);
//		priceList.forEach(a->a.)
	}

}
