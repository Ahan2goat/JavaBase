package com.hyh.algorithm;

/**
 * 	输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @author HuangYuhan
 *
 */
public class Sword09 {
	public int NumberOf1(int n) {
		String str = Integer.toBinaryString(n);
		char[] array = str.toCharArray();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(array[i] == '1') {
				count++;
			}
		}
		return count;
		
	}
}
