package report;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRPA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/home/neebal/Downloads/chromedriver_linux64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.rajexcise.gov.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	//	driver.findElementByXPath("[@id="ModalHome"]/div/div/div[3]/button");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ModalHome\"]/div/div/div[3]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"div_menu\"]/ul/li[5]/a")).click();
	}
}
