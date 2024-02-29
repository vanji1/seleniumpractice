package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methodchaining {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		Options option = driver.manage();
		Window window = option.window();
		window.maximize();
	//	instead of variable names we use the method with which we call the other methods
		//driver.manage().window().maximize();
	}

}
