package com.hyh.commons;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class CIOTest01 {
	public static void main(String[] args) {
		long len = FileUtils.sizeOf(new File("src/com/hyh/commons/CIOTest01.java"));
		System.out.println(len);
		long len2 = FileUtils.sizeOf(new File("C:/Users/HuangYuhan/eclipse-workspace/JavaBase"));
		System.out.println(len2);
	}
}
