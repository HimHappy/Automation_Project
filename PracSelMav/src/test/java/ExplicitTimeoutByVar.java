import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitTimeoutByVar {

	private static final By UseName = By.id("login1");

	public static void main(String[] args) {
		By pass= By.name("passwd");
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(UseName));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(pass));  //It is for Exception
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			System.out.println("Hemant chutiya not found");
//			System.out.println("WebElement not found");
			return;
		}
//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofNanos(5000));
//		wait2.until(ExpectedConditions.invisibilityOfElementLocated(UseName));
		
		driver.findElement(UseName).sendKeys("hemantChutiya");
		driver.findElement(pass).sendKeys("HemChutiya!23");
		
	}

}
