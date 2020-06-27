package com.hyh.IO;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 	图片读取到字节数组
 * 	字节数组写出到文件
 * @author HuangYuhan
 *
 */
public class IOTest09 {
	public static void main(String[] args) {
		//图片转换成字节数组
		byte[] datas = fileToByteArray("p.png");
		System.out.println(datas.length);
		byteArrayyToFile(datas, "p-byte.png");
	}
	/**
	 * 	图片读取到字节数组
	 * 	图片到程序
	 * 	程序到字节数组
	 */
	public static byte[] fileToByteArray(String filePath) {
		//创建源
		File src = new File(filePath);
		byte[] dest = null;
		//选择流
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		try {
			is = new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			//操作
			byte[] flush = new byte[1024];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,len);
			}
			baos.flush();
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/**
	 * 	字节数组写出到图片
	 * 	字节数组到程序ByteArrayInputStream
	 * 	程序到文件FileOutputStream
	 */
	public static void byteArrayyToFile(byte[] src, String filePath) {
		File dest = new File(filePath);
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new ByteArrayInputStream(src);
			os = new FileOutputStream(dest);
			byte[] flush = new byte[5];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=os) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
