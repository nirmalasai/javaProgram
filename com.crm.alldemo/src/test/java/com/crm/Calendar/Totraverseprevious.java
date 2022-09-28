package com.crm.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totraverseprevious {
	public static void main(String[] args) throws ParseException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Calendar calendar=Calendar.getInstance();
		String targetdate="07-June-2030";
		SimpleDateFormat targetformatdate=new SimpleDateFormat("dd-MMM-yyyy");
		targetformatdate.setLenient(false);
		Date formattedtargetdate=targetformatdate.parse(targetdate);
		calendar.setTime(formattedtargetdate);
		System.out.println(formattedtargetdate);
		
		
		int targetday=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(targetday);
		int targetmont=calendar.get(Calendar.MONTH);
		System.out.println(targetmont);
		int targetyear=calendar.get(Calendar.YEAR);
		System.out.println(targetyear);

		
		
		driver.findElement(By.id("second_date_picker")).click();
		String actualText=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actualText);
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualText));
		System.out.println("calendar set");
		int actualmonth=calendar.get(Calendar.MONTH);
		System.out.println(actualmonth);
		int actualyear=calendar.get(Calendar.YEAR);
		System.out.println(actualyear);
		
		while(targetmont < actualmonth || targetyear < actualyear) {
			driver.findElement(By.className("ui-datepicker-prev")).click();
			System.out.println("clicked on element");
			
			actualText=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualText));
			
			actualmonth=calendar.get(Calendar.MONTH);
			actualyear=calendar.get(Calendar.YEAR);
			
			
		}
		
		while(targetmont > actualmonth || targetyear > actualyear) {
			driver.findElement(By.className("ui-datepicker-next")).click();
			System.out.println("clicked on element");
			
			actualText=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualText));
			
			actualmonth=calendar.get(Calendar.MONTH);
			actualyear=calendar.get(Calendar.YEAR);
			
			
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+targetday+"]")).click();

	}

}
