package com.hyh.interview;

/**
 * 	叫我看下面的代码然后画出来在jvm内存中怎么分配的
 * @author HuangYuhan
 *
 */
public class Neicunfenpei {
	public static void main(String[] args) {
		String para1 = "abc";
		String para2 = "abc";
		String para3 = new String("abc");
		String para4 = para3.intern();
		
		System.out.println(para1==para2);//true
		System.out.println(para1.equals(para2));//true
		System.out.println(para1==para3);//falses
		System.out.println(para3==para4);//true
		System.out.println(para1==para4);//true
	}
}
