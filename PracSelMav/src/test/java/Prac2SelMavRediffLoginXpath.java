import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac2SelMavRediffLoginXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//XPATH
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass@Q123");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("pass@Q123");
		//*[@id="login1"]
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Himanshu rajak");
		//input[@class='signinbtn']
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();

	}

}
