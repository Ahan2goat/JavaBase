package com.hyh.algorithm;

public class countZero {
	
	public static void main(String[] args) {
		 countZero countZero = new countZero();
		 System.out.println(countZero.getZero(2003020202));
	}
	
	public int getZero(int inputValue){
		// 假定一个整数
        int value = inputValue;
        // 统计有多少个0
        int count = 0;
        if (value == 0) {
            count ++;
        } else {
            // 如果值小于0，那么就要取绝对值
            value = value < 0 ? -value : value;
            while (value > 1) {
                if (value % 10 == 0) {
                    count++;
                }
                value = value / 10;
            }
        }
		return count;
	}
}
