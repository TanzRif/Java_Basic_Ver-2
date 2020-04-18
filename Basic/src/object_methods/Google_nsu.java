package object_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_nsu {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().fullscreen();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("north south university");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='sbl1 sbl1p']//span[contains(text(),'north south university')]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();

		driver.close();

	}

}
