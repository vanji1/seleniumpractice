package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome, its a replica of the actual browser
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page Title is: "+ title);
		System.out.println(driver.getCurrentUrl());
		if (title.equalsIgnoreCase("Google"))
		{
			System.out.println("Title is correct" + " " + title);
		}else
			System.out.println("Title is not correct");
		
	 driver.quit();
		
	}

}
