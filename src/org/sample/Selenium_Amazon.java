package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91875\\eclipse-workspace\\Sample_Selenium\\driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in");
				String title = driver.getTitle();
				System.out.println(title);
				String Url = driver.getCurrentUrl();
				System.out.println(Url);
			}

}
