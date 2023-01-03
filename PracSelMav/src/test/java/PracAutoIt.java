import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracAutoIt {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//opening page
		driver.get("https://www.ilovepdf.com/");
		//maximizing window
		driver.manage().window().maximize();
		//handling dynamic POP-UP { /* THIS IS NOT WORKING HERE BECAUSE THIS POP-UP IS NOT COMING AS A WINDOW*/
		Set<String> set = driver.getWindowHandles();
		System.out.println(set);
		if(set.size()>1) {
//			driver.switchTo().window("give name");//i don't know this right now
			//accepting cookies
			try {
				WebElement elementPopUp = driver.findElement(By.id("okck"));
				if(elementPopUp.isDisplayed()) {
					elementPopUp.click();
				}
			} catch (NoSuchElementException e) {
				// TODO Auto-generated catch block
				System.out.println("We found Pop-Up but unable to click on it");
			}
		}else {
			System.out.println("Pop-Up is not available as a window ");
		}
		/*
		 * AS THIS POP-UP IS NOT COMING AS A WINDOW SO RIGHT NOW USE IT LIKE A OBJECT ONLY AND WHEN POP-UP NOT COME COMMENT
		 * THIS CODE  
		 */
		driver.findElement(By.id("okck")).click();

//	}
		//going to edit pdf
//		driver.findElement(By.xpath("//h3[1]")).click()
		driver.findElement(By.xpath("//h3[contains(text(),'Edit PDF')]")).click();
		//clicking select pdf
//		driver.findElement(By.xpath("//span[contains(text(),'Select PDF file')]")).click();
//		driver.findElement(By.id("pickfiles")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//span[contains(text(),'Select PDF file')]")).click();
		
		//using AUTOIT for pdf selection
		try {
			Runtime.getRuntime().exec("C:\\Users\\hrajak\\pdfupload.exe");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//screenshots
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File instance= screenshot.getScreenshotAs(OutputType.FILE);
		String localURL = "C:\\Users\\hrajak\\JAVA SELENIUM WS\\ScreenShots\\pdflove.png";
		File localfile = new File(localURL);
		try {
			FileUtils.copyFile(instance, localfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
