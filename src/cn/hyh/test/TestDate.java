package cn.hyh.test;

import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getTime());
		
		Date date1 = new Date(5000);
		System.out.println(date1.getTime());
		
		System.out.println(date.after(date1));
	}
}
