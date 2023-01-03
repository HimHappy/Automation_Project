package test.flpcrt;

import java.io.File;
import java.io.IOException;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipcartAutomation {

	public static void main(String[] args) {
		
				
		//DOING BUY A OBJECT FROM FLIPCART
		final WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		//chromeDriver Update	
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\hrajak\\installchromedriver_win32\\chromedriver.exe"); //Line 1
//		WebDriverManager.chromedriver().version("77.0.3865.40").setup();
				
		//maximizing the web page
		driver.manage().window().maximize();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//pop-up closing
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		//searching s20 fe
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("S20 fe");
		//enter
		driver.findElement(By.xpath("//*[@class='_34RNph']")).click();
//		driver.findElement(By.xpath("//*[@class='_4rR01T']")).click();
//		driver.findElement(By.linkText("SAMSUNG Galaxy S20 FE (Cloud Mint, 128 GB)")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).click();
		
		//selecting first option from list{
		try {
//			Select select = new Select(driver.findElement(By.className("_4rR01T")));
//			select.selectByVisibleText("SAMSUNG S20 FE 5G (Cloud Mint, 128 GB)");
			Select selct2=new Select(driver.findElement(By.xpath("//div[@class='_1AtVbE col-12-12']")));
			selct2.selectByIndex(2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("unable to reach product ! try again with some changes");
		}
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a")).click();
//		driver.findElement(By.xpath("//a[@class='_1fQZEK']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@class='_4rR01T'][1]")).click();
//	}
		//going to next tab
		driver.navigate().forward();
		driver.getWindowHandles().forEach(new Consumer<String>() {
			public void accept(String tab) {
				driver.switchTo().window(tab);
			}
		});
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			//Add to cart
			driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			//Buy Now
			driver.findElement(By.xpath("//*[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			System.out.println("Unable to go to next tab and do this");
		}
		
		//Taking screenshot of output
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File instance=screenshot.getScreenshotAs(OutputType.FILE);
		String myLocaleFile = "C://Users//hrajak//JAVA SELENIUM WS//ScreenShots/Flipcart1.png";
		File flipcartScreenshot = new File(myLocaleFile);
		try {
			FileUtils.copyFile(instance, flipcartScreenshot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
