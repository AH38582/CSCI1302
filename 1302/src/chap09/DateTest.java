package chap09;

import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		Date date1 = new java.util.Date(10000);
		Date date2 = new java.util.Date(100000);
		Date date3 = new java.util.Date(1000000);
		Date date4 = new java.util.Date(10000000);
		Date date5 = new java.util.Date(100000000);

		Date[] dates = { date1, date2, date3, date4, date5 };

		printDate(dates);
	}

	public static void printDate(Date[] dates) {
		for (Date date : dates) {
			System.out.println(date.toString());
		}
	}

}