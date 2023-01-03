import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginReturn {

	public static String returnMethod(String userName, String password) {
	    By UseName = By.id(userName);
		By pass= By.name(password);
		By submit = By.xpath("//input[@value='Sign in']");
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(UseName));
		} catch (TimeoutException e) {
			System.out.println("WebElement not found");
		}		
		driver.findElement(UseName).sendKeys("username");
		driver.findElement(pass).sendKeys("pass@123");
		driver.findElement(submit).click();
		ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
		boolean equals=false;
		try {
			equals = windowHandles.get(1).equals(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Failed";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(returnMethod("login1", "passwd"));
	}

}
