package com.tvsnext.cicd.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppFunctionTest {
	
	@Test
	public void testApplication() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Applications/ChromeDriver/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("renju.ratheesh");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		int present = driver.getPageSource().indexOf("Forgot password");
		System.out.println("*******************************"+present);
		Assert.assertTrue(present>-1);
		driver.quit();
		
	}

}
