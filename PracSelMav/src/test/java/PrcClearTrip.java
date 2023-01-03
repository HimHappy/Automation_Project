import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrcClearTrip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//opening clearTrip
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.findElement(By.xpath(" //*[@class=' c-pointer c-neutral-900']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button[1]")).click();
		////div[@class='flex flex-middle p-relative homeCalender']/button/div
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File scFile = screenshot.getScreenshotAs(OutputType.FILE);
		String myPcUrl = "C://Users//hrajak//JAVA SELENIUM WS//ScreenShots/DatePicker.png";
		File fileEv1 = new File(myPcUrl);
		try {
			FileUtils.copyFile(scFile, fileEv1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
