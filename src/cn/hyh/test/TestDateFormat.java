package cn.hyh.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		
		//把时间对象转换为自己设定的格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = df.format(new Date());
		System.out.println(str);
		
		//把格式转换为对象
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date d = df2.parse("2019-09-25 11:43:33");
		System.out.println(d);
	}
}
