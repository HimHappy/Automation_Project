import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebListCheck {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rdBtn = "f";
		Boolean sexflag = false;
		//*[contains(@name,'gender')]
		WebDriver driver = new EdgeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		//getting list of elements of radio button
//		List<WebElement> listRD = driver.findElements(By.xpath("//*[contains(@name,'gender')]"));
//		System.out.println(listRD.size());
//		for (WebElement webElement : listRD) {
//			System.out.println(webElement.getAttribute("value"));
//			if(webElement.getAttribute("value").equals(rdBtn)) {
//				sexflag=true;
//				webElement.click();
//				
//			}
//		}
//		if(!sexflag) {
//			System.out.println(rdBtn+" not present in list");
//		}
		
		//Practice again
		List<WebElement> radioElement = driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		for (WebElement element : radioElement) {
			if (element.getAttribute("value").equals(rdBtn)) {
				element.click();
			}
		}
		
//		WebElement weSelectDay = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
////      weSelectDay.click();
//      Select slctDay = new Select(weSelectDay);
//      slctDay.selectByVisibleText("04");
//
//      //select Month
//      WebElement weSelectmonth = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
////      weSelectDay.click();
//      Select slctmnth = new Select(weSelectmonth);
//      slctmnth.selectByVisibleText("APR");
//      
//      //Select year
//      WebElement weSelectYear = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
////      weSelectDay.click();
//      Select slctYear = new Select(weSelectYear);
//      slctYear.selectByVisibleText("2000");
      
		//select Day
		WebElement webElement1 = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select selectDay = new Select(webElement1);
		selectDay.selectByVisibleText("04");
		//select Month
		WebElement webElement2 = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select selectMonth = new Select(webElement2);
		selectMonth.selectByIndex(4);// " index starts from 1 "
		//select Year
		WebElement webElement3 = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
		Select selectYear = new Select(webElement3);
		selectYear.selectByValue("2000");
		
	}

}
