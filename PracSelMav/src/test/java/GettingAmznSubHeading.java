import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettingAmznSubHeading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		//*[@id="s-refinements"]/div[1]/ul/li[2]
//		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[2]"));
//		List<WebElement> findElements = driver.findElements(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul"));
//		for (WebElement webElement : findElements) {
//			if (webElement.getText().toString().equals("Electronics") || webElement.getText().toString().equals("Mobiles & Accessories")) {
//				continue;
//			} 
//			else {
//				System.out.println(webElement.getText());
//			}
//			
//		}
//		List<WebElement> li= driver.findElements(By.xpath("//li[contains(@class,'a-spacing-micro')]"));
//        for(int i=2;i<7;i++)
//        {
//            System.out.println(li.get(i).getText());
//        }
//		Electronics   
//		Mobiles & Accessories
//		Mobile Accessories
//		Mobile Broadband Devices
//		SIM Cards
//		Smartphones & Basic Mobiles
//		Smartwatches

		//*[@id="s-refinements"]/div[1]/ul/li[3]
        
        //HW 2 get list of brands
        List<WebElement> findBrands = driver.findElements(By.xpath("//*[@id=\"s-refinements\"]/div[5]/ul"));
        for (WebElement webElement : findBrands) {
			System.out.println(webElement.getText());
		}
        
        //task 3 //using actions class and //switching to next tab using windowsHandles and swichTo
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"sobe_d_b_1_1\"]/a/div[2]/span"));
        //action
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).build().perform();
        webElement.click();
        actions.keyDown(Keys.CONTROL).build().perform();
        //window handlers
        ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowHandles.get(1));
	}

}
