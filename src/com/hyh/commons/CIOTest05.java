package com.hyh.commons;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class CIOTest05 {
	public static void main(String[] args) throws IOException {
		//复制文件
		//FileUtils.copyFile(new File("p.png"), new File("p-ppp.png"));
		//FileUtils.copyFileToDirectory(new File("p.png"), new File("newdir"));
		//FileUtils.copyDirectoryToDirectory(new File("newdir "), new File("new2"));
		//FileUtils.copyDirectory(new File("lib"), new File("lib2"));
		String url = "https://pic2.zhimg.com/v2-7d01cab20858648cbf62333a7988e6d0_qhd.jpg";
		FileUtils.copyURLToFile(new URL(url), new File("aaa.jpg"));
		String datas = IOUtils.toString(new URL("http://www.baidu.com"),"UTF-8");
		System.out.println(datas);
	}
}
