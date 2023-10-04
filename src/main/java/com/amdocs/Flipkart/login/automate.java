package com.amdocs.Flipkart.login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automate {

	public static String browser = "Firefox";
	public static WebDriver dr;
 	
//	condition for selecting browser
	public static void main(String[] args) throws InterruptedException {
		if (browser.equals("Chrome")) {
			dr = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			dr = new FirefoxDriver();
		}
		
//		added implicit wait for loading the whole content of the page
		dr.manage().timeouts().implicitlyWait(75000, TimeUnit.MILLISECONDS);

//		url for directing to login page		
		dr.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		
//		inserting login credentials and logging in.
		dr.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("harshdarak777@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("amazon");
		dr.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		
//		go to cart
		dr.findElement(By.xpath("/html/body/div[1]/header/div/div[7]/div[1]/div/div/div[2]/div/div[2]/span/span/a")).click();
		
//		proceed to buy
		dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")).click();
		
//		select address of delivery
		dr.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/span/span/span/span/input")).click();
				
//		close the driver after all the above process is completed
		Thread.sleep(7500);
		dr.close();
	}
	}
