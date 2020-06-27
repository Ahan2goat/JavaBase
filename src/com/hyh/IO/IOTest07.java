package com.hyh.IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IOTest07 {
	public static void main(String[] args) {
		byte[] src = "talk is cheap show me the code".getBytes();
		InputStream is = null;
		try {
			is = new ByteArrayInputStream(src);
			byte[] flush = new byte[16];
			int len = -1;
			while((len=is.read(flush))!=-1) {
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
}
