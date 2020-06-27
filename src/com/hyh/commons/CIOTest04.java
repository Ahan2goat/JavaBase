package com.hyh.commons;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

public class CIOTest04 {
	public static void main(String[] args) throws IOException {
		FileUtils.write(new File("happy.sxt"), "哈哈哈","UTF-8");
		FileUtils.writeStringToFile(new File("happy.sxt"), "嘻嘻嘻","UTF-8",true);
		FileUtils.writeByteArrayToFile(new File("happy.sxt"), "耶耶耶".getBytes("UTF-8"),true);
		
		//写出列表
		ArrayList<String> datas = new ArrayList<String >();
		datas.add("马云");
		datas.add("马化腾");
		datas.add("马家印");
		FileUtils.writeLines(new File("happy.sxt"), datas,"-",true);
	}
}
