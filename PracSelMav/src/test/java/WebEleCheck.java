import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebEleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
//				new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("remember"));
		System.out.println(element.getAttribute("name"));
		System.out.println(element.isSelected());
		element.click();
		System.out.println(element.isSelected());
		
		//getAttr Vs getText
		WebElement element2 = driver.findElement(By.linkText("Forgot Password?"));
		System.out.println(element2.getText());
				
	}

}
