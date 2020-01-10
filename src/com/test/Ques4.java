package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vignesh Chinnappa\\eclipse-workspace\\Day2Task\\Drivers\\chromedriver.exe");
		//Launching Browser 
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		//System.out.println(tRows.size());
		
		int limit = tRows.size() - 2;
		for(int i=0;i<limit;i++)
		{
			WebElement row = tRows.get(i);
			
			List<WebElement> tData = row.findElements(By.tagName("td"));
				for(int j=0; j<tData.size();j++)
				{
					WebElement data = tData.get(j);
					String text = data.getText();
					System.out.println(text);
				}
		}
		driver.close();
	}

}
