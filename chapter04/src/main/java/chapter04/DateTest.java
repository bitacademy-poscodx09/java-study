package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		printDate01(now);
		printDate02(now);
	}

	private static void printDate02(Date now) {
		// +1900
		int year = now.getYear();
		
		// 0 ~ 11, +1
		int month = now.getMonth();
		
		int date = now.getDate();
		int hours = now.getHours();
		int minutes = now.getMinutes();
		int seconds = now.getSeconds();
		
		System.out.println(
			(year + 1900) + "-" +
			(month + 1) + "-" +
			date + " " +
			hours + ":" +
			minutes + ":" +
			seconds);
	}

	private static void printDate01(Date now) {
		// 2024-11-25 14:23:30
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(now);
		System.out.println(date);
	}

}
