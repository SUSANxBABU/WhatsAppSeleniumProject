package co.selenium.whatsapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_whatsapp {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\exe files\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:\\Users\\ADMIN\\AppData\\Local\\Google\\Chrome\\User Data\\Default");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(3000);// SIDE-PANEL CHATS
	    new WebDriverWait(driver,Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div/div/div[10]/div/div/div/div[2]/div[1]/div[1]/span"))).click();
	    Thread.sleep(3000);// CHAT-TYPING AREA
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[1]/div/div[1]/p")).sendKeys("This is Automated Text...IGNORE :)");
		Thread.sleep(6000);// CHAT SEND BUTTON
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[4]/div/footer/div[1]/div/span[2]/div/div[2]/div[2]/button/span"))).click();
		Thread.sleep(3000);
		driver.close();
		// IF-CONDITION TO RETURN
		if (driver != null) {
		System.out.println("Bankai");
		}
	}
}