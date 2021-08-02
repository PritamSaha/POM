package com.w2a.pages;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class HomePage {
	WebDriver driver;
	public void goToSignUp()
	{}
	public void goToLogin()
	{
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[4]"));
	}
	public void goToLearnMore()
	{}
	public void validateFooterLinks()
	{}
}
