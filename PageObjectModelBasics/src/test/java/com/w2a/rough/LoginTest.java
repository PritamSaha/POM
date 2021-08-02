package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.pages.HomePage;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/pritam/Downloads/chromedriver/chromedriver_linux64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage home= new HomePage();
		home.goToLogin();
		
	}

}
