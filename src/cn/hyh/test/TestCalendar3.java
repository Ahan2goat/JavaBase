package cn.hyh.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestCalendar3 {
	
	public static void main(String[] args) throws ParseException {
		//输入日期字符串
		System.out.println("请输入日期（格式：2019-9-25）：");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		//日期格式
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		//将输入的字符串转换为对象
		Date date = df.parse(str);
		
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int days = calendar.getActualMaximum(Calendar.DATE);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		
		for(int i=0; i<calendar.get(Calendar.DAY_OF_WEEK)-1;i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=days; i++) {
			if(day==calendar.get(Calendar.DAY_OF_MONTH)) {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"*\t");
			}else {
				System.out.print(calendar.get(Calendar.DAY_OF_MONTH)+"\t");
			}
			if(calendar.get(Calendar.DAY_OF_WEEK)==calendar.SATURDAY) {
				System.out.println();
			}
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
