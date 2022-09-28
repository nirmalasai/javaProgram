package com.crm.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Program to select current month date
 * @author sakhi
 *
 */
public class SampleCalendar {

	public static void main(String[] args) throws Exception {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
	
	
		//using calendar we can get the current date
		Calendar calendar=Calendar.getInstance();
		
		//choose a date and store in the string
		String targetDate="1-Jul-2021";
		
		//using simpledateformat we are setting the format
		SimpleDateFormat targetDateFormat=new SimpleDateFormat("dd-MMM-yyyy");
		
		Date converted;
		try
		{	
			//inorder to avoid automatically taking the next month eg if the date is set to 
			//32-mar-2021 it will display 2-apr-2021 if we dont set lenient as false
			targetDateFormat.setLenient(false);
			
			//using paerse it will converting date given format
			converted=targetDateFormat.parse(targetDate);
			calendar.setTime(converted);
			//to split the day
			int day=calendar.get(Calendar.DAY_OF_MONTH);
			//to split the month
			int month=calendar.get(Calendar.MONTH);
			//to split year
			int year=calendar.get(Calendar.YEAR);
			
			//select the date element
			driver.findElement(By.id("second_date_picker")).click();
			//xpath for finding on the current month
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+day+"]")).click();
			
		}
		catch(ParseException e) {
			throw new Exception("Invalid date");
			
		}
		System.out.println(converted);
//		Date newDate = null;
//		String dateTime = "2013-03-18";
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
//		df.setLenient(false);
//		try {
//		    newDate = df.parse(dateTime);
//		} catch (ParseException e) {
//		    throw new Exception("Invalid date input.");
//		}
//		System.out.println(newDate);
//		
	}
}
