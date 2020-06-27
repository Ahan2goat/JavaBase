package com.hyh.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest06 {
	public static void main(String[] args) {
		File file = new File("dest.txt");
		Writer writer = null;
		try {
			writer = new FileWriter(file);
			//写法一
//			String msgString = "IO is so easy\r\n我爱你";
//			char[] datas = msgString.toCharArray();
//			writer.write(datas,0,datas.length);
			//写法二
//			String msgString = "IO is so easy\r\n我爱你";
//			writer.write(msgString);
//			writer.write("添加内容");
//			writer.flush();
			//写法三
			writer.append("加一次").append("加两次");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (null!=writer) {
					writer.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
