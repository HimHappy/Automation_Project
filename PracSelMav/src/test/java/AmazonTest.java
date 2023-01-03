import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 12 pro max");
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		//*[@class='a-size-medium a-color-base a-text-normal'][1]
//		driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal'][1]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')][1]")).click();

		//H.W.
		/*  SearchProduct
			Click on Add Cart
			Update the Qnty > and Validate
			Delete the product from cart and validate Cart as 0
		 */
		String validate = "4"; //quantity
		//search product
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Fire-Boltt Phoenix Smart Watch");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		//selecting product
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		//trying to navigate to next page
//		driver.navigate().forward(); //not working also not throwing ?
		
		//navigating to that page where it is throwing us 
//		driver.navigate().to("https://www.amazon.in/Fire-Boltt-Phoenix-Bluetooth-Calling-Monitoring/dp/B0B3RRWSF6/ref=sr_1_1_sspa?crid=1IGW3QDPTCTC0&keywords=Fire-Boltt%2BPhoenix%2BSmart%2BWatch&qid=1671522406&sprefix=%2Caps%2C307&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1");
		//going to the next page/tab/window
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		//add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//going to cart
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		//updating quantity
		WebElement quantityElement = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
		Select selectQuantity = new Select(quantityElement);
		selectQuantity.selectByVisibleText(validate);
		//validation ?
		//i think get the selected number
		WebElement selectedText = driver.findElement(By.xpath("//*[@class='a-dropdown-prompt']"));
		if (selectedText.getText().toString().equals(validate)) {
			System.out.println("validation passed");
		}else {
			System.out.println("Validation failed");
		}
		//deleting item from cart
		WebElement deleteElement = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
		Select selectDelete = new Select(deleteElement);
		selectDelete.selectByIndex(0);
		//validation
		//DO IT PROPER DO IT WITH LIST ONCE
		WebElement selectDeleted = driver.findElement(By.xpath("//h1"));
		if (selectDeleted.getText().toString().equals("Shopping Cart")) {
			System.out.println("Delete validation passed");
		}else {
			System.out.println("Delete Validation failed");
		}
		////*[contains(@class,'a-size-base')]
//		WebElement list = driver.findElement(By.xpath("//*[contains(@id,'sc-active')]/div/div[1]/span"));
//			System.out.println(list.getText());
		
		//Using Action class doing "cntrl+click"
//		WebElement webElementForActions = driver.findElement(By.xpath("//span[contains(text(),'Fastrack Reflex Play…')]"));
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL).build().perform();
//		webElementForActions.click();
//		action.keyUp(Keys.CONTROL).build().perform();
	}

}
