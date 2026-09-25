package chap09;

import java.util.*;

public class GregorianCalenderTest {

	public static void main(String[] args) {
		java.util.GregorianCalendar cal1 = new GregorianCalendar();

		System.out.printf("%d/%d/%d", cal1.get(GregorianCalendar.MONTH), cal1.get(GregorianCalendar.DAY_OF_MONTH),
				cal1.get(GregorianCalendar.YEAR));
		System.out.println();

	}

}